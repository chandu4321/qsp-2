package basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Script {

	@Test
	public void launch() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("changowda07@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Chandu@11");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.id("search"));
		searchBox.sendKeys("lipstick");
		Thread.sleep(3000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Lakme Forever Matte Lipstick']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		
		
		
	}
}
