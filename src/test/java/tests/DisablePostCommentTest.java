package tests;

import org.testng.annotations.Test;

public class DisablePostCommentTest extends BaseTest {

	
	@Test
	
	public void ValidateDisablePostComment() throws InterruptedException {
	
	//	String emailidinput="Addy123";
   	//	String password="addy.123";
    
    	homePage.openTuguApp();
    		
        loginPage.logintoTuguApp2();
        postpage.AllpostonPage();
        
        postpage.disableCommentPost(1);
}
	
}
