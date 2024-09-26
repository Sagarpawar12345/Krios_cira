package com.ciranet.myworkqueue.disclosureprocessing.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.disclosureprocessing.pages.PropertyConveyancePage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class PropertyConveyancePageTest extends TestBase
{
	// Create the PropertyConveyancePage object
	PropertyConveyancePage propertyConveyancePage = createPage(PropertyConveyancePage.class);
	
	@Test(priority = 0, description = "Verify Property Coveyance Work Queue Page Title", groups = { Constants.SMOKE_TESTING })
	public void verifyPropertyConveyanceWorkQueuePageURL() 
	{
		LoggerManager.info("Verifying Property Conveyance Work Queue Page Title");
		
		TestBase.setExtentReportSettings("Property Conveyance Work Queue Page Title", Constants.SMOKE_TESTING, "Property Conveyance", "verifying Property Conveyance Work Queue Page Title");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertEquals(propertyConveyancePage.propertyConveyancePageLanding(), "Property Ownership Conveyance");
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Full screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Full screen", Constants.FUNCTIONAL_TESTING, "Toolbar Full screen", "Verifying Toolbar - Full screen icon click");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.toolBarFullScreen(),"toolBar Full Screen is not seen");
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verify Toolbar - Normal screen icon click");
		TestBase.setExtentReportSettings("Toolbar - Normal screen", Constants.FUNCTIONAL_TESTING, "Toolbar Normal screen", "Verifying Toolbar - Normal screen icon click");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.toolBarNormalScreen(),"toolBar Normal Screen is not seen");
	}

	@Test(priority = 3, description = "Verify Toolbar - Column Chooser icon click", groups = { Constants.FUNCTIONAL_TESTING },alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verify Column Chooser icon");
		TestBase.setExtentReportSettings("Column Chooser icon", Constants.FUNCTIONAL_TESTING, "Column Chooser icon", "Verifying Column Chooser icon");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.columnChooserClick(),"column Chooser option is not Clicked");
	}

	@Test(priority = 4, description = "Verify Toolbar Expand icon", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyExpandOption() 
	{
		LoggerManager.info("Verify Toolbar Expand icon");
		TestBase.setExtentReportSettings("Toolbar Expand icon", Constants.FUNCTIONAL_TESTING, "Toolbar Expand icon", "Verifying Toolbar Expand icon");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.expandOptionClick(),"Toolbar Expand icon is not Clicked");
	}

	@Test(priority = 5, description = "Verify Edit Community Cancel Button", groups = { Constants.FUNCTIONAL_TESTING })
	public void VerifyactionEditCommunityCancel() 
	{
		LoggerManager.info("Verify Edit Community Cancel Button");
		TestBase.setExtentReportSettings("Edit Community Cancel Button", Constants.FUNCTIONAL_TESTING, "Edit Community Cancel Button", "Verifying Edit Community Cancel Button");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.actionEditCommunityCancel(),"Edit Community Cancel Button is not Clicked");
	}

	@Test(priority = 5 , description = "Verify Delete Community  Button", alwaysRun=true, groups = { Constants.FUNCTIONAL_TESTING })
	public void VerifyactionDeleteCommunity() 
	{
		LoggerManager.info("Verify Delete Community Button");
		TestBase.setExtentReportSettings("Delete Community  Button", Constants.FUNCTIONAL_TESTING, "Delete Community  Button", "Verifying Delete Community  Button");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		try 
		{
			assertTrue(propertyConveyancePage.verifyActionDelete(),"Delete Community  Button is not Clicked");
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 6 , description = "Verify Refresh Button", groups = { Constants.FUNCTIONAL_TESTING })
	public void Verifyrefresh() 
	{
		LoggerManager.info("Verify Refresh Button");
		TestBase.setExtentReportSettings("Refresh Button", Constants.FUNCTIONAL_TESTING, "Refresh Button", "Verifying Refresh Button");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.verifyRefreshButton(),"Refresh Button is not Clicked");
	}

	@Test(priority = 7, description = "Verify Process Property Conveyance Menu and Toggle Compact Mode", alwaysRun=true, groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyCompactModeOnPropertyConveyancePopup() 
	{
		LoggerManager.info("Verify Process Property Conveyance Menu and Toggle Compact Mode");
		TestBase.setExtentReportSettings("Process Property Conveyance Menu and Toggle Compact Mode", Constants.FUNCTIONAL_TESTING, "Process Property Conveyance Menu and Toggle Compact Mode", "Verifying Process Property Conveyance Menu and Toggle Compact Mode");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		try 
		{
			assertTrue(propertyConveyancePage.compactModeToggleOnPropertyConveyancePopup(),"Toggle Compact Mode is not seen");
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 8, description = "Verify Toggle Completed and Open Tabs", alwaysRun=true, groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyToggleCompletedTabOpenTabs() 
	{
		LoggerManager.info("Verify Toggle Completed and Open Tabs");
		TestBase.setExtentReportSettings("Toggle Completed and Open Tabs", Constants.FUNCTIONAL_TESTING, "Toggle Completed and Open Tabs", "Verifying Toggle Completed and Open Tabs");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.toggleCompletedOpenTabClick(),"Toggle Completed and Open Tabs is not seen");
	}

	@Test(priority = 9, description = "Verify Search Work Queue button click", alwaysRun=true, groups = { Constants.FUNCTIONAL_TESTING })
	public void verifySearchWorkQueueButton() 
	{
		LoggerManager.info("Verify Search Work Queue button click");
		TestBase.setExtentReportSettings("Search Work Queue button click", Constants.FUNCTIONAL_TESTING, "Search Work Queue button click", "Verifying Search Work Queue button click");
		propertyConveyancePage = new PropertyConveyancePage(driver);
		assertTrue(propertyConveyancePage.searchWorkQueueButtonClick(),"Search Work Queue button click is not Clicked");
	}
}
