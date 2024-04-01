package webdriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetTitleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//to fetch title of appln
		//System.out.println(driver.getTitle());
		
		//to fetch URL of appl
		//System.out.println(driver.getCurrentUrl());
		
		//to fetch page source
		System.out.println(driver.getPageSource());
		
		driver.quit();
	}
}
