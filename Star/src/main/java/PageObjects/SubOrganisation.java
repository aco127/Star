package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubOrganisation {
	
	WebDriver driver;
	CommonLocators cobj;
	
	public SubOrganisation(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}

	
	@FindBy(xpath="//div[normalize-space()='Sub Organsiation']")
	WebElement suborg;
	
	@FindBy(xpath="//span[normalize-space()='Add Sub Organization']")
	WebElement addorg;
	

	
	public void addorg()
	{
		suborg.click();
		addorg.click();
		
	}
}
