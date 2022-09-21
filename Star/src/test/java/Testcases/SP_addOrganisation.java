package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminPortalLogin;
import PageObjects.Organisation;
import PageObjects.Yopmail;
import Resources.BrowserBase;

public class SP_addOrganisation extends BrowserBase {

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
	
	
	/*
	 * @Test(priority=2) public void inputVerificationOrganisation() { Organisation
	 * obj= new Organisation(driver); obj.organisation_inputvalidation();
	 * 
	 * }
	 */
	 
	
	@Test(priority=3)
	public void verifyaddOrganisation() throws InterruptedException
	{
		Organisation objorg= new Organisation(driver);
		objorg.addOrganisation(prop.getProperty("Email"));
}
	
	@Test(priority=4,dependsOnMethods="verifyaddOrganisation")
	public void verifyOrgMail() throws InterruptedException
	{
		Yopmail yobj= new Yopmail(driver);
		yobj.checkemail(prop.getProperty("Email"));
		yobj.getdatafrommail();
	}
	
	
}