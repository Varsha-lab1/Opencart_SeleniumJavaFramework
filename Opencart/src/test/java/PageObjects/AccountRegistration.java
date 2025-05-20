package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistration extends BasePage {
	WebDriver driver;
	public AccountRegistration(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword; 
	
    
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/input")
	WebElement chkPolicy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContine;

	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	public void setPrivacyPolicy()
	{
		 try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(chkPolicy));
		        chkPolicy.click();
		    } catch (Exception e) {
		        
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chkPolicy);
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chkPolicy);
		    }
	}
	
	public void ClickContine()
	{
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(btnContine));

		    // Scroll and click using JavaScript
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", btnContine);
		    js.executeScript("arguments[0].click();", btnContine);
		}

	


}
