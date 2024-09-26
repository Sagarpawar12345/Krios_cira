package com.ciranet.corporatecirabooks.generalledger.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.corporatecirabooks.generalledger.pages.UploadBudgetsPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class UploadBudgetsPageTest extends TestBase{
	UploadBudgetsPage uploadBudgets = createPage(UploadBudgetsPage.class);

	@Test(priority = 0, description = "Verify Upload Budgets Page Title", groups = { Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyUploadBudgetsPageTitle() 
	{
		LoggerManager.info("Verifying Upload Budgets Page Title");
		TestBase.setExtentReportSettings("Verifying Upload Budgets Page", Constants.SMOKE_TESTING, "Upload Budgets", "Verify Upload Budgets Page");
		uploadBudgets = new UploadBudgetsPage(driver);
		assertEquals(uploadBudgets.uploadBudgetsMenu(),"Upload Budgets");
	}

	@Test(priority = 1, description = "Verify Upload Budgets Page fields", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyUploadBudgetsPage() throws AWTException 
	{
		LoggerManager.info("Verifying Upload Budgets Page");
		TestBase.setExtentReportSettings("Verifying Upload Budgets Fields", Constants.FUNCTIONAL_TESTING, "Upload Budgets fields", "Verify Upload Budgets fields");
		uploadBudgets = new UploadBudgetsPage(driver);
		assertTrue(uploadBudgets.verifyUploadBudgetsPage(),"Upload Budgets fields not seen");
	}
}