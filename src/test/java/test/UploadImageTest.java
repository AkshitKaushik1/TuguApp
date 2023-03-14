package test;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class UploadImageTest extends BaseTest {
	

	@Test(priority = 0, description = "Upload a new image")
    public void validLoginTest(Method method) throws InterruptedException {

		String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(7000);
    	homePage 
    	.UploadImage();

}
}