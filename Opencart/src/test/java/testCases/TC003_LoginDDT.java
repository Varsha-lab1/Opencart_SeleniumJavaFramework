package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import Utilities.DataProviders;
import testBase.BaseClass;

public class TC003_LoginDDT extends BaseClass 
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String pwd, String exp)
	{
		try {
		//Homepage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.Clickbtn();
		
		//MyAccount
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExist();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				macc.clkLogout();
				Assert.assertTrue(true, "login pass");
				
			}
			else
			{
				Assert.assertTrue(false, "Login failed for valid credentials");
			}
			
		}
		
		else if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				macc.clkLogout();
				Assert.assertTrue(false,"Login succeeded for invalid credentials");
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		
		catch(Exception e)
		{
		Assert.fail("Exception occurred during login test: " + e.getMessage());	
		}
		}
				
	}
		
