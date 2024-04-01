package actionMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyUpAndKeyDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions= new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		
	}
}