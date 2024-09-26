package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.AnnouncementLogsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class AnnouncementLogsPageTest extends TestBase
{
	AnnouncementLogsPage announcementLogs = createPage(AnnouncementLogsPage.class);
	
	@Test(priority = 0, description = "Verify announcement Logs", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyAnnouncementLogsMenu() 
	{
		LoggerManager.info("Verifying announcementLogs - Community Search");
		TestBase.setExtentReportSettings("Announcement Logs Community Search", Constants.SMOKE_TESTING, "Verify Home Page Community Search", "Verifying Community Search");
		announcementLogs = new AnnouncementLogsPage(driver);

		String communitySearchKeyword = "Amberwood";
		assertTrue(announcementLogs.verifySearchCommunity(communitySearchKeyword), "Announcements is not seen");
	}	

	@Test(priority = 1, description = "Verify Announcements logs tab switching", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verfiyswitchingtabs() 
	{
		LoggerManager.info("Verifying Announcements Logs tab switching");
		TestBase.setExtentReportSettings("Announcements Logs tab switching", Constants.FUNCTIONAL_TESTING, "Verify Announcements Logs", "Verifying Announcements Logs tab switching");
		announcementLogs = new AnnouncementLogsPage(driver);
		assertTrue(announcementLogs.verfiyswitchingtabs(), "Announcements logs switching tabs are not seen");
	}	

	@Test(priority = 2, description = "Verify Announcements logs Add New Announcement", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verfiyaddNewAnnouncement() 
	{
		LoggerManager.info("Verifying Announcements Logs Add New Announcement button");
		TestBase.setExtentReportSettings("Announcements Logs Add New Announcement", Constants.FUNCTIONAL_TESTING, "Verify Announcements Logs", "Verifying Announcements Logs Add New Announcement");
		announcementLogs = new AnnouncementLogsPage(driver);
		assertTrue(announcementLogs.verfiyaddNewAnnouncement(), "Announcements Logs Add New Announcement are not seen");
	}

	@Test(priority = 3, description = "Verify Announcements logs Edit Announcement", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verfiyEditAnnouncement() 
	{
		LoggerManager.info("Verifying Announcements Logs Edit Announcement");
		TestBase.setExtentReportSettings("Announcements Logs Edit Announcement", Constants.FUNCTIONAL_TESTING, "Verify Announcements Logs", "Verifying Announcements Logs Edit Announcement");
		announcementLogs = new AnnouncementLogsPage(driver);
		assertTrue(announcementLogs.verfiyeditAnnouncement(), "Announcement updated successfully informative message is not seen");
	}
	
	@Test(priority = 4, description = "Verify Announcements logs delete Announcement", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verfiydeleteAnnouncement() 
	{
		LoggerManager.info("Verifying Announcements logs delete Announcement");
		TestBase.setExtentReportSettings("Announcements Announcements logs delete Announcement", Constants.FUNCTIONAL_TESTING, "Verify Announcements Logs", "Verifying Announcements logs delete Announcement");
		announcementLogs = new AnnouncementLogsPage(driver);
		assertTrue(announcementLogs.verfiydeleteAnnouncement(), "Announcement has been deleted successfully informative message is not seen");
	}
	
	@Test(priority = 5, description = "Verify Help Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyHelpAnnouncements() 
	{
		LoggerManager.info("Verifying Help page");
		TestBase.setExtentReportSettings("Verifying Announcements logs Help", Constants.FUNCTIONAL_TESTING, "Announcements logs", "Verify Announcements logs Help");
		announcementLogs = new AnnouncementLogsPage(driver);
		assertTrue(announcementLogs.verifyHelpAnnouncements(),"Help icon for Announcements logs is not seen");
	}
}