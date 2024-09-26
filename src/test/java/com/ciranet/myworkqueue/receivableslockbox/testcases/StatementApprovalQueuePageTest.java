package com.ciranet.myworkqueue.receivableslockbox.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.receivableslockbox.pages.StatementApprovalQueuePage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class StatementApprovalQueuePageTest extends TestBase 
{
	// Create the StatementApprovalQueuePage object
	StatementApprovalQueuePage statementApprovalQueuePage = createPage(StatementApprovalQueuePage.class);

	@Test(priority = 0, description = "Verify Statement Approval Queue Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyStatementApprovalQueueURL() 
	{
		LoggerManager.info("Verifying Statement Approval Queue Page Title");
		TestBase.setExtentReportSettings("Verifying Workspace Title", Constants.SMOKE_TESTING, "Workspace","Verify Workspace");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.workspaceLabel.getText(),"Workspace");
	}

	@Test(priority = 1, description = "Verify Export To Excel Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyStatementApprovalQueueMenu()
	{
		LoggerManager.info("Verifying Statement Approval Queue Title");
		TestBase.setExtentReportSettings("Statement Approval Queue Title", Constants.FUNCTIONAL_TESTING, "Verify Statement Approval Queue Title", "Verifying Statement Approval Queue Title");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.statementApprovalQueueMenu(),"Statement Approvals");
	}
	
	@Test(priority = 2, description = "Verify Search Approvals Tab", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifySearchApprovalsTab()
	{
		LoggerManager.info("Verifying Search Approvals Tab");
		TestBase.setExtentReportSettings("Verifying Search Approvals Tab", Constants.FUNCTIONAL_TESTING, "Search Approvals Tab",
				"Verify Search Approvals Tab");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.searchApprovalTabClick(),"Date Type:");
	}
	
	@Test(priority = 3, description = "Verify Toolbar Full Screen Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertTrue(statementApprovalQueuePage.toolBarFullScreen(), "Fullscreen Icon is not enabled");	
	}

	@Test(priority = 4, description = "Verify Select Date Type", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyDateFields() 
	{
		LoggerManager.info("Verifying Date Fields");
		TestBase.setExtentReportSettings("Verifying Date Fields", Constants.FUNCTIONAL_TESTING, "Date Fields", "Verify Date Fields");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.dateFields(), "Begin Date:");
	}

	@Test(priority = 5, description = "Verify Logs Tab", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyLogsColumn() 
	{
		LoggerManager.info("Verifying Logs Column click");
		TestBase.setExtentReportSettings("Verifying Logs Column click", Constants.FUNCTIONAL_TESTING, "Logs Column click",
				"Verify Logs Column click");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.logsClick(),"User");
	}

	@Test(priority = 6, description = "Verify Statement PDF Tab", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatementColumn() 
	{
		LoggerManager.info("Verifying Statement Clicked");
		TestBase.setExtentReportSettings("Verifying Statement Clicked", Constants.FUNCTIONAL_TESTING, "Statement Clicked",
				"Verify Statement Clicked");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.statementColumnPDFClick(),"Resource Not Found.");
	}

	@Test(priority = 7, description = "Verify LocationColumn", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyLocationSearch()
	{
		LoggerManager.info("Verifying Location Search");
		TestBase.setExtentReportSettings("Verifying Location Search", Constants.FUNCTIONAL_TESTING, "Location Search",
				"Verify Location Search");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.locationColumnLabel.getText(),"Location");
	}

	@Test(priority = 8, description = "Verify Run ID Column", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyRunIDClick() 
	{
		LoggerManager.info("Verifying Run ID Search");
		TestBase.setExtentReportSettings("Verifying Run ID Search", Constants.FUNCTIONAL_TESTING, "Run ID Search",
				"Verify Run ID Search");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.runIDClick(),"Run Id");
	}

	@Test(priority = 9, description = "Verify Statement Runs Tab", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyStatementRunsTab() 
	{
		LoggerManager.info("Verifying Statement Runs Tab");
		TestBase.setExtentReportSettings("Verifying Statement Runs Tab", Constants.FUNCTIONAL_TESTING, "Statement Runs Tab",
				"Verify Statement Runs Tab");
		statementApprovalQueuePage = new StatementApprovalQueuePage(driver);
		assertEquals(statementApprovalQueuePage.statementRunsTabClick(),"Statement Runs");
	}
}