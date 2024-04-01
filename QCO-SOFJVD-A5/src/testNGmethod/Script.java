package testNGmethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script extends ConifugrationAnatation {

	@Test
	public void demo() throws InterruptedException {
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		Thread.sleep(4000);
		
	}
}
