package Resources;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities cap;
    
	// private final static String APP_PACKAGE_NAME = "com.stella";
		//private final static String APP_ACTIVITY_NAME = "com.stella.MainActivity";
	 public static Properties prop;
	
  public static void Android_LaunchApp() throws MalformedURLException {
  cap = new DesiredCapabilities();
  File appDir = new File(System.getProperty("user.dir") + "/APK/");
//File app= new File(appDir,"mamalift-QA-29Jul (2).apk");
 //File app= new File(appDir,"mamalift_UAT_20July.apk");
 File app = new File(appDir,"MSHS-CU001-UAT-1Sept.apk");
//File app= new File(appDir,"mshsCDT001QA-9Sep.apk");
//File app= new File(appDir,"mshsCDT001QA12sept.apk");

  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());	
  driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
  AppDriver.setDriver(driver);
  System.out.println("Android driver is set");
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     
    }
    
    public static void iOS_LaunchApp() throws MalformedURLException
    {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("platformVersion", "13.5");
        //cap.setCapability("usePrebuiltWDA", true);
        //cap.setCapability("bundleId", "com.SamadiPour.SimpleCalculator");
        //cap.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        //cap.setCapability("bundleId", "com.apple.MobileAddressBook");
        cap.setCapability("bundleId", "io.cloudgrey.the-app");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        AppDriver.setDriver(driver);
        System.out.println("iOS driver is set");
   }
   

	/*
	 * public static void initializeproperty() throws IOException {
	 * 
	 * 
	 * prop = new Properties(); String propertiesPath =
	 * System.getProperty("user.dir") +
	 * "\\src\\main\\java\\PathReposiory\\obj.properties"; FileInputStream fis = new
	 * FileInputStream(propertiesPath); prop.load(fis); }
	 */
		
    public static void closeApp(){
        driver.quit();
    }

	
    
}
