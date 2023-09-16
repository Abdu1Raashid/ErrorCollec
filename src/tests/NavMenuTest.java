package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.NavMenuPage;

public class NavMenuTest extends TestBase{
	
		NavMenuPage nmp;
		
		@FindBy(xpath="//nav[@class='NavBar']//li[5]")
		public WebElement NavMenuButton;
		
		@FindBy(xpath="//div[@class='MenuModal__Content__Right']//li[4]")
		public WebElement BookTrip;
		
		@FindBy(id="oneid-secure-responder")
		public WebElement MenuFrame;
		

	public NavMenuTest() {
		super();
	}

	  @BeforeMethod
	  public void beforeMethod() throws IOException {
		  intialization();
		  nmp = new NavMenuPage();		  
	  }
	
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
  }
		
		  @Test
		  public void GetToTrip() throws InterruptedException {
			  Thread.sleep(1000);
			  
			  nmp.ClickMenu();
			  Thread.sleep(3000);
			
			  nmp.ClickBookATrip();
		
		  }
  
}
