package com.ciranet.myworkqueue.communitymanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.communitymanagement.pages.CommonLotsAppraisalPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommonLotsAppraisalPageTest extends TestBase{
	
	// Create the ServicesPage object
	CommonLotsAppraisalPage commonLotsAppraisalPage = createPage(CommonLotsAppraisalPage.class);


	@Test(priority = 0, description = "Verify Common Lots Appraisal Title", groups = {Constants.SMOKE_TESTING})
	public void verifyCommonLotsAppraisalURL() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", Constants.SMOKE_TESTING, "Common Lots", "Verify C L A");
		commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
		assertEquals(commonLotsAppraisalPage.commonLotsAppraisalPage(), "Common Lots Appraisal");   
	}


	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true) 
	public void verifyToolbarFullScreenOption() {
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title",Constants.FUNCTIONAL_TESTING, "Common Lots Appraisal", "Verify Common Lots Appraisal");
		commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
		assertTrue(commonLotsAppraisalPage.toolBarFullScreen(), "Fullscreen icon is not enabled");	
	}



	@Test(priority = 2, description = "Verify Column Chooser Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", Constants.FUNCTIONAL_TESTING, "Common Lots", "Verify C L A");
		commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
		assertEquals(commonLotsAppraisalPage.columnChooserClick(), "Column Chooser");
	}
	
	@Test(priority = 3, description = "Verify excel Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyexcelOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", Constants.FUNCTIONAL_TESTING, "Common Lots", "Verify C L A");
		assertTrue(commonLotsAppraisalPage.excelClick(), "Excel icon is not enabled");
	}

	@Test(priority = 4, description = "Verify csv Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifycsvOption() 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", Constants.FUNCTIONAL_TESTING, "Common Lots", "Verify C L A");
		commonLotsAppraisalPage = new CommonLotsAppraisalPage(driver);
		assertTrue(commonLotsAppraisalPage.csvClick(), "CSV icon is not enabled");
	}
}
