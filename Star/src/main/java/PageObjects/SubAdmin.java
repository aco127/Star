package PageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubAdmin {
	WebDriver driver;
	CommonLocators cobj;
	
	public SubAdmin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}
	

	@FindBy(xpath="//span[normalize-space()='Add Sub-Admin']")
	WebElement subadmintab;
	
	@FindAll(@FindBy(xpath="//div[contains(text(),' Fill SubAdmin Details ')]/following::button"))
	List<WebElement> newsave;
	
	
	public void addsubAdmin(String email) throws InterruptedException
	{
		cobj.subadmin.click();
		subadmintab.click();
		cobj.name.sendKeys("Organisation");
		cobj.emailaddress.sendKeys(email);
		cobj.phoneno.sendKeys("9876543210");
		cobj.address.sendKeys("A 1001 new Building");
		cobj.address.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		newsave.get(0).click();
		Thread.sleep(1500);
		cobj.submit.click();
		
	}
}
