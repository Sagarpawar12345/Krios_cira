package com.ciranet.administration.tools.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.administration.tools.pages.EmployeeManagementPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class EmployeeManagementPageTest extends TestBase {
	
	// Create the EmployeeManagementPage object
	EmployeeManagementPage employeeManagement = createPage(EmployeeManagementPage.class);
	
	@Test(priority = 0, description = "Verify Employee Management Page Title", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommunityNotes() 
	{
		LoggerManager.info("Verifying Employee Management Title");
		TestBase.setExtentReportSettings("Employee Management Title Test", Constants.SMOKE_TESTING, "Verify Employee Management Title", "Verifying Employee Management Page Title");
		employeeManagement = new EmployeeManagementPage(driver);	
		assertEquals(employeeManagement.employeeManagementMenu(),"Employee Management");
	}
		
	@Test(priority = 1, description = "Verify Toolbar and Full Screen Option", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyToolBarFullScreen()
	{
		LoggerManager.info("Verifying Toolbar and Full Screen Option");
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", Constants.FUNCTIONAL_TESTING, "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		employeeManagement = new EmployeeManagementPage(driver);
		assertTrue(employeeManagement.toolBarFullScreen(), "Fullscreen Icon is not enabled");
	}
	
	@Test(priority = 2, description = "Verify User Status", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyUserStatus()
	{
		LoggerManager.info("Verifying User Status");
		TestBase.setExtentReportSettings("User Status dropdown", Constants.FUNCTIONAL_TESTING, "Verify User Status", "Verifying User Status");
		employeeManagement = new EmployeeManagementPage(driver);
		assertEquals(employeeManagement.userStatus(),"User Status:");	
	}
	
	@Test(priority = 3, description = "Verify Manager Biography", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyBiography()
	{
		LoggerManager.info("Verifying Manager Biography");
		TestBase.setExtentReportSettings("Manager Biography", Constants.FUNCTIONAL_TESTING, "Verify Manager Biography", "Verifying Manager Biography");
		employeeManagement = new EmployeeManagementPage(driver);
		assertEquals(employeeManagement.biography(),"Olga Scott, Client Services Manager");	
	}
	
	@Test(priority = 4, description = "Verify Edit Employee Details", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyEditEmployee()
	{
		LoggerManager.info("Verifying Edit Employee Details");
		TestBase.setExtentReportSettings("Edit Employee Details", Constants.FUNCTIONAL_TESTING, "Verify Edit Employee Details", "Verifying Edit Employee Details");
		employeeManagement = new EmployeeManagementPage(driver);
		assertEquals(employeeManagement.editEmployee(),"Edit Employee Akshay Yeole");	
	}
}
