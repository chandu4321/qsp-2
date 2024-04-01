package genericLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script01 {

	@Test
	public void demo() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		UtilityMethod um=new UtilityMethod();
		//driver.get(um.getDataFromProperties("url"));
		
		driver.get(um.getDataFromExcel("Sheet1", 0, 0));
	}
}
