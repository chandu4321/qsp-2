package javaScriptExceutorMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHiddenElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/user/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.id("usertype_yes")).click();
		js.executeScript("document.getElementById('groupcode').value='selenium';");

	}

}
