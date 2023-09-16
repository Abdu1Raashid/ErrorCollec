package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.TestBase;
import utilities.testutil;

public class NavLoginPage extends TestBase{
	
	
		@FindBy(xpath="//div[@class='UserMenu']")
		public WebElement LoginBtn;
		
		@FindBy(id="InputIdentityFlowValue")
		public WebElement EmailInput;
		
		@FindBy(id="oneid-iframe")
		public WebElement iframe;
		
		@FindBy(xpath="//button[@id='BtnSubmit']")
		public WebElement Continue;
		
		@FindBy(id="InputIdentityFlowValue-error")
		public WebElement EmailError;
		
		@FindBy(id="InputFirstName")
		public WebElement FirstNameInput;
		
		@FindBy(id="InputLastName")
		public WebElement LastNameInput;
		
		@FindBy(id="password-new")
		public WebElement PasswordInput;
		
		@FindBy(id="BtnSubmit")
		public WebElement CreateButton;
		
		@FindBy(id="InputFirstName-error")
		public WebElement FirstNameError;
		
		@FindBy(id="InputLastName-error")
		public WebElement LastNameError;
		
		@FindBy(id="password-new-error")
		public WebElement PasswordError;
		
	public NavLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
			public void ClickBtn() {
				LoginBtn.click();
			}
			
			public void EmailClick() {
				EmailInput.click();
			}
			
			public void ClickContinue() {
				Continue.click();
			}
		
			public void AddInputValueToEmail(String a) {
				EmailInput.sendKeys(a);
			}
			
			public void SwitchFrame() {
				driver.switchTo().frame(iframe);
			}
			
			public void Login(String a) {
				
				  testutil.wait.until(ExpectedConditions.visibilityOf(LoginBtn)); 
				  ClickBtn();
				  
				  testutil.wait.until(ExpectedConditions.visibilityOf(iframe)); 
				  SwitchFrame();
			      AddInputValueToEmail(a);
				
			      testutil.wait.until(ExpectedConditions.visibilityOf(Continue)); 
				  ClickContinue();
				  
			}
			
			public String ReadEmailError() {
				String ActualError = EmailError.getText();
				return ActualError;
			}
			
			public String ReadFirstNameError() {
				 String ActualError = FirstNameError.getText();
				 return ActualError;
			}
			
			public String ReadFLastNameError() {
				 String ActualError = LastNameError.getText();
				 return ActualError;
			}
			
			public String ReadPasswordError() {
				 String ActualError = PasswordError.getText();
				 return ActualError;
			}
			
			public void CreateAccount(String a, String b, String c) {
				FirstNameInput.sendKeys(a);
				LastNameInput.sendKeys(b);
				PasswordInput.sendKeys(c);
				
				testutil.wait.until(ExpectedConditions.visibilityOf(CreateButton));
				CreateButton.click();
				
				
			}
		
		}
