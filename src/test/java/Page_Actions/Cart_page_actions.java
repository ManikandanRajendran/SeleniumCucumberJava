package Page_Actions;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebElement;
import Web_Elements.Cart_page_elements;

public class Cart_page_actions extends Cart_page_elements {
	Cart_page_elements cart_page_elements;
	
	public void go_to_cart() throws InterruptedException {
		driver.findElement(viewCart).click();
		Thread.sleep(3000);
	}
	
	public void Verify_item_in_cart() throws InterruptedException {
		Thread.sleep(3000);
		List <WebElement> elements = driver.findElements(productList_cart);
		if(elements.size()!= 2) {
			fail("The product list in cart is not as expected");
		}else {
			System.out.println("The product list in cart is as expected");
		}
		
	}

}
