package com.ciranet.configurations.testcases;		

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ClosingPortalPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;		

@RequiresLogin
public class ClosingPortalPageTest extends TestBase 		
{		
	// Create the ClosingPortalPage object
	ClosingPortalPage closingPortalPage = createPage(ClosingPortalPage.class);
		
	@Test(priority = 0, description = "Verify Configurations Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)	
	public void verifyConfigurationsMenu() 	
	{	
		LoggerManager.info("Verifying Configurations Page Title");
		TestBase.setExtentReportSettings("Configuration Test",Constants.SMOKE_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		closingPortalPage = new ClosingPortalPage(driver);
		closingPortalPage.navigateToConfigurationsPage();
	}	

	@Test(priority = 1, description = "Verify Configurations Page >> Batch job Emails", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifyNavigateToclosingPortal() 
	{	
		LoggerManager.info("Verifying Closing Portal Configurations Title");
		closingPortalPage = new ClosingPortalPage(driver);
		closingPortalPage.navigateToclosingPortal();
		assertEquals(closingPortalPage.navigateToclosingPortal(),"Closing Portal Configurations");
	}	

	@Test(priority = 2, description = "Verify Configurations Page >> Closing Portal Configurations dropdown1", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifyFirstDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown1");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown first value", Constants.FUNCTIONAL_TESTING, "Verify Closing Portal Configurations dropdown first value", "Verifying Closing Portal Configurations dropdown first value");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectclosingPortalConfigDropdowns("Account Inquiry Fulfillment"), "Account Inquiry Fulfillment");
	}	

	@Test(priority = 3, description = "Verify Configurations Page >> Closing Portal Configurations dropdown2", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifySelectSecondDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown second value",Constants.FUNCTIONAL_TESTING, "Verify Closing Portal Configurations dropdown second value", "Verifying Closing Portal Configurations dropdown second value");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectclosingPortalConfigDropdowns("CiraConnect Fee"), "CiraConnect Fee");
	}	

	@Test(priority = 4, description = "Verify Configurations Page >> Closing Portal Configurations dropdown3", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifySelectThirdDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown third value",Constants.FUNCTIONAL_TESTING, "Verify Closing Portal Configurations dropdown third value", "Verifying Closing Portal Configurations dropdown third value");
		closingPortalPage = new ClosingPortalPage(driver);
		assertEquals(closingPortalPage.selectclosingPortalConfigDropdowns("Closing Portal Delivery Tiers"), "Closing Portal Delivery Tiers");
	}	

	@Test(priority = 5, description = "Verify Configurations Page >> Closing Portal Configurations dropdown4", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifySelectFourthDropdown() 	
	{	
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown fourth value",Constants.FUNCTIONAL_TESTING, "Verify Closing Portal Configurations dropdown fourth value", "Verifying Closing Portal Configurations dropdown fourth value");
		assertEquals(closingPortalPage.selectclosingPortalConfigDropdowns("Portal Configuration Fees & Charges"), "Portal Configuration Fees & Charges");
	}	

	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 6, description = "Verify Configurations Page >> Closing Portal Configurations New tier button", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)	
	public void verifynewtierbutton() 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations fourth dropdown selection");
		LoggerManager.info("Verifying Configurations Page >> Closing Portal Configurations dropdown");
		TestBase.setExtentReportSettings("Closing Portal Configurations dropdown fourth value",Constants.FUNCTIONAL_TESTING, "Verify Closing Portal Configurations dropdown fourth value", "Verifying Closing Portal Configurations dropdown fourth value");
		equals("ClosingPortalconfigurationsPage.newtierbutton()");
		closingPortalPage = new ClosingPortalPage(driver);
	}
}		
