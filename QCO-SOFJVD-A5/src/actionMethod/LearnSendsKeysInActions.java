package actionMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSendsKeysInActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions = new Actions(driver);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		actions.sendKeys(search, "books").perform();
	}
}
