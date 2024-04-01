package testNGmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test(dependsOnMethods = "addToCart")
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void addToCart() {
		Reporter.log("user has a product to cart",true);	
	}
	
	@Test
	public void login() {
		Reporter.log("user has login",true);		
	}
}
