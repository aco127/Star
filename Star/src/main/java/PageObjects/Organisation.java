package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Organisation {
	
	WebDriver driver;
	CommonLocators cobj;
	
	@FindBy(xpath="//span[normalize-space()='Add Organisation']")
	WebElement addOrganisation;
	
	@FindAll(@FindBy(xpath="//span[normalize-space()='Save & Continue'][1]"))
	List<WebElement> savecontniuebtn;
	
	
	@FindBy(xpath="//span[@class='mat-button-wrapper'][normalize-space()='Save & Continue']")
	WebElement save;
	
	@FindAll(@FindBy(xpath="//div[contains(text(),' Fill Organisation Details ')]/following::button"))
List<WebElement> newsave;
	
	//span[contains(text(),'Continue')]
	
	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	public Organisation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}
	
	public void addOrganisation(String email) throws InterruptedException
	{
		cobj.organisation.click();
		addOrganisation.click();
		cobj.name.sendKeys("Organisation");
		cobj.emailaddress.sendKeys(email);
		cobj.phoneno.sendKeys("9876543210");
		cobj.address.sendKeys("A 1001 new Building");
		
		Thread.sleep(1500);
		cobj.address.sendKeys(Keys.TAB); Thread.sleep(1500);
		newsave.get(0).click();
		
		cobj.radiobtn.get(0).click();
		
	//	cobj.radiobtn.get(0).sendKeys(Keys.TAB);
		Thread.sleep(1500);
		newsave.get(1).click();
		
		Thread.sleep(2500);
		cobj.checkbox.get(0).click(); Thread.sleep(1500); 
		cobj.submit.click();
		//cobj.submit.click();
	
	}
	
	public void organisation_inputvalidation()
	{
		cobj.organisation.click();
		addOrganisation.click();
		
		cobj.name.sendKeys("32");
		cobj.name.sendKeys(Keys.BACK_SPACE);
		cobj.name.sendKeys(Keys.BACK_SPACE);
		Assert.assertEquals(cobj.errormsg.get(0).getText(),"Please enter name", "Message not received");
		
		cobj.emailaddress.sendKeys("Test@yopmai");
		Assert.assertEquals(cobj.errormsg.get(1).getText(),"Please enter valid email", "Message not received");
		
		cobj.phoneno.sendKeys("jhgsjdkjh");
		Assert.assertEquals(cobj.errormsg.get(2).getText(),"Please enter valid mobile number", "Message not received");

		cobj.address.sendKeys("Ab");
		cobj.address.sendKeys(Keys.BACK_SPACE);
		cobj.address.sendKeys(Keys.BACK_SPACE);
		Assert.assertEquals(cobj.errormsg.get(3).getText(),"{{'addressRequired'|translate}", "Message not received");

	}

	

}
