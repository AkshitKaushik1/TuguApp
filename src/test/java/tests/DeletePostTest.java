package tests;

import org.testng.annotations.Test;

public class DeletePostTest extends BaseTest{
	
	@Test
	
	public void ValidateDeletePost() throws InterruptedException {
	
	//	String emailidinput="Addy123";
   	//	String password="addy.123";
    
    	homePage.openTuguApp();
    		
        loginPage.logintoTuguApp2();
        postpage.AllpostonPage();
        
        postpage.deletePost(1);
    
}

}
