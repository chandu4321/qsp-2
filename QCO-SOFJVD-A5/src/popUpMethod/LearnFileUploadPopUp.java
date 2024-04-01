package popUpMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFileUploadPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Robot robot= new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_U);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_H);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_U);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
