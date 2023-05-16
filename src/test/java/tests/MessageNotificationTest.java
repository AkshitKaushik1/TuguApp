package tests;

import java.time.Duration;

import org.testng.annotations.Test;

public class MessageNotificationTest extends BaseTest {

	
	@Test
	public void ValidateMessageRequest() throws InterruptedException {
		
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    explorePage.SearchBar();
	    notificationPage.sendMessage();
	    logoutPage.LogOut();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    loginPage.logintoTuguApp("rocky123", "rocky.123");
	    notificationPage.MsgNotification();
//	    notificationPage.Notification();
	}	

}
