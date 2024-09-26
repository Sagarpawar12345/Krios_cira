package com.ciranet.myworkqueue.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.pages.InternalTasksPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class InternalTasksPageTest extends TestBase 
{
	// Create the InternalTasksPageTest object
	InternalTasksPage internalTasksPage = createPage(InternalTasksPage.class);
	
	@Test(priority = 0, description = "Verify InternalTaskPage Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyInternalTasksPageURL() 
	{
		LoggerManager.info("Verifying Internal Task Page Title");
		TestBase.setExtentReportSettings("Verifying Internal Task Title", Constants.SMOKE_TESTING, "Internal task", "Verify Internal Task Page");
		internalTasksPage = new InternalTasksPage(driver);
		internalTasksPage.internalTaskPageLanding();
	}

	@Test(priority = 1, description = "Verify Help Button", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyHelpInternalTask() 
	{
		LoggerManager.info("Verifying Internal Task Help");
		TestBase.setExtentReportSettings("Verifying Internal Task  Help", Constants.FUNCTIONAL_TESTING, "Internal task", "Verify Internal Task Help");
		internalTasksPage = new InternalTasksPage(driver);
		assertTrue(internalTasksPage.helpInternalTask(),"Help icon for Project Task is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar - Column Chooser icon click", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Internal Task - Column Chooser");
		TestBase.setExtentReportSettings("Verifying Column Chooser", Constants.FUNCTIONAL_TESTING, "Column Chooser", "Verify Column chooser");
		internalTasksPage = new InternalTasksPage(driver);
		assertTrue(internalTasksPage.columnChooserClick(),"Column chooser is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar - Full screen option click", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Internal Task - Full screen");
		TestBase.setExtentReportSettings("Verifying Full Screen", Constants.FUNCTIONAL_TESTING, "Full Screen", "Verify Full Screen functionality");
		internalTasksPage = new InternalTasksPage(driver);
		assertTrue(internalTasksPage.toolbarFullScreen(), "Fullscreen is not seen");
	}

	@Test(priority = 4, description = "Verify Toolbar - Normal screen option click", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifytoolBarNormalScreenOption() 
	{
		LoggerManager.info("Verifying Internal Task - Normal screen click");
		TestBase.setExtentReportSettings("Verifying Normal Screen", Constants.FUNCTIONAL_TESTING, "Normal Screen", "Verify Normal screen");
		internalTasksPage = new InternalTasksPage(driver);
		assertTrue(internalTasksPage.toolBarNormalScreen(),"Normal icon is not seen");
	}

	@Test(priority = 5, description = "Verify Email Setting button", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyEmailSetting() 
	{
		LoggerManager.info("Verifying Email Setting button");
		TestBase.setExtentReportSettings("Verifying Email Setting button", Constants.FUNCTIONAL_TESTING, "Internal Task", "Verify Email Setting button functionaity");
		internalTasksPage = new InternalTasksPage(driver);
		assertEquals(internalTasksPage.emailSetting(), "Email Setting button");
	}

	@Test(priority = 6, description = "Verify Toolbar - Expand And Collapse", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyExpandCollapseOption() 
	{
		LoggerManager.info("Verifying Expand and Collapse");
		TestBase.setExtentReportSettings("Verifying Expand Collapse", Constants.FUNCTIONAL_TESTING, "Expand Collapse", "Verify Collapse");
		assertTrue(internalTasksPage.expandCollapseClick(),"Expand collapse not seen");
	}

	@Test(priority = 7, description = "Verify Active Filter selection", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyActiveFilterSelect() 
	{
		LoggerManager.info("Verifying Active Filter");
		TestBase.setExtentReportSettings("Verifying Active Filter", Constants.FUNCTIONAL_TESTING, "Active Filter", "Verify Active Filter selection");
		internalTasksPage = new InternalTasksPage(driver);
		assertTrue(internalTasksPage.activeFilterSelection(),"Filter is not selected");
	}

	@Test(priority = 8, description = "Verify Refresh", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyRefreshButton() 
	{
		LoggerManager.info("Verifying Refresh button");
		TestBase.setExtentReportSettings("Verifying Refresh button", Constants.FUNCTIONAL_TESTING, "Internal Task", "Verify Refresh button functionaity");
		internalTasksPage = new InternalTasksPage(driver);
		assertEquals(internalTasksPage.refreshClick(), "Refresh button");
	}
}