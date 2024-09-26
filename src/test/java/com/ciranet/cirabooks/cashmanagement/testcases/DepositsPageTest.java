package com.ciranet.cirabooks.cashmanagement.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.cirabooks.cashmanagement.pages.DepositsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class DepositsPageTest extends TestBase 
{
	DepositsPage depositsPage = createPage(DepositsPage.class);

	@Test(priority = 1, description = "Verify CM Deposits Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyDepositsMenu()
	{
		LoggerManager.info("Verifying Deposits Page Title");
		TestBase.setExtentReportSettings("Deposits Page Title Test", Constants.SMOKE_TESTING, "Verify Deposits Title", "Verifying Deposits Page Title");	
		depositsPage = new DepositsPage(driver);
		assertEquals(depositsPage.depositsMenu(),"Deposits");
	}

	@Test(priority = 2, description = "Verify Add Deposit", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyAddDeposits()
	{
		LoggerManager.info("Verifying Add New Deposits Page Title");
		TestBase.setExtentReportSettings("Add New Deposits Page Title", Constants.FUNCTIONAL_TESTING, "Verify Add New Deposits Title", "Verifying Add New Deposits Page Title");
		depositsPage = new DepositsPage(driver);
		assertEquals(depositsPage.addDeposits(),"Add New Deposit");
	}
	
	@Test(priority = 3, description = "Verify Column Chooser", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void VerifycolumnChooserClick() 
	{
		LoggerManager.info("Verifying Column Chooser");
		TestBase.setExtentReportSettings("Column Chooser Test", Constants.FUNCTIONAL_TESTING, "Verify Column Chooser Title", "Verifying Column Chooser Page Title");
		depositsPage = new DepositsPage(driver);
		assertEquals(depositsPage.columnChooserClick(),"Column Chooser");
	}
	
	@Test(priority = 4, description = "Verify Toolbar and Full Screen Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void VerifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		depositsPage = new DepositsPage(driver);
		assertTrue(depositsPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 5, description = "Verify Export To Excel Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyExportToExcelDownload()
	{
		LoggerManager.info("Verifying Export To Excel Option");
		TestBase.setExtentReportSettings("Export To Excel Option Test", Constants.FUNCTIONAL_TESTING, "Verify Export To Excel Option", "Verifying Export To Excel Option");
		depositsPage = new DepositsPage(driver);
		assertTrue(depositsPage.verifyExportToExcel(), "Excel icon is not enabled");
	}
	
	@Test(priority = 6, description = "Verify View Menu Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyViewMenu()
	{
		LoggerManager.info("Verifying View Menu Option");
		TestBase.setExtentReportSettings("View Menu Option Test", Constants.FUNCTIONAL_TESTING, "Verify View Menu Option", "Verifying View Menu Option");
		depositsPage = new DepositsPage(driver);
		assertEquals(depositsPage.viewMenu(),"Receive Date");	
	}
}
