package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	@Test
	public void verify_Login()
	{
		try
		{
		HomePage hp=new HomePage(driver);
	
		hp.clickMyAccount();
		hp.clickLogin();
	
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.Clickbtn();
		
		MyAccountPage macc=new MyAccountPage(driver);
		Boolean targetpage=macc.isMyAccountPageExist();
		Assert.assertTrue(targetpage);
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
