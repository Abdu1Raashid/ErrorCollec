package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.NavSearchPage;

public class NavSearchTest extends TestBase{
	

	
	public NavSearchTest() {
		super();
	}
	
	NavSearchPage nsp;
	DataFile df;
	
	
	@BeforeMethod
	public void openBrowser() {
		intialization();
		nsp = new NavSearchPage();
		df = new DataFile();
		
		}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	  @Test(priority=1)
	  public void SearchValuesOne() throws InterruptedException {
		  
		  /*
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab));
		  wait.until(ExpectedConditions.textToBePresentInElement(nsp.SearchTab,df.SearchValueOne));
		  */
		  
		  nsp.ClickOnSearch();
		  
		  Thread.sleep(1000);
	 
		  nsp.AddInputValueToSearch(df.SearchValueOne);
		 
		  Thread.sleep(1000);
		  
		  nsp.ClickOnEnterValue();
		  Thread.sleep(1000);
		 
	  }
	  
	  @Test(priority=2)
	  public void SearchValuesTwo() throws InterruptedException {
		  
		
		  nsp.ClickOnSearch();
		  
		  Thread.sleep(2000);
		  
		  nsp.AddInputValueToSearch(df.SearchValueTwo);
		  Thread.sleep(2000);
		  
		  nsp.ClickOnEnterValue();
		 
		  Thread.sleep(4000);
		  
	  }
	  
	  @Test(priority=3)
	  public void SearchValuesThree() throws InterruptedException {
		  
		
		  nsp.ClickOnSearch();
		  
		  Thread.sleep(2000);
		  
		  nsp.AddInputValueToSearch(df.SearchValueThree);
		  Thread.sleep(2000);
		  
		  nsp.ClickOnEnterValue();
		 
		  Thread.sleep(4000);
		  
	  }
	  
	  @Test(priority=4)
	  public void SearchValuesFour() throws InterruptedException {
		  
		
		  nsp.ClickOnSearch();
		  
		  Thread.sleep(2000);
		  
		  nsp.AddInputValueToSearch(df.SearchValueFour);
		  Thread.sleep(2000);
		  
		  nsp.ClickOnEnterValue();
		 
		  Thread.sleep(4000);
		  
	  }
	
	  @Test(priority=5)
	  public void SearchValuesFive() throws InterruptedException {
		  
		
		  nsp.ClickOnSearch();
		  
		  Thread.sleep(2000);
		  
		  nsp.AddInputValueToSearch(df.SearchValueFive);
		  Thread.sleep(2000);
		  
		  nsp.ClickOnEnterValue();
		 
		  Thread.sleep(4000);
		  
	  }
  
  
}
