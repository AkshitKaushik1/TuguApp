package tests;

import org.testng.annotations.Test;

public class SearchBarTest extends BaseTest
{
	
	@Test
	public void ValidateSearchBar() throws InterruptedException{
		
		homePage.openTuguApp();
	    loginPage.logintoTuguApp2();
	    explorePage.SearchBar();	
	}

}
