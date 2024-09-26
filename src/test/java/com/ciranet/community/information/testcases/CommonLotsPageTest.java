package com.ciranet.community.information.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.information.pages.CommonLotsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class CommonLotsPageTest extends TestBase {
	
	// Create the CommonLotsPage object
	CommonLotsPage commonLotsPage = createPage(CommonLotsPage.class);
	@Test(priority = 0, description = "Verify Common Lots Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommonLots() 
	{
		LoggerManager.info("Verifying Common Lots Title");
		TestBase.setExtentReportSettings("Common Lots Title Test", Constants.SMOKE_TESTING, "Verify Common Lots Title", "Verifying Common Lots Page Title");	
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.commonLotsMenu(),"Common Lots");
	}
		
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		commonLotsPage = new CommonLotsPage(driver);
		assertTrue(commonLotsPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}
	
	@Test(priority = 2, description = "Verify Edit Common Lot", groups = { "Functional" }, alwaysRun=true)
	public void verifyCommonLotActions() 
	{	
		LoggerManager.info("Verifying Edit Common Lot");
		TestBase.setExtentReportSettings("Verifying Edit Common Lot", Constants.FUNCTIONAL_TESTING, "Edit Common Lot",
				"Verify Edit Common Lot");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.commonLotActions(),"Edit a Common Lot");		
	}
	
	@Test(priority = 3, description = "Verify Common Lot Notes", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyCommonLotsNotes() 
	{	
		LoggerManager.info("Verifying Common Lot Notes");
		TestBase.setExtentReportSettings("Verifying Common Lot Notes", Constants.FUNCTIONAL_TESTING, "Common Lot Notes",
				"Verify Common Lot Notes");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.notes(),"New Notes");		
	}
	
	@Test(priority = 4, description = "Verify Common Lot Notes", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyCategoryGrid() 
	{	
		LoggerManager.info("Verifying Category Grid");
		TestBase.setExtentReportSettings("Verifying Category Grid", Constants.FUNCTIONAL_TESTING, "Category Grid",
				"Verify Category Grid");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.categoryGrid(),"Category");		
	}
	
	@Test(priority = 5, description = "Verify PTA Received Tab", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyPTAReceivedTab() 
	{	
		LoggerManager.info("Verifying PTA Received Tab");
		TestBase.setExtentReportSettings("Verifying PTA Received Tab",Constants.FUNCTIONAL_TESTING, "PTA Received Tab",
				"Verify PTA Received Tab");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.ptaReceivedTab(),"Appraiser");		
	}
	
	@Test(priority = 6, description = "Verify PTA Not Received Tab", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyPTANotReceivedTab() 
	{	
		LoggerManager.info("Verifying PTA Not Received Tab");
		TestBase.setExtentReportSettings("Verifying PTA Not Received Tab", Constants.FUNCTIONAL_TESTING, "PTA Not Received Tab",
				"Verify PTA Not Received Tab");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.ptaNotReceivedTab(),"Street Number");		
	} 
	
	@Test(priority = 7, description = "Verify Property Taxes Paid Tab", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyPropertyTaxesPaidTab() 
	{	
		LoggerManager.info("Verifying Property Taxes Paid Tab");
		TestBase.setExtentReportSettings("Verifying Property Taxes Paid Tab", Constants.FUNCTIONAL_TESTING, "Property Taxes Paid Tab",
				"Verify Property Taxes Paid Tab");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.propertyTaxesPaidTab(),"Tax Year");		
	}
	
	@Test(priority = 8, description = "Verify Add a New Common Lot", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyAddNewCommonLot() 
	{	
		LoggerManager.info("Verifying Add a New Common Lot");
		TestBase.setExtentReportSettings("Verifying Add a New Common Lot",Constants.FUNCTIONAL_TESTING, "Add a New Common Lot",
				"Verify Add a New Common Lot");
		commonLotsPage = new CommonLotsPage(driver);
		assertEquals(commonLotsPage.addCommonLot(),"Add a New Common Lot");		
	}
}
