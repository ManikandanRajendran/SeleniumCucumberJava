package Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Actions.common_actions;

public class Cart_page_elements extends common_actions {
	public By productList_cart = By.xpath("//*[contains(@class,'woocommerce-cart-form__contents')]//tbody/tr");
	public By viewCart = By.xpath("//*[@class='site-header container-fluid']//*[@class='cart-contents']");
}
