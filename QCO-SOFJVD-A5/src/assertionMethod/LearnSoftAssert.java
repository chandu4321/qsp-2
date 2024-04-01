package assertionMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {
	String fname="chandana";
	String lname="n";
	String ename="chandana@gmail.com";
	String pname="chandu123";
	String cname="chandu123";
	@Test
	public void launchDemo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert sa= new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		sa.assertEquals(driver.getTitle(), "Demo Web Shop","user not landed to the appln");
		driver.findElement(By.linkText("Register")).click();
		sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user is not landed to register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		sa.assertTrue(gender.isSelected()); 
		WebElement name = driver.findElement(By.id("FirstName"));
		name.sendKeys(fname);
		sa.assertEquals(name.getAttribute("value"), "chandana","first name is not matching");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys(lname);
		sa.assertEquals(lastName.getAttribute("value"), "n","last name is not matching");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(ename);
		sa.assertEquals(email.getAttribute("value"), "chandana@gmail.com","email is not matching");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(pname);
		sa.assertEquals(password.getAttribute("value"), "chandu123","password is not matching");
		WebElement conPassword = driver.findElement(By.id("ConfirmPassword"));
		conPassword.sendKeys(cname);
		sa.assertEquals(conPassword.getAttribute("value"), "chandu123","confirm password is not matching");
		driver.findElement(By.id("register-button")).click();
		sa.assertTrue(true);
		sa.assertAll();
	}
}