package listener;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass_1 {

	@Test
	public void demo() {
		driver.findElement(By.linkText("Register")).click();
	}
}
