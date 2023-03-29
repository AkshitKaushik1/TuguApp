package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RecentNewsFeedTest extends BaseTest {

	

	  @Test(priority = 0, description = "Validate Recent News Feed.")
	    public void validateRecentNewsFeed(Method method) throws InterruptedException {
	      
	    	String emailidinput="nick.test@yopmail.com";
	    	String password="nick.123";
	    	homePage.openTuguApp();
	    		
	        loginPage.logintoTuguApp(emailidinput, password);
	       Thread.sleep(5000);
	    
	       String str =  recentNewsFeedPage.RecentNewsFeed();
	     
	       String[] string = new String[3];
	       string[0]= "first post is most recent post in News feed";
			string[1] = "top 2 post are posted at the same time";
			string[2] = "post is currently posted";
	         
			
			// TestNG
	       Assert.assertTrue(str.equals(string[0]) || str.equals(string[1]) || str.equals(string[2]));

	       
	 }
}
