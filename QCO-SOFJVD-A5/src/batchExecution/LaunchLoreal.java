package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchLoreal {
	@Test(groups = "beauty")
	public void loreal() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/products/?brand=l-oreal-paris&category=serums-essence&gad_source=1&gclid=Cj0KCQiAzoeuBhDqARIsAMdH14Gc3LIvXnQ_8CrfivqZCuVoUmcaiS92ylwoB6xCZEKRftKPuEnTFlcaAijQEALw_wcB");
		driver.quit();
	}
}
