package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
//		driver.switchTo().frame(1);
//		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
//		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("9876654342");
		Thread.sleep(2000);
		//switching back the driver control to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
	}

}
