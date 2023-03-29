package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

import utils.Log;

public class MyGroupsPage extends BasePage {

	public MyGroupsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	/**
	 * Variables
	 */
	
	
	/**
	 * Web Elements
	 */
	
	By mygroupslink = By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[5]/a");
	By creategroup  = By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By groupname	= By.xpath("//*[@id='group_title']");
	By grouplink 	= By.xpath("//*[@id='group_name']");
	By desc			= By.id("group_about");
	By grouptype	= By.xpath("//*[@id='privacy']");
	By category		= By.id("category");
	By createbttn	= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
	By goback		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/a");
	By grouplvl		= By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/a");
	By member		= By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/span");
	
	
	
	
	public String MyGroups(String gname,String link,String gdesc,String type, String cat) throws InterruptedException    {
		Log.info("Trying to validate my groups.");
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	click(mygroupslink);
	Thread.sleep(2000);
	click(creategroup);
	Thread.sleep(2000);
	writeText(groupname, gname);
	Thread.sleep(2000);
	writeText(grouplink, link);
	Thread.sleep(5000);
	writeText(desc, gdesc);
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300);");
	
	Select se = new Select(driver.findElement(grouptype));
	Thread.sleep(2000);
	// Select the option by index
	se.selectByVisibleText(type);
	
	Thread.sleep(2000);
	Select se1 = new Select(driver.findElement(category));
	Thread.sleep(2000);
	// Select the option by index
	se1.selectByVisibleText(cat);
	Thread.sleep(2000);
	click(createbttn);
	Thread.sleep(4000);
	
	String level =driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/a")).getText();
	String membernumber = driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/span")).getText();
	
	return level;
	}
}
