
package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;
import utils.Log;

public class BaseTest {

	
    public WebDriver driver;
    public LoginPage  loginPage;
    public HomePage homePage;
    public RegisterationPage registerationPage;
 
    
    public WebDriver getDriver() {
        return driver;
    }
   
   	
    
    @BeforeClass
    public void classLevelSetup() throws InterruptedException {
        Log.info("Tests is starting!");
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NONE);
        option.addArguments("--disable-notifications");
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        registerationPage = new RegisterationPage(driver);
      
      
    }
        
    
	
	//  @AfterMethod public void methodLevelSetup() throws InterruptedException {
		 
	    
	  
	//  }
	 
	 
	  
    @AfterClass
    public void teardown() {
    	
        Log.info("Tests are ending!");
      // driver.quit();
    }
    
   
 
 
}