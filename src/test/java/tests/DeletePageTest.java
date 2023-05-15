package tests;

import org.testng.annotations.Test;

public class DeletePageTest extends BaseTest{

	
	
	@Test
	public void ValidateDeletePage()throws InterruptedException{
		
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    myPagesPage.DeletePage();
		
		
		
	}
	
}
