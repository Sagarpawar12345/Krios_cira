package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.MassCommunicationPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class MassCommunicationPageTest extends TestBase 
{
	MassCommunicationPage massCommunicationPage = createPage(MassCommunicationPage.class);

	@Test(priority = 0, description = "Verify Mass Communication", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifymailMergeMenu() 
	{
		LoggerManager.info("Verifying mailMerge - Community Search");
		TestBase.setExtentReportSettings("Mass Communication Community Search", Constants.SMOKE_TESTING, "Verify Home Page Community Search", "Verifying Community Search");
		massCommunicationPage = new MassCommunicationPage(driver);

		String communitySearchKeyword = "Amberwood";
		assertTrue(massCommunicationPage.verifySearchCommunity(communitySearchKeyword), "Mass Communication is not seen");
	}
	
	@Test(priority = 1, description = "Verify Mass Communication From Scheduled Date Dropdown", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifySearchFunctionality() 
	{
		LoggerManager.info("Verifying Mass Communication From Scheduled Date Dropdown");
		TestBase.setExtentReportSettings("Mass Communication From Scheduled Date Dropdown", Constants.FUNCTIONAL_TESTING, "Search button", "Verifying Mass Communication From Scheduled Date Dropdown");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyFromScheduledDateDropdown(), "Mass Communication Scheduled Date Dropdown is not seen");
	}
	
	@Test(priority = 2, description = "Verify Mass Communication From Processed Date Dropdown", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyFromProcessedDateDropdown() 
	{
		LoggerManager.info("Verifying Mass Communication From Processed Date Dropdown");
		TestBase.setExtentReportSettings("Mass Communication From Processed Date Dropdown", Constants.FUNCTIONAL_TESTING, "Search button", "Verifying Mass Communication From Processed Date Dropdown");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyFromProcessedDateDropdown(), "Mass Communication From Processed Date Dropdown is not seen");
	}
	
	@Test(priority = 3, description = "Verify Mass Communication Schedule Communication Reset button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyScheduleCommunicationRefreshButton() 
	{
		LoggerManager.info("Verifying Mass Communication Schedule Communication Reset button");
		TestBase.setExtentReportSettings("Mass Communication Schedule Communication Reset button", Constants.FUNCTIONAL_TESTING, "Reset button", "Verifying Mass Communication Schedule Communication Reset button");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyScheduleCommunicationRefreshButton(), "Schedule Communication Reset button is not seen");
	}
	
	@Test(priority = 4, description = "Verify Mass Communication Schedule Communication Refresh Recipients Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyScheduleCommunicationRefreshRecipientsButton() 
	{
		LoggerManager.info("Verifying Mass Communication Schedule Communication Refresh Recipients Button");
		TestBase.setExtentReportSettings("Mass Communication Schedule Communication Refresh Recipients Button", Constants.FUNCTIONAL_TESTING, "Refresh Recipients Button", "Verifying Mass Communication Schedule Communication Refresh Recipients Button");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyScheduleCommunicationRefreshRecipientsButton(), "Schedule Communication Refresh Recipients Button is not seen");
	}

	@Test(priority = 5, description = "Verify Mass Communication New Template Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyNewTemplateButton() 
	{
		LoggerManager.info("Verifying Mass Communication New Template Button");
		TestBase.setExtentReportSettings("Mass Communication Schedule Communication New Template Button", Constants.FUNCTIONAL_TESTING, "New Template Button", "Verifying Mass Communication New Template Button");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyNewTemplateButton(), "Schedule Communication Refresh Recipients Button is not seen");
	}

	@Test(priority = 6, description = "Verify Mass Communication Scheduled By Hyperlink", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyScheduledByHyperlink() 
	{
		LoggerManager.info("Verifying Mass Communication Scheduled By Hyperlink");
		TestBase.setExtentReportSettings("Mass Communication Scheduled By Hyperlink", Constants.FUNCTIONAL_TESTING, "Search button", "Verifying Mass Communication Scheduled By Hyperlink");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyScheduledByHyperlink(), "Mass Communication Scheduled By Hyperlink is not seen");
	}
	
	@Test(priority = 7, description = "Verify Mass Communication Status column Cancel filter", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatusCancel() 
	{
		LoggerManager.info("Verifying Mass Communication Status column Cancel filter");
		TestBase.setExtentReportSettings("Mass Communication Status column Cancel filter", Constants.FUNCTIONAL_TESTING, "Status column Cancel filter", "Verifying Mass Communication Status column Cancel filter");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyStatusCancel(), "Mass Communication Status column Cancel filter is not seen");
	}
	
	@Test(priority = 8, description = "Verify Mass Communication Status column Processed filter", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatusProcessed() throws AWTException 
	{
		LoggerManager.info("Verifying Mass Communication Status column Processed filter");
		TestBase.setExtentReportSettings("Mass Communication Status column Processed filter", Constants.FUNCTIONAL_TESTING, "Status column Processed filter", "Verifying Mass Communication Status column Processed filter");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyStatusProcessed(), "Mass Communication Status column Processed filter is not seen");
	}
	
	@Test(priority = 9, description = "Verify Mass Communication Status column Scheduled filter", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatusScheduled() throws AWTException 
	{
		LoggerManager.info("Verifying Mass Communication Status column Scheduled filter");
		TestBase.setExtentReportSettings("Mass Communication Status column Scheduled filter", Constants.FUNCTIONAL_TESTING, "Status column Scheduled filter", "Verifying Mass Communication Status column Scheduled filter");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyStatusScheduled(), "Mass Communication Status column Scheduled filter is not seen");
	}
	
	@Test(priority = 10, description = "Verify Mass Communication Status column Pending Approval filter", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatusPendingApproval() throws AWTException 
	{
		LoggerManager.info("Verifying Mass Communication Status column Pending Approval filter");
		TestBase.setExtentReportSettings("Mass Communication Status column Pending Approval filter", Constants.FUNCTIONAL_TESTING, "Status column Pending Approval filter", "Verifying Mass Communication Status column Pending Approval filter");
		massCommunicationPage = new MassCommunicationPage(driver);
		assertTrue(massCommunicationPage.verifyStatusPendingApproval(), "Mass Communication Status column Pending Approval filter is not seen");
	}

}