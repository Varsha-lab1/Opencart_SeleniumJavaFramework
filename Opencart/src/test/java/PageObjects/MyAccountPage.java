package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
	super(driver);
    PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//h1[normalize-space()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group mb-3']//a[text()='Logout']")
	WebElement lnkLogout;
	
	public boolean isMyAccountPageExist()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(msgHeading));
			return msgHeading.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println("My Account page heading not found: " + e.getMessage());
			return false;
		}
	}
	
	public void clkLogout()
	{
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.visibilityOf(lnkLogout));

	        // Scroll into view
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lnkLogout);
	        Thread.sleep(500);;
	        wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
	        
	        lnkLogout.click();
	    } catch (Exception e) {
	        System.out.println("Logout failed: " + e.getMessage());
	    }
	}
	
	

}
