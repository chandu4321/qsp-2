package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//css selector 
		driver.findElement(By.cssSelector("input[value='Vote']"));

	}

}
