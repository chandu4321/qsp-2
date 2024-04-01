package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		//1)Create a File("path")
		File file= new File("./externalFile/testData.properties");
		
		//2)Create a Object for FileInputStream.
		FileInputStream fis= new FileInputStream(file);
		
		//3)Create a object of Property File.
		Properties p= new Properties();
		
		//4)call load(fis) method 
		p.load(fis);
		
		//5)use getProperty() method 
		String Key = p.getProperty("key").toString();
		String Path = p.getProperty("path").toString();
		String URL = p.getProperty("url").toString();
		
		System.out.println(Key);
		System.out.println(Path);
		System.out.println(URL);
		
		System.setProperty(Key, Path);
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		
	}
}
