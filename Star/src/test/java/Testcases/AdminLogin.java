package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import Resources.BrowserBase;


public class AdminLogin  extends BrowserBase{

	AdminPortalLogin adminobj ;
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("SuperAdminurl"));
	}
	
	
	@Test(priority=1)
	public void VerifyHindiLanguage()
	{
		adminobj= new AdminPortalLogin(driver);
		adminobj.ChangeLangtoHindi();
			
	}
	
	@Test(priority=2)
	public void VerifyEnglishLanguage()
	{
	
		adminobj.ChangeLangtoEnglish();
			
	}
	@Test(priority=3)
	public void SuperAdminLogin()
	{
		adminobj.LoginToAdminPortal(prop.getProperty("Username"),prop.getProperty("Password"));

	}

}
