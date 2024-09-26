package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.configurations.pages.ReportTemplatesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ReportTemplatesPageTest extends TestBase {
	
	// Create the ReportTemplatesPage object
	ReportTemplatesPage reportTemplatesPage = createPage(ReportTemplatesPage.class);
		
	@Test(priority = 0, description = "Verify Report Template", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyConfigReportTemplatesClickPages() 
	{
		LoggerManager.info("Verifying Report Template");
		TestBase.setExtentReportSettings("Verifying Report Configuration Page Title", Constants.SMOKE_TESTING, "Report Configuration", "Verify Report Configuration");
		reportTemplatesPage = new ReportTemplatesPage(driver);
	}

	@Test(priority = 1, description = "Verify Report Template", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyLetterTemplate() 
	{
		LoggerManager.info("Verifying Letter Template");
		TestBase.setExtentReportSettings("Verifying   Letter Templates / Builder Statement Cover Letter - Global  Title",Constants.FUNCTIONAL_TESTING, "Letter Template", "Verify Letter Template");	
		reportTemplatesPage = new ReportTemplatesPage(driver);
		assertEquals(reportTemplatesPage.letterTemplate(),"Letter Templates / Builder Statement Cover Letter - Global");
	}

	@Test(priority = 2, description = "Verify Report Template", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyLetterHeadTemplate() 
	{
		LoggerManager.info("Verifying Letterhead Template");
		TestBase.setExtentReportSettings("Verifying  Letterhead Template / Page Footer - Global  Title",Constants.FUNCTIONAL_TESTING, "Letterhead Template", "Verify Letterhead Template");
		reportTemplatesPage = new ReportTemplatesPage(driver);
		assertEquals(reportTemplatesPage.letterHeadTemplate(),"Letterhead Template / Page Footer - Global");
	}
}