package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1)Create a File("path") 
		File file= new File("./externalFile/excelData.xlsx");
		
		//2)Create a Object for FileInputStream
		FileInputStream fis= new FileInputStream(file);
		
		//3)Create a object of workbook
		Workbook wb= WorkbookFactory.create(fis);
		
		String text = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(text);
		
		double num = wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(num);
		
		boolean ele = wb.getSheet("Sheet1").getRow(3).getCell(2).getBooleanCellValue();
		System.out.println(ele);
		
		LocalDateTime date = wb.getSheet("Sheet1").getRow(4).getCell(0).getLocalDateTimeCellValue();
		System.out.println(date);
		
	}
}
