package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//id locator 
		driver.findElement(By.id("small-searchterms"));
		
		//name locator
		driver.findElement(By.name("q"));
		
		//classname locator
		driver.findElement(By.className("classone"));
		

	}

}
