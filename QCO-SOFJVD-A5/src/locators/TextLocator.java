package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//link Text 
		driver.findElement(By.linkText("Log in"));
		
		//partial link Text
		driver.findElement(By.partialLinkText("Apparel & Shoes"));
		

	}

}
