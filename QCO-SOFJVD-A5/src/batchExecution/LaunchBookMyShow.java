package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBookMyShow {
	@Test
	public void bookMyShow() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.quit();
	}
}
