package com.ciranet.myportfolio.revenuemanagement.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myportfolio.revenuemanagement.pages.MyCustomerChargesPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class MyCustomerChargesPageTest extends TestBase 
{
	// Create the MyCustomerChargesPage object
	MyCustomerChargesPage myCustomerChargesPage = createPage(MyCustomerChargesPage.class);

	@Test(priority = 0, description = "Verify My Customer Charges Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyMyCustomerChargesMenu() 
	{
		LoggerManager.info("Verifying My Customer Charges Menu");
		TestBase.setExtentReportSettings("Verifying My Customer Charges Title", Constants.FUNCTIONAL_TESTING, "My Customer Charges", "Verify My Customer Charges");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertEquals(myCustomerChargesPage.myCustomerChargesMenu(),"My Customer Charges");
	}
	
	@Test(priority = 1,description = "Verify Entity Selection", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyEntitySelection() 
	{	
		LoggerManager.info("Verifying My Customer Charges Menu");
		TestBase.setExtentReportSettings("Verifying Entity Field", Constants.FUNCTIONAL_TESTING, "Entity Field", "Verify Entity Field");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertEquals(myCustomerChargesPage.entity(),"Entity:");
	}
	
	@Test(priority = 2, description = "Verify Toolbar Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true) 
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Fullscreen icon");
		TestBase.setExtentReportSettings("Verifying Fullscreen icon", Constants.FUNCTIONAL_TESTING, "Fullscreen icon", "Verify Fullscreen icon");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertTrue(myCustomerChargesPage.toolBarFullScreen(), "FullScreen Icon is not enabled");
	}

	@Test(priority = 3,description = "Verify Charge Button", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCreateNewCharge() 
	{
		LoggerManager.info("Verifying Add My Customer Charges");
		TestBase.setExtentReportSettings("Verifying Add My Customer Charges", Constants.FUNCTIONAL_TESTING, "Add My Customer Charges", "Verify Add My Customer Charges");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertEquals(myCustomerChargesPage.addNewCharge(),"Add Customer Charge");
	}
	
	@Test(priority = 4,description = "Verify Edit Menu", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyEditCharge() 
	{
		LoggerManager.info("Verifying Edit Customer Charges");
		TestBase.setExtentReportSettings("Verifying Edit Customer Charges", Constants.FUNCTIONAL_TESTING, "Edit Customer Charges", "Verify Edit Customer Charges");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertEquals(myCustomerChargesPage.editCharge(),"Add Customer Charge");
	}

	@Test(priority = 5,description = "Verify Delete Menu", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyDeleteCharge() 
	{
		LoggerManager.info("Verifying Delete Customer Charges");
		TestBase.setExtentReportSettings("Verifying Delete Customer Charges", Constants.FUNCTIONAL_TESTING, "Delete Customer Charges", "Verify Delete Customer Charges");
		myCustomerChargesPage = new MyCustomerChargesPage(driver);
		assertEquals(myCustomerChargesPage.deleteCharge(),"Confirmation");
	}
}