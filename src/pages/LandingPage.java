package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;
import utilities.testutil;

public class LandingPage extends TestBase{

	

	//public JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
	

	
	
	@FindBy(xpath="//div[@class='FrameBackgroundFull__BackgroundImage']//button")
	public WebElement playButton;
	
	@FindBy(xpath="//div[@class='InlineEmail__Container']//button")
	 public WebElement SignUpButton;
	
	@FindBy(xpath="//div[@class='GeneralContainer GeneralContainer__TV']//button")
	 public WebElement FirstScroller;
	
	//button[@data-tocard='15']"
	//button[@class='Swiper__Button Swiper__Button--prev']
	@FindBy(xpath="//button[@class='Swiper__Button Swiper__Button--prev']")
     public WebElement SecondScroller;
	
	@FindBy(xpath="//button[@class='CarouselArrow CarouselArrow--right']")
	 public WebElement ThirdScroller;

	@FindBy(xpath="//div[@class='ListItem__Text']//a")
	public List<WebElement> TitlesDisplayed;
	
	@FindBy(id="BtnSubmit")
	public WebElement SubmitCountry;
	
	@FindBy(id="oneid-iframe")
	public WebElement SwitchFrame;
	
	@FindBy(linkText="edit")
	public WebElement EditCountry;
	
	@FindBy(id="InputSelect")
	public WebElement selectCountry;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void playVideo()  {
		 Actions action = new Actions(driver);
		
		JavascriptExecutor Scroll =  (JavascriptExecutor) driver;
		Scroll.executeScript("scroll(16, 1453)"); 
		  
		//Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.visibilityOf(playButton));  
	
		  //playButton.click();
		  action.moveToElement(playButton).click().build().perform();
		  
		  //Thread.sleep(2000);
		  
		  playButton.click();
	      action.moveToElement(playButton).click().build().perform();
		 // Thread.sleep(2000);
	}
	
	
	public void clickOnSignUp() {
		 
		  JavascriptExecutor Scroll =  (JavascriptExecutor) TestBase.driver;
		  Scroll.executeScript("scroll(413, 7698)");
		  //Thread.sleep(4000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(SignUpButton)); 
		  
		  SignUpButton.click();
		 // Thread.sleep(2000);
		  
		  TestBase.driver.switchTo().frame(SwitchFrame);
		  
		  EditCountry.click();
		  
		  Select select = new Select(selectCountry);
		  select.selectByIndex(1);
		  
		  SubmitCountry.click();
		  
		//  Thread.sleep(2000);
		 
		  
	}
	
	public void ClickToSwipe()  {
		
		 JavascriptExecutor Scroll =  (JavascriptExecutor) TestBase.driver;
		 Scroll.executeScript("scroll(483, 6241)");
		 //Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.visibilityOf(FirstScroller)); 
		  
			  for(int i=0; i<4;i++) {
				  
				  FirstScroller.click();
				  //Thread.sleep(1000);
			  }
	}
	
	public void ClickToSwipeTwo(){
 
		 JavascriptExecutor Scroll =  (JavascriptExecutor) TestBase.driver;
		  Scroll.executeScript("scroll(1048, 3000)");
		  
		 //Thread.sleep(4000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(SecondScroller)); 
		 
			  for(int i=0; i<4;i++) {
				  
				  SecondScroller.click();
				 // Thread.sleep(1000);
			  }
	}
	
	public void ClickToSwipeThree() {
		
		  Actions action = new Actions(TestBase.driver);
		  
		  JavascriptExecutor Scroll =  (JavascriptExecutor) TestBase.driver;
		  Scroll.executeScript("scroll(1116, 4883)");
		 // Thread.sleep(4000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.visibilityOf(ThirdScroller)); 
		  
			 for(int i=0; i<2;i++) {
				  action.moveToElement(ThirdScroller).perform();
				  ThirdScroller.click();
				 // Thread.sleep(1000);
		  }
	}
	
	public void GetPageTitles() {
		
		for(int i=0;i<TitlesDisplayed.size();i++) {
			System.out.println(TitlesDisplayed.get(i).getText());
		}
		
	}


	

}