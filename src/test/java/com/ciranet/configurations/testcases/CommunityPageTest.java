package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.CommunityPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommunityPageTest extends TestBase 
{
	// Create the CommunityPage object
	CommunityPage communityPage = createPage(CommunityPage.class);

	@Test(priority = 0, description = "Verify Configurations Page Title", groups = {Constants.SMOKE_TESTING})
	public void verifyConfigurationsMenu() 
	{
		LoggerManager.info("Verifying Configurations Page Title");
		TestBase.setExtentReportSettings("Configuration Test", Constants.SMOKE_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.navigateToConfigurationsPage(), "Configurations");
	}
	
	@Test(priority = 1, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyNavigateToCommunityConfigurations() {
		LoggerManager.info("Verifying Community Configurations Title");
		TestBase.setExtentReportSettings("Community Configuration", Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.navigateToCommunityConfigurations(),"Community Configurations");
	}

	@Test(priority = 2, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyAmenityDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations first dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Amenity");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelAmenity.getText(), "Amenity - Global");
	}

	@Test(priority = 3, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyBoardApprovalDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations second dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration", Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Board Approval");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelBoardApproval.getText(), "Board Approval - Global");		
	}
	
	@Test(priority = 4, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyCollectionLettersDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Collection Letter Fees");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelCollectionLetterFees.getText(), "Collection Letter Fees - RealManage");		
	}
	
	@Test(priority = 5, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyCommunityConfigurationDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Community Configuration");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelCommunityConfiguration.getText(), "Community Configuration - 1920 E. Maryland Place Townhomes, Inc.");		
	}
	
	@Test(priority = 6, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyFullfilmentJobSpecialPricingDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Fulfillment Job Special Pricing Configuration");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelFullfillmentJobSpecialPricingConfiguration.getText(), "Fulfillment Job Special Pricing Configuration - Global");		
	}
	
	@Test(priority = 7, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyHolidayDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Holidays");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelHoliday.getText(), "Holidays - Global");		
	}
	
	@Test(priority = 8, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyInfo() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Info");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelInfo.getText(), "Info - Global");		
	}
	
	@Test(priority = 9, description = "Verify Configurations Page >> Community Configurations dropdown8", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyMassCommunicationConfiguration() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Mass Communication Configuration");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelMassConfigurationConfiguration.getText(), "Mass Communication Configuration - RealManage");		
	}
	
	@Test(priority = 10, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyNotes() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Notes");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelNotes.getText(), "Notes - Global");		
	}
    
	@Test(priority = 11, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyOnwerFees() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Owner Fees");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelOwnerFees.getText(), "Owner Fees - RealManage");		
	}
	
	@Test(priority = 12, description = "Verify Community Configurations", groups = {Constants.FUNCTIONAL_TESTING})
	public void verifyPrintingProvider() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		TestBase.setExtentReportSettings("Community Configuration",Constants.FUNCTIONAL_TESTING, "Verify Configuration Page", "Verifying Configuration Page");
		communityPage.selectCommunityConfigDropdowns("Printing Provider");
		communityPage = new CommunityPage(driver);
		assertEquals(communityPage.labelPrintingProvider.getText(), "Printing Provider - Global");	
	}

}