package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SavedPostTest extends BaseTest{

	
	@Test(priority = 0, description ="Saved posts of following users ")
	
	public void ValidateSavedpostTest() throws InterruptedException {

		homePage.openTuguApp();
			
	   loginPage.logintoTuguApp2();
	  
	   savedpostpage.Savedpost(1);
	  
}
}