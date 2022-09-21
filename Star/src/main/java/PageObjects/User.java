package PageObjects;

import javax.xml.crypto.Data;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class User {
	
WebDriver driver;
	
	CommonLocators cobj;
	public User(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}

	@FindBy(xpath="//div[normalize-space()='User']")
	WebElement user;
	
	@FindBy(xpath="//span[normalize-space()='Add User']")
	WebElement adduser;
	
	@FindBy(xpath="//div[contains(text(),'Fill User Details')]/following::button")
	WebElement savecontinuebtn;
	
	
	
	public void adduser() throws InterruptedException
	{
		user.click();
		adduser.click();
		cobj.firstname.sendKeys("Test");
		cobj.middlename.sendKeys("Mname");
		cobj.lastname.sendKeys("User");
		cobj.emailaddress.sendKeys("org123@yopmail.com");
		cobj.phoneno.sendKeys("9876543210");
		cobj.address.sendKeys("12 HB Dummy Address");
		cobj.dob.sendKeys("020202022");
		cobj.dob.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		
		savecontinuebtn.click();
		Thread.sleep(1500);
		cobj.submit.click();
		
		
		
	}
	
	public void verifyuseradded()
	{
		user.click();
	for (int i=0;i<cobj.data.size();i++)
	{

String expectedText="org123@yopmail.com";
String actualText= cobj.data.get(i).getText();

if(actualText.contains(expectedText))
{
	System.out.print("Text is there "+actualText);
	}
	}
}
}