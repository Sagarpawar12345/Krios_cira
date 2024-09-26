package com.ciranet.cirabooks.accountspayable.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.cirabooks.accountspayable.pages.APExpenseDetailPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class APExpenseDetailPageTest extends TestBase 
{
	// Create the APExpenseDetailPage object
	APExpenseDetailPage apExpenseDetailPage = createPage(APExpenseDetailPage.class);

	@Test(priority = 0, description = "Verify AP Expense Details Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyAPExpenseDetail() 
	{
		LoggerManager.info("Verifying AP Expense Details Title");
		TestBase.setExtentReportSettings("Workspace Title Test", Constants.SMOKE_TESTING, "Verify Workspace Title", "Verifying Workspace Page Title");	
		apExpenseDetailPage = new APExpenseDetailPage(driver);
		assertEquals(apExpenseDetailPage.apExpenseDetailMenu(),"AP Expense Detail");
	}
	
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		apExpenseDetailPage = new APExpenseDetailPage(driver);
		assertTrue(apExpenseDetailPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 2, description = "Verify AP Bill", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyAmount() 
	{
		LoggerManager.info("Verifying AP Bill");
		TestBase.setExtentReportSettings("AP Bill Page Title Test", Constants.FUNCTIONAL_TESTING, "Verify AP Bill", "Verifying AP Bill");
		apExpenseDetailPage = new APExpenseDetailPage(driver);
		assertEquals(apExpenseDetailPage.amountColumn(),"Bill Description:");
	}
	
	@Test(priority = 3, description = "Verify Workflow Details", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyReclassifyButton() 
	{
		LoggerManager.info("Verifying Workflow Details");
		TestBase.setExtentReportSettings("Workflow Details Test", Constants.FUNCTIONAL_TESTING, "Verify Workflow Details", "Verifying Workflow Details");
		apExpenseDetailPage = new APExpenseDetailPage(driver);
		assertEquals(apExpenseDetailPage.reclassifyButton(), "AAP Workflow Job Details");
	} 
}
