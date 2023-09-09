package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NavSearchPage extends TestBase{
	
	
	
	@FindBy(xpath="//a[@class='AnchorLink NavBar__List--search']")
	public WebElement SearchBar;
	
	@FindBy(xpath="//input[@class='SearchBar__Input']")
	public WebElement SearchTab;
	
	@FindBy(xpath="//div[@id='natgeo-search-input']//button")
	public WebElement SearchClick;
	
	
	public NavSearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickOnSearch() {
		SearchBar.click();
		
	}
	
	public void AddInputValueToSearch(String a) {
		SearchTab.sendKeys(a);
	}
	
	public void ClickOnEnterValue() {
		SearchClick.click();
	}
	
	
	
	
	
}
