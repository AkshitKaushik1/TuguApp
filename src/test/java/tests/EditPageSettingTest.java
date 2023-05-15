package tests;

import org.testng.annotations.Test;

public class EditPageSettingTest extends BaseTest{

	
		@Test
		public void ValidatePageSetting() throws InterruptedException {
					
			homePage.openTuguApp();
		    loginPage.logintoTuguApp2();
		    myPagesPage.EditSetting();
		   		
		}	
		
}
