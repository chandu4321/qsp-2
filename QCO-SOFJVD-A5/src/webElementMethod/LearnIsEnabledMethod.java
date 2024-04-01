package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/#");
		//isEnabled method
		System.out.println(driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled());
		
		//isDisplayed Method
		System.out.println(driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).isDisplayed());
	
	}
}
