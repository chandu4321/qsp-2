package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("./externalFile/excelData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		
		String key = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String path = wb.getSheet("Sheet2").getRow(4).getCell(2).getStringCellValue();
		String url = wb.getSheet("Sheet2").getRow(7).getCell(0).getStringCellValue();
	
		System.setProperty(key, path);
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
	}
}
