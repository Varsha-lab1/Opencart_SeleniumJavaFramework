package testBase;



import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties p;

	@Parameters({"os","browser"})
	@BeforeClass
	
	public void setup(@Optional("windows") String os, @Optional("chrome") String br) throws IOException
	{
		//Loading config properties file
		FileReader file= new FileReader("./src/test/resources//config.properties");
		p=new Properties();
		p.load(file);
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		default : System.out.println("Invalid browser name");
		return;
		}
		
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL1"));
		
	}
	/*@AfterClass
	public void teardown()
	{
		driver.quit();
	}*/
	
	
	public String randomString()
	{
		String generatedString =RandomStringUtils.randomAlphabetic(3);
		return generatedString;
		
	}
	
	public String randomNumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomAlphanumeric()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber= RandomStringUtils.randomNumeric(3);
		return (generatedstring+ "@"+ generatednumber);
	}

}
