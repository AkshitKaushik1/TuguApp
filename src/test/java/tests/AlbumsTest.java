package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.TestUtil3;

public class AlbumsTest extends BaseTest{

	@Test(dataProvider = "data", dataProviderClass=TestUtil3.class)
	public void ValidateCreateAlbum(String picture) throws InterruptedException {
		
		String emailidinput="nick.test@yopmail.com";
		String password="nick.123";
		homePage.openTuguApp();
			
	   loginPage.logintoTuguApp(emailidinput, password);
	   Thread.sleep(5000);
	   albumPage.CreateAlbum(picture);
	   
		
	  
		
	}
}
