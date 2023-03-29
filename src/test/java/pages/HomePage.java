package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.Log;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By loginregister        = By.xpath("//*[@id=\"html-body\"]/div[7]/header/div[3]/div[1]/div/a");
	By Register				=By.xpath("//*[@id=\"login\"]/div[5]/div[2]/p/a");
	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */

	//Go to Login Page
	public HomePage openTuguApp() throws InterruptedException {
		Log.info("Opening Tugu App.");

		driver.get(baseURL);
		Thread.sleep(5000);
		return this;
	}

	public LoginPage loginTuguApp() throws InterruptedException {
		Log.info("Click on login TuguApp.");
		

		Thread.sleep(5000);
		click(loginregister);
		Thread.sleep(5000);
		return new LoginPage(driver);
	}


}
