package com.ciranet.community.dashboard.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.dashboard.pages.QuickLinksPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class QuickLinksPageTest extends TestBase{

	QuickLinksPage quickLinksPage = createPage(QuickLinksPage.class);
	@Test(priority = 0, description = "Verify Community Dashboard - Quick Links", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
	public void verifyQuickLinks() 
	{
		LoggerManager.info("Verifying Quick Links");
		TestBase.setExtentReportSettings("Quick Links", Constants.SMOKE_TESTING, "Verify Community Dashboard - Quick Links", "Community Dashboard - Verifying Quick Links");
		quickLinksPage = new QuickLinksPage(driver);
		quickLinksPage.verifyQuickLinksText();
	}

	@Test(priority = 1, description = "Verify Quick Links - Add / Edit Project - Tasks", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksAddEditProjectTasks() 
	{
		LoggerManager.info("Verifying Quick Links - Add Edit Project Tasks");
		TestBase.setExtentReportSettings("Add Edit Project Taks", Constants.SMOKE_TESTING, "Add/Edit Project Taks link", "Add/Edit Project Tasks");
		quickLinksPage = new QuickLinksPage(driver);
		assertTrue(quickLinksPage.verifyQuickLinksClick("Add / Edit Project - Tasks"),"Link is not clicked");
	}

	@Test(priority = 2, description = "Add / Edit Resident Announcement", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksAddEditResidentAnnouncements() 
	{
		LoggerManager.info("Add / Edit Resident Announcement");
		TestBase.setExtentReportSettings("Add / Edit Resident Announcement", Constants.SMOKE_TESTING, "Add / Edit Resident Announcement", "Add / Edit Resident Announcement");
		quickLinksPage = new QuickLinksPage(driver);
		assertTrue(quickLinksPage.verifyQuickLinksClick("Add / Edit Resident Announcement"),"Link is not clickable");
	}

	@Test(priority = 3, description = "Review Approved Open AP", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksReviewApprovedOpenAP() 
	{
		LoggerManager.info("Review Approved Open AP");
		TestBase.setExtentReportSettings("Review Approved Open AP", Constants.SMOKE_TESTING, "Review Approved Open AP", "Review Approved Open AP");
		quickLinksPage = new QuickLinksPage(driver);
		assertTrue(quickLinksPage.verifyQuickLinksClick("Review Approved Open AP"), "Link is not clickable");
	}

	@Test(priority = 4, description = "Review Open Work Orders", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksReviewOpenWorkOrders() 
	{
		LoggerManager.info("Review Open Work Orders");
		TestBase.setExtentReportSettings("Review Open Work Orders", Constants.SMOKE_TESTING, "Review Open Work Orders", "Review Open Work Orders");
		quickLinksPage = new QuickLinksPage(driver);
		assertTrue(quickLinksPage.verifyQuickLinksClick("Review Open Work Orders"),"Link is npt clickable");
	}

	@Test(priority = 5, description = "Verify Quick Links - News and Announcements", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksNewsAndAnnouncements() 
	{
		LoggerManager.info("Verifying Quick Links - News and Announcements");
		TestBase.setExtentReportSettings("Quick Links", Constants.SMOKE_TESTING, "Verify Community Dashboard - Quick Links", "Verifying Quick Links - News and Announcements");
		quickLinksPage = new QuickLinksPage(driver);
		assertEquals(quickLinksPage.verifyQuickLinksClickAndPressEscapeButton("News and Announcements"),"News and Announcements");
	}

	@Test(priority = 6, description = "Contact your RealManage Service Team", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksContactYourRealManageServiceTeam() 
	{
		LoggerManager.info("Contact your RealManage Service Team");
		TestBase.setExtentReportSettings("Contact your RealManage Service Team", Constants.FUNCTIONAL_TESTING, "Contact your RealManage Service Team", "Contact your RealManage Service Team");
		quickLinksPage = new QuickLinksPage(driver);
		assertEquals(quickLinksPage.verifyQuickLinksClickAndPressEscapeButton("Contact your RealManage Service Team"),"Contact your RealManage Service Team");
	}

	@Test(priority = 7, description = "Contact RealManage's Client Satisfaction Team", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksContactRealManageClientSatisfactionTeam() 
	{
		LoggerManager.info("Contact RealManage's Client Satisfaction Team");
		TestBase.setExtentReportSettings("Contact RealManage's Client Satisfaction Team", Constants.FUNCTIONAL_TESTING, "Contact RealManage's Client Satisfaction Team", "Contact RealManage's Client Satisfaction Team");
		quickLinksPage = new QuickLinksPage(driver);
		assertEquals(quickLinksPage.verifyQuickLinksClickAndPressEscapeButton("Contact RealManage's Client Satisfaction Team"),"Contact RealManage's Client Satisfaction Team");
	}

	@Test(priority = 8, description = "Evaluate RealManage's Performance", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksEvaluateRealManagePerformance() 
	{
		LoggerManager.info("Evaluate RealManage's Performance");
		TestBase.setExtentReportSettings("Evaluate RealManage's Performance", Constants.SMOKE_TESTING, "Verify - Evaluate RealManage's Performance", "Verifying - Evaluate RealManage's Performance");
		quickLinksPage = new QuickLinksPage(driver);
		assertTrue(quickLinksPage.verifyQuickLinksClick("Evaluate RealManage's Performance"),"Link is not clickable");
	}

	@Test(priority = 9, description = "Have a CiraNet issue, suggestion or feedback?", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void clickQuickLinksSsuggestionOrFeedback() 
	{
		LoggerManager.info("Have a CiraNet issue, suggestion or feedback?");
		TestBase.setExtentReportSettings("Contact RealManage's Client Satisfaction Team", Constants.FUNCTIONAL_TESTING, "Have a CiraNet issue, suggestion or feedback?", "Have a CiraNet issue, suggestion or feedback?");
		quickLinksPage = new QuickLinksPage(driver);
		assertEquals(quickLinksPage.verifyQuickLinksClickAndPressEscapeButton("Have a CiraNet issue, suggestion or feedback?"),"Have a CiraNet issue, suggestion or feedback?");
		
		driver.switchTo().defaultContent();
	}
}
