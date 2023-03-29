package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlbumsPage extends BasePage {

	public AlbumsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variables
	 */
	String img= "D:\\TUGU\\photos\\pic1.jpg";

	/**
	 * Web Elements
	 */
	By albumslink  		= By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[2]/a");
	By createbutton		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By albumname		= By.xpath("//*[@id='album_name']");
	By uploadimg		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[2]/div");
	By publish			= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
	
	
	
	
	
		public void CreateAlbum(String picture)  throws InterruptedException 
		{

			click(albumslink);
			Thread.sleep(3000);
			click(createbutton);
			Thread.sleep(3000);
			writeText(albumname,"friends");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200);");
			Thread.sleep(33000);
			
			
	Select se = new Select((WebElement) driver.findElements(By.xpath("//*[@class=\"upload_ad_image\"]")));
	se.getFirstSelectedOption();

		
			Thread.sleep(25000);
			click(publish);
			
		}
}
