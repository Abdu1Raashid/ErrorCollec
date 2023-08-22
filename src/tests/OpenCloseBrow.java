package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

public class OpenCloseBrow {

	
	WebDriver driver;
		public void openBrowser() throws IOException {
			FileInputStream propReader = new FileInputStream("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/src/prop.properties");
			
			Properties prop = new Properties();
			prop.load(propReader);
			
			String browser = "Firefox";
			
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
		
		
		
		public void OpenLandingPage() {
			driver.get("https://www.nationalgeographic.com/");
		}
	
		public void closeBrowser() {
			driver.quit();
		}
}
