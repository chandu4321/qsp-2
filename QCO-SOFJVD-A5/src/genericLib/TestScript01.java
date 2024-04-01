package genericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass {

	@Test
	public void demo() throws InterruptedException {
		HomePagePom hp= new HomePagePom(driver);
		hp.getSearchBox().sendKeys("books");
		Thread.sleep(3000);
		hp.getComputerButton().click();
	}
}
