package Web_Elements;


import org.openqa.selenium.By;
import Page_Actions.common_actions;

public class Shop_page_elements extends common_actions{	
	public By clearCookies = By.xpath("//*[@class='cc-compliance cc-highlight']/a[1]");
	public By clickShop = By.xpath("//*[@id='menu-main-menu']/li[2]/a");
	public By addToWish1 = By.xpath("//*[@class='products columns-4']/li[1]//*[contains(@class,'yith-wcwl-add-to-wishlist')]");
	public By addToWish2 = By.xpath("//*[@class='products columns-4']/li[3]//*[contains(@class,'yith-wcwl-add-to-wishlist')]");
	public By addToWish3 = By.xpath("//*[@class='products columns-4']/li[4]//*[contains(@class,'yith-wcwl-add-to-wishlist')]");
	public By addToWish4 = By.xpath("//*[@class='products columns-4']/li[6]//*[contains(@class,'yith-wcwl-add-to-wishlist')]");
	public By addToCart = By.xpath("//*[@class='products columns-4']//li[2]/a[2]");
	public By viewWish = By.xpath("//*[@class='site-header container-fluid']//*[@class='header-wishlist']");
	
	public By sortDropDown = By.xpath("//*[@class='orderby']");	

}
