package com.ciranet.myportfolio.timeandexpense.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myportfolio.timeandexpense.pages.TimeandExpensePage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class TimeandExpensePageTest extends TestBase{

	// Create the TimeandExpensePage object
	TimeandExpensePage timeandExpensePage = createPage(TimeandExpensePage.class);

	@Test(priority = 0,description = "Verify Time and Expese Management", groups = {Constants.SMOKE_TESTING},alwaysRun=true)
	public void verifyTimeandExpensePageURL() 
	{

		LoggerManager.info("Verifying Verify Time and Expese Management Page Title");
		TestBase.setExtentReportSettings("Time and Expense Page Title Test", Constants.SMOKE_TESTING, "Verify Time and Expense Page Title", "Verifying Time and Expense Page Title");
		timeandExpensePage = new TimeandExpensePage(driver);
		assertEquals(timeandExpensePage.timeandExpensePageLanding(), "Time & Expense Management");
	} 
	
		@Test(priority = 1, description = "Verify New Time Entry", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyNewTimeEntrySaveButton() 
	{
		LoggerManager.info("Verifying New Time Entry");
		TestBase.setExtentReportSettings("New Time Entry", Constants.FUNCTIONAL_TESTING, "Verify New Time Entry", "Verify New Time Entry");
		timeandExpensePage = new TimeandExpensePage(driver);
		assertEquals(timeandExpensePage.newTimeEntrySaveButton(), "Time & Expense Management");
	}
		
		@Test(priority = 2, description = "Verify Tab Switching", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
		public void verifyTabSwitching() 
		{

			LoggerManager.info("Verifying Tab Switching");
			TestBase.setExtentReportSettings("Tab Switching", Constants.FUNCTIONAL_TESTING, "Verify Tab Switching", "Verifying Tab Switching");
			timeandExpensePage = new TimeandExpensePage(driver);
			assertTrue(timeandExpensePage.tabSwitching(), "General Expense tab is clicked");
		} 
		
		@Test(priority = 3, description = "Verify General Expense for Cancel Button", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
		public void verifySubmitForApprovalCancelButton() 
		{
			LoggerManager.info("Verifying General Expense for Cancel Button");
			TestBase.setExtentReportSettings("General Expense for Cancel Button",Constants.FUNCTIONAL_TESTING, "Verify General Expense for Cancel Button", "Verifying General Expense for Cancel Button");
			timeandExpensePage = new TimeandExpensePage(driver);
			assertEquals(timeandExpensePage.submitForApprovalCancelButton(), "Time & Expense Management");
		}

		@Test(priority = 4, description = "Verify Mileage Expense for Submit Button", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
		public void verifySubmitMileageExpenses() 
		{
			LoggerManager.info("Verifying Mileage Expense for Submit Button");
			TestBase.setExtentReportSettings("Mileage Expense for Submit Button", Constants.FUNCTIONAL_TESTING, "Verify Mileage Expense for Submit Button", "Verifying Mileage Expense for Submit Button");
			timeandExpensePage = new TimeandExpensePage(driver);
			assertEquals(timeandExpensePage.submitMileageExpenses(), "Time & Expense Management");
		}
		
		@Test(priority = 5, description = "Verify My Places", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
		public void verifyMyPlaces() 
		{
			LoggerManager.info("Verifying My Places");
			TestBase.setExtentReportSettings("My Places", Constants.FUNCTIONAL_TESTING, "Verify My Places", "Verifying My Places");
			timeandExpensePage = new TimeandExpensePage(driver);
			assertEquals(timeandExpensePage.myPlaces(), "Add New My Place");
		} 
		
}


