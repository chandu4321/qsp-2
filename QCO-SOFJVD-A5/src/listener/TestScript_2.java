package listener;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript_2 extends BaseClass_1{

	@Test
	public void demo() {
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		driver.findElement(By.xpath("add-to-cart-button-13")).click();
	}
}
