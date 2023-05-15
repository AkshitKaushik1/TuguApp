package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EditGroupSettingTest extends BaseTest {

	@Test
	public void ValidateGroupSetting() throws InterruptedException {
				
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    myGroupsPage.EditSetting();
	   		
	}	
}
