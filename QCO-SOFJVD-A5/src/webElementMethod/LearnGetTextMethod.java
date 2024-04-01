package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//normal text that is present in webpage
		//System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText());

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("button-1 register-next-step-button")).click();
		//error text 
		System.out.println(driver.findElement(By.xpath("//span[text()='First name is required.']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[text()='Last name is required.']")).getText());
		
		//tagname
		System.out.println(driver.findElement(By.id("gender-male")).getTagName());
		
	}
}
