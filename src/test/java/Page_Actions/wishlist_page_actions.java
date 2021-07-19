package Page_Actions;

import java.util.List;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import Web_Elements.Wishlist_page_elements;

public class wishlist_page_actions extends Wishlist_page_elements{
	Wishlist_page_elements cart_page_elements;
	
	public void verify_wishlist(Integer list_count) throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(productList);
		int products_count = elements.size();
		if(products_count != list_count) {
			fail("The products are not same in wishlist");
		}else {
			System.out.println("The product count is same");
		}
	}

}
