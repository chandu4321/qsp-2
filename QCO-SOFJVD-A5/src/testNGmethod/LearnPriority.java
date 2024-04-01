package testNGmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = 4)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test(priority = 3)
	public void addToCart() {
		Reporter.log("user has a product to cart",true);
	}
	
	@Test(priority = -1)
	public void login() {
		Reporter.log("user has login",true);
	}
	
	@Test(priority = 0)
	public void product() {
		Reporter.log("user selected a product",true);
	}
	
}
