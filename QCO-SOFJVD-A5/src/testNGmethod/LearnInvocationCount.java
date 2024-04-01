package testNGmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	@Test(invocationCount = 2,threadPoolSize = 2)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test(invocationCount = 2,threadPoolSize = 1)
	public void addToCart() {
		Reporter.log("user has a product to cart",true);
	}
	
	@Test(invocationCount = 3,threadPoolSize = 4)
	public void login() {
		Reporter.log("user has login",true);
	}
	
	@Test(invocationCount = 2)
	public void product() {
		Reporter.log("user selected a product",true);
	}
}
