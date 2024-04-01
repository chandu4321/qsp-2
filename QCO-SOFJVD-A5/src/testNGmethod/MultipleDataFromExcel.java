package testNGmethod;

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

public class MultipleDataFromExcel {
	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException{
		File file= new File("./externalFile/excelData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		int noOfRow=wb.getSheet("Sheet3").getPhysicalNumberOfRows();
		int noOfCol= wb.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		String[][] data= new String[noOfRow][noOfCol];
		for(int i=0;i<noOfRow;i++) {
			for(int j=0;j<noOfCol;j++) {
				data[i][j]=wb.getSheet("Sheet3").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}	
	@Test(dataProvider = "testData")
	public void registerUser(String[] testData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if(testData[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		}
		else {
			driver.findElement(By.id("gender-male")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(testData[1]);
		driver.findElement(By.id("LastName")).sendKeys(testData[2]);
		driver.findElement(By.id("Email")).sendKeys(testData[3]);
		driver.findElement(By.id("Password")).sendKeys(testData[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(testData[5]);
		driver.findElement(By.id("register-button")).click();
	}
	
}
