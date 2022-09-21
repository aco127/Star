package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import PageObjects.SubAdmin;
import Resources.BrowserBase;

public class SP_addSubAdmin extends BrowserBase{
	
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
	public void AddsubAdmin() throws InterruptedException
	{
		SubAdmin sobj = new SubAdmin(driver);
		sobj.addsubAdmin(prop.getProperty("Email"));
	}
	

}
