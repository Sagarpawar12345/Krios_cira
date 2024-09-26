package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communitymanagement.pages.BoardApprovalsPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class BoardApprovalsPageTest extends TestBase{
	
	// Create the BoardApprovalsPage object
	BoardApprovalsPage boardApprovalsPage = createPage(BoardApprovalsPage.class);

	@Test(priority = 0, description = "Verify Board Approval Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyboardApprovalsMenu() 
	{
		LoggerManager.info("Verifying Board Approval Page Title");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		TestBase.setExtentReportSettings("Verifying Board Approval Title", Constants.SMOKE_TESTING, "Board Approval", "Verify Board Approvals");
		assertEquals(boardApprovalsPage.verifyBoardApprovalsMenu(), "Board Approvals");
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", Constants.FUNCTIONAL_TESTING, "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		assertTrue(boardApprovalsPage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar Normal Screen option",  groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyToolBarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", Constants.FUNCTIONAL_TESTING, "Toolbar Normal screen", "Verifying Toolbar - Normal screen icon click");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		assertTrue(boardApprovalsPage.toolBarNormalScreen(),"toolBar Normal Screen is not seen");
		
	}
	
	@Test(priority = 3, description = "Verify Switching tabs Open tab and Closed tab", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifySwitchTab() 
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", Constants.FUNCTIONAL_TESTING, "Switching tab", "Verifying tab Switching");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		assertTrue(boardApprovalsPage.switchTab(),"switch Tabs are not seen");
	}

	@Test(priority = 4, description = "Verify Exapnd All icon", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyExpandOptionClick() 
	{
		LoggerManager.info("Verify Exapnd All");
		TestBase.setExtentReportSettings("Exapnd All icon", Constants.FUNCTIONAL_TESTING, "Verify Exapnd All icon", "Verifying Exapnd All icon");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		assertTrue(boardApprovalsPage.expandOptionClick(),"expand Option is not Clicked");
	}

	@Test(priority = 5, description = "Verify Column Chooser icon", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Column Chooser icon",Constants.FUNCTIONAL_TESTING, "Verify Column Chooser icon", "Verify Column Chooser icon");
		boardApprovalsPage = new BoardApprovalsPage(driver);
		assertEquals(boardApprovalsPage.columnChooserClick(), "Column Chooser");
	}
}
