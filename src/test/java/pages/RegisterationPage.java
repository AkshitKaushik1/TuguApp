package pages;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

import utils.Log;

public class RegisterationPage extends BasePage{

	//public static WebDriver     driver;
    public WebDriverWait wait;
    //Constructor
    public RegisterationPage(WebDriver driver) {
        
        super(driver);
    }
	//public RegisterationPage(WebDriver driver) {
	//	super(driver);
	//	        }
	/**
	 * Variables
	 */
	  
	int waittime =4000;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By Register				=By.xpath("//*[@id=\"login\"]/div[5]/div[2]/p/a");
	By loginPage			=By.xpath("//*[@id=\"register\"]/div[9]/div[2]/p/a");
	By userName             = By.xpath("//*[@id='username']");
	By email				= By.xpath("//*[@id='email']");
	By password             = By.xpath("//*[@id='password']");
	By confirmPassword		= By.xpath("//*[@id='confirm_password']");
	By Gender				= By.xpath("//*[@id=\"gender\"]");
	By reCaptcha			= By.xpath("//*[@id='recaptcha-anchor']");
	By term					= By.xpath("//*[@id=\"register\"]/div[8]");
	By signupButton         = By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[1]/form/div[9]/div[1]");
	By Namebtn				= By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
	By user					= By.xpath("//*[@id='head_menu_rght']/li[4]/a");
	By logout				= By.xpath("//*[@id='head_menu_rght']/li[4]/ul/li[14]/a");
	By Name					= By.xpath("//*[@id=\"update-username\"]/b");
	
	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */

	public void RegisterintoTuguApp(String username, String Email, String Password, String ConfirmPassword,String Male) throws InterruptedException {
	Log.info("Trying to Register into Tugu App.");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0, 1500);");
		
		click(Register);
		writeText(userName, username);
		
		writeText(email,Email);
		
		writeText(password, Password);
		
		js.executeScript("window.scrollBy(0, 1000);");
		writeText(confirmPassword,ConfirmPassword);
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(Gender));
					
		// Select the option by index
		se.selectByIndex(2);
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));		
		Thread.sleep(20000);
		click(term);
		click(signupButton);
	}
	
	public String GetName() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(Namebtn);
	
		String name1 = driver.findElement(By.xpath("//*[@id=\"update-username\"]/b")).getText();
		return name1;
		
	}


}
