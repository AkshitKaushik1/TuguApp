package tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends BaseTest{
	
	@Test
	public void ValidateDeleteGroup()throws InterruptedException{
		
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    myGroupsPage.DeleteGroup();
		
		
		
	}
	

}
