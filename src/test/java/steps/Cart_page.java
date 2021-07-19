package steps;

import Page_Actions.Cart_page_actions;
import io.cucumber.java.en.Then;

public class Cart_page {
	Cart_page_actions Cart_page_actions;
	
	public Cart_page(Cart_page_actions cart_page_actions) {
		this.Cart_page_actions = cart_page_actions;
	}
	
	@Then("I am able to verify the item in my cart")
	public void i_am_able_to_verify_the_item_in_my_cart() throws InterruptedException {
	    Cart_page_actions.go_to_cart();
	    Cart_page_actions.Verify_item_in_cart();
	}

}
