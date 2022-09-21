package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	WebDriver driver;
	CommonLocators cobj;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()='Edit']")
	WebElement edit;
	
	@FindBy(xpath="//input[@formcontrolname='img']")
	WebElement choosefile;
	
	
	
	public Profile(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}
	
	
	public void editprofileimage() throws AWTException, InterruptedException
	{
		cobj.profileicon.click();
		cobj.profile.click();
		edit.click();
		Thread.sleep(4000);
		//cobj.choosefile.click();
		choosefile.click();
	//	choosefile.sendKeys(Keys.ENTER);
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\shilp\\Pictures\\Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
	}

}
