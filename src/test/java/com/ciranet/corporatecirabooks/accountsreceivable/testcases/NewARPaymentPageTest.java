package com.ciranet.corporatecirabooks.accountsreceivable.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.corporatecirabooks.accountsreceivable.pages.NewARPaymentPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class NewARPaymentPageTest extends TestBase
{
	
	// Create the NewARPaymentPage object
	NewARPaymentPage newARPaymentPage = createPage(NewARPaymentPage.class);

	@Test(priority = 0, description = "Verify New AR Payment", groups = { Constants.SMOKE_TESTING })
	public void verifyNewARPayment()
	{
		LoggerManager.info("Verifying New AR Payment Page Title");
		TestBase.setExtentReportSettings("Verifying New AR Payment Title", Constants.SMOKE_TESTING, "AR Payment", "Verify AR Payment");
		newARPaymentPage = new NewARPaymentPage(driver);
		assertEquals(newARPaymentPage.newARPaymentMenu(),"New AR Payment");
	} 
	
	@Test(priority = 1, description = "Verify New AR Payment Page fields", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyCreateAR()
	{
		LoggerManager.info("Verifying Create New AR Payment");
		TestBase.setExtentReportSettings("Verifying Create AR Payment", Constants.FUNCTIONAL_TESTING, "Create AR Payment", "Verify Create AR Payment");
		newARPaymentPage = new NewARPaymentPage(driver);
		assertTrue(newARPaymentPage.createAR(), "Confirmation popup is displayed");
	}
}