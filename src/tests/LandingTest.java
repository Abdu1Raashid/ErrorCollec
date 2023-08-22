package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.DataFile;
import pages.LandingPage;

public class LandingTest {
	
	WebDriver driver;
	LandingPage lp = new LandingPage();
	DataFile df = new DataFile();
	
	//OpenCloseBrow ocb = new OpenCloseBrow();
	 
	@BeforeMethod
	public void getBrowser() throws IOException {
		lp.openBrowser();
		lp.OpenLandingPage();

	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.closeBrowser();
	}
	
		 @Test(priority=1)
		  public void playVid() throws InterruptedException {
			
			 lp.playVideo();
			  
		  }
		  
		  @Test(priority=2)
		  public void ClickSignUp() throws InterruptedException{
			  
			 lp.clickOnSignUp();
			 
		  }
		  
		  @Test(priority=3)
		  public void SwipeRight() throws InterruptedException {
			
			 lp.ClickToSwipe(); 
		  }
			  
		  @Test(priority=4)
		  public void SwipeSecond() throws InterruptedException {
			
			  lp.ClickToSwipeTwo();
		  
		  }
			  
		 @Test(priority=5)
		  public void SwipeThird() throws InterruptedException {
			  
			  lp.ClickToSwipeThree();
	  
	  }
}
