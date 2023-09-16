package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.LandingPage;

public class LandingTest extends TestBase{

	LandingPage lp;
	DataFile df;

	public LandingTest() {
		super();
	}
	 
	@BeforeMethod
	public void getBrowser(){
		intialization();
		lp = new LandingPage();
		df = new DataFile();		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
		 @Test(priority=1)
		  public void playVid() {
			
			 lp.playVideo();
			  
		  }
		  
		  @Test(priority=2)
		  public void ClickSignUpAndChangeCountry() {
			  
			 lp.clickOnSignUp();
			 
		  }
		  
		  @Test(priority=3)
		  public void SwipeRight() {
			
			 lp.ClickToSwipe(); 
		  }
			  
		  @Test(priority=4)
		  public void SwipeSecond()  {
			
			  lp.ClickToSwipeTwo();
		  
		  }
			  
		  @Test(priority=5)
		  public void SwipeThird() throws InterruptedException {
			  
			  lp.ClickToSwipeThree();
	  
	     }
		 
	     @Test(priority=6, groups = {"GetTitles"})
		 public void GetTitle() {
	    	 
			 lp.GetPageTitles();
			 
		 }
}
