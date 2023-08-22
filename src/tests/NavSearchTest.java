package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.DataFile;
import pages.NavSearchPage;

public class NavSearchTest {
	
	WebDriver driver;
	NavSearchPage nsp = new NavSearchPage();
	DataFile df = new DataFile();
	
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		nsp.openBrowser();
		nsp.OpenPage();
		}
	
	@AfterMethod
	public void closeBrowser() {
		nsp.closeBrowser();
	}
	
	
	  @Test
	  public void SearchValues() throws InterruptedException {
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  nsp.ClickOnSearch();
		  Thread.sleep(2000);
		  
		  wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab));
		  nsp.AddInputValueToSearch();
		  
	  }
	  
	  //@Test
	  public void SearchInputValue() {
		  
	  }
  
  
  
}
