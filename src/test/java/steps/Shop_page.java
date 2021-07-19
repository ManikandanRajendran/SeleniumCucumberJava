package steps;

import org.openqa.selenium.WebDriver;

import Page_Actions.shop_page_actions;
import Page_Actions.common_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shop_page {
	WebDriver driver;
	String test_url;
	shop_page_actions shop_page_actions;
	common_actions common_actions;
	
	public Shop_page(common_steps common_steps, common_actions common_actions, shop_page_actions shop_page_actions) {
		this.test_url = common_steps.getUrl();
		this.common_actions = common_actions;
		this.shop_page_actions = shop_page_actions;
	}
	
	@Given("I am in the website homepage")
	public void website_homepage() {
//	    driver.get(test_url);
		common_actions.goTo_url(test_url);
	}

	@Given("I add four different products to my wishlist")
	public void add_products() throws InterruptedException {
		shop_page_actions.accept_cookies();
		shop_page_actions.navigate_to_shop_page();
	    shop_page_actions.add_four_items_to_wishlist();
	}

	@When("I view my wishlist table")
	public void wishlist_table() throws InterruptedException {
		shop_page_actions.navigate_to_wishlist();
	}


	@When("I search for lowest price product")
	public void lowest_price_product() throws InterruptedException {
		shop_page_actions.search_lowest_price_product();
	}

	@When("I am able to add the lowest price item to my cart")
	public void add_lowest_item() throws InterruptedException {
	    shop_page_actions.add_to_cart();
	}

}
