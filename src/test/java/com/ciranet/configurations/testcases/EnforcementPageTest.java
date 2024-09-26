package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.configurations.pages.EnforcementPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class EnforcementPageTest extends TestBase{
	
	// Create the EnforcementPage object
	EnforcementPage enforcementPage = createPage(EnforcementPage.class);
		
	@Test(priority = 0,description = "Verify Configuration Module", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyConfigEnforcementClickPages() 
	{
		LoggerManager.info("Verifying Enforcement Configuration");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Enforcement Configuration Module", Constants.SMOKE_TESTING, "Enforcement Configuration", "Verify Enforcement Configuration");
	}
	
	@Test(priority = 1, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyArchitecturalCategories() 
	{		
		LoggerManager.info("Verifying Architectural Categories");
		assertEquals(enforcementPage.architecturalCategories(),"Architectural Categories - Global");	
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Architectural Categories Title", Constants.FUNCTIONAL_TESTING, "Architectural Categories", "Verify Architectural Categories");	
	}

	@Test(priority = 2, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyArchitecturalFormsandGuides() 
	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.architecturalFormsandGuides(),"Architectural Forms and Guides - Global");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Architectural Forms and Guides", Constants.FUNCTIONAL_TESTING, "Architectural Forms and Guides", "Verify Architectural Forms and Guides");	
	}

	@Test(priority = 3, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyViolationCategorySubCategoryConfiguration() 
	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationCategorySubCategoryConfiguration(),"Violation Category / SubCategory Configuration - Global");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Violation Category Sub Category Configuration",Constants.FUNCTIONAL_TESTING, "Violation Category Sub Category Configuration", "Verify Violation Category Sub Category Configuration");	
	}
    
	@Test(priority = 4, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyViolationEscalationConfiguration() 
	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationEscalationConfiguration(),"Violation Escalation Configuration - Global");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Violation Escalation Configuration",Constants.FUNCTIONAL_TESTING, "Violation Escalation Configuration", "Verify Violation Escalation Configuration");	
	}

	@Test(priority = 5, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyViolationNotificationTemplates() 
	{
		LoggerManager.info("Verifying Architectural Categories");
		assertEquals(enforcementPage.violationNotificationTemplates(),"Violation Notification Templates - Global");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Violation Notification Templates",Constants.FUNCTIONAL_TESTING, "Violation Notification Templates", "Verify Violation Notification Templates");	
	}
 
	@Test(priority = 6, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyViolationRestrictionDefinition() 
	{
		LoggerManager.info("Verifying Architectural Categories");	
		assertEquals(enforcementPage.violationRestrictionDefinition(),"Violation Restriction Definition - 1920 E. Maryland Place Townhomes, Inc.");
		enforcementPage = new EnforcementPage(driver);
		TestBase.setExtentReportSettings("Verifying Violation Restriction Definition", Constants.FUNCTIONAL_TESTING, "Violation Restriction Definition", "Verify Violation Restriction Definition");	
	}

}
