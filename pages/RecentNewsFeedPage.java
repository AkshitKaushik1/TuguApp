package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import utils.Log;

public class RecentNewsFeedPage extends BasePage{

	public RecentNewsFeedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//	       
	/**
	 * Variables
	 */
	  
	int waittime =4000;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By NewsFeedLink			=By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[1]/a");
	By topfeed1				=By.xpath("//*[@id=\"post-505\"]/div/div[1]/div[3]/h6/span/a");
	By secondtop			=By.xpath("//*[@id=\"post-504\"]/div/div[1]/div[3]/h6/span[1]");
	
	
	public String RecentNewsFeed() throws InterruptedException {
		
		Log.info("Trying to validate recent post from News Feed.");
		
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, 500);");
			click(NewsFeedLink);
			Thread.sleep(3000);
			String topfeed = driver.findElement(topfeed1).getText();
			String topfeed1= topfeed.replace("hrs", "").trim();
			System.out.println(topfeed1);
		
			js.executeScript("window.scrollBy(0, 600)");
			String secondtopfeed = driver.findElement(secondtop).getText();
			String secondtopfeed1= secondtopfeed.replace("hrs", "").trim();
			System.out.println(secondtopfeed1);
			
			return topfeed;
			
			
	}
	
	
}
