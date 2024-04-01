package listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(TestngImplementation.class)
public class BaseClass_1 {
	
public static WebDriver driver;
	
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
