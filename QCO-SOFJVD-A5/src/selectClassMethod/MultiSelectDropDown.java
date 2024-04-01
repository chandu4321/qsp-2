package selectClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
		
		WebElement dropDown = driver.findElement(By.id("m1"));
		Select sel= new Select(dropDown);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("Mango");
		Thread.sleep(2000);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.deselectByIndex(0);
		
		
//		List<WebElement> options = sel.getOptions();
//		for(WebElement var:options) {
//			System.out.println(var.getText());
//		}
		
		
	}

}
