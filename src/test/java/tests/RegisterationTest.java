package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.TestUtil;


public class RegisterationTest extends BaseTest{

	@Test(dataProvider= "data", dataProviderClass = TestUtil.class,retryAnalyzer= utils.Retry.class)
    public void validRegisterationTest(String username, String email, String password, String confirmpassword, String male) throws InterruptedException {
    	homePage.openTuguApp();
		
        registerationPage
        .RegisterintoTuguApp(username,email, password,confirmpassword,male);
     
       String name = registerationPage.GetName();
       Assert.assertEquals(username, name);
      	
    }
	
 
}
