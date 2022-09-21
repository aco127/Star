package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Staff {
	
WebDriver driver;
CommonLocators cobj;

@FindBy(xpath="//div[normalize-space()='Staff']")
WebElement staff;

@FindBy(xpath="//span[normalize-space()='Add Staff']")
WebElement addstaff;

@FindBy(xpath="//mat-select[@formcontrolname='gender']")
WebElement dropdown;

@FindBy(xpath="//span[normalize-space()='Male']")
WebElement male;



public Staff(WebDriver driver) 
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	 cobj= new CommonLocators(driver);
}


public void addstaff() throws InterruptedException
{
	staff.click();
	addstaff.click();
	cobj.name.sendKeys("Teststaff");
	cobj.emailaddress.sendKeys("Staff234@yopmail.com");
	cobj.phoneno.sendKeys("9876543210");
	
	
	dropdown.click();
	Thread.sleep(1000);
	male.click();
	Thread.sleep(1500);
	cobj.address.sendKeys("12 BH Address");
	Thread.sleep(1000);
	cobj.address.sendKeys(Keys.TAB,Keys.TAB);
	Thread.sleep(1000);
	cobj.submit.click();
}
}
