package tests;

import org.testng.annotations.Test;

public class HidePostTest extends BaseTest {

	
	@Test()
	public void ValidateHidePost() throws InterruptedException  {
	
		
			homePage.openTuguApp();
		   loginPage.logintoTuguApp2();
		   postpage.AllpostonPage();
		   postpage.HidePage(1);
		  
	}
}
