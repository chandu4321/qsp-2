package batchExecution;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchMeesho {
	@Test
	public void lakme() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}
}
