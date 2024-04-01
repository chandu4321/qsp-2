package popUpMethod;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnChildBrowserPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(parentWindowId);
		System.out.println(allWindowId);
		allWindowId.remove(parentWindowId);
		for(String i:allWindowId) {
			driver.switchTo().window(i);
			Thread.sleep(2000);
			driver.close();
		}
//		driver.switchTo().window(parentWindowId);
//		driver.close();//to close parent window 
		//driver.findElement(By.partialLinkText("Books")).click();
	}
}
