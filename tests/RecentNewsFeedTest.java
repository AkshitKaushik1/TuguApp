package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RecentNewsFeedTest extends BaseTest {

	

	  @Test(priority = 0, description = "Validate Recent News Feed.")
	    public void validateRecentNewsFeed(Method method) throws InterruptedException {
	      
	    	String emailidinput="nick.test@yopmail.com";
	    	String password="nick.123";
	    	homePage.openTuguApp();
	    		
	        loginPage.logintoTuguApp(emailidinput, password);
	       Thread.sleep(5000);
	       recentNewsFeedPage.RecentNewsFeed();
	       
	      	
	    }
}
