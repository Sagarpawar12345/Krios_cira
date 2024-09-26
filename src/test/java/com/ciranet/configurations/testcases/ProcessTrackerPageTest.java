package com.ciranet.configurations.testcases;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ProcessTrackerPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ProcessTrackerPageTest extends TestBase {
	
	// Create the ProcessTrackerPage object
	ProcessTrackerPage processTrackerPage = createPage(ProcessTrackerPage.class);
		
	@Test(priority = 0, description = "Verify Process Tracker", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyConfigProcessTrackerClickPages() 
	{
		LoggerManager.info("Verifying Process Tracker");	
		TestBase.setExtentReportSettings("Verifying Process Tracker",Constants.SMOKE_TESTING, "Process Tracker", "Verify Process Tracker");
		processTrackerPage = new ProcessTrackerPage(driver);
	}

	@Test(priority = 1, description = "Verify Process Tracker", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyCommunityAutoCloseReportGeneration() 
	{
		LoggerManager.info("Verifying Community Auto Close & Report Generation");
		TestBase.setExtentReportSettings("Verifying  Community Auto Close & Report Generation - Global Title",Constants.FUNCTIONAL_TESTING, "Community Auto Close & Report Generation - Global", "Verify Community Auto Close & Report Generation - Global");
		processTrackerPage = new ProcessTrackerPage(driver);
		assertEquals(processTrackerPage.communityAutoCloseReportGeneration(),"Community Auto Close & Report Generation - Global");			
	}

	@Test(priority = 2, description = "Verify Process Tracker", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyFinancialPackageConfiguration()
	{
		LoggerManager.info("Verifying Financial Package Configuration");
		TestBase.setExtentReportSettings("Verifying Financial Package Configuration - Global Title",Constants.FUNCTIONAL_TESTING, "Financial Package Configuration - Global", "Verify Financial Package Configuration");
		processTrackerPage = new ProcessTrackerPage(driver);
		assertEquals(processTrackerPage.financialPackageConfiguration(),"Financial Package Configuration - Global");		
	}
	
	@Test(priority = 3, description = "Verify Process Tracker", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyProcessTrackerConfiguration() 
	{
		LoggerManager.info("Verifying Process Tracker Configuration");
		TestBase.setExtentReportSettings("Verifying Process Tracker Configuration - Global Title",Constants.FUNCTIONAL_TESTING, "Process Tracker Configuration", "Verify Process Tracker Configuration");	
		processTrackerPage = new ProcessTrackerPage(driver);
		assertEquals(processTrackerPage.processTrackerConfiguration(),"Process Tracker Configuration - Global");	
	}
}
