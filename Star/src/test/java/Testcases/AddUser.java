package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import PageObjects.User;
import Resources.BrowserBase;

public class AddUser  extends BrowserBase {
	
	@BeforeTest
	public void launchBrowser() throws IOException
	{
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("portalurl"));
	}
	
	@Test(priority=1)
	public void PortalLogin()
	{
		AdminPortalLogin adminobj= new AdminPortalLogin(driver);
		adminobj.LoginToAdminPortal(prop.getProperty("portalusername"),prop.getProperty("portalpwd"));
	}
		
	  @Test(priority=2) public void adduser() throws InterruptedException
	  { 
		  User uobj = new User(driver); 
		  uobj.adduser(); 
		  }
	 

	@Test(priority=3)
	public void verifyuser()
	{
		User uobj = new User(driver);
		uobj.verifyuseradded();
		
	}

}
