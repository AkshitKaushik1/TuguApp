package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Log;

public class HomePage extends BasePage {
    /*
     * --**
     * Constructor
     */
    public HomePage (WebDriver driver) {
        super(driver);
    } 
    /**
     * Web Elements
     */

    By Poststatus               = By.xpath("//*[@id=\"post-textarea\"]/div/textarea");
    By emoji                    = By.xpath("//*[@id=\"dropdownEmo\"]");
    By emojidropdown            = By.xpath("//*[@id=\"post-textarea\"]/div/div[2]/ul/span[12]/span");
    By sharebutton              = By.xpath("//*[@id=\"publisher-button\"]");
    By uploadImage              = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[12]/div[2]/span");
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    public HomePage Poststatus () throws InterruptedException {
        Log.info("Publish a status");
        Thread.sleep(6000);
        click(Poststatus);
        Thread.sleep(3000);
        writeText(Poststatus,"Hi all");
        click(emoji);
        Thread.sleep(4000);
        click(emojidropdown);
        Thread.sleep(4000);
        click(sharebutton);
        
        return new HomePage(driver);
        
    }
    public HomePage UploadImage () throws InterruptedException {
    	Log.info("Uploading an Image");
    	Thread.sleep(6000);
        click(Poststatus);
        Thread.sleep(3000);
        writeText(Poststatus,"Hi all");
        Thread.sleep(20000);
        //click(uploadImage);
        //Thread.sleep(3000);
        //WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[12]/div[2]/span"));
       //writeText(uploadImage,("/tugu/Pictures/1020071.jpg"));
        //upload_file.sendKeys("‪/tugu/Pictures/1020071.jpg");
    	driver.findElement(uploadImage).sendKeys("./Pictures/1020071.jpg");
    	return new HomePage(driver);
    }
    }

