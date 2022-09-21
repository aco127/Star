package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import PageObjects.Staff;
import Resources.BrowserBase;

public class AddStaff extends BrowserBase {
	
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("portalurl"));
	}
	
	
	  @Test(priority=1) public void PortalLogin() { AdminPortalLogin adminobj= new
	  AdminPortalLogin(driver);
	  adminobj.LoginToAdminPortal(prop.getProperty("portalusername"),prop.
	  getProperty("portalpwd")); }
	 
	
	@Test(priority=2)
	public void addstaff() throws InterruptedException
	{
		Staff sobj= new Staff(driver);
		sobj.addstaff();
	}

}
