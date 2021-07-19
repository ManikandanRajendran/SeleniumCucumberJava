package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.asm.Advice.This;
import utils.BrowserFactory;
import utils.DriverManager;

public class common_steps {
	public static WebDriver driver;
	Properties properties;
	
	@Before
	public void fetchUrl() throws IOException {
		properties = new Properties();
		FileInputStream file = new FileInputStream("./Resources/config.properties");
		properties.load(file);
	}
	
	
	@Before
	public void openBrowser()
	{
		driver = BrowserFactory.startApplication(properties.getProperty("Browser"));
		DriverManager.getInstance().setDriver(driver); 
	}
	
	@After
	public void tearDown()
	{
		BrowserFactory.quiteBrowser(driver);
	}
	
	public void setDriver(WebDriver	driver) {
		this.driver = driver;
		
	}
	
	public WebDriver getDriver() {
		return this.driver;
		
	}
	
	
	public String getUrl()
	{
		return properties.getProperty("test_url");
	}

}
