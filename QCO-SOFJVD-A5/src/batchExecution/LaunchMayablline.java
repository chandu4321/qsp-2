package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchMayablline {
	@Test
	public void mayablline() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_content=&utm_term=maybelline&gad_source=1&gclid=CjwKCAiArfauBhApEiwAeoB7qPE0u6pGYJyAktOPn6H84G2ygQKrMblkHskQ2qlfptHqW1mRDdr42RoCUeQQAvD_BwE");
		driver.quit();
	}
}
