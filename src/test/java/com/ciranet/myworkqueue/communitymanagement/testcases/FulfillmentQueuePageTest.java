package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communitymanagement.pages.FulfillmentQueuePage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class FulfillmentQueuePageTest extends TestBase
{
	// Create the FulfillmentQueuePage object
	FulfillmentQueuePage fulfillmentQueuePage = createPage(FulfillmentQueuePage.class);
	
	@Test(priority = 0, description = "Verify Fulfillment Queue Page Title", groups = {Constants.SMOKE_TESTING})
	public void verifyFulfillmentQueuePageURL() 
	{
		LoggerManager.info("Verifying Fulfillment Queue Page Title");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		fulfillmentQueuePage.fulfillmentQueueMenu();
		TestBase.setExtentReportSettings("Verifying Fullfillment Queue Title",Constants.SMOKE_TESTING, "Fullfillment Queue", "Verify Fullfillment Queue");
	}

	@Test(priority = 1, description ="Verify Toolbar - Full screen option click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		TestBase.setExtentReportSettings("Toolbar - Full screen",Constants.FUNCTIONAL_TESTING, "Toolbar Full screen", "Verifying Toolbar Full screen icon click");
		assertTrue(fulfillmentQueuePage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description ="Verify Toolbar - Normal screen option click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen",Constants.FUNCTIONAL_TESTING, "Toolbar Normal screen", "Verifying Toolbar Normal screen icon click");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.toolBarNormalScreen(),"Normal Full Screen is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar Expand icon click",groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar Expand icon");
		TestBase.setExtentReportSettings("Verify Toolbar Expand icon", Constants.FUNCTIONAL_TESTING, "Toolbar Expand icon", "Verifying Toolbar Expand icon");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.expandCollapseOptionClick()	,"Expand icon is not clicked"); 
	}

	@Test(priority = 4, description ="Verify Toolbar - Column Chooser icon click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Column Chooser icon", Constants.FUNCTIONAL_TESTING, "Verify Column Chooser icon", "Verify Column Chooser icon");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.columnChooserClick(),"Column Chooser is not selected"); 
	}

	@Test(priority = 5, description = "Verify tab Switching", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifySwitchtab() 
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", Constants.FUNCTIONAL_TESTING, "Switching tab", "Verifying tab Switching");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.switchTab(),"Tab switching is seen");
	}

	@Test(priority = 6, description = "Verify Action Button save", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyactionSaveClick() 
	{
		LoggerManager.info("Verify Action Button save");
		TestBase.setExtentReportSettings("Switching tab",Constants.FUNCTIONAL_TESTING, "Action Button save", "Verifying Action Button save");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.actionSaveClick(),"Action save button is clicked");
	}

	@Test(priority =7, description = "Verify that View Edit Action close button", groups= {Constants.FUNCTIONAL_TESTING})
	public void verifyActionCloseButton() 
	{
		LoggerManager.info("Verify that View Edit Action close button");
		TestBase.setExtentReportSettings("View Edit Action close button",Constants.FUNCTIONAL_TESTING, "View Edit Action close button", "Verifying View Edit Action close button");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.verifyActionCloseButton(),"Action Close is seen");
	}

	@Test(priority = 8, description = "Verify Action Button Save and Close ", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyactionSaveCloseClick() 
	{
		LoggerManager.info("Verify Action Button Save and Close");
		TestBase.setExtentReportSettings("Action Button Save and Close",Constants.FUNCTIONAL_TESTING, "Action Button Save and Close", "Verifying Action Button Save and Close");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.actionSaveCloseClick(),"Save and Close button is seen");
	}

	@Test(priority = 9, description = "Verify Refresh Queue", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyrefreshQueuebutton() 
	{
		LoggerManager.info("Verify Refresh Queue");
		TestBase.setExtentReportSettings("Refresh Queue",Constants.FUNCTIONAL_TESTING, "Refresh Queue", "Verifying Refresh Queue");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.refreshQueueButton(),"refresh Queue button is seen");
	}

	@Test(priority = 10, description = "Verify Documents tab", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyActionDocumenttabclick() 
	{
		LoggerManager.info("Verify Documents tab");
		TestBase.setExtentReportSettings("Documents tab",Constants.FUNCTIONAL_TESTING, "Documents tab", "Verifying Documents tab");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.actionDocumentTabClick(),"action Document tab is seen");
	}

	@Test(priority = 11, description = "Verify Action completion Job tab", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyActionCompletionttabclick() 
	{
		LoggerManager.info("Verify Action completion Job tab");
		TestBase.setExtentReportSettings("Action completion Job tab", Constants.FUNCTIONAL_TESTING, "Action completion Job tab", "Verifying Action completion Job tab");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.actionCompletiontTabclick(),"action Completion tab is seen");
	}

	@Test(priority = 12, description = "Verify Add Job save and close", groups ={Constants.FUNCTIONAL_TESTING}) 
	public void verifyAddJobSaveAndCloseButton() 
	{
		LoggerManager.info("Verify Add Job save and close");
		TestBase.setExtentReportSettings("Add Job save and close",Constants.FUNCTIONAL_TESTING, "Add Job save and close", "Verifying Add Job save and close");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.addJobSaveAndCloseButton(),"add Job Save And Close button is seen");
	}

	@Test(priority = 13, description = "Verify Add Completion Job tab", groups = {Constants.FUNCTIONAL_TESTING}) 
	public void verifyAddCompletionJobtab() 
	{
		LoggerManager.info("Verify Add Completion Job tab");
		TestBase.setExtentReportSettings("Add Completion Job tab",Constants.FUNCTIONAL_TESTING, "Add Completion Job tab", "Verifying Add Completion Job tab");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.addCompletionJobtab(),"add Completion Job tab is seen");
	}

	@Test(priority = 14, description = "Verify Closed Jobs Search Button", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyClosedJobsSearchButton() 
	{
		LoggerManager.info("Verify Closed Jobs Search Button");
		TestBase.setExtentReportSettings("Closed Jobs Search",Constants.FUNCTIONAL_TESTING, "Closed Jobs Search Button", "Verifying Closed Jobs Search Button");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.closedJobsSearchButton(),"Closed Jobs Search Button is seen");
	}

	@Test(priority = 15, description = "Verify Add Completed Job Save & Add Documents button click", groups =
		{Constants.FUNCTIONAL_TESTING}) 
	public void verifyAddCompletedJobbuttonSaveandAddDocuments() 
	{
		LoggerManager.info("Verify Add Completed Job Save & Add Documents button click");
		TestBase.setExtentReportSettings("Add Completed Job Save and Add Documents",Constants.FUNCTIONAL_TESTING, "Add Completed Job Save & Add Documents button click", "Verifying Add Completed Job Save & Add Documents button click");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.addCompletedJobbuttonSaveandAddDocuments(),"Add Documents is seen");
	}

	@Test(priority = 16, description = "Verify Add Completed Job Close button click", groups ={Constants.FUNCTIONAL_TESTING}) 
	public void verifyAddCompletedJobbuttonclick() 
	{
		LoggerManager.info("Verify Add Completed Job Close button click");
		TestBase.setExtentReportSettings("Add Completed Job Close button click",Constants.FUNCTIONAL_TESTING, "Add Completed Job Close", "Verifying Add Completed Job Close button click");
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);
		assertTrue(fulfillmentQueuePage.addCompletedJobButtonClick(),"add Completed Job button is seen");
	}
}
