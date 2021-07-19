package Page_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverManager;

public class common_actions {
	public WebDriver driver = DriverManager.getInstance().getDriver(); 
	
	public void goTo_url(String url) {
		driver.get(url);
	}
	
	public boolean is_element_displayed(WebDriver driver, By by) {
		return driver.findElement(by).isDisplayed();
	}
	
	public boolean is_element_enabled(WebDriver driver, By by) {
		return driver.findElement(by).isEnabled();
	}
	
	public static void waitUntilElementClickable(WebDriver driver, By by, long timeOutInSeconds) {
        (new WebDriverWait(driver, timeOutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(by));
    }
	
	public void waitForPageLoad(long timeOutInSeconds) {

        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(pageLoadCondition);
        } catch (Exception e) {
            System.out.println("Timeout waiting for Page Load Request to complete.<br><b>Exception : </b>" + e);
        }

    }
}
