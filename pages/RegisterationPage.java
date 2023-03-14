package pages;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

import java.util.*;

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
	  
	
	
	 
	
	int waittime =13000;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By Register				=By.xpath("//*[@id=\"login\"]/div[5]/div[2]/p/a");
	By userName             = By.xpath("//*[@id='username']");
	By email				= By.xpath("//*[@id='email']");
	By password             = By.xpath("//*[@id='password']");
	By confirmPassword		= By.xpath("//*[@id='confirm_password']");
	By Gender				= By.xpath("//*[@id=\"gender\"]");
	By reCaptcha			= By.xpath("//*[@id='recaptcha-anchor']");
	By term					= By.name("accept_terms");
	By signupButton         = By.xpath("//*[@id='sign_submit']");


	

	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */


	

	public void RegisterintoTuguApp(String username, String Email, String Password, String ConfirmPassword) throws InterruptedException {
		Log.info("Trying to Register into Tugu App.");
	
		js.executeScript("window.scrollBy(0, 1500);");
		Thread.sleep(3000);
		click(Register);
		writeText(userName, username);
		Thread.sleep(waittime);
		writeText(email,Email);
		Thread.sleep(10000);
		writeText(password, Password);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000);");
		writeText(confirmPassword,ConfirmPassword);
		Thread.sleep(waittime);
		// Create object of the Select class
		Select se = new Select(driver.findElement(Gender));
					
		// Select the option by index
		se.selectByIndex(2);
		Thread.sleep(25000);
		//click(reCaptcha);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
	

		wait	
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
	
		Thread.sleep(waittime);
		
		click(term);
		Thread.sleep(waittime);
		click(signupButton);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -1500);");

	}


}
