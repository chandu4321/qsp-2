package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}
}
