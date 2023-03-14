package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RegisterationTest extends BaseTest{

	@Test(priority = 0, description = "Valid Registeration Scenario with correct username and password.")
    public void validRegisterationTest(Method method) throws InterruptedException {
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
		String username = "smith";
    	String email= "smith.test@yopmail.com";
    	String password="Test.123";
    	String confirmpassword ="Test.123";
    	homePage.openTuguApp();
    		
        registerationPage.RegisterintoTuguApp(username,email, password,confirmpassword);
       Thread.sleep(5000);
        //String username = myaccountPage.verifyMyAccountUserName();
      //  assertEquals(username, "Hi, test4!");
      	
    }
 
}
