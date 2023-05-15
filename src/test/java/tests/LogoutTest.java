package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

	
	 @Test(priority = 0, description = "Valid Logout.")
	    public void validLogoutTest(Method method) throws InterruptedException {
	  
	    	homePage.openTuguApp();
	    		
	    	loginPage.logintoTuguApp2();
	    	logoutPage.LogOut();
		 
	 }
}
