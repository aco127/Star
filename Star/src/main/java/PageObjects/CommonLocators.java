package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonLocators {

	WebDriver driver;

	
	  public CommonLocators(WebDriver driver) { this.driver = driver;
	  PageFactory.initElements(driver, this); }
	 

	@FindBy(xpath = "//input[@formcontrolname='email']")
	public WebElement emailaddress;

	@FindBy(xpath = "//input[@formcontrolname='pass']")
	public WebElement password;

	@FindBy(xpath="//input[@formcontrolname='firstname']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@formcontrolname='middlename']")
	public WebElement middlename;
	
	@FindBy(xpath="//input[@formcontrolname='lastname']")
	public WebElement lastname;
	
	
	@FindBy(xpath = "//mat-select[@role='combobox']")
	public WebElement dropdown;

	@FindBy(xpath = "//p[normalize-space()='Forgot Password?']")
	public WebElement forgotpwd;

	@FindBy(xpath = "//span[normalize-space()='LOGIN']")
	public WebElement logintbn;

	@FindBy(xpath = "//span[normalize-space()='SUBMIT']")
	public WebElement submitbtn;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	public WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'हिन्दी')]")
	public WebElement hindi;
	
	@FindBy(xpath="//span[contains(text(),'English')]")
	public WebElement english;
	
	@FindBy(xpath="//div[normalize-space()='Organisation']")
	public WebElement organisation;
	
	@FindBy(xpath="//div[normalize-space()='Subadmin']")
	public WebElement subadmin;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	public WebElement phoneno;
	
	@FindBy(xpath="//input[@formcontrolname='address']")
	public WebElement address;
	
	@FindBy(xpath="//input[@formcontrolname='dob']")
	public WebElement dob;
	
	@FindBy(xpath="//mat-select[@formcontrolname='gender']")
	public WebElement gender;
	
	@FindAll(@FindBy(xpath="//span[@class='err-msg']"))
	public List<WebElement> errormsg;
	
	@FindAll(@FindBy(xpath="//span[@class='mat-radio-label-content']"))
	public List<WebElement> radiobtn;
	
	@FindAll(@FindBy(xpath="//label[@class='mat-checkbox-layout']"))
	public List<WebElement> checkbox;
	
	@FindAll(@FindBy(xpath="//input[@type='number']"))
	public List <WebElement> number;
	
	@FindAll(@FindBy(xpath="//td[@role='cell']"))
	public List<WebElement> data;
	
	@FindBy(xpath="//button[@aria-haspopup='menu']/img")
	public WebElement profileicon;
	
	@FindBy(xpath="//button[normalize-space()='Profile']")
	public WebElement profile; 
	
	@FindBy(xpath="//input[@name='filename']")
	public WebElement choosefile;

}
