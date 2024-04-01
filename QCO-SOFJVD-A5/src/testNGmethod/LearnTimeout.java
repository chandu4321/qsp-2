package testNGmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTimeout {

	@Test(timeOut = 20000)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
	}
}
