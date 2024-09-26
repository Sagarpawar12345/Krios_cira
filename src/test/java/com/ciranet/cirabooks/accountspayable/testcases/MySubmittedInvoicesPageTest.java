package com.ciranet.cirabooks.accountspayable.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.cirabooks.accountspayable.pages.MySubmittedInvoicesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class MySubmittedInvoicesPageTest extends TestBase {
	
	// Create the MySubmittedInvoicesPage object
	MySubmittedInvoicesPage mySubmittedInvoicesPage = createPage(MySubmittedInvoicesPage.class);

	@Test(priority = 0, description = "Verify Time and Expese Management", groups = {Constants.SMOKE_TESTING},alwaysRun=true)
	public void verifyMySubmittedInvoicesPage() 
	{
		LoggerManager.info("Verifying My Submitted Invoices Page Title");
		TestBase.setExtentReportSettings("My Submitted Invoices Page Title Test", Constants.SMOKE_TESTING, "Verify My Submitted Invoices Page Title", "Verifying My Submitted Invoices Page Title");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.mySubmittedInvoicesMenu(), "Review My Invoices");
	} 

	@Test(priority = 1, description = "Verify My Submitted Invoices", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyAddSubmitedInvoice() throws AWTException 
	{
		LoggerManager.info("Verifying My Submitted Invoices Page Title");
		TestBase.setExtentReportSettings("My Submitted Invoices Page Title Test", Constants.FUNCTIONAL_TESTING, "Verify My Submitted Invoices Page Title", "Verifying My Submitted Invoices Page Title");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.addSubmitedInvoice(), "AP Payment Request");
	}
	
	@Test(priority = 2, description = "Verify Reset Action", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyReset() 
	{
		LoggerManager.info("Verifying reset action");
		TestBase.setExtentReportSettings("Rset Test", Constants.FUNCTIONAL_TESTING, "Verify reset action", "Verifying reset action");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.reset(), "AP Payment Request");
	} 
    
	@Test(priority = 3, description = "Verify vendor activity", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyVendorActivity() 
	{
		LoggerManager.info("Verifying vendor activity");
		TestBase.setExtentReportSettings("vendor activity", Constants.FUNCTIONAL_TESTING, "Verify vendor activity", "Verifying vendor activity");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.vendorActivity(), "Vendor History");
	} 
    
	@Test(priority = 4, description = "Verify board Approval", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyBoardApproval() 
	{
		LoggerManager.info("Verifying Board Approval");
		TestBase.setExtentReportSettings("Board Approval", Constants.FUNCTIONAL_TESTING, "Verify board approval", "Verifying board approval");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.boardApproval(), "Approval Requirements");
	} 
	
	@Test(priority = 5, description = "Verify board Approval", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyAddNotes() 
	{
		LoggerManager.info("Verifying add notes");
		TestBase.setExtentReportSettings("Add Notes", Constants.FUNCTIONAL_TESTING, "Verify add notes", "Verifying add notes");
		mySubmittedInvoicesPage = new MySubmittedInvoicesPage(driver);
		assertEquals(mySubmittedInvoicesPage.addNotes(), "Notes For Vendor #*** Big D Pest & Termite Services, LLC");	
	} 

}
