package pages;

import java.util.concurrent.TimeUnit;

import java.time.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NotificationPage extends BasePage{


	public NotificationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
/**
	 * Variables
	 */	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait =   new WebDriverWait(driver,Duration.ofSeconds(35));
	
	/**
	 * Web Elements
	 */
	
	By Frnd	 			=  By.xpath("//*[@id=\"users-cont\"]/div[1]/div/div[1]/div[2]/h4/span/a");
	By Followbtn		=  By.xpath("//*[@id='wo_useract_btn']");
	By profile			=  By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
	By notificationbell	=  By.xpath("/html/body/header/div[1]/nav/div/ul[2]/li[3]/a");
	By activity1		=  By.xpath("//*[@id=\"notification-list\"]/li[1]/div/a");
	By message			=  By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/span[2]/button");
	By sendmsg			=  By.xpath("//*[@id=\"sendMessage\"]");
	By msgnotification  =  By.xpath("/html/body/header/div[1]/nav/div/ul[2]/li[2]/a");
	By msgnotific1		=  By.xpath("/html/body/header/div[1]/nav/div/ul[2]/li[2]/ul/li[1]/div/div[2]");
	
	
	/**
	 * Variables
	 */
	


	public void addAFriend() {
		// TODO Auto-generated method stub
		
		js.executeScript("window.scrollBy(0, 300);");
		click(Frnd);
		click(Followbtn);
		
		
	}
	
	
	public void sendMessage() {
	

		js.executeScript("window.scrollBy(0, 300);");
		click(Frnd);
		click(message);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgnotification));

		writeText(sendmsg,"My Dear Friends! How are you?");
		driver.findElement(sendmsg).sendKeys(Keys.ENTER);
			
		
	}
	
	public void Notification() {
		
		wait.until(ExpectedConditions.elementToBeClickable(notificationbell)).click();
		click(notificationbell);
		click(notificationbell);
		wait.until(ExpectedConditions.visibilityOfElementLocated(activity1));
		
		String act= 	driver.findElement(activity1).getText();
		System.out.println("Notification = "+act);
	}

	
	
	public void MsgNotification() throws InterruptedException {
	
		
		
		WebDriverWait wait =   new WebDriverWait(driver,Duration.ofSeconds(26));
			wait.until(ExpectedConditions.visibilityOfElementLocated(msgnotification));

		click(msgnotification);
		click(msgnotification);
	
//		wait.until(ExpectedConditions.presenceOfElementLocated(msgnotification));

	
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(msgnotific1));
		
		String act1= 	driver.findElement(msgnotific1).getText();
		
		System.out.println(act1);
	}
	
	
	
}
