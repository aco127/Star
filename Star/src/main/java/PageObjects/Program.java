package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program {

	WebDriver driver;
	CommonLocators cobj;
	
	public Program(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 cobj= new CommonLocators(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Program']")
	WebElement program;
	
	@FindBy(xpath="//span[normalize-space()='Add Program']")
	WebElement addProgram;
	
	
	
	public void AddeventdrivenProgram()
	{
		program.click();
		addProgram.click();
		cobj.name.sendKeys("TestProgramnew");
		cobj.radiobtn.get(1).click();
		cobj.number.get(0).sendKeys("7");
		cobj.submit.click();
		
	}
	
	public void AddtimedrivenProgram()
	{
		program.click();
		addProgram.click();
		cobj.name.sendKeys("TestProgramold");
		cobj.radiobtn.get(0).click();
		cobj.number.get(0).sendKeys("4");
		cobj.number.get(1).sendKeys("4");
		cobj.submit.click();
		
	}
	
}
