package test;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class StatusTest  extends BaseTest {
	

	@Test(priority = 0, description = "Postings a new status with an emoji")
    public void validLoginTest(Method method) throws InterruptedException {

		String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(5000);
    	homePage
    	.Poststatus();
    	
}
}