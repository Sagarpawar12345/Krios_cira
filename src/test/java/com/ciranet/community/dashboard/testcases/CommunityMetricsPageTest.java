package com.ciranet.community.dashboard.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.dashboard.pages.CommunityMetricsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class CommunityMetricsPageTest extends TestBase {
	// Create the CommunityMetrixPage object
	CommunityMetricsPage communityMetrixPage = createPage(CommunityMetricsPage.class);
	

	@Test(priority = 0, description = "Verify Time and Expese Management", groups = {Constants.SMOKE_TESTING},alwaysRun=true)
	public void verifyCommunityMetrixPage() 
	{

		LoggerManager.info("Verifying Community Metrics Page Title");
		TestBase.setExtentReportSettings("Community Metrics Page Title Test", Constants.SMOKE_TESTING, "Verify Community Metrics Page Title", "Verifying Community Metrics Page Title");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertEquals(communityMetrixPage.communityMetricsPage(), "Community Metrics");

	} 

	@Test(priority = 1, description = "Verify Add Lawsuit", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyAddLawsuit() 
	{
		LoggerManager.info("Verifying Add Lawsuit");
		TestBase.setExtentReportSettings("Add Lawsuit", Constants.FUNCTIONAL_TESTING, "Verify Add Lawsuit", "Verifying Add Lawsuit");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertEquals(communityMetrixPage.addLawsuit(), "Lawsuits");

	}
	@Test(priority = 2, description = "Verify Add Lawsuit", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyEditLawsuit() 
	{
		LoggerManager.info("Verifying Edit Lawsuit");
		TestBase.setExtentReportSettings("Edit Lawsuit", Constants.FUNCTIONAL_TESTING, "Verify Edit Lawsuit", "Verifying Edit Lawsuit");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertEquals(communityMetrixPage.editLawsuit(), "Edit Lawsuit");


	}
	@Test(priority = 3, description = "Verify Registered ACH Owners", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyRegisteredACHOwners() 
	{
		LoggerManager.info("Verifying Edit Lawsuit");
		TestBase.setExtentReportSettings("Registered ACH Owners", Constants.FUNCTIONAL_TESTING, "Verify Registered ACH Owners", "Verifying Registered ACH Owners");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertEquals(communityMetrixPage.registeredACHOwners(), "Property Owner Details");
	}

	@Test(priority = 4, description = "Verify Add Lawsuit", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyTabSwitching() 
	{
		LoggerManager.info("Verifying Tab Swaitching");
		TestBase.setExtentReportSettings("Tab Swaitching", Constants.FUNCTIONAL_TESTING, "Verify Tab Swaitching", "Verifying Tab Swaitching");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertTrue(communityMetrixPage.tabSwitching(), "Open Work tab is clicked");
	}

	@Test(priority = 5, description = "Verify Add Lawsuit", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyWorkArea() 
	{
		LoggerManager.info("Verifying Work Area");
		TestBase.setExtentReportSettings("Work Area", Constants.FUNCTIONAL_TESTING, "Verify Work Area", "Verifying Work Area");
		communityMetrixPage = new CommunityMetricsPage(driver);
		assertEquals(communityMetrixPage.workArea(), "Compose New");
	}

}
