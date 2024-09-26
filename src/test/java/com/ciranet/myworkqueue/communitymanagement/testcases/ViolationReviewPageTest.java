package com.ciranet.myworkqueue.communitymanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communitymanagement.pages.ViolationReviewPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ViolationReviewPageTest extends TestBase{
	
	// Create the ServicesPage object
	ViolationReviewPage violationReviewPage = createPage(ViolationReviewPage.class);

	@Test(priority = 0, description = "Verify Violation Review Page Title", groups = {Constants.SMOKE_TESTING})
	public void verifyViolationReviewURL() 
	{
		LoggerManager.info("Verifying Violation Review Page Title");
		TestBase.setExtentReportSettings("Verifying Violetion review Title", Constants.SMOKE_TESTING, "Violetion review", "Verify B A");
		violationReviewPage = new ViolationReviewPage(driver);
		assertEquals(violationReviewPage.ViolationReviewMenu(),"Open Violations Requiring Review");
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		violationReviewPage = new ViolationReviewPage(driver);
		assertTrue(violationReviewPage.toolBarFullScreen(), "Fullscreen Icon is not enabled"); 
	}
	
	@Test(priority= 2, description= "Verify Violation History Popup", groups= {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyViolationInspectionHistoryPopup() 
	{
		LoggerManager.info("Verifying Violation History");
		TestBase.setExtentReportSettings("Violation History Title Test", Constants.FUNCTIONAL_TESTING, "Verify Violation History Title", "Verifying Violation History Title");
		violationReviewPage = new ViolationReviewPage(driver);
		assertEquals(violationReviewPage.ViolationInspectionHistoryPopup(),"Violation Inspection History");	
	}
}