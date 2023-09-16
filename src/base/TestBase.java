package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public TestBase()  {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/src/config/config.properties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void intialization() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

	
	
	
}
