package PageObjects;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yopmail {
	WebDriver driver;
	
	  public Yopmail(WebDriver driver) { 
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  }
	 
	
	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement email;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;

	@FindBy(xpath = "//span[@class='lmf' and text()='CURIO']")
	WebElement mailinbox;
	

@FindBy(xpath="//li[contains(text(),'Please go to')]")
	WebElement link;


	
	public void checkemail(String emailid) throws InterruptedException
	{
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  driver.get("https://yopmail.com"); Thread.sleep(5000);
		  email.sendKeys(emailid); Thread.sleep(5000); checkinbox.click();
		  driver.switchTo().frame("ifmail"); Thread.sleep(9000);
		 
	}
	
	public void getdatafrommail()
	{
		String regcode= link.getText();
		System.out.println(regcode);
	}

}
