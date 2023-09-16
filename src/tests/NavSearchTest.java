package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.NavSearchPage;
import utilities.testutil;

public class NavSearchTest extends TestBase{
		 
		NavSearchPage nsp;
		DataFile df;

	public NavSearchTest() {
		super();
	}
		
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
		
				  nsp.ClickOnSearch();
				  
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchBar)); 
				  nsp.AddInputValueToSearch(df.SearchValueOne);
				 
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchClick));
				  nsp.ClickOnEnterValue();
				  
				  Thread.sleep(1000);
				 
			  }
			  
			  @Test(priority=2)
			  public void SearchValuesTwo() throws InterruptedException {
				  
				  nsp.ClickOnSearch();
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab)); 
				 
				  nsp.AddInputValueToSearch(df.SearchValueTwo);testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchClick)); 
				  nsp.ClickOnEnterValue();
				 
				  Thread.sleep(4000);
				  
			  }
			  
			  @Test(priority=3)
			  public void SearchValuesThree() throws InterruptedException {
				
				  nsp.ClickOnSearch();
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab)); 
				  
				  nsp.AddInputValueToSearch(df.SearchValueThree);
			 
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchClick)); 
				  nsp.ClickOnEnterValue();
				 
				  Thread.sleep(4000);
				  
			  }
			  
			  @Test(priority=4)
			  public void SearchValuesFour() throws InterruptedException {
				
				  nsp.ClickOnSearch();
				  
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab)); 
				  nsp.AddInputValueToSearch(df.SearchValueFour);
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchClick)); 
				  nsp.ClickOnEnterValue();
				 
				  Thread.sleep(4000);
				  
			  }
			
			  @Test(priority=5)
			  public void SearchValuesFive() throws InterruptedException {
				
				  nsp.ClickOnSearch();
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab)); 
				  nsp.AddInputValueToSearch(df.SearchValueFive);
				  
				  testutil.wait.until(ExpectedConditions.visibilityOf(nsp.SearchTab)); 
				  nsp.ClickOnEnterValue();
				 
				  Thread.sleep(4000);
				  
			  }
		  
		  
		}
