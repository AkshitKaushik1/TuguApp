package tests;

import org.testng.annotations.Test;

public class FriendRequestNotificationTest extends BaseTest {
	
	@Test
	public void ValidateFriendRequest() throws InterruptedException {
		
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    explorePage.SearchBar();
	    notificationPage.addAFriend();	
	    logoutPage.LogOut();
	    loginPage.logintoTuguApp("rocky123", "rocky.123");
	    notificationPage.Notification();
	}

}
