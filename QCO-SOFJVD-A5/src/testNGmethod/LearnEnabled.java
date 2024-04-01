package testNGmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnEnabled {
	
	@Test(enabled = false)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test(enabled = true)
	public void addToCart() {
		Reporter.log("user has a product to cart",true);	
	}
	
	@Test
	public void login() {
		Reporter.log("user has login",true);		
	}
	
}