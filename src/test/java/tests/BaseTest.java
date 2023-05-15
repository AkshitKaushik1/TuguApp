
package tests;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import pages.AddProfilePage;
import pages.AlbumsPage;
import pages.BlogPage;
import pages.ExplorePage;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.MyGroupsPage;
import pages.MyPagesPage;
import pages.NotificationPage;
import pages.PostPage;
import pages.RecentNewsFeedPage;
import pages.RegisterationPage;
import pages.Savedpostpage;
import utils.Log;

public class BaseTest {

	
    public WebDriver driver;
    public LoginPage  loginPage;
    public HomePage homePage;
    public RegisterationPage registerationPage;
    public RecentNewsFeedPage recentNewsFeedPage;
    public MyGroupsPage myGroupsPage;
    public MyPagesPage myPagesPage;
    public AlbumsPage albumPage;
    public ExplorePage explorePage;
    public AddProfilePage addprofilepage;
    public Savedpostpage savedpostpage;
    public BlogPage blogpage;
    public PostPage postpage;
    public NotificationPage notificationPage;
    public LogoutPage logoutPage;
    public FirefoxProfile profile;
    public FirefoxProfile firefoxProfiles;
    
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
 //       option.addArguments("--headless=new");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        registerationPage = new RegisterationPage(driver);
        recentNewsFeedPage = new RecentNewsFeedPage(driver);
        myGroupsPage = new MyGroupsPage(driver);
        myPagesPage = new MyPagesPage(driver);
        albumPage = new AlbumsPage(driver);
        explorePage = new ExplorePage(driver);
        addprofilepage = new AddProfilePage(driver);
        savedpostpage = new Savedpostpage(driver);
        blogpage = new BlogPage(driver);
        postpage = new PostPage(driver);
        logoutPage = new LogoutPage(driver);
        notificationPage = new NotificationPage(driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
      
     
	/*
	@BeforeClass
    public void classLevelSetup() throws InterruptedException {
        Log.info("Tests is starting!");
        
        
        System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
        Map < String, Object > prefs = new HashMap < String, Object > ();
        Map < String, Object > profile = new HashMap < String, Object > ();
        Map < String, Object > contentSettings = new HashMap < String, Object > ();                 
       
        contentSettings.put("geolocation", 1);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
   
        
        FirefoxOptions option = new FirefoxOptions();
        option.addPreference("dom.webnotifications.enabled", false);
     
        driver = new FirefoxDriver(option);
     
        option.setPageLoadStrategy(PageLoadStrategy.NONE);
      
        option.addArguments("--remote-allow-origins=*");
     // option.addArguments("--headless=new");
      
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage=new HomePage(driver);
        registerationPage = new RegisterationPage(driver);
        recentNewsFeedPage = new RecentNewsFeedPage(driver);
        myGroupsPage = new MyGroupsPage(driver);
        myPagesPage = new MyPagesPage(driver);
        albumPage = new AlbumsPage(driver);
        explorePage = new ExplorePage(driver);
        addprofilepage = new AddProfilePage(driver);
        savedpostpage = new Savedpostpage(driver);
        blogpage = new BlogPage(driver);
        postpage = new PostPage(driver);
        logoutPage = new LogoutPage(driver);
        notificationPage = new NotificationPage(driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
      */  
    
	
	 
	@AfterMethod public void methodLevelSetup() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 }
	
	@AfterClass
	 public void afterClassSetup() throws InterruptedException{
		 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
	  
    @AfterClass
    public void teardown() {
    	
        Log.info("Tests are ending!");
        driver.quit();
    }
    
   
 
 
}