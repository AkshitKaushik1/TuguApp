package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Log;
public class LoginPage extends BasePage {
    /*
     * --**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Web Elements
     */

    By userNameId                = By.xpath("//*[@id=\"username\"]");
    By passwordId                = By.xpath("//*[@id=\"password\"]");
    By loginButton            = By.xpath("//*[@id=\"login\"]/div[5]/div[1]/button");
    
   
  
    
    /**
     * Variables
     */
    String baseURL = ("https://tuguapp.com/");
    
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public LoginPage logintoTugu(String username, String password) throws InterruptedException {
        Log.info("Trying to login Tugu.");
        Thread.sleep(2000);
        driver.get(baseURL);
        Thread.sleep(7000);
        writeText(userNameId, username);
        writeText(passwordId, password);
        Thread.sleep(5000);
        click(loginButton);
        return new LoginPage(driver);
            }}