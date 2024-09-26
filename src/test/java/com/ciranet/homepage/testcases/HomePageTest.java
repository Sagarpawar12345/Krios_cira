package com.ciranet.homepage.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.homepage.pages.HomePage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class HomePageTest extends TestBase 
{
	HomePage homePage = createPage(HomePage.class);
	
	@Test(priority = 0, description = "Verify HomePage", groups = {Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyHomeOwnerSearch() 
	{
		LoggerManager.info("Verifying HomePage - Owner Search");
		TestBase.setExtentReportSettings("HomePage Owner Search", Constants.SMOKE_TESTING, "Verify Home Page Owner Search", "Verifying Owner Search");
		homePage = new HomePage(driver);
		String ownerSearchKeyword = "romich";
		assertTrue(homePage.searchOwner(ownerSearchKeyword));

	}

	@Test(priority = 1, description = "Verify HomePage", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyCommunitySearch() 
	{
		LoggerManager.info("Verifying HomePage - Community Search");
		TestBase.setExtentReportSettings("HomePage Community Search", Constants.FUNCTIONAL_TESTING, "Verify Home Page Community Search", "Verifying Community Search");
		homePage = new HomePage(driver);
		String communitySearchKeyword = "amberwood";
		assertTrue(homePage.searchCommunity(communitySearchKeyword));
	}	
}
