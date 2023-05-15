  	package tests;

import org.testng.annotations.Test;

import org.testng.Assert;
import utility.TestUtil2;

public class MyPagesTest extends BaseTest {

	@Test(dataProvider= "data", dataProviderClass = TestUtil2.class,retryAnalyzer= utils.Retry.class)
	  
	public void validateMyPagesTest(String pgname,String pgurl, String pgcat, String pgdesc) throws InterruptedException {
	//	String emailidinput="kevin.test@yopmail.com";
	//	String password="kevin.123";
	homePage.openTuguApp();
		
   loginPage.logintoTuguApp2();
 
   String pagetitle= myPagesPage.MyPages(pgname,pgurl,pgcat,pgdesc);
  	Assert.assertEquals(pgname, pagetitle);
	
	}
}
