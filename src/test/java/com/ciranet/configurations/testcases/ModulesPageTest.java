package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.ciranet.configurations.pages.ModulesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ModulesPageTest extends TestBase
{
	// Create the ModulesPage object
	ModulesPage modulesPage = createPage(ModulesPage.class);

	@Test(priority = 0,description = "Verify Configuration Module", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyconfigModulesClickPages() {

		LoggerManager.info("Verifying Configuration Module");
		TestBase.setExtentReportSettings("Verifying Module Configuration Title", Constants.SMOKE_TESTING, "Module Configuration", "Verify Module Configuration");
		modulesPage = new ModulesPage(driver);
	}
	
	@Test(priority = 1, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyConfigurations() 
	{
		LoggerManager.info("Verifying Customer Defined Info");
		TestBase.setExtentReportSettings("Verifying  Customer Defined Info Configurations Title",Constants.FUNCTIONAL_TESTING, " Modules Configurations ", "Verify  Modules Configurations ");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.configurationsModules(),"Customer Defined Info - RealManage");				
	}


	@Test(priority = 2, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyEgnyteConfiguration() 
	{   
		LoggerManager.info("Verifying Egnyte Configuration");	
		TestBase.setExtentReportSettings("Verifying Egnyte Configuration Title",Constants.FUNCTIONAL_TESTING, "Modules Configuration", "Verify  Modules Configurations ");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.egnyteConfiguration(),"Egnyte Configuration - Global");					
	}


	@Test(priority = 3, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyHelp() 
	{   
		LoggerManager.info("Verifying Help");
		TestBase.setExtentReportSettings("Verifying Help - Global Title",Constants.FUNCTIONAL_TESTING,"Modules Configurations", "Verify  Modules Configurations ");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.help(),"Help - Global");			
	}

	@Test(priority = 4, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyRecommendationsandAssumptions() 
	{   
		LoggerManager.info("Verifying Recommendations and Assumptions - Global");		
		TestBase.setExtentReportSettings("Verifying Recommendations and Assumptions Title",Constants.FUNCTIONAL_TESTING, "Recommendations and Assumptions - Global", "Verify Recommendations and Assumptions - Global");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.recommendationsandAssumptions(),"Recommendations and Assumptions - Global");					
	}

	@Test(priority = 5, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifySupplimentalInformation() 
	{   
		LoggerManager.info("Verifying Supplemental Information");	
		TestBase.setExtentReportSettings("Verifying Supplemental Information - Global Title", Constants.FUNCTIONAL_TESTING, "Modules Configurations", "Verify  Modules Configurations ");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.supplimentalInformation(),"Supplemental Information - Global");				
	}

	@Test(priority = 6, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyTransitionDocuments()
	{   
		LoggerManager.info("Verifying Transition Document");
		TestBase.setExtentReportSettings("Verifying Transition Document - Global Title",Constants.FUNCTIONAL_TESTING, "Transition Document", "Verify Transition Document");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.transitionDocuments(),"Transition Document - Global");
	}

	@Test(priority = 7, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyTransitionTaskTemplates() 
	{   
		LoggerManager.info("Verifying Transition Task Templates");
		TestBase.setExtentReportSettings("Verifying Transition Task Templates -  Title",Constants.FUNCTIONAL_TESTING, "Transition Task Templates", "Verify Transition Task Templates");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.transitionTaskTemplates(),"Tasks");			
	}

	@Test(priority = 8, description = "Verify Configuration Module", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyWorkOrderWorkArea() 
	{   
		LoggerManager.info("Verifying Work Order Work Areas");
		TestBase.setExtentReportSettings("Verifying Work Order Work Areas Title",Constants.FUNCTIONAL_TESTING, "Modules Configurations", "Verify  Modules Configurations ");
		modulesPage = new ModulesPage(driver);
		assertEquals(modulesPage.workOrderWorkArea(),"Work Order Work Areas - 1920 E. Maryland Place Townhomes, Inc.");		
	}

}