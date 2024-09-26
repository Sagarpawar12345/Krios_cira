package com.ciranet.myworkqueue.disclosureprocessing.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.disclosureprocessing.pages.CommunityBlocksPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommunityBlocksPageTest  extends TestBase
{
	// Create the CommunityBlocksPage object
	CommunityBlocksPage communityBlocksPage = createPage(CommunityBlocksPage.class);

	@Test(priority = 0, description = "Verify Closing Requests Page Title", groups = { Constants.SMOKE_TESTING }, alwaysRun=true)
	public void verifyCommunityBlocks() 
	{
		LoggerManager.info("Verifying Community Blocks Page Title");
		TestBase.setExtentReportSettings("Community Blocks Page Title Test", Constants.SMOKE_TESTING, "Verify Community Blocks Title", "Verifying Community Blocks Page Title");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.communityBlocksMenu(),"SOA Community Blocks Config");
	}

	@Test(priority = 1, description = "Verify Closing Requests Page Column Chooser", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyColumnChooserClick() {

		LoggerManager.info("Verifying Column chooser");
		TestBase.setExtentReportSettings("Column Chooser Test", Constants.FUNCTIONAL_TESTING, "Verify Column Chooser Title", "Verifying Column Chooser Page Title");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.columnChooserClick(),"Column Chooser");
	}

	@Test(priority = 2, description = "Verify Toolbar and Full Screen Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertTrue(communityBlocksPage.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}

	@Test(priority = 3, description = "Verify Export To Excel Option", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyExportToExcelDownload()
	{
		LoggerManager.info("Verifying Export To Excel Option");
		TestBase.setExtentReportSettings("Export To Excel Option Test", Constants.FUNCTIONAL_TESTING, "Verify Export To Excel Option", "Verifying Export To Excel Option");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertTrue(communityBlocksPage.exportToExcel(), "Excel icon is not enabled");
	}

	@Test(priority = 4, description = "Verify Switching Tabs", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifySwitchingTabs()
	{
		LoggerManager.info("Verifying Switching tabs");
		TestBase.setExtentReportSettings("Switching tabs Test", Constants.FUNCTIONAL_TESTING, "Verify Switching tabs", "Verifying Switching tabs");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.switchingTabs(),"Active");
	}
	
	@Test(priority = 5, description = "Verify Add Block", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyAddBlock()
	{
		LoggerManager.info("Verifying Add Block");
		TestBase.setExtentReportSettings("Community Add Blocks Page Title Test", Constants.FUNCTIONAL_TESTING, "Verify Add Community Blocks Title", "Verifying Add Community Blocks Page Title");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.addBlock(),"Add Community Block");
	}

	@Test(priority = 6, description = "Verify Edit Button", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyActiveEditButtonOption()
	{
		LoggerManager.info("Verifying Active Edit Button Option");
		TestBase.setExtentReportSettings("Active Edit Title Test", Constants.FUNCTIONAL_TESTING, "Verify Active Edit Title", "Verifying Active Edit Title");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.activeEditButton(), "Block Text:");     
	}
	
	@Test(priority = 7, description = "Verify Expire Edit Button", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyExpiredEditButtonoption()
	{
		LoggerManager.info("Verifying Expired Edit Button Option");
		TestBase.setExtentReportSettings("Expired Edit Title Test", Constants.FUNCTIONAL_TESTING, "Verify Expired Edit Title", "Verifying Expired Edit Title");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.expiredEditButton(),"Block Text:");   
	}

	@Test(priority = 8, description = "Verify Community Filter", groups = { Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCommunityFilterOption()
	{
		LoggerManager.info("Verifying Community Filter Option");
		TestBase.setExtentReportSettings("Community Filter", Constants.FUNCTIONAL_TESTING, "Verify Community Filter", "Verifying Community Filter");
		communityBlocksPage = new CommunityBlocksPage(driver);
		assertEquals(communityBlocksPage.communityFilter(),"Community");
	}

	
}
