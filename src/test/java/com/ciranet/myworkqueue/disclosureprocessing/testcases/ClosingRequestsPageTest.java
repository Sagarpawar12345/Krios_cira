package com.ciranet.myworkqueue.disclosureprocessing.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.disclosureprocessing.pages.ClosingRequestsPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ClosingRequestsPageTest  extends TestBase{
	
	// Create the ClosingRequestsPage object
	ClosingRequestsPage closingRequestsPage = createPage(ClosingRequestsPage.class);
		
	@Test(priority = 0, description = "Verify Closing Requests Page Title", groups = { Constants.SMOKE_TESTING },alwaysRun = true)
	public void verifyclosingRequeststURL() {

		LoggerManager.info("Verifying Closing Request Page Title");
		TestBase.setExtentReportSettings("Verifying Closing Request Title", Constants.SMOKE_TESTING, "Closing Request", "Verify Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.closingRequestsMenu(), "Closing Requests");
	}

	@Test(priority = 1, description = "Verify Toolbar and Full Screen", groups ={ Constants.FUNCTIONAL_TESTING },alwaysRun = true) 
	public void verifyToolBarFullScreen() 
	{
		LoggerManager.info("Verifying Closing Request"); 
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertTrue(closingRequestsPage.toolBarFullScreen(),"FullScreen icon is not enabled");
	}

	@Test(priority = 2, description = "Verify Search Button", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifySearchButton() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertTrue(closingRequestsPage.searchButton(), "Search icon is not enabled");
	}

	@Test(priority = 3, description = "Verify Action Transfer to Collection", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifyActionTransfertoCollectionsOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.verifyActionTransfertoCollections(), "Collections");
		
	}
	@Test(priority = 4, description = "Verify Action Transfer to Transition", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifyActionTransfertoTransitionOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.verifyActionTransfertoTransition(), "Transition");
	}


	@Test(priority = 5, description = "Verify Assign Property", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifyActionAssignPropertyOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.verifyActionAssignProperty(), "Resale/SOA Change Request Property");
	}

	@Test(priority = 6, description = "Verify Action cancle request", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void actionCancleRequestOption() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.actionCancelRequest(), "Cancel Reason:");	
	}

	@Test(priority = 7, description = "Verify Assign Property", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifySwitchingTabs() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertTrue(closingRequestsPage.switchingTabs(), "Open Request(Auto Fill) tab is clicked ");
	}

	@Test(priority = 8, description = "Verify Request Type", groups = {Constants.FUNCTIONAL_TESTING },alwaysRun = true) 
	public void verifyRequestTypeFilter() {
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.requestTypeFilter(), "Location");
	}
	@Test(priority = 9, description = "Verify Search tab", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun = true)
	public void verifySearchTab() 
	{
		LoggerManager.info("Verifying Closing Request");
		TestBase.setExtentReportSettings("Closing Request ", Constants.FUNCTIONAL_TESTING, "Verify Closing Request", "Verifying Closing Request");
		closingRequestsPage = new ClosingRequestsPage(driver);
		assertEquals(closingRequestsPage.searchTab(), "Property Address:");
	}


	}
