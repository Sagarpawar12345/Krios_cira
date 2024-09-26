package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.CommunicationLogsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class CommunicationLogsPageTest extends TestBase 
{
	CommunicationLogsPage communicationLogs = createPage(CommunicationLogsPage.class);
	@Test(priority = 0, description = "Verify Communication Logs", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommunicationLogsMenu() 
	{
		LoggerManager.info("Verifying communicationLogs - Community Search");
		TestBase.setExtentReportSettings("Communication Logs Community Search", Constants.SMOKE_TESTING, "Verify Home Page Community Search", "Verifying Community Search");
		communicationLogs = new CommunicationLogsPage(driver);

		String communitySearchKeyword = "Amberwood";
		assertTrue(communicationLogs.verifySearchCommunity(communitySearchKeyword), "Communication Logs is not seen");
	}	

	@Test(priority = 1, description = "Verify Communication Logs Communication Logs In Past days", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCommunicationLogsInPastdays() 
	{
		LoggerManager.info("Verifying Communication Logs Communication Logs In Past days");
		TestBase.setExtentReportSettings("Communication Logs Communication Logs In Past days", Constants.FUNCTIONAL_TESTING, "Verify Communication Logs In Past days", "Verifying Communication Logs In Past days");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifyCommunicationLogsInPastdays(), "Communication Logs In Past days searched data are not seen");
	}

	@Test(priority = 2, description = "Verify Communication Logs Communication Logs In Past days for All dropdown selection", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCommunicationLogsInPastdaysAll() 
	{
		LoggerManager.info("Verifying Communication Logs Communication Logs In Past days for All dropdown selection");
		TestBase.setExtentReportSettings("Communication Logs Communication Logs In Past days for All dropdown selection", Constants.FUNCTIONAL_TESTING, "Verify Communication Logs In Past days", "Verifying Communication Logs In Past days for All dropdown selection");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifyCommunicationLogsInPastdaysAll(), "Communication Logs In Past days for All dropdown selection searched data are not seen");
	}

	//@Test(priority = 3, description = "Verify Communication Logs Actions button View Details", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyActionsViewDetails() 
	{
		LoggerManager.info("Verifying Communication Logs Actions button View Details");
		TestBase.setExtentReportSettings("Communication LogsActions button View Details", Constants.FUNCTIONAL_TESTING, "Verify Actions button View Details", "Verifying Communication Logs Actions button View Details");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifyActionsViewDetails(), "Communication Logs Actions button View Details are not seen");
	}
	
	@Test(priority = 4, description = "Verify Communication Logs Actions button Links Internal Task", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyActionsLinksInternalTask() throws AWTException 
	{
		LoggerManager.info("Verifying Communication Logs Actions Links Internal Task");
		TestBase.setExtentReportSettings("Communication Logs Actions Links Internal Task", Constants.FUNCTIONAL_TESTING, "Verify Actions Links Internal Task", "Verifying Communication Logs Actions Links Internal Task");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifyActionsLinksInternalTask(), "Communication Logs Actions Links Internal Task pop-up is not seen");
	}
	
	@Test(priority = 5, description = "Verify Communication Logs Actions button Links Project Task", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyActionsLinksProjectTask() throws AWTException 
	{
		LoggerManager.info("Verifying Communication Logs Actions Links Project Task");
		TestBase.setExtentReportSettings("Communication Logs Actions Links Project Task", Constants.FUNCTIONAL_TESTING, "Verify Actions Links Project Task", "Verifying Communication Logs Actions Links Project Task");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifyActionsLinksProjectTask(), "Communication Logs Actions Links Project Task pop-up is not seen");
	}

	@Test(priority = 6, description = "Verify Communication Logs property Address hyperlinks", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifypropertyAddresshyperlinks() throws AWTException 
	{
		LoggerManager.info("Verifying Communication Logs property Address hyperlinks");
		TestBase.setExtentReportSettings("Communication Logs property Address hyperlinks", Constants.FUNCTIONAL_TESTING, "Verify property Address hyperlinks", "Verifying Communication Logs property Address hyperlinks");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.verifypropertyAddresshyperlinks(), "Communication Logs property Address hyperlinks are not seen");
	}
	
	@Test(priority = 7, description = "Verify Help Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyhelpCommunicationLogs() 
	{
		LoggerManager.info("Verifying Help page");
		TestBase.setExtentReportSettings("Verifying Communication Logs  Help", Constants.FUNCTIONAL_TESTING, "Communication Logs", "Verify Communication Logs Help");
		communicationLogs = new CommunicationLogsPage(driver);
		assertTrue(communicationLogs.helpCommunicationLogs(),"Help icon for Communication Logs is not seen");
	}
	
	

}