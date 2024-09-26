package com.ciranet.myportfolio.revenuemanagement.testcases;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myportfolio.revenuemanagement.pages.BillingItemManagementPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class BillingItemManagementPageTest extends TestBase
{
	// Create the BillingItemManagementPage object
	BillingItemManagementPage billingItemManagementPage = createPage(BillingItemManagementPage.class);
	
	@Test(priority = 0, description = "Verify Billing Item Management Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void VerifybillingItemManagementURL() 
	{
		LoggerManager.info("Verifying Billing Item Management Page Title");
		TestBase.setExtentReportSettings("Billing Item Management Page Title Test", Constants.SMOKE_TESTING, "Verify Billing Item Management Page Title", "Verifying Billing Item Management Page Title");
		billingItemManagementPage = new BillingItemManagementPage(driver);
		assertEquals(billingItemManagementPage.billingItemManagementMenu(),"Billing Item Management");		
	}
}
