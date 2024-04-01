package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("selenium"); //to send value in inside textbox
		driver.switchTo().alert().accept(); //to click on ok button
//		driver.switchTo().alert().dismiss(); //to click on cancel button
		
	}
}
