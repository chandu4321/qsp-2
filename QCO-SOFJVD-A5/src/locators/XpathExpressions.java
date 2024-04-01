package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExpressions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//          //tagname[@an='av']
		driver.findElement(By.xpath("//input[@value='Vote']"));
		
		driver.findElement(By.xpath("//strong[text()='Featured products']"));
		
		driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2024 Tricentis')]"));
	}

}
