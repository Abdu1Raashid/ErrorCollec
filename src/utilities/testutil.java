package utilities;

import org.openqa.selenium.JavascriptExecutor;

import base.TestBase;



public class testutil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	
	
	}

