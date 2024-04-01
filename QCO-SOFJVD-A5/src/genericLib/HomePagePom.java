package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePom extends BasePage{

	public HomePagePom(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksButton;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getBooksButton() {
		return booksButton;
	}
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computerButton;

	public WebElement getComputerButton() {
		return computerButton;
	}
	
	
}
