package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.CommunityAccountingPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class CommunityAccountingPageTest extends TestBase
{
	// Create the CommunityAccountingPage object
	CommunityAccountingPage communityAccountingPage = createPage(CommunityAccountingPage.class);

	@Test(priority = 0, description = "Verify Community Accounting Configuration", groups = {Constants.SMOKE_TESTING}, alwaysRun=true)
	public void verifyCommunityAccountingPage()
	{
		LoggerManager.info("Verifying Community Accounting Configuration");
		TestBase.setExtentReportSettings("Verifying Community Accounting Configuration", Constants.SMOKE_TESTING,"Community Accounting Configurations", "Verify  Community Accounting Configurations");
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.communityAccountingPage(),"Community Accounting Configurations");
	}
	
	@Test(priority = 1, description = "Verify AAP Cross Entity Bill", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaapCrossEntityBill() 
	{
		LoggerManager.info("Verifying AAP Cross Entity Bill");
		TestBase.setExtentReportSettings("Verifying AAP Cross Entity Bill Title", Constants.FUNCTIONAL_TESTING, "AAP Cross Entity Bill", "Verify AAP Cross Entity Bill");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapCrossEntityBill(),"AAP Cross Entity Bill - 1920 E. Maryland Place Townhomes, Inc.");
	}

	@Test(priority = 2, description = "Verify AAP Work Flow Auto Action", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaapWorkFlowAutoAction() 
	{
		LoggerManager.info("Verifying AAP Work Flow Auto Action");
		TestBase.setExtentReportSettings("Verifying AAP  Work Flow Auto Action Title", Constants.FUNCTIONAL_TESTING, "AAP Work Flow Auto Action", "Verify AAP Work Flow Auto Action");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapWorkFlowAutoAction(),"AAP Work Flow Auto Action - Global");
	}
	
	@Test(priority = 3, description = "Verify AAP Work Flow CheckList", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaapWorkFlowCheckList() 
	{
		LoggerManager.info("Verifying AAP Work Flow CheckList");
		TestBase.setExtentReportSettings("Verifying AAP Work Flow CheckList Title", Constants.FUNCTIONAL_TESTING, "AAP Work Flow CheckList", "Verify AAP Work Flow CheckList");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aapWorkFlowCheckList(),"AAP Work Flow CheckList - Global");
	}
	
	@Test(priority = 4, description = "Verify AAR Billing Types", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaarBillingTypes() 
	{
		LoggerManager.info("Verifying AAR Billing Types");
		TestBase.setExtentReportSettings("Verifying AAR Billing Types Title", Constants.FUNCTIONAL_TESTING, "AAR Billing Types", "Verify AAR Billing Types");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarBillingTypes(),"AAR Billing Types - Global");
	}
		
	@Test(priority = 5, description = "Verify AAR Builder Statements", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaarBuilderStatements() 
	{
		LoggerManager.info("Verifying AAR Builder Statements");
		TestBase.setExtentReportSettings("Verifying AAR Builder Statements Title",Constants.FUNCTIONAL_TESTING, "AAR Builder Statements", "Verify AAR Builder Statements");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarBuilderStatements(),"AAR Builder Statements - Global");
	}

	@Test(priority = 6, description = "Verify AAR Misc Invoice Types", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaarMiscInvoiceTypes() 
	{
		LoggerManager.info("Verifying AAR Misc Invoice Types");
		TestBase.setExtentReportSettings("Verifying  Title", Constants.FUNCTIONAL_TESTING, "AAR Misc Invoice Types", "Verify AAR Misc Invoice Types");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarMiscInvoiceTypes(),"AAR Misc Invoice Types - RealManage");
	}

	@Test(priority = 7, description = "Verify AAR Payment Application Order", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaarPaymentApplicationOrder() 
	{
		LoggerManager.info("Verifying AAR Payment Application Order");
		TestBase.setExtentReportSettings("Verifying AAR Payment Application Order Title", Constants.FUNCTIONAL_TESTING, "AAR Payment Application Order", "Verify AAR Payment Application Order");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarPaymentApplicationOrder(),"AAR Payment Application Order - Global");
	}

	@Test(priority = 8, description = "Verify AAR Statements", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifyaarStatements() 
	{
		LoggerManager.info("Verifying AAR Statements");
		TestBase.setExtentReportSettings("Verifying AAR Statements Title", Constants.FUNCTIONAL_TESTING, "AAR Statements", "Verify AAR Statements");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.aarStatements(),"AAR Statements - RealManage");
	}

	@Test(priority = 9, description = "Verify Collections Configuration", groups = {Constants.FUNCTIONAL_TESTING}, alwaysRun=true)
	public void verifycollectionsConfiguration() 
	{
		LoggerManager.info("Verifying Collections Configuration");
		TestBase.setExtentReportSettings("Verifying Collections Configuration Title",Constants.FUNCTIONAL_TESTING, "Collections Configuration", "Verify Collections Configuration");	
		communityAccountingPage = new CommunityAccountingPage(driver);
		assertEquals(communityAccountingPage.collectionsConfiguration(),"Collections Configuration - Global");
	}
	
}
