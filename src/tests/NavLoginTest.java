package tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.NavLoginPage;

public class NavLoginTest extends TestBase{
  
		NavLoginPage nlp;
		DataFile df;
		
	
	public NavLoginTest() {
		super();
	}
		
	  @BeforeMethod
	  public void beforeMethod() {
		  intialization();
		  nlp = new NavLoginPage();
		  df = new DataFile();
	  }
	
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
		  
		  @Test(priority=1)
		  public void LoginWithError() {
			  
			  nlp.Login(df.EnterEmailOne);
			  Assert.assertEquals(nlp.ReadEmailError(), df.EmailError);
			  
		  }
		  
		  @Test(priority=2, groups= {"LoginCreateAcc"})
		  public void GenFirstNameError() {
			  
			  nlp.Login(df.EnterEmailTwo);
			  nlp.CreateAccount("", "lastName", "pass");
			  Assert.assertEquals(nlp.ReadFirstNameError(),df.FNameError );
			   
		  }
		  
		  @Test(priority=3, groups= {"LoginCreateAcc"})
		  public void GenLastNameError() {
			  
			  nlp.Login(df.EnterEmailTwo);
			  nlp.CreateAccount("FirstName", "", "pass");
			  Assert.assertEquals(nlp.ReadFLastNameError(),df.LNameError );
			   
		  }
		  
		  @Test(priority=3, groups= {"LoginCreateAcc"})
		  public void GenPasswordError() {
			  
			  nlp.Login(df.EnterEmailTwo);
			  nlp.CreateAccount("FirstName", "LastName", "");
			  Assert.assertEquals(nlp.ReadPasswordError(),df.NoPassError );
			   
		  }
		  
		 
		  @Test(priority=3, groups= {"LoginCreateAcc"})
		  public void GenShortPasswordError(){
			  
			  nlp.Login(df.EnterEmailTwo);
			  nlp.CreateAccount("FirstName", "LastName", "sds");
			  Assert.assertEquals(nlp.ReadPasswordError(),df.ShortPassError );
			   
		  }
		  
		  
		  @Test(priority=3, groups= {"LoginCreateAcc"})
		  public void GenPredPasswordError() {
			  
			  nlp.Login(df.EnterEmailTwo);
			  nlp.CreateAccount("FirstName", "LastName", "sdsdsd");
			  Assert.assertEquals(nlp.ReadPasswordError(),df.PredPassError );
			   
		  }
		  
		  
		  
		  
		  
		
		}
