package com.ciranet.myworkqueue.communitymanagement.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communitymanagement.pages.MaintenanceWorkOrdersPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class MaintenanceWorkOrdersPageTest extends TestBase{
	
	// Create the MaintenanceWorkOrdersPage object
	MaintenanceWorkOrdersPage workOrdersPage = createPage(MaintenanceWorkOrdersPage.class);

	@Test(priority = 0, description = "Verify Work Orders Page Title", groups = {Constants.SMOKE_TESTING}) 

	public void verifyworkOrdersPageURL() 
	{
		LoggerManager.info("Verifying Work Orders Page Title");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		workOrdersPage.workOrdersPageLanding();
		TestBase.setExtentReportSettings("Verifying Work Order Title",Constants.SMOKE_TESTING, "Work Order", "Verify Work Order");
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", Constants.FUNCTIONAL_TESTING, "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}


	@Test(priority = 3, description = "Verify tab Switching", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifySwitchtab()
	{
		LoggerManager.info("Verify tab Switching");
		TestBase.setExtentReportSettings("Switching tab", Constants.FUNCTIONAL_TESTING, "Verify tab Switching", "Verify tab Switching");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.switchTab(),"tab switching are not seen");
	}

	@Test(priority = 4, description = "Verify Closed Work Orders In Past days textbox", groups = {Constants.FUNCTIONAL_TESTING })
	public void verifyClosedDaysTextbox()
	{
		LoggerManager.info("Verify Closed Work Orders In Past days textbox");
		TestBase.setExtentReportSettings("Closed Work Orders In Past days textbox", Constants.FUNCTIONAL_TESTING, "Closed Work Orders In Past days textbox", "Verifying Closed Work Orders In Past days textbox");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.closedDaysTextbox(),"closed DaysTextbox is not seen");
		
	}

	@Test(priority = 5, description = "Verify Toolbar - Expand icon click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar - Expand icon");
		TestBase.setExtentReportSettings("Verify Toolbar - Expand icon", Constants.FUNCTIONAL_TESTING, "Verify Toolbar - Expand icon", "Verifying Toolbar - Expand icon");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.expandOptionClick(),"Expand icon is not clicked");
	}

	@Test(priority = 6, description = "Verify Toolbar - collapsed icon click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyCollapseOption() 
	{
		LoggerManager.info("Verify Toolbar - collapsed icon");
		TestBase.setExtentReportSettings("Verify Toolbar - collapsed icon", Constants.FUNCTIONAL_TESTING, "Toolbar collapsed icon", "Verifying Toolbar collapsed icon");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.collapseOptionClick(),"Collapse icon is not clicked");
	}

	@Test(priority = 7, description = "Verify Toolbar - Column Chooser icon click", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Toolbar - Column Chooser icon");
		TestBase.setExtentReportSettings("Verify Toolbar - Column Chooser icon", Constants.FUNCTIONAL_TESTING, "Toolbar Column Chooser", "Verifying Toolbar Column Chooser icon");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertEquals(workOrdersPage.columnChooserClick(),"Column Chooser");
	}

	@Test(priority =8, description = "Verify that View Edit Work Order and close", groups= {Constants.FUNCTIONAL_TESTING})
	public void verifyViewEditCloseWorkOrderClick()
	{
		LoggerManager.info("Verify that View Edit Work Order and close");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order and close", Constants.FUNCTIONAL_TESTING, "View Edit Work Order and close", "Verifying that View Edit Work Order and close");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.viewEditCloseWorkOrderClick(),"view Edit Clos Work Order is not seen");
	}

	@Test(priority =9, description = "Verify that View Edit Work Order", groups= {Constants.FUNCTIONAL_TESTING})
	public void verifyViewEditWorkOrder()
	{
		LoggerManager.info("Verify that View Edit Work Order");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order", Constants.FUNCTIONAL_TESTING, "View Edit Work Order", "Verifying that View Edit Work Order");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.viewEditWorkOrder(),"view Edit Work Order is not seen");
	}

	@Test(priority =10, description = "Verify that View Edit Work Order and save", groups= {Constants.FUNCTIONAL_TESTING})
	public void verifyViewEditSaveWorkOrderClick()
	{
		LoggerManager.info("Verify that View Edit Work Order and save");
		TestBase.setExtentReportSettings("Verify that View Edit Work Order and save", Constants.FUNCTIONAL_TESTING, "View Edit Work Order and save", "Verifying that View Edit Work Order and save");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.viewEditSaveWorkOrderClick(),"view Edit Save Work Order is not seen");
	}

	@Test(priority = 11, description = "Verify Work Authorization", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyManageWorkAuthorization() 
	{
		LoggerManager.info("Verify Work Authorization");
		TestBase.setExtentReportSettings("Verify Work Authorization",Constants.FUNCTIONAL_TESTING, "Work Authorization", "Verifying Work Authorization");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.verifyManageWorkAuthorization(),"verify Manage Work Authorization is not seen");
	}

	@Test(priority =12, description = "Verify that Manage Praposal PopUp", groups= {Constants.FUNCTIONAL_TESTING})
	public void VerifyManageProposal() 
	{
		LoggerManager.info("Verify that Manage Praposal PopUp");
		TestBase.setExtentReportSettings("Verify that Manage Praposal PopUp", Constants.FUNCTIONAL_TESTING, "Manage Praposal PopUp", "Verifying Manage Praposal PopUp");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.manageProposal(),"verify manage Proposal is not seen");
	}

	@Test(priority =13, description = "Verify the Chanage Status", groups= {Constants.FUNCTIONAL_TESTING})
	public void verifychangeStatus()
	{
		workOrdersPage.changeStatus();
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
	}

	@Test(priority = 14, description = "Verify Manage Task References Popup", groups = {Constants.FUNCTIONAL_TESTING})
	public void VerifyManageTaskReferences() 
	{
		LoggerManager.info("Verify Manage Task References Popup");
		TestBase.setExtentReportSettings("Verify Manage Task References Popup", Constants.FUNCTIONAL_TESTING, "Manage Task References Popup", "Verifying Manage Task References Popup");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.manageTaskReferences(),"manage Task References is not seen");
	}

	@Test(priority =15, description = "Verify that Add Work Oreders and Close", groups= {Constants.FUNCTIONAL_TESTING })
	public void verifycloseWorkOrder()
	{
		LoggerManager.info("Verify that Add Work Oreders and Close");
		TestBase.setExtentReportSettings("Verify that Add Work Oreders and Close", Constants.FUNCTIONAL_TESTING, "Add Work Oreders and Close", "Verifying Add Work Oreders and Close");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.closeAddWorkOrder(),"close Add Work Order is not seen");
	}

	@Test(priority = 16, description = "Verify Add New Work Order button click", groups = {Constants.FUNCTIONAL_TESTING})
	public void VerifyAddNewWorkOrderClick() 
	{
		LoggerManager.info("Verify Add New Work Order button click");
		TestBase.setExtentReportSettings("Verify Add New Work Order button click", Constants.FUNCTIONAL_TESTING, "Add New Work Order", "Verifying Add New Work Order button click");
		workOrdersPage = new 	MaintenanceWorkOrdersPage(driver);
		assertTrue(workOrdersPage.addNewWorkOrderClick(),"add New Work Order is not seen");
	}
}


