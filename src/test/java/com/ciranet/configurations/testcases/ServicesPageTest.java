package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ServicesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ServicesPageTest extends TestBase {
	
	// Create the ServicesPage object
	ServicesPage servicesPage = createPage(ServicesPage.class);
		
	@Test(priority = 0, description = "Verify Service Configuration", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
	public void verifyServicesPage() 
	{
		LoggerManager.info("Verifying Service Configurations");
		TestBase.setExtentReportSettings("Verifying Service Configuration", Constants.SMOKE_TESTING, "Services Configurations",
				"Verify Services Configurations");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.servicesConfiguration(), "Services Configurations");
	}

	@Test(priority = 1, description = "Verify Board Approval", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBoardPortal() 
	{
		LoggerManager.info("Verifying Board Approval");
		TestBase.setExtentReportSettings("Verifying Board Approval Title", Constants.FUNCTIONAL_TESTING, "Board Approval",
				"Verify Board Approval");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.boardPortal(), "Board Portal - Global");
	}

	@Test(priority = 2, description = "Verify Branding Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBrandingConfiguration() 
	{
		LoggerManager.info("Verifying Branding Configuration");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", Constants.FUNCTIONAL_TESTING,
				"Branding Configuration", "Verify Branding Configuration");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.brandingConfiguration(), "Branding Configuration - Global");
	}

	@Test(priority = 3, description = "Verify Service Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyBussinessHours() 
	{
		LoggerManager.info("Verifying Bussiness Hour");
		TestBase.setExtentReportSettings("Verifying Business Hours - Global Title", Constants.FUNCTIONAL_TESTING,
				" Business Hours ", "Verify Business Hours");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.bussinessHour(), "Business Hours - Global");
	}

	@Test(priority = 4, description = "Verify Calendar Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyCalendarConfiguration() 
	{
		LoggerManager.info("Verifying Calendar Configuration");
		TestBase.setExtentReportSettings("Verifying Calendar Configuration - Global Title", Constants.FUNCTIONAL_TESTING,
				"Calendar Configuration", "Verify Calendar Configuration");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.calendarConfiguration(), "Calendar Configuration - Global");
	}

	@Test(priority = 5, description = "Verify Mass Communication System Template Configuration", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void verifyMassCommunicationSystemTemplateConfiguration() 
	{
		LoggerManager.info("Verifying Mass Communication System Template Configuration");
		TestBase.setExtentReportSettings("Verifying Mass Communication System Template Configuration - Global Title",
				Constants.FUNCTIONAL_TESTING, "Mass Communication System Template Configuration",
				"VerifyMass Communication System Template Configuration");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.massCommunicationSystemTemplateConfiguration(),
				"Mass Communication System Template Configuration - Global");
	}

	@Test(priority = 6, description = "Verify Resident Portal", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyResidentPortal() 
	{
		LoggerManager.info("Verifying Resident Portal");
		TestBase.setExtentReportSettings("Verifying Resident Portal - Global Title", Constants.FUNCTIONAL_TESTING,
				"Resident Portal", "Verify Resident Portal");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.residentPortal(), "Resident Portal - Global");
	}

	@Test(priority = 7, description = "Verify Service Group", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServiceGroup() 
	{
		LoggerManager.info("Verifying Service Group");
		TestBase.setExtentReportSettings("Verifying Service Group - Global Title", Constants.FUNCTIONAL_TESTING, "Service Group",
				"Verify Service Group");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.serviceGroup(), "Service Groups - Global");
	}

	@Test(priority = 8, description = "Verify Service Role", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServiceRole() 
	{
		LoggerManager.info("Verifying Service Role");
		TestBase.setExtentReportSettings("Verifying Service Roles - Global Title", Constants.FUNCTIONAL_TESTING, "Service Role",
				"Verify Service Role");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.serviceRole(), "Service Roles - Global");
	}

	@Test(priority = 9, description = "Verify Services", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun = true)
	public void verifyServices() 
	{
		LoggerManager.info("Verifying Services");
		TestBase.setExtentReportSettings("Verifying Services - Global Title", Constants.FUNCTIONAL_TESTING, "Services",
				"Verify Services");
		servicesPage = new ServicesPage(driver);
		assertEquals(servicesPage.services(), "Services - Global");
	}
}