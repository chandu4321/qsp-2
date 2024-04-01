package actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveToElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Actions actions= new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		actions.moveToElement(men).perform();

	}
}
