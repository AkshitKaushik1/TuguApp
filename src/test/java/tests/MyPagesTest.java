package tests;

import org.testng.annotations.Test;

import org.testng.Assert;
import utility.TestUtil2;

public class MyPagesTest extends BaseTest {

	@Test(dataProvider= "data", dataProviderClass = TestUtil2.class)
	  
	public void validateMyPagesTest(String pgname,String pgurl, String pgcat, String pgdesc) throws InterruptedException {
	String emailidinput="nick.test@yopmail.com";
	String password="nick.123";
	homePage.openTuguApp();
		
   loginPage.logintoTuguApp(emailidinput, password);
   Thread.sleep(5000);
   String pagetitle= myPagesPage.MyPages(pgname,pgurl,pgcat,pgdesc);
  	Assert.assertEquals(pgname, pagetitle);
	
	}
}
