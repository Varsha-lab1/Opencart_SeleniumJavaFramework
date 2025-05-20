package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.Super;

public class HomePage extends BasePage {
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);


	}
	
	
	@FindBy(xpath="//*[@id='top']/div/div/div[2]/ul/li[2]/div/a/span")
	WebElement lnkMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	public void clickMyRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}

}
