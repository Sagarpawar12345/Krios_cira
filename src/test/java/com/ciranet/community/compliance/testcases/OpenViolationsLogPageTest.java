package com.ciranet.community.compliance.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.community.compliance.pages.OpenViolationsLogPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class OpenViolationsLogPageTest extends TestBase 
{
	// Create the OpenViolationsLogPage object
	OpenViolationsLogPage openViolationsLogPage = createPage(OpenViolationsLogPage.class);
		
	@Test(priority = 0, description = "Verify Open Violations Log Detail Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyOpenViolationsLogPage() 
	{
		LoggerManager.info("Verifying Open Violations Log Detail Title");
		TestBase.setExtentReportSettings("Open Violations Log Detail Title Test", Constants.SMOKE_TESTING, "Verify Open Violations Log Detail Title", "Verifying Open Violations Log Detail Page Title");
		openViolationsLogPage = new OpenViolationsLogPage(driver);
		assertEquals(openViolationsLogPage.openViolationsLogMenu(),"Open Violations Log");
	}
 
	@Test(priority = 1, description = "Verify Log Details", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyLogDetails() 
	{	
		LoggerManager.info("Verifying Log Detail Title");
		TestBase.setExtentReportSettings("Log Detail Title Test", Constants.FUNCTIONAL_TESTING, "Verify Log Detail Title", "Verifying Log Detail Page Title");
		assertEquals(openViolationsLogPage.logDetails(),"Open Violations Log Detail");
	}

	@Test(priority = 2, description = "Verify Violation History Title Test", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyViolationHistory() 
	{	
		LoggerManager.info("Verifying Violation History Detail Title");
		TestBase.setExtentReportSettings("Violation History Title Test", Constants.FUNCTIONAL_TESTING, "Verify Violation History Title", "Verifying Violation History Title");
		assertEquals(openViolationsLogPage.violationHistory(),"Violation History");		
	}

	@Test(priority = 3, description = "Verify Violation History Images Title Test", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyHistoryImage() 
	{	
		LoggerManager.info("Verifying Violation History Images Title");
		TestBase.setExtentReportSettings("Violation History Images Title Test", Constants.FUNCTIONAL_TESTING, "Verify Violation History Images Title", "Verifying Violation History Images Title");
		assertEquals(openViolationsLogPage.historyImage(),"Violation History Images");
	}

	@Test(priority = 4, description = "Verify Popup Close Buttons", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyCloseButtons() 
	{	
		LoggerManager.info("Verifying Open Violations Log Detail Title");
		TestBase.setExtentReportSettings("Open Violations Log Detail Title Test", Constants.FUNCTIONAL_TESTING, "Verify Open Violations Log Detail Title", "Verifying Open Violations Log Detail Page Title");
		assertEquals(openViolationsLogPage.closeButtons(),"Open Violations Log");
	}
}
