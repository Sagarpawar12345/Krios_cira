package com.ciranet.community.information.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.information.pages.CommunityNotesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommunityNotesPageTest extends TestBase {
	
	// Create the CommunityNotesPage object
	CommunityNotesPage communityNotesPage = createPage(CommunityNotesPage.class);
	
	@Test(priority = 0, description = "Verify Community Notes Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommunityNotes() 
	{
		LoggerManager.info("Verifying Community Notes Title");
		TestBase.setExtentReportSettings("Community Notes Title Test", Constants.SMOKE_TESTING, "Verify Community Notes Title", "Verifying Community Notes Page Title");
		communityNotesPage = new CommunityNotesPage(driver);	
		assertEquals(communityNotesPage.communityNotesMenu(),"Community Notes");
	}
		
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		communityNotesPage = new CommunityNotesPage(driver);
		assertTrue(communityNotesPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}
	
	@Test(priority = 2, description = "Verify Edit Community Notes", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAddNewNote() 
	{	
		LoggerManager.info("Verifying Add New Note");
		TestBase.setExtentReportSettings("Verifying Add New Note", Constants.FUNCTIONAL_TESTING, "Edit Community Notes",
				"Verify Add New Note");
		communityNotesPage = new CommunityNotesPage(driver);
		assertEquals(communityNotesPage.addNote(),"Add a Note");		
	}
	
	@Test(priority = 3, description = "Verify Import Note Template", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyImportNoteTemplate() 
	{	
		LoggerManager.info("Verifying Add New Note");
		TestBase.setExtentReportSettings("Verifying Import Note Template", Constants.FUNCTIONAL_TESTING, "Import Note Template",
				"Verify Import Note Template");
		assertEquals(communityNotesPage.importNoteTemplate(),"Import Notes From Template");		
	}
		
	@Test(priority = 4, description = "Verify Edit Community Notes", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyActionMenu() 
	{	
		LoggerManager.info("Verifying Edit Community Notes");
		TestBase.setExtentReportSettings("Verifying Edit Community Notes", Constants.FUNCTIONAL_TESTING, "Edit Community Notes",
				"Verify Edit Community Notes");
		communityNotesPage = new CommunityNotesPage(driver);
		assertEquals(communityNotesPage.actionButton(),"Edit Note");		
	}
	
}
