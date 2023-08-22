package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	
	WebDriver driver;
	JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
	
	
	@FindBy(xpath="//div[@class='FrameBackgroundFull__BackgroundImage']//button")
	public WebElement playButton;
	
	@FindBy(xpath="//div[@class='InlineEmail__Container']//button")
	 public WebElement SignUpButton;
	
	@FindBy(xpath="//div[@class='GeneralContainer GeneralContainer__TV']//button")
	 public WebElement FirstScroller;

	
	@FindBy(xpath="//button[@data-tocard='15']")
     public WebElement SecondScroller;
	
	
	@FindBy(xpath="//button[@class='CarouselArrow CarouselArrow--right']")
	 public WebElement ThirdScroller;

	
	public void openBrowser() throws IOException {
		FileInputStream propReader = new FileInputStream("/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/ErrorCollector/src/prop.properties");
		
		Properties prop = new Properties();
		prop.load(propReader);
		
		String browser = prop.getProperty("Browser");
		
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

	
	public void playVideo() throws InterruptedException {
		Actions action = new Actions(driver);
		
		//JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(16,1453)");
		  
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.visibilityOf(playButton));  
	
		  
		 action.moveToElement(playButton).click().build().perform();
		  
		  Thread.sleep(2000);
		  action.moveToElement(playButton).click().build().perform();
		  Thread.sleep(2000);
	}
	
	
	public void clickOnSignUp() throws InterruptedException {
		 
		 // JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		  Scroll.executeScript("window.scrollBy(413, 7698)");
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(SignUpButton));
		  
		  SignUpButton.click();
		  Thread.sleep(2000);
		  
	}
	
	public void ClickToSwipe() throws InterruptedException {
		
		 JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		 Scroll.executeScript("window.scrollBy(483, 6241)");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.visibilityOf(FirstScroller));
		  
			  for(int i=0; i<4;i++) {
				  
				  FirstScroller.click();
				  Thread.sleep(1000);
			  }
	}
	
	public void ClickToSwipeTwo() throws InterruptedException {
 
		 JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		  Scroll.executeScript("window.scrollBy(1048, 3091)");
		  
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(SecondScroller));
		 
			  for(int i=0; i<4;i++) {
				  
				  SecondScroller.click();
				  Thread.sleep(1000);
			  }
		  
	}
	
	public void ClickToSwipeThree() throws InterruptedException {
		
		  Actions action = new Actions(driver);
		  
		  JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		  Scroll.executeScript("window.scrollBy(1116, 4883)");
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(ThirdScroller));
		  
			 for(int i=0; i<4;i++) {
				  action.moveToElement(ThirdScroller).perform();
				  ThirdScroller.click();
				  Thread.sleep(1000);
		  }
	
	  
	  
	}


	public void closeBrowser() {
		driver.quit();
	}
	

}