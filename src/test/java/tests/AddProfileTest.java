package tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import utility.TestUtil4;

public class AddProfileTest extends BaseTest{

	@Test(dataProvider ="data", dataProviderClass=TestUtil4.class, retryAnalyzer= utils.Retry.class )
	public void ValidateAddProfile(String img, String fname, String lname, String dob) throws InterruptedException, AWTException {
		
		//String emailidinput="sierra.test@yopmail.com";
		//String password="sierra.123";
		homePage.openTuguApp();
			
	   loginPage.logintoTuguApp2();
	
		driver.navigate().to("https://tuguapp.com/start-up");
		addprofilepage.AddProfile(img, fname, lname, dob);
		
		
	}
}
