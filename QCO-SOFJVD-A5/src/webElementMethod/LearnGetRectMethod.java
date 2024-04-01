package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Rectangle searchBox = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println(searchBox.getX());
		System.out.println(searchBox.getY());
		System.out.println(searchBox.getHeight());
		System.out.println(searchBox.getWidth());
		
	}
}
