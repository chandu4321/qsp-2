package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchingData {
	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException{
		File file= new File("./externalFile/excelData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		int noOfRow=wb.getSheet("Sheet4").getPhysicalNumberOfRows();
		int noOfCol= wb.getSheet("Sheet4").getRow(0).getPhysicalNumberOfCells();
		String[][] data= new String[noOfRow][noOfCol];
		for(int i=0;i<noOfRow;i++) {
			for(int j=0;j<noOfCol;j++) {
				data[i][j]=wb.getSheet("Sheet4").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}	
	@Test(dataProvider = "testData")
	public void register(String[] testData) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/user-signin");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("First Name")).sendKeys(testData[0]);
		driver.findElement(By.id("Last Name")).sendKeys(testData[1]);
		if(testData[2].equalsIgnoreCase("male")) {
		driver.findElement(By.id("Male")).click();
		}
		else {
			driver.findElement(By.id("Female")).click();
		}
		driver.findElement(By.id("Phone Number")).sendKeys(testData[3]);
		driver.findElement(By.id("Email Address")).sendKeys(testData[4]);
		driver.findElement(By.id("Password")).sendKeys(testData[5]);
		driver.findElement(By.id("Confirm Password")).sendKeys(testData[6]);
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("Register")).click();
	}
	
}
