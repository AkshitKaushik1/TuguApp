package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MyPagesPage extends BasePage {

	public MyPagesPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Variables
	 */

	/**
	 * Web Elements
	 */
	By mypageslink 		 =   By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[6]/a");
	By createpagelink	 = 	 By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By pagename			=  	By.xpath("//*[@id='page_title']");
	By pglink			=	By.xpath("//*[@id='page_name']");
	By pagecategory		= 	By.id("page_category");
	By pagedesc			=	By.xpath("//*[@id='page_description']");
	By create			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
	By pagetitle		=   By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div/a");
	
	
	
		public String MyPages(String pgname,String pgurl, String pgcat, String pgdesc)  throws InterruptedException 
		{
		
		click(mypageslink);
		Thread.sleep(3000);
		click(createpagelink);
		Thread.sleep(2000);
		writeText(pagename,pgname);
		Thread.sleep(2000);
		writeText(pglink, pgurl);
		Thread.sleep(2000);
		Select se1 = new Select(driver.findElement(pagecategory));
		Thread.sleep(2000);
		// Select the option by Visible text
		se1.selectByVisibleText(pgcat);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		writeText(pagedesc, pgdesc);
		click(create);
		
		Thread.sleep(10000);
		String pgtitle= driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div/a")).getText();
		
		return pgtitle;
		}
}

