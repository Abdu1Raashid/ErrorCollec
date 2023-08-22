package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavSearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='AnchorLink NavBar__List--search']")
	public WebElement SearchBar;
	
	@FindBy(xpath="//div[@class='SearchBar']")
	public WebElement SearchTab;
	
	public void openBrowser() throws IOException {
		FileInputStream propReader = new FileInputStream("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/src/prop.properties");
		
		Properties prop = new Properties();
		prop.load(propReader);
		
		String browser = prop.getProperty("Browser");
		
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else {
			driver = new SafariDriver();
		}
		PageFactory.initElements(driver, this);
		
	}
	
	public void OpenPage() {
		driver.get("https://www.nationalgeographic.com/");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void ClickOnSearch() {
		SearchBar.click();
		
	}
	
	public void AddInputValueToSearch() {
		SearchTab.sendKeys("Animals");
	}
	
	
	
	
	
	
}
