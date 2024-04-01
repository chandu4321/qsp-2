package takeScreenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnScreenShotOfWebPage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		LocalDateTime dateTime= LocalDateTime.now();
		String date= dateTime.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("errorScreenShot//"+date+"webpage.png");
		FileHandler.copy(source, target);
	}
}
