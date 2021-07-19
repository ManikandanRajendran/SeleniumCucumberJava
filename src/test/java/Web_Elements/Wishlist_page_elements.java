package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Actions.common_actions;

public class Wishlist_page_elements extends common_actions {
	public By productList = By.xpath("//*[@class='wishlist-items-wrapper']/tr");	//"//*[@id='yith-wcwl-form']//tbody/tr"
}
