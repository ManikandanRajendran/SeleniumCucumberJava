package steps;

import Page_Actions.wishlist_page_actions;
import Page_Actions.common_actions;
import io.cucumber.java.en.Then;

public class Wishlist_page {
	
	wishlist_page_actions cart_page_actions;
	
	public Wishlist_page(wishlist_page_actions cart_page_actions) {
		this.cart_page_actions = cart_page_actions;
	}
	
	@Then("I find total four selected items in my wishlist")
	public void verify_wishlist() throws InterruptedException {
		cart_page_actions.verify_wishlist(4);
	}
}
