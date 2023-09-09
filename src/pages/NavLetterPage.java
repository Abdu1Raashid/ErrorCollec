package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NavLetterPage extends TestBase{
	
	
	@FindBy(linkText="Newsletters")
	public WebElement NewsLetter;
	
	@FindBy(xpath="//div[@class='CheckCard__Title']")
	public List<WebElement> NewsLetterTitle;

	public NavLetterPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void OpenLandingPage() {
		driver.get("https://www.nationalgeographic.com/");
	}

	public void closeBrowser() {
		driver.quit();
	}
	
	 public void clickOnLetter() {
			
			NewsLetter.click();
		}
	 
	 
	 public void GetTitleForNewsLetter() {
		 for(int i=0; i<NewsLetterTitle.size();i++) {
			 System.out.println(NewsLetterTitle.get(i).getText());
		 }
	 }

}
