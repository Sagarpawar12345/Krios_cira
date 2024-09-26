package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.ResidentContactLogsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ResidentContactLogsPageTest extends TestBase {
	ResidentContactLogsPage residentContactLogs = createPage(ResidentContactLogsPage.class);

	@Test(priority = 0, description = "Verify residentContactLogs", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyHomeOwnerSearch() {
		LoggerManager.info("Verifying residentContactLogs - Community Search");
		TestBase.setExtentReportSettings("Resident Contact Logs", Constants.SMOKE_TESTING,
				"Verify Home Page Community Search", "Verifying Community Search");
		residentContactLogs = new ResidentContactLogsPage(driver);

		String communitySearchKeyword = "Amberwood";
		assertTrue(residentContactLogs.searchCommunity(communitySearchKeyword), "Resident Contact Logs is not seen");
	}

	@Test(priority = 1, description = "Verify Resident Contact Logs Historical hyperlinks", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verfiyHistoricalHyperlink() {
		LoggerManager.info("Verifying Resident Contact Logs Historical hyperlinks");
		TestBase.setExtentReportSettings("Resident Contact Logs Historical hyperlinks", Constants.FUNCTIONAL_TESTING,
				"Resident Contact Logs", "Verifying Resident Contact Logs Historical hyperlinks");
		residentContactLogs = new ResidentContactLogsPage(driver);
		assertTrue(residentContactLogs.verfiyHistoricalHyperlink(),
				"Resident Contact Log Detail Historical hyperlinks are not seen");
	}
}
