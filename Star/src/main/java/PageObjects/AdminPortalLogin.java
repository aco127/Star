package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminPortalLogin {
	
	WebDriver driver;
	
	CommonLocators cobj;
	
	@FindBy(xpath="//span[contains(text(),'लॉग इन करें')]")
	WebElement hindi;
	
	@FindBy(xpath="//span[contains(text(),'LOGIN')]")
	WebElement english;

	@FindBy(xpath="//div[@id='toastr-container']")
	WebElement message;
	
	public AdminPortalLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}
	

	public void LoginToAdminPortal(String useremail,String userpwd)
	{
		//emailaddress.sendKeys("Test@123");
		
		cobj.emailaddress.sendKeys(useremail);
		cobj.password.sendKeys(userpwd);
		cobj.logintbn.click();
		System.out.println(message.getText());
		String x =message.getText();
		//Assert.assertEquals(message.getText(), x.contains("Login Successfull"), "Login Fail");
		//Assert.assertEquals(message.getText(), "लॉग इन करें", "Did not got converted to Hindi");
	}
	
	public void ForgotPassword()
	{
		cobj.forgotpwd.click();
		cobj.emailaddress.sendKeys("Test");
		cobj.submitbtn.click();
		
	}
	
	public void ChangeLangtoHindi()
	{
	cobj.dropdown.click();
	cobj.hindi.click();
	Assert.assertEquals(hindi.getText(), "लॉग इन करें", "Did not got converted to Hindi");
	
	}
	
	public void ChangeLangtoEnglish()
	{
		cobj.dropdown.click();
		cobj.english.click();
		Assert.assertEquals(english.getText(), "LOGIN", "Did not got converted to English");
		
	}
}
