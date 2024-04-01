package dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTravelToChildElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../..//input[@value='Add to cart']")).click();

	}

}
