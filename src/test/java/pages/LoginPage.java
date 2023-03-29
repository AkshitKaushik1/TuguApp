package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.JSErrorLogs;
import utils.Log;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class LoginPage extends BasePage {
	/**
	 * Constructor
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * Variables
	 */

	int waittime=8000;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */

	By userName                = By.xpath("//*[@id='username']");
	By password               = By.xpath("//*[@id='password']");
	By loginButton             = By.xpath("//*[@id=\"login\"]/div[5]/div[1]/button");



	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */




	public void logintoTuguApp(String username, String Password) throws InterruptedException {
		Log.info("Trying to login to Tugu App.");
		Thread.sleep(10000);
		writeText(userName, username);
		Thread.sleep(5000);
		writeText(password, Password);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1500);");

		click(loginButton);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -1500);");

	}
	/* //Verify Username Condition
    public LoginPage verifyLoginUserName(String expectedText) {
        Log.info("Verifying login username.");
        waitVisibility(errorMessageUsernameXpath);
        assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }
    //Verify Password Condition
    public LoginPage verifyLoginPassword(String expectedText) {
        Log.info("Verifying login password.");
        waitVisibility(errorMessagePasswordXpath);
        assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
    }
    //Verify Password Condition
    public LoginPage verifyLogError() {
        Log.info("Verifying javascript login errors.");
        assertTrue(JSErrorLogs.isLoginErrorLog(driver));
        return this;
    }*/
}