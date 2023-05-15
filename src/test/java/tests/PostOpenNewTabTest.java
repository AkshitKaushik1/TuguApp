
package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class PostOpenNewTabTest extends BaseTest {

	@Test
	
	public void ValidatePostOnpenInNewTab() throws InterruptedException {
	
    	homePage.openTuguApp();
    	loginPage.logintoTuguApp2();  
    	postpage.AllpostonPage();	
        postpage.OpenInNewTab(1);
}
	
}

