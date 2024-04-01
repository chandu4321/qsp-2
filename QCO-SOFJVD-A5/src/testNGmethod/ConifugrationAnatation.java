package testNGmethod;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ConifugrationAnatation {

	public static WebDriver driver;
	String email="bangalore541@gmail.com";
	String password="bangalore123";
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@BeforeSuite
	public void connDB() {
		Reporter.log("connected to DataBase",true);
	}
	@Parameters("browser")
	@BeforeClass
	public void launch(String bname) {
		if(bname.contains("chrome")) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	}
}
	
	@BeforeTest
	public void preCon() {
		Reporter.log("precondn code", true);
	}
	
	@AfterClass
	public void logout() {
		driver.quit();
	}
	
	@AfterSuite
	public void closeDB() {
		Reporter.log("closed the conn of DataBase",true);
	}
	
	@AfterTest
	public void postCon() {
		Reporter.log("post conn code", true);
	}
	
	
	@AfterMethod
	public void close() {
		driver.findElement(By.linkText("Log out")).click();
	}
}
