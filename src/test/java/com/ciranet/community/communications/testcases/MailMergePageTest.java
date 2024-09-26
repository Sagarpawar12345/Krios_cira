package com.ciranet.community.communications.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.community.communications.pages.MailMergePage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

public class MailMergePageTest extends TestBase 
{
	MailMergePage mailMerge = createPage(MailMergePage.class);

	@RequiresLogin
	@Test(priority = 0, description = "Verify Mail Merge", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifymailMergeMenu() 
	{
		LoggerManager.info("Verifying mailMerge - Community Search");
		TestBase.setExtentReportSettings("Mail Merge Community Search", Constants.SMOKE_TESTING, "Verify Home Page Community Search", "Verifying Community Search");
		mailMerge = new MailMergePage(driver);

		String communitySearchKeyword = "Amberwood";
		assertTrue(mailMerge.verifySearchCommunity(communitySearchKeyword), "Mail Merge is not seen");
	}

	@Test(priority = 1, description = "Verify Mail Merge Dropdown selection", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyDropdownselection() 
	{
		LoggerManager.info("Verifying Mail Merge Dropdown selection");
		TestBase.setExtentReportSettings("Mail Merge Dropdown selection", Constants.FUNCTIONAL_TESTING, "Dropdown selection", "Verifying Mail Merge Dropdown selection");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyDropdownselection(), "Mail Merge Dropdown selection are not seen");
	}

	@Test(priority = 2, description = "Verify Mail Merge Create Labels button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCreateLabels() 
	{
		LoggerManager.info("Verifying mailMerge- Create Labels");
		TestBase.setExtentReportSettings("Mail Merge Create Labels", Constants.FUNCTIONAL_TESTING, "Create Labels", "Verifying Create Labels");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyCreateLabels(), "Create Labels is not seen");
	}

	@Test(priority = 3, description = "Verify Mail Merge Browse button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyBrowseButton() throws AWTException 
	{
		LoggerManager.info("Verifying mailMerge- Browse button");
		TestBase.setExtentReportSettings("Mail Merge Browse button", Constants.FUNCTIONAL_TESTING, "Browse button", "Verifying Browse button");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyBrowseButton(), "Browse button is not seen");
	}

	@Test(priority = 4, description = "Verify Mail Merge View or Save Standard Letter head Template", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyViewSaveStandardLetterheadTemplate() 
	{
		LoggerManager.info("Verifying Mail Merge View or Save Standard Letter head Template");
		TestBase.setExtentReportSettings("Mail Merge View or Save Standard Letter head Template", Constants.FUNCTIONAL_TESTING, "View or Save Standard Letter head Template hyperlink", "Verifying Mail Merge View or Save Standard Letter head Template");
		mailMerge = new MailMergePage(driver);
		try {
			assertTrue(mailMerge.verifyViewSaveStandardLetterheadTemplate(), "View or Save Standard Letter head Template hyperlink is not clicked");
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5, description = "Verify CustomerId hyperlinks", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCustomerIdhyperlink() 
	{
		LoggerManager.info("Verifying CustomerId hyperlinks");
		TestBase.setExtentReportSettings("Verifying CustomerId hyperlinks", Constants.FUNCTIONAL_TESTING, "CustomerId hyperlinks", "Verify CustomerId hyperlinks");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyCustomerIdhyperlink(),"CustomerId hyperlinks are not seen");
	}

	@Test(priority = 6, description = "Verify Combined Owner hyperlinks", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyCombinedOwnerhyperlink() 
	{
		LoggerManager.info("Verifying Combined Owner hyperlinks");
		TestBase.setExtentReportSettings("Verifying Combined Owner hyperlinks", Constants.FUNCTIONAL_TESTING, "Combined Owner hyperlinks", "Verify Combined Owner hyperlinks");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.verifyCombinedOwnerhyperlink(),"Combined Owner hyperlinks are not seen");
	}

	@Test(priority = 7, description = "Verify Help Button", groups = {Constants.FUNCTIONAL_TESTING }, alwaysRun=true)
	public void verifyhelpMailMerge() 
	{
		LoggerManager.info("Verifying Help page");
		TestBase.setExtentReportSettings("Verifying Mail Merge  Help", Constants.FUNCTIONAL_TESTING, "Mail Merge", "Verify Mail Merge Help");
		mailMerge = new MailMergePage(driver);
		assertTrue(mailMerge.helpMailMerge(),"Help icon for Mail Merge is not seen");
	}
}