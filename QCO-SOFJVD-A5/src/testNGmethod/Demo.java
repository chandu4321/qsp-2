package testNGmethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void launch() {
		Reporter.log("testNG installed",true);
	}
}
