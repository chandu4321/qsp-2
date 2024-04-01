package assertionMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningHardAssert {
	@Test
	public void launchDemo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(), "Demo Web Shop","user not landed to the appln");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user is not landed to register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		assertTrue(gender.isSelected()); 
		WebElement name = driver.findElement(By.id("FirstName"));
		name.sendKeys("chandana");
		assertEquals(name.getAttribute("value"), "chandana","first name is not matching");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("n");
		assertEquals(lastName.getAttribute("value"), "n","last name is not matching");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("chandana@gmail.com");
		assertEquals(email.getAttribute("value"), "chandana@gmail.com","email is not matching");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("chandu123");
		assertEquals(password.getAttribute("value"), "chandu123","password is not matching");
		WebElement conPassword = driver.findElement(By.id("ConfirmPassword"));
		conPassword.sendKeys("chandu123");
		assertEquals(conPassword.getAttribute("value"), "chandu123","confirm password is not matching");
		driver.findElement(By.id("register-button")).click();
		assertTrue(true);
		driver.quit();
		}
}
