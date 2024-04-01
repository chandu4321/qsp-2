package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchSkill {
	@Test
	public void skillary() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/#");
		driver.quit();
	}
}
