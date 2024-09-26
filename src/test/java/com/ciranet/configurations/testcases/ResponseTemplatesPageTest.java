package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ResponseTemplatesPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ResponseTemplatesPageTest extends TestBase 
{
	// Create the ResponseTemplatesPage object
	ResponseTemplatesPage responseTemplatesPage = createPage(ResponseTemplatesPage.class);
	
	@Test(priority = 0, description = "Verify Response Template", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyConfigReportTemplatesClickPages() 
	{
		LoggerManager.info("Verifying  Response Templates");
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", Constants.SMOKE_TESTING, " Response Templates Configurations ", "Verify Response Templates Configurations");		
		responseTemplatesPage = new ResponseTemplatesPage(driver);	
		assertEquals(responseTemplatesPage.verifyResponseTemplateMenu(),"Response Templates Configurations");
	}

	@Test(priority = 1, description = "Verify Response Template", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)

	public void verifyResponseTemplate() 
	{
		LoggerManager.info("Verifying  Response Templates");
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", Constants.FUNCTIONAL_TESTING, " Response Templates Configurations ", "Verify  Response Templates Configurations");
		responseTemplatesPage = new ResponseTemplatesPage(driver);
		assertTrue(responseTemplatesPage.verifyResponseTemplateDropdownSelection(),"Response Templates droppdown are not selected");
	}
}
