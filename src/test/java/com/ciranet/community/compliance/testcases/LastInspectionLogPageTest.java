package com.ciranet.community.compliance.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.community.compliance.pages.LastInspectionLogPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class LastInspectionLogPageTest extends TestBase 
{
	// Create the LastInspectionLogPage object
	LastInspectionLogPage lastInspectionLogPage = createPage(LastInspectionLogPage.class);
	
	@Test(priority = 0, description = "Verify Last Inspection Log Detail Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyLastInspectionLogPage() 
	{
		LoggerManager.info("Verifying Last Inspection Log Detail Title");
		TestBase.setExtentReportSettings("Last Inspection Log Detail Title Test", Constants.SMOKE_TESTING, "Verify Last Inspection Log Detail Title", "Verifying Last Inspection Log Detail Page Title");
		lastInspectionLogPage = new LastInspectionLogPage(driver);	
		assertEquals(lastInspectionLogPage.lastInspectionLogMenu(),"Last Inspection Log");
	}
	
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		lastInspectionLogPage = new LastInspectionLogPage(driver);
		assertTrue(lastInspectionLogPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}
 
	@Test(priority = 2, description = "Verify Last Inspection Results Detail", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyLastInspectionResultsDetails() 
	{	
		LoggerManager.info("Verifying Last Inspection Results Detail Title");
		TestBase.setExtentReportSettings("Last Inspection Results Detail Title Test", Constants.FUNCTIONAL_TESTING, "Verify Last Inspection Results Detail Title", "Verifying Last Inspection Results Detail Page Title");
		lastInspectionLogPage = new LastInspectionLogPage(driver);
		assertEquals(lastInspectionLogPage.logDetails(),"Last Inspection Results Detail: Architectural / Last 180 Days");
	}
	
	@Test(priority = 3, description = "Verify Violation History Title Test", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyViolationHistory() 
	{	
		LoggerManager.info("Verifying Violation History Detail Title");
		TestBase.setExtentReportSettings("Violation History Title Test", Constants.FUNCTIONAL_TESTING, "Verify Violation History Title", "Verifying Violation History Title");
		lastInspectionLogPage = new LastInspectionLogPage(driver);
		assertEquals(lastInspectionLogPage.violationHistory(),"Violation History");		
	}

	@Test(priority = 4, description = "Verify Violation History Images Title Test", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyHistoryImage() 
	{	
		LoggerManager.info("Verifying Violation History Images Title");
		TestBase.setExtentReportSettings("Violation History Images Title Test", Constants.FUNCTIONAL_TESTING, "Verify Violation History Images Title", "Verifying Violation History Images Title");
		lastInspectionLogPage = new LastInspectionLogPage(driver);
		assertEquals(lastInspectionLogPage.historyImage(),"Violation History Images");
	}

	@Test(priority = 5, description = "Verify Popup Close Buttons", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyCloseButtons() 
	{	
		LoggerManager.info("Verifying Last Inspection Log Detail Title");
		TestBase.setExtentReportSettings("Last Inspection Log Detail Title Test", Constants.FUNCTIONAL_TESTING, "Verify Last Inspection Log Detail Title", "Verifying  Last Inspection Log Page Title");
		lastInspectionLogPage = new LastInspectionLogPage(driver);
		assertEquals(lastInspectionLogPage.closeButtons(),"Last Inspection Log");
	}
}
             