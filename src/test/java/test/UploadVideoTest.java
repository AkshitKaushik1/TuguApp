package test;

import java.io.IOException;

import org.testng.annotations.Test;


import com.test.Utility.TestUtil1;

public class UploadVideoTest extends BaseTest {
	
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil1.class)
	//@Test(priority = 0, description = "Upload a new image")
    public void UploadVideo (String VideoPath, String Videotype ) throws InterruptedException, IOException {

		String emailidinput="Akshit";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(7000);
    	homePage 
    	.UploadVideo(VideoPath);
    	

}
}