package com.ciranet.boardmembers.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ciranet.boardmembers.pages.BoardMemberNavigation;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class BoardMemberNavigationTest extends TestBase {
	// Create the  object
	BoardMemberNavigation boardMemberHomePage = createPage(BoardMemberNavigation.class);

	@Test(priority = 0, description = "Verify HomePage of Board Member", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyHomePageSearch() {
		LoggerManager.info("Verify HomePage of Board Member");
		TestBase.setExtentReportSettings("Board Member Page Components Test", Constants.SMOKE_TESTING,
				"Verify Home Page Components", "Verifying Board Member Home Page Components");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertTrue(boardMemberHomePage.verifyPageHeaderAndClickHelpIcon(), "Failed to get the Page Help");
	}

	// ========== Communications menus starts here ========== //

	@Test(priority = 1, description = "Verify Communication Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCommunication() {
		LoggerManager.info("Verifying Communication-Announcement Page");
		TestBase.setExtentReportSettings("Communication-Announcement Test", Constants.SMOKE_TESTING,
				"Verify Communication-Announcement Page", "Verifying Communication-Announcement Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCommunicationMenu(), "Announcements");
	}

	@Test(priority = 2, description = "Verify Mail Merge Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMailMerge() {
		LoggerManager.info("Verifying Mail Merge Page");
		TestBase.setExtentReportSettings("Mail Merge Test", "Smoke Test", "Verify Mail Merge Page",
				"Verifying Mail Merge Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyMailMergeModule(), "Mail Merge");
	}

	@Test(priority = 3, description = "Verify Resident Contact Logs Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyResidentContactLogs() {
		LoggerManager.info("Verifying Resident Contact Logs Page");
		TestBase.setExtentReportSettings("Resident Contact Logs Test", "Smoke Test",
				"Verify Resident Contact Logs Page", "Verifying Resident Contact Logs Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyResidentContactLogsModule(), "Resident Contact Logs");
	}
	// ========== Communications menus ends here ========== //

	// ========== Compliance menus starts here ========== //

	@Test(priority = 4, description = "Verify Certified Tracking Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCertiedTracking() {
		LoggerManager.info("Verifying Certified Tracking Page");
		TestBase.setExtentReportSettings("Certified Tracking Test", "Smoke Test", "Verify Certified Tracking Page",
				"Verifying Certified Tracking Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyComplianceCertifiedTrackingModule(), "Certified Tracking");
	}

	@Test(priority = 5, description = "Verify Detailed Violation Log Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyDetailedViolationLog() {
		LoggerManager.info("Verifying Detailed Violation Log Page");
		TestBase.setExtentReportSettings("Detailed Violation Log Test", "Smoke Test",
				"Verify Detailed Violation Log Page", "Verifying Detailed Violation Log Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyDetailedViolationLogTrackingModule(), "Detailed Violations Log");
	}

	@Test(priority = 6, description = "Verify Last Inspection Log Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyLastInspectionLog() {
		LoggerManager.info("Verifying Last Inspection Log Page");
		TestBase.setExtentReportSettings("Last Inspection Log Test", "Smoke Test", "Verify Last Inspection Log Page",
				"Verifying Last Inspection Log Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyLastInspectionLogModule(), "Last Inspection Log");
	}

	@Test(priority = 7, description = "Verify Open Violations Log Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOpenViolationsLog() {
		LoggerManager.info("Verifying Open Violations Log Page");
		TestBase.setExtentReportSettings("Open Violations Log Test", "Smoke Test", "Verify Open Violations Log Page",
				"Verifying Open Violations Log Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyLastOpenViolationsModule(), "Open Violations Log");
	}

	@Test(priority = 8, description = "Verify Report A Violation Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyReportAViolation() {
		LoggerManager.info("Verifying Report A Violation Page");
		TestBase.setExtentReportSettings("Report A Violation Test", "Smoke Test", "Verify Report A Violation Page",
				"Verifying Report A Violation Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyReportAViolationModule(), "Report a Violation");
	}

	@Test(priority = 9, description = "Verify Restriction Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyRestrictionSummary() {
		LoggerManager.info("Verifying Restriction Summary Page");
		TestBase.setExtentReportSettings("Restriction Summary Test", "Smoke Test", "Verify Restriction Summary Page",
				"Verifying Restriction Summary Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyRestrictionSummaryModule(), "Deed Restriction Full Summary");
	}

	// =========== Compliance menu Ends here ========== //

	// =========== Information menus start here ========== //

	@Test(priority = 10, description = "Verify Additional Info Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAdditionalInfoMenu() {
		LoggerManager.info("Verifying Additional Info Page");
		TestBase.setExtentReportSettings("Additional Info", "Smoke Test", "Verify Additional Info page",
				"Verifying Additional Info");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyAdditionalInformationModule(), "Additional Information");
	}

	@Test(priority = 11, description = "Verify Amenities And Access Control Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyAmenitiesAccessControlMenu() {
		LoggerManager.info("Verifying Amenities and Access Control Page");
		TestBase.setExtentReportSettings("Amenities and Access Control", "Smoke Test",
				"Verify Amenities and Access Control page", "Verifying Amenities and Access Control");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyAmenitiesAccessControlModule(), "Amenities and Access Control");
	}

	@Test(priority = 12, description = "Verify Board / Committee Members Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBoardCommitteeMembersMenu() {
		LoggerManager.info("Verifying Board / Committee Members Page");
		TestBase.setExtentReportSettings("Board / Committee Members", "Smoke Test",
				"Verify Board / Committee Members page", "Verifying Board / Committee Members");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyBoardCommitteeMemberModule(), "Board / Committee Members");
	}

	@Test(priority = 13, description = "Verify Calendar Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCalendarMenu() {
		LoggerManager.info("Verifying Calendar Page");
		TestBase.setExtentReportSettings("Calendar", "Smoke Test", "Verify Calendar page",
				"Verifying Calendar Members");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCalendarModule(), "My Calendar");
	}

	@Test(priority = 14, description = "Verify Common Lots Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCommonLotsMenu() {
		LoggerManager.info("Verifying Common Lots Page");
		TestBase.setExtentReportSettings("Common Lots", "Smoke Test", "Verify Common Lots page",
				"Verifying Common Lots");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCommonLotsMenuClick(), "Common Lots");
	}

	@Test(priority = 15, description = "Verify Community Assets Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCommunityAssetsMenu() {
		LoggerManager.info("Verifying Community Assets Menu Page");
		TestBase.setExtentReportSettings("Community Assets ", "Smoke Test", "Verify Community Assets  page",
				"Verifying Community Assets");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCommunityAssetsMenuClick(), "Assets");
	}

	@Test(priority = 16, description = "Verify Community Notes Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCommunityNotesMenu() {
		LoggerManager.info("Verifying Community Notes Menu Page");
		TestBase.setExtentReportSettings("Community Notes", "Smoke Test", "Verify Community Notes page",
				"Verifying Community Notes");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCommunityNotesMenuClick(), "Community Notes");
	}

	@Test(priority = 17, description = "Verify Documents Archive Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyDocumentsArchiveMenu() {
		LoggerManager.info("Verifying Documents Menu Page");
		TestBase.setExtentReportSettings("Archive", "Smoke Test", "Verify Archive page", "Verifying Archive");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyDocumentArchiveClick(), "Documents");
	}

	@Test(priority = 18, description = "Verify New Documents Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyNewDocumentSummaryMenu() {
		LoggerManager.info("Verifying Documents Menu Page");
		TestBase.setExtentReportSettings("New Document Summary", "Smoke Test", "Verify New Document Summary page",
				"Verifying New Document Summary");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyNewDocumentSummaryClick(), "New Document Summary");
		boardMemberHomePage.ClickDocumentMenu();
	}

	@Test(priority = 19, description = "Verify New Documents Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyEnforcementPolicyMenu() {
		LoggerManager.info("Verifying Enforcement Policy Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Enforcement Policy page",
				"Verifying Enforcement Policy");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyEnforcementPolicyMenuClick(), "Enforcement Policy");
	}

	@Test(priority = 20, description = "Verify Graphs & Metrics Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyGraphsAndMetricsMenu() {
		LoggerManager.info("Verifying Graphs & Metrics Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Graphs & Metrics page",
				"Verifying Enforcement Policy");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyGraphsAndMetricsMenuClick(), "Community Dashboard");
	}

	@Test(priority = 21, description = "Verify Community Information Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInfoSummaryMenu() {
		LoggerManager.info("Verifying Community Information Page");
		TestBase.setExtentReportSettings("Community Information", "Smoke Test", "Verify Community Information page",
				"Verifying Community Information");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyInfoSummaryMenuClick(), "Community Information");
	}

	@Test(priority = 22, description = "Verify Insurance Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyInsuranceMenu() {
		LoggerManager.info("Verifying Insurance Page");
		TestBase.setExtentReportSettings("Insurance", "Smoke Test", "Verify Insurance page", "Verifying Insurance");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyInsuranceMenuClick(), "Insurance");
	}

	@Test(priority = 23, description = "Verify Legal Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyLegalSummaryMenu() {
		LoggerManager.info("Verifying Legal Summary Page");
		TestBase.setExtentReportSettings("Legal Summary", "Smoke Test", "Verify Legal Summary page",
				"Verifying Legal Summary");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyLegalSummaryMenuClick(), "Legal Information");
	}

	@Test(priority = 24, description = "Verify Map Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMapMenu() {
		LoggerManager.info("Verifying Community Map Page");
		TestBase.setExtentReportSettings("Community Map", "Smoke Test", "Verify Community Map page",
				"Verifying Community Map");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyMapMenuClick(), "Community Map");
		boardMemberHomePage.clickBreadCrumbMenu();
	}

	@Test(priority = 25, description = "Verify Vendor Management Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyVendorManagementMenu() {
		LoggerManager.info("Verifying Vendor Management Page");
		TestBase.setExtentReportSettings("Vendor Management", "Smoke Test", "Verify Vendor Management page",
				"Verifying Vendor Management");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyVendorManagementMenuClick(), "Vendor Management");
		boardMemberHomePage.informationMenuClick();
	}

	@Test(priority = 26, description = "Verify Property Details Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyPropertiesMenu() {
		LoggerManager.info("Verifying Property Details Page");
		TestBase.setExtentReportSettings("Property Details", "Smoke Test", "Verify Property Details page",
				"Verifying Property Details");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyPropertiesMenuClick(), "Property Details");
		boardMemberHomePage.clickBreadCrumbMenu();
	}

	@Test(priority = 27, description = "Verify Resident Directory Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyResidentDirectoryMenu() {
		LoggerManager.info("Verifying Resident Directory Page");
		TestBase.setExtentReportSettings("Resident Directory", "Smoke Test", "Verify Resident Directory page",
				"Verifying Resident Directory");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyResidentDirectoryMenu(), "Resident Directory");
	}

	@Test(priority = 28, description = "Verify Reports - Move-In-Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyMoveInSummaryMenu() {
		LoggerManager.info("Verifying Reports Move-In-Summary Page");
		TestBase.setExtentReportSettings("Reports-Move-In-Summary", "Smoke Test", "Verify Reports-Move-In-Summary page",
				"Verifying Reports Move-In-Summary");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyReportsMenuClick(), "Move-In Summary");
	}

	@Test(priority = 29, description = "Verify Reports - On Demand Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyOnDemandMenu() {
		LoggerManager.info("Verifying Reports On Demand Page");
		TestBase.setExtentReportSettings("Reports-On Demand", "Smoke Test", "Verify Reports-On Demand page",
				"Verifying Reports On-Demand");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyReportsOnDemandMenuClick(), "Reports");
	}

	@Test(priority = 30, description = "Verify Reports - Summary Previous Month Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifySummaryPreviousMonthMenu() {
		LoggerManager.info("Verifying Summary Previous Month Page");
		TestBase.setExtentReportSettings("Reports-Summary Previous Month", "Smoke Test",
				"Verify Reports-Summary Previous Month page", "Verifying Report - Summary Previous Month");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyReportsSummaryPrevMonthClick(), "Operations Summary - Previous Month");
	}

	// ========== Cirabooks Starts here ========== Here need to check whether
	// CiraBooks menu is available or not//

	@Test(priority = 31, description = "Verify Cirabooks Worksspace Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksWorkSpace() {

		LoggerManager.info("Verifying Cirabooks Worksspace Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		if (boardMemberHomePage.isCiarBooksMenuVisible()) {
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}

		assertEquals(boardMemberHomePage.verifyCiraBooksMenusClick(), "CiraBooks Workspace");
	}

	@Test(priority = 32, description = "Verify AP Expense Details Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksMenu() {
		LoggerManager.info("Verifying AP Expense Details Page");

		TestBase.setExtentReportSettings("AP Expense Details", "Smoke Test", "Verify AP Expense Details page",
				"Verifying AP Expense Details ");
		boardMemberHomePage = new BoardMemberNavigation(driver);

		if (!boardMemberHomePage.isAPMenuVisible()) {
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCBAccountsPayableMenusClick(), "AP Expense Detail");
	}

	@Test(priority = 33, description = "Verify AP Ledger Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksApLedgerMenu() {
		LoggerManager.info("Verifying AP Ledger Page");

		TestBase.setExtentReportSettings("AP Ledger", "Smoke Test", "Verify AP Ledger page", "Verifying AP Ledger");
		boardMemberHomePage = new BoardMemberNavigation(driver);

		if (boardMemberHomePage.isCiarBooksMenuVisible()) {
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCBAPLedgerMenuClick(), "AP Ledger");
	}

	@Test(priority = 34, description = "Verify My Submitted Invoices Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksMySubmittedInvoicesMenu() {
		LoggerManager.info("Verifying My Submitted Invoices Page");
		TestBase.setExtentReportSettings("My Submitted Invoices", "Smoke Test", "Verify My Submitted Invoices page",
				"Verifying My Submitted Invoices");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		if (boardMemberHomePage.isCiarBooksMenuVisible()) {
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyAccountsPayableMySubmittedInvoiceMenu(), "Review My Invoices");
	}

	@Test(priority = 35, description = "Verify Open AP Page", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksOpenAPMenu() {
		LoggerManager.info("Verifying Open AP Page");

		TestBase.setExtentReportSettings("Open AP", "Smoke Test", "Verify Open AP page", "Verifying Open AP");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		if (boardMemberHomePage.isCiarBooksMenuVisible()) {
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		assertEquals(boardMemberHomePage.verifyCbOpenApMenuClick(), "Approved Open AP");
	}

	@Test(priority = 36, description = "Verify Search InvoicesPage", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksSearchInvoicesMenu() {
		LoggerManager.info("Verifying Search Invoices Page");
		TestBase.setExtentReportSettings("Search Invoices", "Smoke Test", "Verify Search Invoices page",
				"Verifying Search Invoices");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCbSearchInvoicesMenuClick(), "Search Invoices");
	}

	@Test(priority = 37, description = "Verify Search InvoicesPage", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksSubmitInvoiceMenu() {
		LoggerManager.info("Verifying Submit Invoice Page");
		TestBase.setExtentReportSettings("Submit Invoice", "Smoke Test", "Verify Submit Invoice page",
				"Verifying Submit Invoice");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBSubmitInvoiceMenuClick(), "Submit Invoice/Payment Request");
	}

	@Test(priority = 38, description = "Verify Vendor Aging Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBooksVendorAgingMenu() {
		LoggerManager.info("Verifying vendor Aging Page");
		TestBase.setExtentReportSettings("Vendor Aging", "Smoke Test", "Verify Vwndor Aging page",
				"Verifying Vendor Aging");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBVendorAgingMenuClick(), "Vendor Aging");
		boardMemberHomePage.clickAccountPayableMenuClick();
	}

	@Test(priority = 39, description = "Verify AR Ledger Details Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBookARsMenu() {
		LoggerManager.info("Verifying AR Ledger Details Page");
		TestBase.setExtentReportSettings("AR Ledger Details", "Smoke Test", "Verify AR Ledger Details page",
				"Verifying AR Ledger Details ");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBARLedgerMenuClick(), "AR Ledger");
	}

	@Test(priority = 40, description = "Verify AR Ledger Details Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBookARAssessmentRulessMenu() {
		LoggerManager.info("Verifying Assessment Rules Page");
		TestBase.setExtentReportSettings("Assessment Rules Details", "Smoke Test", "Verify Assessment Rules Page",
				"Verifying Assessment Rules Details");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBARAssessmentRulesMenuClick(), "Assessment Rules");
	}

	@Test(priority = 41, description = "Verify Customer Aging Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBookARCustomerAgingMenu() {
		LoggerManager.info("Verifying Customer Aging Page");
		TestBase.setExtentReportSettings("Customer Aging Details", "Smoke Test", "Verify Customer Aging Page",
				"Verifying Customer Aging Details");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBARCustomerAgingMenuClick(), "Customer Aging");
	}

	@Test(priority = 42, description = "Verify Delinquency Detail Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyCiraBookARDelinquencyDetailMenu() {
		LoggerManager.info("Verifying Delinquency Detail Page");
		TestBase.setExtentReportSettings("Customer Delinquency Detail", "Smoke Test", "Verify Delinquency Detail Page",
				"Verifying Delinquency Detail");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyCBARDelinquencyDetailMenuClick(), "Delinquency Detail");
		boardMemberHomePage.clickBreadCrumbMenu();
	}

	@Test(priority = 43, description = "Verify Actual Vs Budget Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFRActualVsBudget() {
		LoggerManager.info("Verifying Actual Vs Budget Page");
		TestBase.setExtentReportSettings("ActualVsBudget Test", "Smoke Test", "Verify ActualVsBudget Page",
				"Verifying ActualVsBudget Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		boardMemberHomePage.verifyFRActualVsBudgetMenu();
		assertEquals(boardMemberHomePage.verifyFRActualVsBudgetMenu(), "Actual vs Budget");
	}

	@Test(priority = 44, description = "Verify Benchmark Report Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyBenchmarkReport() {
		LoggerManager.info("Verifying Benchmark Report Page");
		TestBase.setExtentReportSettings("Benchmark Report Test", "Smoke Test", "Verify Benchmark Report Page",
				"Verifying Benchmark Report Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyFRBenchmarkReportMenu(), "Benchmark Report");
	}

	@Test(priority = 45, description = "Verify Financial Summary Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyFinancialSummary() {
		LoggerManager.info("Verifying Financial Summary Page");
		TestBase.setExtentReportSettings("Financial Summary Test", "Smoke Test", "Verify Financial Summary Page",
				"Verifying Financial Summary Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyFRFinancialSummaryMenu(), "Financial Summary");
	}

	@Test(priority = 46, description = "Verify General Ledger Report Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyGLReport() {
		LoggerManager.info("Verifying General Ledger Report Page");
		TestBase.setExtentReportSettings("General Ledger Report Test", "Smoke Test",
				"Verify General Ledger Report Page", "Verifying General Ledger Report Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyGLGeneralLedgerReportMenu(), "General Ledger Report");
	}

	@Test(priority = 47, description = "Verify Trial Balance Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifyGLTrialBalance() {
		LoggerManager.info("Verifying Trial Balance Page");
		TestBase.setExtentReportSettings("Trial Balance Test", "Smoke Test", "Verify Trial Balance Page",
				"Verifying Trial Balance Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyTrialBalanceMenu(), "General Ledger Report");
	}

	@Test(priority = 48, description = "Verify Architectural Application Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyWQArchitecturalApplication() {
		LoggerManager.info("Verifying Architectural Application Page");
		TestBase.setExtentReportSettings("Architectural Application Test", "Smoke Test",
				"Verify Architectural Application Page", "Verifying Architectural Application Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyMyWorkQueueCommMgmtArchiApplMenu(), "Architectural Application");
	}

	@Test(priority = 49, description = "Verify Board Approval Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyWQBoardApproval() {
		LoggerManager.info("Verifying Board Approval Page");
		TestBase.setExtentReportSettings("Board Approval Test", "Smoke Test", "Verify Board Approval Page",
				"Verifying Board Approval Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyMyWorkQueueBoardApprovalMenu(), "Board Approvals");
	}

	@Test(priority = 50, description = "Verify Maintenance Work Orders Page", groups = {
			Constants.SMOKE_TESTING }, alwaysRun = true)
	public void verifymyWQMaintenceWorkOrders() {
		LoggerManager.info("Verifying Maintenance Work Orders Page");
		TestBase.setExtentReportSettings("Maintenance Work Orders Test", "Smoke Test",
				"Verify Maintenance Work Orders Page", "Verifying Maintenance Work Orders Page");
		boardMemberHomePage = new BoardMemberNavigation(driver);
		assertEquals(boardMemberHomePage.verifyMyWorkQueueMaintenanceWorkOrdersMenu(), "Maintenance Work Orders");
	}

}
