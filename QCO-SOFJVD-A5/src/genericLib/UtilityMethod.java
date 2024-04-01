package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {

	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./externalFile/testData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
	
	public String getDataFromExcel(String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./externalFile/excelData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		return sh.getRow(rowNum).getCell(cellNum).toString();
	}
}
