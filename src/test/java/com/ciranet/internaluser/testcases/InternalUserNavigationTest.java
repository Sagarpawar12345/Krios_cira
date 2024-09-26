package com.ciranet.internaluser.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.internaluser.pages.InternalUserNavigation;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class InternalUserNavigationTest extends TestBase {

	// Create the InternalUserNavigation object
	InternalUserNavigation internalUserPage = createPage(InternalUserNavigation.class);

	@Test(priority = 0, description = "Verify All Modules Link Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycheckAllModulesLinkPageLanding() {
		LoggerManager.info("Verifying Account Management Link");
		TestBase.setExtentReportSettings("Account Management test", Constants.SMOKE_TESTING,
				"Verify Account Management Title", "Verifying Account Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.checkAllModulesLinkPageLanding(), "Account Management");
	}

	@Test(priority = 1, description = "Verify Achievements Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAchievementsURL() {
		LoggerManager.info("Verifying Achievements Link Page");
		TestBase.setExtentReportSettings("achievements test", Constants.SMOKE_TESTING, "Verify achievements Title",
				"Verifying achievements Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.AchievementsPageLanding(), "Achievements");
	}

	@Test(priority = 2, description = "Verify Cloud Drive Link", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCloudDriveURL() {
		LoggerManager.info("Verifying Cloud Drive Link Page");
		TestBase.setExtentReportSettings("cloud Drives", Constants.SMOKE_TESTING, "Verify cloud Drives Title",
				"Verifying cloud Drives Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.CloudDrivePageLanding(), "CiraCloud File Server page is clicked");
	}

	@Test(priority = 3, description = "Verify Map of My Communities Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMapofMyCommunitiesURL() {
		LoggerManager.info("Verifying Map of My Communities Link Page");
		TestBase.setExtentReportSettings("map of My Communities", Constants.SMOKE_TESTING,
				"Verify map of My Communities Title", "Verifying map of My Communities Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.MapofMyCommunitiesPageLanding(), "Map of My Communities");
	}

	@Test(priority = 4, description = "Verify My Communities page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyCommunitiesURL() throws AWTException {
		LoggerManager.info("Verifying My Communities Link Page");
		TestBase.setExtentReportSettings("my Communities", Constants.SMOKE_TESTING, "Verify my Communities  Title",
				"Verifying my Communities Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.myCommunitiesPageLanding(), "My Communities");
	}

	@Test(priority = 5, description = "Verify My Tests page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyTestsURL() {
		LoggerManager.info("Verifying My Tests Link Page");
		TestBase.setExtentReportSettings("my Tests;", Constants.SMOKE_TESTING, "Verify my Tests Title",
				"Verifying my Tests Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myTestsPageLanding(), "My Tests page is clicked");
	}

	@Test(priority = 6, description = "Verify My Text page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyTextURL() {
		LoggerManager.info("Verifying My Text Link Page");
		TestBase.setExtentReportSettings("my Text", Constants.SMOKE_TESTING, "Verify my Text Title",
				"Verifying my Text Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertTrue(internalUserPage.myTextPageLanding(), "My Text page is clicked");
	}

	@Test(priority = 8, description = "Verify  page Link", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verify() {
		LoggerManager.info("Verifying  Page");
		TestBase.setExtentReportSettings("Billing Item Management", Constants.SMOKE_TESTING,
				"Verify Billing Item Management Title", "Verifying Billing Item Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.billingItemManagementPageLanding(), "Billing Item Management");
	}

	@Test(priority = 9, description = "Verify Billing Queue Management page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifybillingQueueManagementPageLanding() {
		LoggerManager.info("Verifying Billing Queue Management Page");
		TestBase.setExtentReportSettings("Billing Queue Management", Constants.SMOKE_TESTING,
				"Verify Billing Queue Management Title", "Verifying Billing Queue Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.billingQueueManagementPageLanding(), "Billing Queue Management");
	}

	@Test(priority = 10, description = "Verify My Customer Charges page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyCustomerChargesPageLanding() {
		LoggerManager.info("Verifying My Customer Charges Page");
		TestBase.setExtentReportSettings("My Customer Charges", Constants.SMOKE_TESTING,
				"Verify My Customer Charges Title", "Verifying My Customer Charges Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.myCustomerChargesPageLanding(), "My Customer Charges");
	}

	@Test(priority = 11, description = "Verify Test Plan Configuration page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytestPlanConfigurationPageLanding() {
		LoggerManager.info("Verifying Test Plan Configuration Link Page");
		TestBase.setExtentReportSettings("test Plan Configuration", Constants.SMOKE_TESTING, "Verify  Title",
				"Verifying test Plan Configuration Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.testPlanConfigurationPageLanding(), "Test Plan Configuration");
	}

	@Test(priority = 12, description = "Verify Testing Configuration page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytestingConfigurationPageLanding() {
		LoggerManager.info("Verifying Testing Configuration Link Page");
		TestBase.setExtentReportSettings("testing Configuration", Constants.SMOKE_TESTING,
				"Verify testing Configuration Title", "Verifying testing Configuration Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.testingConfigurationPageLanding(), "Testing Configuration");
	}

	@Test(priority = 13, description = "Verify Time Expense Management page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytimeExpenseManagementPageLanding() {
		LoggerManager.info("Verifying Time Expense Management Link Page");
		TestBase.setExtentReportSettings("time Expense Management", Constants.SMOKE_TESTING,
				"Verify time Expense Management Title", "Verifying time Expense Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.timeExpenseManagementPageLanding(), "Time & Expense Management");
	}

	@Test(priority = 14, description = "Verify Time and Expense Submission page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytimeandExpenseSubmissionPageLanding() {
		LoggerManager.info("Verifying Time and Expense Submission Link Page");
		TestBase.setExtentReportSettings("time Expense Submission", Constants.SMOKE_TESTING,
				"Verify time Expense Submission Title", "Verifying time Expense Submission Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.timeandExpenseSubmissionPageLanding(), "Time & Expense Submissions");
	}

	@Test(priority = 15, description = "Verify Vendor Management page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyvendorManagementPageLanding() {
		LoggerManager.info("Verifying Vendor Management Link Page");
		TestBase.setExtentReportSettings("vendor Management", Constants.SMOKE_TESTING, "Verify vendor Management Title",
				"Verifying vendor Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.vendorManagementPageLanding(), "Vendor Management");
	}

	@Test(priority = 17, description = "Verify Automated Document Print ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ArchitecturalApplication()

	{
		LoggerManager.info("Verifying Architectural Application Page");
		TestBase.setExtentReportSettings("Verifying Architectural Application Title", Constants.SMOKE_TESTING,
				"Architectural Application", "Verify Architectural Application");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.architecturalApplication(), "Architectural Application");
	}

	@Test(priority = 18, description = "Verify Automated Document Print ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void AutomatedDocumentPrint()

	{
		LoggerManager.info("Verifying Automated Document Print Page");
		TestBase.setExtentReportSettings("Verifying  Automated Document Print  Title", Constants.SMOKE_TESTING,
				"Automated Document Print", "Verify Automated Document Print");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.automatedDocumentPrint(), "Automated Document Print");
	}

	@Test(priority = 19, description = "Verify Board Approvals ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void BoardApprovals()

	{
		LoggerManager.info("Verifying Board Approvals Page");
		TestBase.setExtentReportSettings("Verifying  ** Board Approvals **  Title", Constants.SMOKE_TESTING,
				"  ** Board Approvals **  ", "Verify   ** Board Approvals **  ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.boardApprovals(), "Board Approvals");
	}

	@Test(priority = 20, description = "Verify Common Lots Apprisal ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void CommonLotsApprisal()

	{
		LoggerManager.info("Verifying Common Lots Appraisal Page");
		TestBase.setExtentReportSettings("Verifying Common Lots Title", Constants.SMOKE_TESTING, "Common Lots Apprisal",
				"Verify Common Lots Apprisal");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.commonLotsApprisal(), "Common Lots Appraisal");
	}

	@Test(priority = 21, description = "Verify Fullfillment Queue ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void FullfillmentQueue()

	{
		LoggerManager.info("Verifying Fulfillment Queue Page");
		TestBase.setExtentReportSettings("Verifying Fulfillment Queue Title", Constants.SMOKE_TESTING,
				"Fulfillment Queue", "Verify Fulfillment Queue");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.fullfillmentQueue(), "Fulfillment Queue");
	}

	@Test(priority = 22, description = "Verify Maintenance Work Order ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void MaintenanceWorkOrder()

	{
		LoggerManager.info("Verifying Maintenance Work Orders Page");
		TestBase.setExtentReportSettings("Verifying Maintenance Work Order Title", Constants.SMOKE_TESTING,
				"Maintenance Work Orders", "Verify Maintenance Work Orders");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.maintenanceWorkOrder(), "Maintenance Work Orders");
	}

	@Test(priority = 23, description = "Verify Violation Review ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ViolationReview()

	{
		LoggerManager.info("Verifying Open Violations Requiring Review Page");
		TestBase.setExtentReportSettings("Verifying Violation Review Title", Constants.SMOKE_TESTING,
				"Open Violations Requiring Review", "Verify Open Violations Requiring Review");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.violationReview(), "Open Violations Requiring Review");
	}

	@Test(priority = 24, description = "Verify Add Community ", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void AddCommunity()

	{
		LoggerManager.info("Verifying Organization Details Page");
		TestBase.setExtentReportSettings("Verifying Organization Details Title", Constants.SMOKE_TESTING,
				"Organization Details", "Verify Organization Details");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.addCommunity(), "Organization Details");
	}

	@Test(priority = 25, description = "Verify On Boarding CheckList ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void OnBoardCheckList()

	{
		LoggerManager.info("Verifying On-Boarding Checklist Page");
		TestBase.setExtentReportSettings("Verifying  On-Boarding Checklist  Title", Constants.SMOKE_TESTING,
				"On-Boarding Checklist", "Verify On-Boarding Checklist");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.onBoardCheckList(), "On-Boarding Checklist");
	}

	@Test(priority = 26, description = "Verify On Boarding Flags ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void OnBoardingFlag()

	{
		LoggerManager.info("Verifying Modify an On-Boarding Community Page");
		TestBase.setExtentReportSettings("Verifying  Modify an On-Boarding Community  Title", Constants.SMOKE_TESTING,
				"Modify an On-Boarding Community", "Verify Modify an On-Boarding Community");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.onBoardingFlag(), "Modify an On-Boarding Community");
	}

	@Test(priority = 27, description = "Verify Schedule First Assessment ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ScheduleFirstAssessment()

	{
		LoggerManager.info("Verifying Schedule First Statement Page");
		TestBase.setExtentReportSettings("Verifying  Schedule First Assessment  Title", Constants.SMOKE_TESTING,
				"Schedule First Assessment", "Verify Schedule First Assessment");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.scheduleFirstAssessment(), "Schedule First Assessment");
	}

	@Test(priority = 28, description = "Verify Schedule Initial Assessment ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ScheduleInitialAssessment()

	{
		LoggerManager.info("Verifying Schedule Initial Statement Page");
		TestBase.setExtentReportSettings("Verifying  Schedule Initial Statement Title", Constants.SMOKE_TESTING,
				"Schedule Initial Assessment", "Verify Schedule Initial Assessment");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.scheduleInitialAssessment(), "Schedule Initial Statement");
	}

	@Test(priority = 29, description = "Verify Closing Portal Location Manager ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ClosingPortalLocationManager()

	{
		LoggerManager.info("Verifying Closing Portal Location Manager Page");
		TestBase.setExtentReportSettings("Verifying  Closing Portal Location Manager  Title", Constants.SMOKE_TESTING,
				"Closing Portal Location Manager", "Verify Closing Portal Location Manager");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.closingPortalLocationManager(), "Closing Portal Location Manager");
	}

	@Test(priority = 30, description = "Verify Closing Request ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void ClosingRequests()

	{
		LoggerManager.info("Verifying Closing Requests Page");
		TestBase.setExtentReportSettings("Verifying  Closing Requests  Title", Constants.SMOKE_TESTING,
				"Closing Request", "Verify Closing Request");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.closingRequests(), "Closing Requests");
	}

	@Test(priority = 31, description = "Verify Closing Request ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void communityBlocks()

	{
		LoggerManager.info("Verifying SOA Community Blocks Config Page");
		TestBase.setExtentReportSettings("Verifying  Closing Requests  Title", Constants.SMOKE_TESTING,
				"Closing Request", "Verify Closing Request");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.communityBlocks(), "SOA Community Blocks Config");
	}

	@Test(priority = 32, description = "Verify Property Conveyances ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void PropertyConveyances()

	{
		LoggerManager.info("Verifying Property Ownership Conveyance Page");
		TestBase.setExtentReportSettings("Verifying  Property Ownership Conveyance  Title", Constants.SMOKE_TESTING,
				"Property Conveyances", "Verify Property Conveyances");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.propertyConveyances(), "Property Ownership Conveyance");
	}

	@Test(priority = 34, description = "Verify Internal Task ", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInternalTask()

	{
		LoggerManager.info("Verifying Internal Tasks Page");
		TestBase.setExtentReportSettings("Verifying  Internal Tasks  Title", Constants.SMOKE_TESTING, "Internal Tasks",
				"Verify Internal Tasks");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.internalTask(), "Internal Tasks");
	}

	@Test(priority = 35, description = "Verify My Work Inbox ", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMyWorkInbox()

	{
		LoggerManager.info("Verifying My Work Inbox");
		TestBase.setExtentReportSettings("Verifying  My Work Inbox Title", Constants.SMOKE_TESTING, "My Work Inbox",
				"Verify My Work Inbox");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.myWorkInbox(), "My Work Inbox");

	}

	@Test(priority = 36, description = "Verify Invoice Approval ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInvoiceApproval()

	{
		LoggerManager.info("Verifying AAP Workflow Queue Page");
		TestBase.setExtentReportSettings("Verifying  AAP Workflow Queue Title", Constants.SMOKE_TESTING,
				"Invoice Approval", "Verify Invoice Approval");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.invoiceApproval(), "AAP Workflow Queue");
	}

	@Test(priority = 37, description = "Verify Invoice Approval ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMetrics()

	{
		LoggerManager.info("Verifying AAP Workflow Metrics Page");
		TestBase.setExtentReportSettings("Verifying  AAP Workflow Metrics Title", Constants.SMOKE_TESTING, "Metrics",
				"Verify Metrics");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.metrics(), "AAP Workflow Metrics");

	}

	@Test(priority = 38, description = "Verify Invoice Approval ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyProcessInvoice()

	{
		LoggerManager.info("Verifying New AR Payment Page");
		TestBase.setExtentReportSettings("Verifying New AR Payment Title", Constants.SMOKE_TESTING, "Process Invoice",
				"Verify Process Invoice");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.processInvoice();

	}

	@Test(priority = 39, description = "Verify Annual Budget Preparation ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualBudgetPreparation()

	{
		LoggerManager.info("Verifying Annual Budget Preparation Page");
		TestBase.setExtentReportSettings("Verifying  Annual Budget Preparation Title", Constants.SMOKE_TESTING,
				"Annual Budget Praparation", "Verify Annual Budget Praparation");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.annualBudgetPreparation(), "Annual Budget Preparation");
	}

	@Test(priority = 40, description = "Verify Annual Coupon Order ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualCouponOrder()

	{
		LoggerManager.info("Verifying Annual Coupon Process Page");
		TestBase.setExtentReportSettings("Verifying  Annual Coupon Process Title", Constants.SMOKE_TESTING,
				"Annual Coupon Order", "Verify Annual Coupon Order");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.annualCouponOrder(), "Annual Coupon Process");
	}

	@Test(priority = 41, description = "Verify Annual Statement Generation Process ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAnnualStatementGenerationProcess()

	{
		LoggerManager.info("Verifying Annual Statement Generation Process Page");
		TestBase.setExtentReportSettings("Verifying  Annual Statement Generation Process Title",
				Constants.SMOKE_TESTING, "Annual Statement Generation Process",
				"Verify Annual Statement Generation Process");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.annualStatementGenerationProcess(), "Annual Statement Generation Process");
	}

	@Test(priority = 42, description = "Verify Financial Report Publishing", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFinancialReportPublishing()

	{
		LoggerManager.info("Verifying Financial Report Publishing Page");
		TestBase.setExtentReportSettings("Verifying  Financial Report Publishing Title", Constants.SMOKE_TESTING,
				"Annual Coupon Order", "Verify Annual Coupon Order");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.financialReportPublishing(), "Financial Report Publishing");
	}

	@Test(priority = 43, description = "Verify Management Report Publishing", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyManagementReportPublishing()

	{
		LoggerManager.info("Verifying Monthly Management Report Generation Page");
		TestBase.setExtentReportSettings("Verifying  Monthly Management Report Generation Title",
				Constants.SMOKE_TESTING, "Monthly Management Report Generation",
				"Verify Monthly Management Report Generation");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.managementReportPublishing(), "Monthly Management Report Generation");
	}

	@Test(priority = 44, description = "Verify Project Task", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyProjectTask()

	{
		LoggerManager.info("Verifying Projects / Tasks Page");
		TestBase.setExtentReportSettings("Verifying  Projects / Tasks  Title", Constants.SMOKE_TESTING, "Project Task",
				"Verify Project Task");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.projectTask(), "Projects / Tasks");
	}

	@Test(priority = 45, description = "Verify Bank Returns", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBankReturns()

	{
		LoggerManager.info("Verifying Bank Returns Page");
		TestBase.setExtentReportSettings("Verifying  Bank Returns Title", Constants.SMOKE_TESTING, "Banks Returns",
				"Verify Banks Returns");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.bankReturns(), "Bank Returns");
	}

	@Test(priority = 46, description = "Verify Project Task", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOrderAnnualCoupon()

	{
		LoggerManager.info("Verifying Order Annual Coupons Page");
		TestBase.setExtentReportSettings("Verifying  Order Annual Coupons Title", Constants.SMOKE_TESTING,
				"Order Annual Coupon", "Verify Order Annual Coupon");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.orderAnnualCoupon(), "Order Annual Coupons");
	}

	@Test(priority = 47, description = "Verify Payment Post Error", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyPaymentPostError()

	{
		LoggerManager.info("Verifying Payment Post Errors ");
		internalUserPage.paymentPostError();
		internalUserPage = new InternalUserNavigation(driver);
		TestBase.setExtentReportSettings("Verifying  Payment Post Errors Title", Constants.SMOKE_TESTING,
				"Payment Post Error", "Verify Payment Post Error");

	}

	@Test(priority = 48, description = "Verify Statement Approval", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifystatementApprovel()

	{
		LoggerManager.info("Verifying Statement Approvals Page");
		TestBase.setExtentReportSettings("Verifying  Statement Approvals Title", Constants.SMOKE_TESTING,
				"Statement Approval", "Verify Statement Approval");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.statementApproval(), "Statement Approvals");
	}

	@Test(priority = 49, description = "Verify CiraBooks Workspace page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyciraBooksModule() {
		LoggerManager.info("Verifying CiraBooks Workspace Link Page");
		internalUserPage.ciraBooksModule();
		internalUserPage = new InternalUserNavigation(driver);
		TestBase.setExtentReportSettings("Verifying CiraBook Module", Constants.SMOKE_TESTING, "CiraBook Module",
				"Verify CiraBook Module");

	}

	@Test(priority = 50, description = "Verify  Accounts Payable  Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyaccountsPayablePageLanding() {
		LoggerManager.info("Verifying Accounts Payable Link Page");
		TestBase.setExtentReportSettings("accounts Payable", Constants.SMOKE_TESTING, "Verify accounts Payable Title",
				"Verifying accounts Payable Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.accountsPayablePageLanding(), "Accounts Payable");
	}

	@Test(priority = 51, description = "Verify AP Bill Analysis Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyapBillAnalysisPageLanding() {
		LoggerManager.info("Verifying AP Bill Analysis Page");
		TestBase.setExtentReportSettings("ap Bill Analysis", Constants.SMOKE_TESTING, "Verify ap Bill Analysis Title",
				"Verifying ap Bill Analysis Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apBillAnalysisPageLanding(), "AP Bill Analysis");
	}

	@Test(priority = 52, description = "Verify AP Ledger Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyapLedgerPageLanding() {
		LoggerManager.info("Verifying AP Ledger Page");
		TestBase.setExtentReportSettings("ap Ledger", Constants.SMOKE_TESTING, "Verify ap Ledger Title",
				"Verifying ap Ledger Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apLedgerPageLanding(), "AP Ledger");
	}

	@Test(priority = 53, description = "Verify AP Unapplied Payments Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyapUnappliedPaymentsPageLanding() {
		LoggerManager.info("Verifying AP Unapplied Payments Page");
		TestBase.setExtentReportSettings("AP Unapplied Payments", Constants.SMOKE_TESTING,
				"Verify AP Unapplied Payments Title", "Verifying AP Unapplied Payments Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apUnappliedPaymentsPageLanding(), "AP Unapplied Payments");
	}

	@Test(priority = 54, description = "Verify CheckPrinting Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycheckPrintingManagementPageLanding() {
		LoggerManager.info("Verifying Check Printing Management Page");
		TestBase.setExtentReportSettings("check Printing Management", Constants.SMOKE_TESTING,
				"Verify check Printing Management Title", "Verifying check Printing Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.checkPrintingManagementPageLanding(), "check Printing Management");
	}

	@Test(priority = 55, description = "Verify EFTPaymentManagement Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyeftPaymentManagementPageLanding() {
		LoggerManager.info("Verifying Check EFT Payment Management Page");
		TestBase.setExtentReportSettings("EFT Payment Management", Constants.SMOKE_TESTING,
				"Verify EFT Payment Management Title", "Verifying EFT Payment Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.eftPaymentManagementPageLanding(), "EFT Payment Management");
	}

	@Test(priority = 56, description = "Verify Local Office Only Check Printing Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylocalOfficeOnlyCheckPrintingPageLanding() {
		LoggerManager.info("Verifying Check Local Office Only Check Printing Page");
		TestBase.setExtentReportSettings("Local Office Only Check Printing", Constants.SMOKE_TESTING,
				"Verify Local Office Only Check Printing Title", "Verifying Local Office Only Check Printing Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.localOfficeOnlyCheckPrintingPageLanding(), "Local Office Only Check Printing");
	}

	@Test(priority = 57, description = "Verify Manage AAP Workflow Vendor Edit Landing Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymanageAAPWorkflowVendorEditLanding() {
		LoggerManager.info("Verifying Manage AAP Workflow Vendor Edit Landing Page");
		TestBase.setExtentReportSettings("manage AAP Work flow Vendor Edit", Constants.SMOKE_TESTING,
				"Verify Manage AAP Work flow Vendor Edit Title", "Verifying Manage AAP Work flow Vendor Edit Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.manageAAPWorkflowVendorEditLanding(), "Manage AAP Work flow Vendor Edit");
	}

	@Test(priority = 58, description = "Verify My Submitted Invoices Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymySubmittedInvoicesPageLanding() {
		LoggerManager.info("Verifying My Submitted Invoices Landing Page");
		TestBase.setExtentReportSettings("My Submitted Invoices", Constants.SMOKE_TESTING,
				"Verify My Submitted Invoices Title", "Verifying My Submitted Invoices Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.mySubmittedInvoicesPageLanding(), "My Submitted Invoices");
	}

	@Test(priority = 59, description = "Verify Reimbursement Request Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyreimbursementRequestPageLanding() {
		LoggerManager.info("Verifying Reimbursement Request Page");
		TestBase.setExtentReportSettings("Reimbursement Request", Constants.SMOKE_TESTING,
				"Verify Reimbursement Request Title", "Verifying Reimbursement Request Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.reimbursementRequestPageLanding(), "Reimbursement Request");
	}

	@Test(priority = 60, description = "Verify Search Invoices Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifysearchInvoicesPageLanding() {
		LoggerManager.info("Verifying Search Invoices Page");
		TestBase.setExtentReportSettings("search Invoices", Constants.SMOKE_TESTING, "Verify search Invoices Title",
				"Verifying search Invoices Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.searchInvoicesPageLanding(), "search Invoices");
	}

	@Test(priority = 61, description = "Verify Submit Invoice Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifysubmitInvoicePageLanding() {
		LoggerManager.info("Verifying Submit Invoice Page");
		TestBase.setExtentReportSettings("submit Invoice", Constants.SMOKE_TESTING, "Verify submit Invoice Title",
				"Verifying submit Invoice Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.submitInvoicePageLanding(), "Submit Invoice");
	}

	@Test(priority = 62, description = "Verify Vendor 1099 Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyvendor1099PageLanding() {
		LoggerManager.info("Verifying Vendor 1099 Page");
		TestBase.setExtentReportSettings("vendor1099", Constants.SMOKE_TESTING, "Verify vendor1099 Title",
				"Verifying vendor1099 Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.vendor1099PageLanding(), "vendor1099");
	}

	@Test(priority = 63, description = "Verify Vendor Aging Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyvendorAgingPageLanding() {
		LoggerManager.info("Verifying Vendor Aging Page");
		TestBase.setExtentReportSettings("vendor Aging", Constants.SMOKE_TESTING, "Verify vendor Aging Title",
				"Verifying vendor Aging Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.vendorAgingPageLanding(), "vendor Aging");
	}

	@Test(priority = 64, description = "Verify Vendor Missing Bills Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyvendorMissingBillsPageLanding() {
		LoggerManager.info("Verifying Vendor Missing Bills Page");
		TestBase.setExtentReportSettings("Vendor Missing Bills", Constants.SMOKE_TESTING,
				"Verify Vendor Missing Bills Title", "Verifying Vendor Missing Bills Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.vendorMissingBillsPageLanding(), "Vendor Missing Bills");
	}

	@Test(priority = 65, description = "Verify Accounts Receivable Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyaccountsReceivablePageLanding() {
		LoggerManager.info("Verifying Accounts Receivable Page");
		TestBase.setExtentReportSettings("Accounts Receivable", Constants.SMOKE_TESTING,
				"Verify Accounts Receivable Title", "Verifying Accounts Receivable Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.accountsReceivablePageLanding(), "Accounts Receivable");
	}

	@Test(priority = 66, description = "Verify AR Collection Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyarCollectionPageLanding() {
		LoggerManager.info("Verifying AR Collection Page");
		TestBase.setExtentReportSettings("ARCollection", Constants.SMOKE_TESTING, "Verify ARCollection Title",
				"Verifying ARCollection Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.arCollectionPageLanding(), "ARCollection");
	}

	@Test(priority = 67, description = "Verify AR Invoice Analysis Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyarInvoiceAnalysisPageLanding() {
		LoggerManager.info("Verifying AR Invoice Analysis Page");
		TestBase.setExtentReportSettings("AR Invoice Analysis", Constants.SMOKE_TESTING,
				"Verify AR Invoice Analysis Title", "Verifying AR Invoice Analysis Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.arInvoiceAnalysisPageLanding(), "AR Invoice Analysis");
	}

	@Test(priority = 68, description = "Verify AR Ledger Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyarLedgerPageLanding() {
		LoggerManager.info("Verifying AR Ledger Page");
		TestBase.setExtentReportSettings("AR Ledgere", Constants.SMOKE_TESTING, "Verify AR Ledgere Title",
				"Verifying AR Ledgere Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.arLedgerPageLanding(), "AR Ledgere");
	}

	@Test(priority = 69, description = "Verify Add Payments Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyaddPaymentsPageLanding() {
		LoggerManager.info("Verifying Add Payments Page");
		TestBase.setExtentReportSettings("Add Payments", Constants.SMOKE_TESTING, "Verify Add Payments Title",
				"Verifying Add Payments Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.addPaymentsPageLanding(), "Add Payments");
	}

	@Test(priority = 70, description = "Verify Customer Aging Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycustomerAgingPageLanding() {
		LoggerManager.info("Verifying Add Payments Page");
		TestBase.setExtentReportSettings("Customer Aging", Constants.SMOKE_TESTING, "Verify Customer Aging Title",
				"Verifying Customer Aging Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.customerAgingPageLanding(), "Customer Aging");
	}

	@Test(priority = 71, description = "Verify Generate Builder Statements Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifygenerateBuilderStatementsPageLanding() {
		LoggerManager.info("Verifying Generate Builder Statements Page");
		TestBase.setExtentReportSettings("", Constants.SMOKE_TESTING, "Verify Generate Builder Statements Title",
				"Verifying Generate Builder Statements Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.generateBuilderStatementsPageLanding(), "Generate Builder Statements");
	}

	@Test(priority = 72, description = "Verify Lot Payment Allocation Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylotPaymentAllocationPageLanding() {
		LoggerManager.info("Verifying Lot Payment Allocation Page");
		TestBase.setExtentReportSettings("Lot Payment Allocation", Constants.SMOKE_TESTING,
				"Verify Lot Payment Allocation Title", "Verifying Lot Payment Allocation Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.lotPaymentAllocationPageLanding(), "Lot Payment Allocation");
	}
//=============================== Cash Management page code starts here ===========================

	@Test(priority = 73, description = "Verify CiraBooks>> Cash Management>> Bank Accounts Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycashManagementPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Bank Accounts Page");
		TestBase.setExtentReportSettings("Verify Cash Management Title", Constants.SMOKE_TESTING,
				"Verify Cash Management Title", "Verifying Cash Management Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.cashManagementPageLanding(), "Cash Management");
	}

	@Test(priority = 74, description = "Verify CiraBooks>> Cash Management>> Bank Reconciliation Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifybankReconciliationPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Bank Reconciliation Page");
		TestBase.setExtentReportSettings("Bank Reconciliation", Constants.SMOKE_TESTING,
				"Verify Bank Reconciliation Title", "Verifying Bank Reconciliation Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.bankReconciliationPageLanding(), "Bank Reconciliation");
	}

	@Test(priority = 75, description = "Verify CiraBooks>> Cash Management>> CM Batches Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycmBatchesPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> CM Batches");
		TestBase.setExtentReportSettings("CM Batches", Constants.SMOKE_TESTING, "Verify CM Batches Title",
				"Verifying CM Batches Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.cmBatchesPageLanding(), "CM Batches");
	}

	@Test(priority = 76, description = "Verify CiraBooks>> Cash Management>> Cash Receipts Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycashReceiptsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Cash Receipts");
		TestBase.setExtentReportSettings("cash Receipts", Constants.SMOKE_TESTING, "Verify cash Receipts Title",
				"Verifying cash Receipts Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.cashReceiptsPageLanding(), "cash Receipts");
	}

	@Test(priority = 77, description = "Verify CiraBooks>> Cash Management>> Cash Receipts Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifycreateCashReceiptsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Create Cash ReceiptsPageLanding");
		TestBase.setExtentReportSettings("Create Cash Receipts", Constants.SMOKE_TESTING,
				"Verify Create Cash Receipts Title", "Verifying Create Cash Receipts Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.createCashReceiptsPageLanding(), "Create Cash Receipts");
	}

	@Test(priority = 78, description = "Verify CiraBooks>> Cash Management>> Deposits Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifydepositsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Deposits");
		TestBase.setExtentReportSettings("Deposits", Constants.SMOKE_TESTING, "Verify Deposits Title",
				"Verifying Deposits Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.depositsPageLanding(), "Deposits");
	}

	@Test(priority = 79, description = "Verify CiraBooks>> Cash Management>> Funds Transfer Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void veriffundsTransferPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Funds Transfer");
		TestBase.setExtentReportSettings("Funds Transfer", Constants.SMOKE_TESTING, "Verify Funds Transfer Title",
				"Verifying Funds Transfer Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.fundsTransferPageLanding(), "Funds Transfer");
	}

	@Test(priority = 80, description = "Verify CiraBooks>> Cash Management>> Lockbox Payment File Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylockboxPaymentFilePageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Lockbox Payment File");
		TestBase.setExtentReportSettings("Lockbox Payment File", Constants.SMOKE_TESTING,
				"Verify Lockbox Payment File Title", "Verifying Lockbox Payment File Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.lockboxPaymentFilePageLanding(), "Lockbox Payment File");
	}

	@Test(priority = 81, description = "Verify CiraBooks>> Cash Management>> Manage Bank Statements Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymanageBankStatementsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Manage Bank Statements");
		TestBase.setExtentReportSettings("Manage Bank Statements", Constants.SMOKE_TESTING,
				"Verify Manage Bank Statements Title", "Verifying Manage Bank Statements Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.manageBankStatementsPageLanding(), "Manage Bank Statements");
	}

	@Test(priority = 82, description = "Verify CiraBooks>> Cash Management>> Unmatched Transactions Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyunmatchedTransactionsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Cash Management>> Unmatched Transactions");
		TestBase.setExtentReportSettings("Unmatched Transactions", Constants.SMOKE_TESTING,
				"Verify Unmatched Transactions Title", "Verifying Unmatched Transactions Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.unmatchedTransactionsPageLanding(), "Unmatched Transactions");
	}

	@Test(priority = 83, description = "Verify CiraBooks>> CiraBooks Entity>> Audit Log Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyciraBooksEntityPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> CiraBooks Entity>> Audit Log");
		TestBase.setExtentReportSettings("CiraBooks Entity", Constants.SMOKE_TESTING, "Verify CiraBooks Entity Title",
				"Verifying CiraBooks Entity Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ciraBooksEntityPageLanding(), "CiraBooks Entity");
	}

	@Test(priority = 84, description = "Verify CiraBooks>> CiraBooks Entity>> Configuration Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyconfigurationPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> CiraBooks Entity>> Configuration");
		TestBase.setExtentReportSettings("Configuration", Constants.SMOKE_TESTING, "Verify Configuration Title",
				"Verifying Configuration Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.configurationPageLanding(), "Configuration");
	}

	@Test(priority = 85, description = "Verify CiraBooks>> Financial Reports>> Actual Budget Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyfinancialReportsPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Actual Budget Page");
		TestBase.setExtentReportSettings("Financial Reports", Constants.SMOKE_TESTING, "Verify Financial Reports Title",
				"Verifying Financial Reports Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.financialReportsPageLanding(), "Financial Reports");
	}

	@Test(priority = 86, description = "Verify CiraBooks>> Financial Reports>> Benchmark Report Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifybenchmarkReportPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Benchmark Report page");
		TestBase.setExtentReportSettings("Benchmark Report", Constants.SMOKE_TESTING, "Verify Benchmark Report Title",
				"Verifying Benchmark Report Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.benchmarkReportPageLanding(), "Benchmark Report");
	}

	@Test(priority = 87, description = "Verify CiraBooks>> Financial Reports>> Financial Summary Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyfinancialSummaryPageLanding() {
		LoggerManager.info("Verifying CiraBooks>> Financial Reports>> Financial Summary page");
		TestBase.setExtentReportSettings("Financial Summary", Constants.SMOKE_TESTING, "Verify Financial Summary Title",
				"Verifying Financial Summary Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.financialSummaryPageLanding(), "Financial Summary");
	}

	@Test(priority = 88, description = "Verify General Ledger>> Budget Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifygeneralLedgerPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Budget page");
		TestBase.setExtentReportSettings("General Ledger", Constants.SMOKE_TESTING, "Verify General Ledger Title",
				"Verifying General Ledger Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.generalLedgerPageLanding(), "General Ledger");
	}

	@Test(priority = 89, description = "Verify General Ledger>> General Ledger Report Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifygeneralLedgerReportPageLanding() {
		LoggerManager.info("Verifying General Ledger>> General Ledger Report page");
		TestBase.setExtentReportSettings("General Ledger Report", Constants.SMOKE_TESTING,
				"Verify General Ledger Report Title", "Verifying General Ledger Report Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.generalLedgerReportPageLanding(), "General Ledger Report");
	}

	@Test(priority = 90, description = "Verify General Ledger>> Journal Entries Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyjournalEntriesPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Journal Entries page");
		TestBase.setExtentReportSettings("Journal Entries", Constants.SMOKE_TESTING, "Verify Journal Entries Title",
				"Verifying Journal Entries Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.journalEntriesPageLanding(), "Journal Entries");
	}

	@Test(priority = 91, description = "Verify General Ledger>> Journal Entry Templates Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyjournalEntryTemplatesPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Journal Entry Templates page");
		TestBase.setExtentReportSettings("Journal Entry Templates", Constants.SMOKE_TESTING,
				"Verify Journal Entry Templates Title", "Verifying Journal Entry Templates Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.journalEntryTemplatesPageLanding(), "Journal Entry Templates");
	}

	@Test(priority = 92, description = "Verify General Ledger>> Open Close Books Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyopenCloseBooksPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Open Close Books page");
		TestBase.setExtentReportSettings("Open Close Books", Constants.SMOKE_TESTING, "Verify Open Close Books Title",
				"Verifying Open Close Books Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.openCloseBooksPageLanding(), "Open Close Books");
	}

	@Test(priority = 93, description = "Verify General Ledger>> Trial Balance Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytrialBalancePageLanding() {
		LoggerManager.info("Verifying General Ledger>> Trial Balance page");
		TestBase.setExtentReportSettings("Trial Balance", Constants.SMOKE_TESTING, "Verify Trial Balance Title",
				"Verifying Trial Balance Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.trialBalancePageLanding(), "Trial Balance");
	}

	@Test(priority = 94, description = "Verify General Ledger>> Upload Budgets Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyuploadBudgetsPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Upload Budgets page");
		TestBase.setExtentReportSettings("Upload Budgets", Constants.SMOKE_TESTING, "Verify Upload Budgets Title",
				"Verifying Upload Budgets Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.uploadBudgetsPageLanding(), "Upload Budgets");
	}

	@Test(priority = 95, description = "Verify General Ledger>> Upload JEs Page Link", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyuploadJEsPageLanding() {
		LoggerManager.info("Verifying General Ledger>> Upload JEs page");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.uploadJesPageLanding(), "Upload JEs");
		TestBase.setExtentReportSettings("Upload JEs", Constants.SMOKE_TESTING, "Verify Upload JEs Title",
				"Verifying Upload JEs Title");
	}

	// Corporate CiraBook
	@Test(priority = 96, description = "Verify Statement Approval", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCorporateCirabook()

	{
		LoggerManager.info("Verifying Corporate Cirabook");
		internalUserPage.corporateCirabook();
		internalUserPage = new InternalUserNavigation(driver);
		TestBase.setExtentReportSettings("Verifying  Corporate CiraBook Title", Constants.SMOKE_TESTING,
				"Corporate CiraBook", "Verify Corporate CiraBook");

	}

	@Test(priority = 97, description = "Verify AP Batches", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAPBatches()

	{
		LoggerManager.info("Verifying AP Batches");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apBatches(), "AP Batches");
		TestBase.setExtentReportSettings("Verifying  AP Batches Title", Constants.SMOKE_TESTING, "APBatches",
				"Verify APBatches");

	}

	@Test(priority = 98, description = "Verify AP Bill Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyAPBillAnalysis()

	{
		LoggerManager.info("Verifying AP Bill Analysis");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apBillAnalysis(), "AP Bill Analysis");
		TestBase.setExtentReportSettings("Verifying  AP Bill Analysis Title", Constants.SMOKE_TESTING,
				"AP Bill Analysis", "Verify AP Bill Analysis");

	}

	@Test(priority = 99, description = "Verify AP Bill Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyAPLedger()

	{
		LoggerManager.info("Verifying AP Ledger");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.apLedger(), "AP Ledger");
		TestBase.setExtentReportSettings("Verifying  AP Ledger Title", Constants.SMOKE_TESTING, "AP Ledger",
				"Verify AP Ledger");

	}

	@Test(priority = 100, description = "Verify Check Printing Management", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCheckPrintingManagement()

	{
		LoggerManager.info("Verifying Check Printing Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCheckPrintingManagement(),
				"Check Printing Management For Management Companies");
		TestBase.setExtentReportSettings("Verifying  Check Printing Management Title", Constants.SMOKE_TESTING,
				"Check Printing Management", "Verify Check Printing Management");

	}

	@Test(priority = 101, description = "Verify EFT Payment Management", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBEFTPAymentMAnagement()

	{
		LoggerManager.info("Verifying EFT PAyment Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbEFTPaymentManagement(), "EFT Payment Management");
		TestBase.setExtentReportSettings("Verifying  EFT PAyment Management Title", Constants.SMOKE_TESTING,
				"EFT PAyment Management", "Verify EFT PAyment Management");

	}

	@Test(priority = 102, description = "Verify New AP Bill", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBNewAPBill()

	{
		LoggerManager.info("Verifying New AP Bill");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbNewAPBill(), "New AP Bill");
		TestBase.setExtentReportSettings("Verifying New AP Bill Title", Constants.SMOKE_TESTING, "New AP Bill",
				"Verify New AP Bill");

	}

	@Test(priority = 103, description = "Verify Select Bills to PAy", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifySelectBillstoPay()

	{
		LoggerManager.info("Verifying Select Bills to Pay");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.selectBillstoPay(), "Select Bills to Pay");
		TestBase.setExtentReportSettings("Verifying Select Bills to Pay Title", Constants.SMOKE_TESTING,
				"Select Bills to Pay", "Verify Select Bills to Pay");

	}

	@Test(priority = 104, description = "Verify Vendor 1099", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBVendor1099()

	{
		LoggerManager.info("Verifying Vendor 1099");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbVendor1099(), "Vendor 1099");
		TestBase.setExtentReportSettings("Verifying Vendor 1099 Title", Constants.SMOKE_TESTING, "Vendor 1099",
				"Verify Vendor 1099");

	}

	@Test(priority = 105, description = "Verify Vendor Aging", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBVendorAging()

	{
		LoggerManager.info("Verifying Vendor Aging");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbVendorAging(), "Vendor Aging");
		TestBase.setExtentReportSettings("Verifying Vendor Aging Title", Constants.SMOKE_TESTING, "Vendor Aging",
				"Verify Vendor Aging");
	}

	@Test(priority = 106, description = "Verify Vendor Aging", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBVendorManagement()

	{
		LoggerManager.info("Verifying Vendor Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbVendorManagement(), "Vendor Management");
		TestBase.setExtentReportSettings("Verifying Vendor Management Title", Constants.SMOKE_TESTING,
				"Vendor Management", "Verify Vendor Management");
	}

	@Test(priority = 107, description = "Verify Vendor Aging", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBVendorWorkQueueMAnagement()

	{
		LoggerManager.info("Verifying Work Queue Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbVendorWorkQueueManagement(), "Work Queue Management");
		TestBase.setExtentReportSettings("Verifying Work Queue Management Title", Constants.SMOKE_TESTING,
				"Work Queue Management", "Verify Work Queue Management");
	}

	@Test(priority = 108, description = "Verify CCB AR Batches", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBARBatches()

	{
		LoggerManager.info("Verifying AR Batches");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbARBatches(), "AR Batches");
		TestBase.setExtentReportSettings("Verifying AR Batches Title", Constants.SMOKE_TESTING, "AR Batches",
				"Verify AR Batches");
	}

	@Test(priority = 109, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBARInvoiceAnalysis()

	{
		LoggerManager.info("Verifying AR Invoice Analysis");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbARInvoiceAnalysis(), "AR Invoice Analysis");
		TestBase.setExtentReportSettings("Verifying AR Invoice Analysis Title", Constants.SMOKE_TESTING,
				"AR Invoice Analysis", "Verify AR Invoice Analysis");
	}

	@Test(priority = 110, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBARLedger()

	{
		LoggerManager.info("Verifying AR Ledger");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbARLedger(), "AR Ledger");
		TestBase.setExtentReportSettings("Verifying AR Ledger Title", Constants.SMOKE_TESTING, "AR Ledger",
				"Verify AR Ledger");
	}

	@Test(priority = 111, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCustomerAging()

	{
		LoggerManager.info("Verifying Customer Aging");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCustomerAging(), "Customer Aging");
		TestBase.setExtentReportSettings("Verifying Customer Aging Title", Constants.SMOKE_TESTING, "Customer Aging",
				"Verify Customer Aging");
	}

	@Test(priority = 112, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCustomerManagement()

	{
		LoggerManager.info("Verifying Customer Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCustomerManagement(), "Customer Management");
		TestBase.setExtentReportSettings("Verifying Customer Management Title", Constants.SMOKE_TESTING,
				"Customer Management", "Verify Customer Management");
	}

	@Test(priority = 113, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBNewARAdjustment()

	{
		LoggerManager.info("Verifying New AR Adjustment");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbNewARAdjustment(), "New AR Adjustment");
		TestBase.setExtentReportSettings("Verifying New AR Adjustment Title", Constants.SMOKE_TESTING,
				"New AR Adjustment", "Verify New AR Adjustment");
	}

	@Test(priority = 114, description = "Verify CCB AR Invoice Analysis", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBNewARInvoice()

	{
		LoggerManager.info("Verifying New AR Invoice ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbNewARInvoice(), "New AR Invoice");
		TestBase.setExtentReportSettings("Verifying New AR Invoice Title", Constants.SMOKE_TESTING, "New AR Invoice",
				"Verify New AR Invoice");
	}

	@Test(priority = 115, description = "Verify CCB AR Payment", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBNewARPayment()

	{
		LoggerManager.info("Verifying New AR Invoice");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbNewARPayment(), "New AR Payment");
		TestBase.setExtentReportSettings("Verifying New AR Invoice Title", Constants.SMOKE_TESTING, "New AR Payment",
				"Verify New AR Payment");
	}

	@Test(priority = 116, description = "Verify CCB Bank Account", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBBankAccounts()

	{
		LoggerManager.info("Verifying Bank Account");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbBankAccounts(), "Bank Accounts");
		TestBase.setExtentReportSettings("Verifying Bank Account Title", Constants.SMOKE_TESTING, "Bank Account",
				"Verify Bank Account");
	}

	@Test(priority = 117, description = "Verify CCB CM Batches", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCMBatches()

	{
		LoggerManager.info("Verifying CM Batches ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCMBatches(), "CM Batches");
		TestBase.setExtentReportSettings("Verifying CM Batches Title", Constants.SMOKE_TESTING, "CM Batches",
				"Verify CM Batches");
	}

	@Test(priority = 118, description = "Verify CCB Cash Receipts", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCashReceipts()

	{
		LoggerManager.info("Verifying Cash Receipts");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCashReceipts(), "Cash Receipts");
		TestBase.setExtentReportSettings("Verifying Cash Receipts Title", Constants.SMOKE_TESTING, "Cash Receipts",
				"Verify Cash Receipts");
	}

	@Test(priority = 119, description = "Verify CCB Deposits", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBDeposits()

	{
		LoggerManager.info("Verifying Deposits");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbDeposits(), "Deposits");
		TestBase.setExtentReportSettings("Verifying Deposits Title", Constants.SMOKE_TESTING, "Deposits",
				"Verify Deposits");
	}

	@Test(priority = 120, description = "Verify CCB Reconcile Bank Account", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBReconcileBankAccount()

	{
		LoggerManager.info("Verifying Bank Reconciliation ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbReconcileBankAccount(), "Bank Reconciliation");
		TestBase.setExtentReportSettings("Verifying  Bank Reconciliation  Title", Constants.SMOKE_TESTING,
				" Bank Reconciliation ", "Verify  Bank Reconciliation ");
	}

	@Test(priority = 121, description = "Verify CCB Audit Log", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBAuditLog()

	{
		LoggerManager.info("Verifying Audit Log ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbAuditLog(), "Audit Log");
		TestBase.setExtentReportSettings("Verifying  Audit Log  Title", Constants.SMOKE_TESTING, "Audit Log",
				"Verify Audit Log");
	}

	@Test(priority = 122, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBConfiguration()

	{
		LoggerManager.info("Verifying Configuration for Management Companies");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbConfiguration(), "Configuration for Management Companies");
		TestBase.setExtentReportSettings("Verifying Configuration for Management Companies Title",
				Constants.SMOKE_TESTING, " Configuration for Management Companies ",
				"Verify  Configuration for Management Companies");
	}

	@Test(priority = 123, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBBudget()

	{
		LoggerManager.info("Verifying Budgets");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbBudget(), "Budgets");
		TestBase.setExtentReportSettings("Verifying Budgets Title", Constants.SMOKE_TESTING, "Budgets",
				"Verify Budgets");
	}

	@Test(priority = 124, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBGeneralLedgerReports()

	{
		LoggerManager.info("Verifying General Ledger Report");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbGeneralLedgerReports(), "General Ledger Report");
		TestBase.setExtentReportSettings("Verifying  General Ledger Report Title", Constants.SMOKE_TESTING,
				" General Ledger Report ", "Verify  General Ledger Report ");
	}

	@Test(priority = 125, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBJournalEntries()

	{
		LoggerManager.info("Verifying Journal Entries");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbJournalEntries(), "Journal Entries");
		TestBase.setExtentReportSettings("Verifying  Journal Entries Title", Constants.SMOKE_TESTING, "Journal Entries",
				"Verify Journal Entries");
	}

	@Test(priority = 126, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBJournalEntryTemplate()

	{
		LoggerManager.info("Verifying Journal Entry Template");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbJournalEntryTemplate(), "Journal Entry Template");
		TestBase.setExtentReportSettings("Verifying  Journal Entry Template Title", Constants.SMOKE_TESTING,
				"Journal Entry Templates", "Verify Journal Entry Templates");
	}

	@Test(priority = 127, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBOpenCloseBook()

	{
		LoggerManager.info("Verifying Open - Close Books");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbOpenCloseBook(), "Open - Close Books");
		TestBase.setExtentReportSettings("Verifying  Open - Close Books  Title", Constants.SMOKE_TESTING,
				" Open - Close Books ", "Verify  Open - Close Books ");
	}

	@Test(priority = 128, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBTrialBalance()

	{
		LoggerManager.info("Verifying Trial Balance");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbTrialBalance(), "Trial Balance");
		TestBase.setExtentReportSettings("Verifying  Trial Balance Title", Constants.SMOKE_TESTING, " Trial Balance ",
				"Verify  Trial Balance ");
	}

	@Test(priority = 129, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBUploadBudgets()

	{
		LoggerManager.info("Verifying Upload Budgets");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbUploadBudgets(), "Upload Budgets");
		TestBase.setExtentReportSettings("Verifying  Upload Budgets  Title", Constants.SMOKE_TESTING,
				" Upload Budgets ", "Verify  Upload Budgets ");
	}

	@Test(priority = 130, description = "Verify CCB Configuration", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBUploadJE()

	{
		LoggerManager.info("Verifying  Upload JE Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbUploadJE(), "Upload JE");
		TestBase.setExtentReportSettings("Verifying  Upload JE Title", Constants.SMOKE_TESTING, " Upload JE ",
				"Verify  Upload JE ");
	}

	@Test(priority = 131, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBReports()

	{
		LoggerManager.info("Verifying Reports");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbReports(), "Reports");
		TestBase.setExtentReportSettings("Verifying  Reports Title", Constants.SMOKE_TESTING, " Reports ",
				"Verify  Reports ");
	}

	@Test(priority = 132, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBBillingItemManagement()

	{
		LoggerManager.info("Verifying Billing Item Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbBillingItemManagement(), "Billing Item Management");
		TestBase.setExtentReportSettings("Verifying  Billing Item Management  Title", Constants.SMOKE_TESTING,
				" Billing Item Management ", "Verify  Billing Item Management ");
	}

	@Test(priority = 133, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBBillingQueueManagement()

	{
		LoggerManager.info("Verifying Billing Queue Management");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbBillingQueueManagement(), "Billing Queue Management");
		TestBase.setExtentReportSettings("Verifying  Billing Queue Management Title", Constants.SMOKE_TESTING,
				" Billing Queue Management ", "Verify  Billing Queue Management ");
	}

	@Test(priority = 134, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCuctomerContracts()

	{
		LoggerManager.info("Verifying Customer Contracts Title");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCuctomerContracts(), "Customer Contracts");
		TestBase.setExtentReportSettings("Verifying  Customer Contracts Title", Constants.SMOKE_TESTING,
				" Customer Contracts ", "Verify  Customer Contracts ");
	}

	@Test(priority = 135, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBSetupBillingItemCategory()

	{
		LoggerManager.info("Verifying Billing Item Category Setup");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbSetupBillingItemCategory(), "Billing Item Category Setup");
		TestBase.setExtentReportSettings("Verifying  Billing Item Category Setup  Title", Constants.SMOKE_TESTING,
				" Billing Item Category Setup ", "Verify  Billing Item Category Setup ");
	}

	@Test(priority = 136, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBbillingRules()

	{
		LoggerManager.info("Verifying Billing Rules Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbBillingRules(), "Billing Rules Setup");
		TestBase.setExtentReportSettings("Verifying  Billing Rules Setup  Title", Constants.SMOKE_TESTING,
				" Billing Rules Setup ", "Verify  Billing Rules Setup ");
	}

	@Test(priority = 137, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBContractForms()

	{
		LoggerManager.info("Verifying Contract Form Setup");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbContractForms(), "Contract Form Setup");
		TestBase.setExtentReportSettings("Verifying  Contract Form Setup Title", Constants.SMOKE_TESTING,
				" Contract Form Setup ", "Verify  Contract Form Setup ");
	}

	@Test(priority = 138, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBCustomerCategory()

	{
		LoggerManager.info("Verifying Customer Category Setup");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbCustomerCategory(), "Customer Category Setup");
		TestBase.setExtentReportSettings("Verifying  Customer Category Setup  Title", Constants.SMOKE_TESTING,
				" Customer Category Setup ", "Verify  Customer Category Setup ");
	}

	@Test(priority = 139, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBProductCategory()

	{
		LoggerManager.info("Verifying Product Category Setup");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbProductCategory(), "Product Category Setup");
		TestBase.setExtentReportSettings("Verifying  Product Category Setup  Title", Constants.SMOKE_TESTING,
				" Product Category Setup ", "Verify  Product Category Setup ");
	}

	@Test(priority = 140, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBProduct()

	{
		LoggerManager.info("Verifying Products Setup");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbProduct(), "Products Setup");
		TestBase.setExtentReportSettings("Verifying  Products Setup Title", Constants.SMOKE_TESTING, " Products Setup ",
				"Verify  Products Setup ");
	}

	@Test(priority = 141, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBSubscription()

	{
		LoggerManager.info("Verifying Subscriptions Setup");
		TestBase.setExtentReportSettings("Verifying  Subscriptions Setup Title", Constants.SMOKE_TESTING,
				" Subscriptions Setup ", "Verify  Subscriptions Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbSubscription(), "Subscriptions Setup");
	}

	@Test(priority = 142, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBTimeExpenseManagement()

	{
		LoggerManager.info("Verifying Payroll Reimbursements");
		TestBase.setExtentReportSettings("Verifying  Payroll Reimbursements  Title", Constants.SMOKE_TESTING,
				" Payroll Reimbursements ", "Verify  Payroll Reimbursements");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbTimeExpenseManagement(), "Payroll Reimbursements");

	}

	@Test(priority = 143, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBChargeCodeCategory()

	{
		LoggerManager.info("Verifying Charge Code Category Setup");
		TestBase.setExtentReportSettings("Verifying  Charge Code Category Setup  Title", Constants.SMOKE_TESTING,
				" Charge Code Category Setup ", "Verify  Charge Code Category Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbChargeCodeCategory(), "Charge Code Category Setup");

	}

	@Test(priority = 144, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBChargeCodes()

	{
		LoggerManager.info("Verifying charge codes");
		TestBase.setExtentReportSettings("Verifying  Charge Code Setup  Title", Constants.SMOKE_TESTING,
				" Charge Code Setup ", "Verify  Charge Code Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbChargeCodes(), "Charge Code Setup");

	}

	@Test(priority = 145, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBChargeRateCategory()

	{
		LoggerManager.info("Verifying charge rate category");
		TestBase.setExtentReportSettings("Verifying  Charge Rate Category Setup  Title", Constants.SMOKE_TESTING,
				" Charge Rate Category Setup ", "Verify  Charge Rate Category Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbChargeRateCategory(), "Charge Rate Category Setup");

	}

	@Test(priority = 146, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCCBChargeRates()

	{
		LoggerManager.info("Verifying Charge Rates");
		TestBase.setExtentReportSettings("Verifying  Charge Rate Setup Title", Constants.SMOKE_TESTING,
				" Charge Rate Setup ", "Verify  Charge Rate Setup ");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.ccbChargeRates(), "Charge Rate Setup");

	}

//======================================= Footer toolbar ====================================================
	@Test(priority = 147, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyAdvancedSearch()

	{
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.advancedSearch();
		TestBase.setExtentReportSettings("Verifying  Modules  Search  Title", Constants.SMOKE_TESTING, " Search ",
				"Verify  Search ");
	}

	@Test(priority = 148, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyUserDirectory()

	{
		LoggerManager.info("Verifying user directory footer toolbar menu");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.userDirectory(), "Directory");
		TestBase.setExtentReportSettings("Verifying  Modules  Directory  Title", Constants.SMOKE_TESTING, " Directory ",
				"Verify  Directory ");
	}

	@Test(priority = 149, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyContactUs()

	{
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage = new InternalUserNavigation(driver);
		assertEquals(internalUserPage.contactUs(), "Contact Us");
		TestBase.setExtentReportSettings("Verifying  Modules Contact Us Title", Constants.SMOKE_TESTING, "Contact Us",
				"Verify Contact Us");
	}

	@Test(priority = 150, description = "Verify CCB Reports", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)

	public void verifyCalendar()

	{
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.calendar();
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", Constants.SMOKE_TESTING,
				" My Calendar ", "Verify  My Calendar ");
	}

	@Test(priority = 151, description = "Verify ciramail footer toolbar ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyciramailMenu() {
		LoggerManager.info("Verifying ciramail footer toolbar");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.ciramailMenu();
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", Constants.SMOKE_TESTING,
				" My Calendar ", "Verify  My Calendar ");
	}

	@Test(priority = 152, description = "Verify logcallcreatecase footer toolbar ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifylogcallcreatecasePagelanding() {
		LoggerManager.info("Verifying logcallcreatecase footer toolbar");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.logcallCreateCaseIconClick();
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", Constants.SMOKE_TESTING,
				" My Calendar ", "Verify  My Calendar ");
	}

	@Test(priority = 153, description = "Verify time and expense management footer toolbar ", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifytimeandexpensemanagementPageLanding() {
		LoggerManager.info("Verifying time and expense managementfooter toolbar");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.timeAndExpenseManagementIconClick();
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", Constants.SMOKE_TESTING,
				" My Calendar ", "Verify  My Calendar ");
	}

	@Test(priority = 154, description = "Verify help footer toolbar icon", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyhelpIcon() {
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage = new InternalUserNavigation(driver);
		internalUserPage.helpIcon();
		TestBase.setExtentReportSettings("Verifying  Modules  My Calendar Title", Constants.SMOKE_TESTING,
				" My Calendar ", "Verify  My Calendar ");
	}

}
