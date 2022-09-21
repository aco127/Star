package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import PageObjects.Program;
import Resources.BrowserBase;

public class SP_addProgram extends BrowserBase {
	
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("SuperAdminurl"));
	}
	
	@Test(priority=1)
	public void SuperAdminLogin()
	{
		AdminPortalLogin adminobj= new AdminPortalLogin(driver);
		adminobj.LoginToAdminPortal(prop.getProperty("Username"),prop.getProperty("Password"));
	}
	
	@Test(priority=2)
	public void addProgram()
	{
		Program pobj = new Program(driver);
		pobj.AddeventdrivenProgram();
		
		
	}
	
	@Test(priority=3)
	public void addprogramtimedriver()
	{
		Program pobj = new Program(driver);
		pobj.AddtimedrivenProgram();
	}

}
