package test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil;

public class UploadImageTest extends BaseTest {
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil.class)
	//@Test(priority = 0, description = "Upload a new image")
    public void Uploadimage (String Imagepath, String Imagetype ) throws InterruptedException, IOException {

		String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(7000);
    	homePage 
    	.UploadImage(Imagepath);

}
}