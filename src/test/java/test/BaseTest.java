package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import util.Log;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	
	public LoginPage  loginPage;
	public HomePage   homePage;
	public WebDriver getDriver() {
	        return driver;
	    }


@BeforeClass
public void classLevelSetup() throws InterruptedException {
    Log.info("Tests is starting!");
    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    ChromeOptions option=new ChromeOptions();
    option.setPageLoadStrategy(PageLoadStrategy.NONE);
    option.addArguments("--remote-allow-origins=*");
    option.addArguments("disable-notifications");
    driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    
    loginPage = new LoginPage(driver);
    homePage  = new HomePage (driver);
    
}



@AfterMethod public void methodLevelSetup() throws InterruptedException {
	 
  
}



@AfterClass
public void teardown() {
	
  Log.info("Tests are ending!");
// driver.quit();
}}