package tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.TestUtil3;

public class AlbumsTest extends BaseTest{

	@Test(dataProvider ="data", dataProviderClass=TestUtil3.class)
	public void ValidateCreateAlbum(String picture, String albmname) throws InterruptedException, AWTException {
	
		homePage.openTuguApp();
			
	   loginPage.logintoTuguApp2();
	   
	   albumPage.CreateAlbum(picture, albmname );
	     
	}
}
