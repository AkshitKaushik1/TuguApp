package tests;

import org.testng.annotations.Test;


import org.testng.Assert;

import utility.TestUtil1;

public class MyGroupsTest extends BaseTest {


	
	 @SuppressWarnings("deprecation")
	@Test(dataProvider= "data", dataProviderClass = TestUtil1.class)
	  
	public void validateMyGroupsTest(String gname,String link,String gdesc,String type, String cat) throws InterruptedException {
	String emailidinput="nick.test@yopmail.com";
	String password="nick.123";
	homePage.openTuguApp();
		
    loginPage.logintoTuguApp(emailidinput, password);
    Thread.sleep(5000);
    String groupname = myGroupsPage.MyGroups(gname,link,gdesc,type,cat);
    Assert.assertEquals(gname, groupname);
	
	}
	

}
