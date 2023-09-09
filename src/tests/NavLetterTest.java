package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.NavLetterPage;


public class NavLetterTest extends TestBase{
	
	
	
	WebDriver driver;
	NavLetterPage nlp;
	DataFile df;
	
	public NavLetterTest() {
		super();
	}
	
	 
	@BeforeMethod
	public void getBrowser() throws IOException {
		intialization();
		nlp = new NavLetterPage();
		df = new DataFile();

	}
	
	@AfterMethod
	public void closeBrowser() {
		nlp.closeBrowser();
	}
	
	
  @Test(priority=1, groups = {"GetTitles"})
  public void GetTitle() throws InterruptedException {
		
	  nlp.clickOnLetter();
	  
	  Thread.sleep(2000);
	  nlp.GetTitleForNewsLetter();
	}
}
