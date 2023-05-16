package tests;

import java.awt.AWTException;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class BlogTest extends BaseTest {

	
	@Test(priority = 0)
	
	public void ValidateCreateBlog() throws InterruptedException, AWTException {
		
			homePage.openTuguApp();
		
		   loginPage.logintoTuguApp2();
		  
		   blogpage.CreateBlog();
		   
		  		  
		//	Assert.assertEquals(groupkeyword, keyword2);
		
		
		
		
	}
}
