package testCases;
import org.testng.Assert;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.AccountRegistration;
import PageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	//public WebDriver driver;
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
	
		hp.clickMyAccount();
		hp.clickMyRegister();
		AccountRegistration regpage=new AccountRegistration(driver);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomNumber().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		
		String password=randomAlphanumeric();
		regpage.setPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.ClickContine();
		
		
		//String confmsg=regpage.get
		
		
		
	}

	
	













}
