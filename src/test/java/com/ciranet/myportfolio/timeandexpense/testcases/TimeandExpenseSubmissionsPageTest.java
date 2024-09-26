package com.ciranet.myportfolio.timeandexpense.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myportfolio.timeandexpense.pages.TimeandExpenseSubmissionsPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class TimeandExpenseSubmissionsPageTest extends TestBase 
{
	// Create the TimeandExpenseSubmissionsPage object
	TimeandExpenseSubmissionsPage timeandExpenseSubmissionsPage = createPage(TimeandExpenseSubmissionsPage.class);
	
	@Test(priority = 0, description = "Verify Time and Expense Submissions Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyTimeandExpenseSubmissionsMenu() 
	{
		LoggerManager.info("Verifying Time and Expense Submissions Menu");
		TestBase.setExtentReportSettings("Verifying Time and Expense Submissions Title", Constants.SMOKE_TESTING, "Time and Expense Submissions", "Verify Time and Expense Submissions");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.timeandExpenseSubmissionsMenu(),"Time & Expense Submissions");
	}
	
	@Test(priority = 1,description = "Verify Entity Selection", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyEntitySelection() 
	{	
		LoggerManager.info("Verifying My Customer Charges Menu");
		TestBase.setExtentReportSettings("Verifying Entity Field", Constants.FUNCTIONAL_TESTING, "Entity Field", "Verify Entity Field");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.entity(),"Entity:");
	}
	
	@Test(priority = 2, description = "Verify Toolbar Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Fullscreen icon");
		TestBase.setExtentReportSettings("Verifying Fullscreen icon", Constants.FUNCTIONAL_TESTING, "Fullscreen icon", "Verify Fullscreen icon");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertTrue(timeandExpenseSubmissionsPage.toolBarFullScreen(), "FullScreen Icon is not enabled");
	}
	
	@Test(priority = 3, description = "Verify Mileage Expense Label", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyMileageExpenseLabel() 
	{
		LoggerManager.info("Verifying Mileage Expense Label");
		TestBase.setExtentReportSettings("Verifying Mileage Expense Label", Constants.FUNCTIONAL_TESTING, "Mileage Expense Label", "Verify Mileage Expense Label");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.mileageExpense(), "Mileage Expenses");
	}
	
	@Test(priority = 4, description = "Verify Mileage Expense Label", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyApproveMenu() 
	{
		LoggerManager.info("Verifying Mileage Expense Label");
		TestBase.setExtentReportSettings("Verifying Mileage Expense Label",Constants.FUNCTIONAL_TESTING, "Mileage Expense Label", "Verify Mileage Expense Label");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.approveMenu(), "Verified By");
	}

	@Test(priority = 5, description = "Verify Mileage Expense Label", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifyDenyMenu() 
	{
		LoggerManager.info("Verifying Mileage Expense Label");
		TestBase.setExtentReportSettings("Verifying Mileage Expense Label", Constants.FUNCTIONAL_TESTING, "Mileage Expense Label", "Verify Mileage Expense Label");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.denyMenu(), "Deny Reason");
	}

	@Test(priority = 6, description = "Verify Biography Popup", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true) 
	public void verifySubmittedByColumn() 
	{
		LoggerManager.info("Verifying Biography Popup");
		TestBase.setExtentReportSettings("Verifying Biography Popup", Constants.FUNCTIONAL_TESTING, "Biography Popup", "Verify Biography Popup");
		timeandExpenseSubmissionsPage = new TimeandExpenseSubmissionsPage(driver);
		assertEquals(timeandExpenseSubmissionsPage.submittedByColumn(), "Experience Summary");
	}	
}