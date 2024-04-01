package selectClassMethod;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		Select sel= new Select(dropDown);
		//System.out.println(sel.isMultiple());//this method is used to check dropdown is single select r multiple dropdown
		//sel.selectByVisibleText("Name: A to Z");//this method is used to select the options using visible text
		
		List<WebElement> options = sel.getOptions();
		for(WebElement ele:options) {
			System.out.println(ele.getText());
		}
	}
}
