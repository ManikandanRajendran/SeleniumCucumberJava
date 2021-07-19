package Page_Actions;

import org.openqa.selenium.support.ui.Select;

import Web_Elements.Shop_page_elements;

public class shop_page_actions extends Shop_page_elements {
	Shop_page_elements shop_page_elements;

	
	public void accept_cookies() throws InterruptedException {
		waitForPageLoad(5);
		driver.findElement(clearCookies).click();
	}
	
	public void add_four_items_to_wishlist() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(addToWish1).click();
		Thread.sleep(1000);
		driver.findElement(addToWish2).click();
		Thread.sleep(1000);
		driver.findElement(addToWish3).click();
		Thread.sleep(1000);
		driver.findElement(addToWish4).click();

	}
	
	public void navigate_to_shop_page() {
		driver.findElement(clickShop).click();
	}
	
	public void navigate_to_wishlist() throws InterruptedException {
		driver.findElement(viewWish).click();
		waitForPageLoad(5);
	}
	
	public void search_lowest_price_product() throws InterruptedException {
		navigate_to_shop_page();
		waitForPageLoad(20);
		Select dropdown = new Select(driver.findElement(sortDropDown));
		dropdown.selectByVisibleText("Sort by price: low to high");
		Thread.sleep(3000);;
	}
	
	public void add_to_cart() throws InterruptedException {
		waitForPageLoad(15);
		driver.findElement(addToCart).click();
		Thread.sleep(5000);
	}
	
}
