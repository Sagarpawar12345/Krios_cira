package com.ciranet.boardmembers.pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;

public class BoardMemberNavigation extends BasePage {

	public BoardMemberNavigation(WebDriver driver) {
		super(driver);
	}

	// Here define the Object definition
	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'Community Landing - Board')]")
	WebElement communityPageHeader;

	@FindBy(xpath = "//i[@class='fas fa-bell approval-button']")
	WebElement bellIcon;

	@FindBy(xpath = "//sup[@class='page-help-link']//a[@class='fas fa-question-circle']")
	WebElement communityPageHeaderHelpIcon;

	@FindBy(xpath = "//span[normalize-space()='Community']")
	WebElement communityMenu;

	@FindBy(xpath = "//span[normalize-space()='Communications']")
	WebElement communicationMenu;

	@FindBy(xpath = "//span[normalize-space()='Announcement Logs']")
	WebElement announcementMenu;

	@FindBy(xpath = "//div[contains(text(),'Expired')]")
	WebElement annExpriredTab;

	@FindBy(xpath = "//h2[normalize-space()='Announcements']")
	WebElement lblAnnoucement;

	// For Mail merge module

	@FindBy(xpath = "//span[normalize-space()='Mail Merge']")
	WebElement mailMergeMenu;

	@FindBy(xpath = "//h2[normalize-space()='Mail Merge']")
	WebElement lblMailMerge;

	@FindBy(xpath = "//div[@class='dx-widget dx-checkbox dx-select-checkbox dx-datagrid-checkbox-size dx-state-focused dx-state-hover']//span[@class='dx-checkbox-icon']")
	WebElement chkBoxMailMergeFirstRecord;

	@FindBy(xpath = "//div[@class='new-mail-merge-btn letter-head dx-template-wrapper dx-item-content dx-toolbar-item-content']")
	WebElement buttonCreateLabel;

	// Resident Contact Logs controls
	@FindBy(xpath = "//span[normalize-space()='Resident Contact Logs']")
	WebElement residentContactLogsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblResidentContactLogs;

	// Compliance module xpaths are defined here
	@FindBy(xpath = "//span[normalize-space()='Compliance']")
	WebElement complianceMenu;

	@FindBy(xpath = "//span[normalize-space()='Certified Tracking']")
	WebElement certifiedTrackingMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Certified Tracking')]")
	WebElement lblCertifiedTracking;

	@FindBy(xpath = "//span[normalize-space()='Detailed Violations Log']")
	WebElement detailedViolationLogsMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Detailed Violations Log')]")
	WebElement lblDetailedVioLog;

	@FindBy(xpath = "//span[normalize-space()='Open']")
	WebElement openTab;

	@FindBy(xpath = "//span[normalize-space()='Closed']")
	WebElement closedTab;

	@FindBy(xpath = "//span[normalize-space()='Notices']")
	WebElement noticesTab;

	// Last Inspection Log
	@FindBy(xpath = "//span[normalize-space()='Last Inspection Log']")
	WebElement lastInspectionLogMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Last Inspection Log')]")
	WebElement lblLastInspectionLog;

	// Open Violation log
	@FindBy(xpath = "//span[normalize-space()='Open Violations Log']")
	WebElement openViolationsLogMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Open Violations Log')]")
	WebElement lblOpenViolationLog;

	@FindBy(xpath = "//div[@title='Compliance']//i[@class='fas fa-chevron-left header-icon-button-back']")
	WebElement complianceBack;

	@FindBy(xpath = "//div[@title='Compliance']//i[@class='fas fa-chevron-right header-icon-button-right']")
	WebElement complianceRight;

	@FindBy(xpath = "//span[normalize-space()='Report a Violation']")
	WebElement reportAViolationMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Report a Violation')]")
	WebElement lblReportAViolation;

	@FindBy(xpath = "//span[normalize-space()='Restriction Summary']")
	WebElement restrictionSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Deed Restriction Full Summary')]")
	WebElement lblRestrictionSummary;

	// Compliance module xpath ends here

	// Information menu - components
	@FindBy(xpath = "//span[normalize-space()='Information']")
	WebElement informationMenu;

	@FindBy(xpath = "//span[normalize-space()='Additional Info']")
	WebElement additionalInforMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Additional Information')]")
	WebElement lblAdditionalInfo;

	@FindBy(xpath = "//span[normalize-space()='Amenities and Access Control']")
	WebElement amenitiesAndAccessControlMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Amenities and Access Control')]")
	WebElement lblAmenitiesAndAccessControl;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']") // "//dx-button[@title='Hide Menu']//i[@class='dx-icon
															// dx-icon-menu']")
	WebElement breadCrumbMenu;

	// For Board/Committee Member
	@FindBy(xpath = "//span[normalize-space()='Board / Committee Members']")
	WebElement boardCommitteeMemberMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Board / Committee Members')]")
	WebElement lblBoardCommitteeMember;

	// Calendar
	@FindBy(xpath = "//span[normalize-space()='Calendar']")
	WebElement calenderMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'My Calendar')]")
	WebElement lblMyCalendar;

	@FindBy(xpath = "//span[normalize-space()='Financial Reports']")
	WebElement financialReportsMenu;

	@FindBy(xpath = "//span[normalize-space()='Actual vs Budget']")
	WebElement actualVsBudget;

	@FindBy(xpath = "//h2[normalize-space()='Actual vs Budget']")
	WebElement lblActualVsBudget;

	@FindBy(xpath = "//span[normalize-space()='Benchmark Report']")
	WebElement benchmarkReport;

	@FindBy(xpath = "//h2[normalize-space()='Benchmark Report']")
	WebElement lblBenchmarkReport;

	@FindBy(xpath = "//span[normalize-space()='Financial Summary']")
	WebElement financialSummaryMenu;

	@FindBy(xpath = "//h2[normalize-space()='Financial Summary']")
	WebElement lblFinancialSummary;

	@FindBy(xpath = "//span[normalize-space()='General Ledger']")
	WebElement generalLedgerMenu;

	@FindBy(xpath = "//span[normalize-space()='General Ledger Report']")
	WebElement generalLedgerReportMenu;

	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'General Ledger Report')]")
	WebElement lblGLReport;

	@FindBy(xpath = "//span[normalize-space()='Trial Balance']")
	WebElement trialBalanceMenu;

	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'Trial Balance')]")
	WebElement lblTrialBalance;

	// My Work Queue menus and submenus
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//span[normalize-space()='Community Management']")
	WebElement communityMgmtSubMenu;

	@FindBy(xpath = "//span[normalize-space()='Architectural Application']")
	WebElement architecturalSubMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Architectural Application')]")
	WebElement lblArchitecturalApplication;

	@FindBy(xpath = "//span[normalize-space()='Board Approvals']")
	WebElement boardApprovalSubMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Board Approvals')]")
	WebElement lblBoardApproval;

	@FindBy(xpath = "//span[normalize-space()='Maintenance Work Orders']")
	WebElement maintenanceWorkOrdersSubMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Maintenance Work Orders')]")
	WebElement lblMaintenanceWorkOrders;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[contains(text(),'Active')]")
	WebElement activeTab;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks']")
	WebElement ciraBooksMenu;

	@FindBy(css = "h2[class='page-header'] span")
	WebElement lblCBWorkSpace;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	WebElement documentMenu;

	@FindBy(xpath = "//span[normalize-space()='Archive']")
	WebElement archiveMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Documents')]")
	WebElement lblArchive;

	@FindBy(xpath = "//span[normalize-space()='Properties']")
	WebElement propertiesMenu;

	@FindBy(xpath = "//span[contains(text(),'Property Details')]")
	WebElement propertyDetailsMenu;

	@FindBy(xpath = "//h2[normalize-space()='Property Details']")
	WebElement lblPropertyDetails;

	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement reportsMenu;

	@FindBy(xpath = "//span[normalize-space()='Move-In Summary']")
	WebElement moveInSummaryMenu;

	@FindBy(xpath = "//h2[normalize-space()='Move-In Summary']")
	WebElement lblMoveInSummary;

	@FindBy(xpath = "//span[normalize-space()='On Demand']")
	WebElement onDemandMenu;

	@FindBy(xpath = "//h2[normalize-space()='Reports']")
	WebElement lblOnDemand;

	@FindBy(xpath = "//span[normalize-space()='Summary - Previous Month']")
	WebElement summaryPrevMonthMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Operations Summary - Previous Month')]")
	WebElement lblSummasryPrevMonth;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Workspace']")
	WebElement cbWorkSpaceMenu;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement cbAccountsPayable;

	@FindBy(xpath = "//span[normalize-space()='Accounts Receivable']")
	WebElement cbAccountsReceivable;

	@FindBy(xpath = "//span[normalize-space()='AR Ledger']")
	WebElement cbARLedgerMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBARLedger;

	@FindBy(xpath = "//span[normalize-space()='Assessment Rules']")
	WebElement cbARAssessmentRulesMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBARAssessmentRules;

	@FindBy(xpath = "//span[normalize-space()='Customer Aging']")
	WebElement cbARCustomerAgingMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBARCustomerAging;

	@FindBy(xpath = "//span[normalize-space()='Delinquency Detail']")
	WebElement cbARDeliquencyDetailMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBARDeliquencyDetail;

	@FindBy(xpath = "//span[normalize-space()='AP Expense Detail']")
	WebElement cbAPExpenseDetails;

	@FindBy(css = ".page-header")
	WebElement lblCBAPExpenseDetails;

	@FindBy(xpath = "//span[normalize-space()='AP Ledger']")
	WebElement cbAPLedger;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBAPLedger;

	@FindBy(xpath = "//span[normalize-space()='My Submitted Invoices']")
	WebElement cbMySubmittedInvoices;
	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Review My Invoices')]")
	WebElement lblMySubInvoices;

	@FindBy(xpath = "//span[normalize-space()='Open AP']")
	WebElement cbOpenAPMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblOpenAP;

	@FindBy(xpath = "//span[normalize-space()='Search Invoices']")
	WebElement cbSearchInvoicesMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBSearchInvoices;

	@FindBy(xpath = "//span[normalize-space()='Search Invoices']")
	WebElement cbSubmitInvoiceMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblCBSubmitInvoice;

	@FindBy(xpath = "//span[normalize-space()='Vendor Aging']")
	WebElement cbVendorAgingMenu;
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblVendorAging;

	@FindBy(xpath = "//span[normalize-space()='New Document Summary']")
	WebElement newDocSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'New Document Summary')]")
	WebElement lblNewDocumentSummary;

	@FindBy(xpath = "//span[normalize-space()='Vendor Management']")
	WebElement vendorManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Vendor Management')]")
	WebElement lblVendorManagement;

	@FindBy(xpath = "//span[normalize-space()='Common Lots']")
	WebElement commonLotsMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Common Lots')]")
	WebElement lblCommonLots;

	@FindBy(xpath = "//span[normalize-space()='Community Assets']")
	WebElement communityAssetsMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Assets')]")
	WebElement lblCommunityAssets;

	@FindBy(xpath = "//span[normalize-space()='Community Notes']")
	WebElement communityNotesMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Community Notes')]")
	WebElement lblCommunityNotes;

	@FindBy(xpath = "//span[normalize-space()='Enforcement Policy']")
	WebElement enforcementPolicyMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Enforcement Policy')]")
	WebElement lblEnforcementPolicy;

	@FindBy(xpath = "//span[normalize-space()='Graphs & Metrics']")
	WebElement graphsAndMetricsMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Community Dashboard')]")
	WebElement lblGraphsAndMetrics;

	@FindBy(xpath = "//span[normalize-space()='Info Summary']")
	WebElement infoSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Community Information')]")
	WebElement lblInfoSummary;

	@FindBy(xpath = "//span[normalize-space()='Insurance']")
	WebElement insuranceMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Insurance')]")
	WebElement lblInsurance;

	@FindBy(xpath = "//span[normalize-space()='Legal Summary']")
	WebElement legalSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Legal Information')]")
	WebElement lblLeagalSummary;

	@FindBy(xpath = "//span[normalize-space()='Map']")
	WebElement mapMenu;

	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Community Map')]")
	WebElement lblMap;

	@FindBy(xpath = "//span[normalize-space()='Resident Directory']")
	WebElement residentDirectoryMenu;

	@FindBy(xpath = "//h2[normalize-space()='Resident Directory']")
	WebElement lblResidentDirectory;

	// Information menu items Xpath ends here

	public boolean verifyPageHeaderAndClickHelpIcon() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(bellIcon);

		if (bellIcon.isDisplayed()) {
			return true;
		} else
			return false;
	}

	// ======== Communications menus starts here ===== //
	public String verifyCommunicationMenu() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communicationMenu);

		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(announcementMenu);
		clickElementJS(announcementMenu);

		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(annExpriredTab);
		clickElementJS(annExpriredTab);

		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(activeTab);
		clickElementJS(activeTab);
		return lblAnnoucement.getText();

	}

	public String verifyMailMergeModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(mailMergeMenu);
		clickElement(mailMergeMenu);
		waitForInvisibility(loaderIcon);
		return lblMailMerge.getText();
	}

	public String verifyResidentContactLogsModule() {
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(residentContactLogsMenu);
		clickElementJS(residentContactLogsMenu);
		waitForInvisibility(loaderIcon);
		String lblText = lblResidentContactLogs.getText();
		clickElementJS(communicationMenu);
		return lblText;
	}
	// ======== Communications menus ends here ===== //

	// ======== Compliance menus starts here ===== //
	public String verifyComplianceCertifiedTrackingModule() {
		waitForInvisibility(loaderIcon);
		clickElementJS(complianceMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(certifiedTrackingMenu);
		return lblCertifiedTracking.getText();
	}

	public String verifyDetailedViolationLogTrackingModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(detailedViolationLogsMenu);
		clickElementJS(detailedViolationLogsMenu);

		waitForElementToBeClickable(closedTab);
		clickElementJS(closedTab);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(noticesTab);
		clickElementJS(noticesTab);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(openTab);
		clickElementJS(openTab);
		waitForInvisibility(loaderIcon);
		return lblDetailedVioLog.getText();
	}

	public String verifyLastInspectionLogModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(lastInspectionLogMenu);
		clickElementJS(lastInspectionLogMenu);
		waitForInvisibility(loaderIcon);
		return lblLastInspectionLog.getText();
	}

	public String verifyLastOpenViolationsModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(openViolationsLogMenu);
		clickElementJS(openViolationsLogMenu);
		waitForInvisibility(loaderIcon);
		return lblOpenViolationLog.getText();
	}

	public String verifyReportAViolationModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(reportAViolationMenu);
		clickElementJS(reportAViolationMenu);
		waitForInvisibility(loaderIcon);
		return lblReportAViolation.getText();
	}

	public String verifyRestrictionSummaryModule() {
		waitForInvisibility(loaderIcon);
		scrollToElement(restrictionSummaryMenu);
		waitForElementToBeClickable(restrictionSummaryMenu);
		clickElementJS(restrictionSummaryMenu);

		waitForInvisibility(loaderIcon);

		scrollToElement(complianceMenu);
		clickElementJS(complianceMenu);
		return lblRestrictionSummary.getText();
	}

	// ========== Compliance menus Ends here ========== //

	// ========================== Information menu click starts here

	public String verifyAdditionalInformationModule() {
		waitForInvisibility(loaderIcon);
		scrollToElement(informationMenu);
		waitForElementToBeClickable(informationMenu);
		clickElementJS(informationMenu);

		waitForElementToBeClickable(additionalInforMenu);
		clickElementJS(additionalInforMenu);
		waitForInvisibility(loaderIcon);
		return lblAdditionalInfo.getText();
	}

	public String verifyAmenitiesAccessControlModule() {
		waitForElementToBeClickable(amenitiesAndAccessControlMenu);
		clickElementJS(amenitiesAndAccessControlMenu);
		waitForInvisibility(loaderIcon);

		Actions actions = new Actions(driver);
		// Performs mouse move action onto the element
		actions.moveToElement(breadCrumbMenu).click().build().perform();
		return lblAmenitiesAndAccessControl.getText();
	}

	public String verifyBoardCommitteeMemberModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(boardCommitteeMemberMenu);
		clickElementJS(boardCommitteeMemberMenu);
		waitForInvisibility(loaderIcon);
		return lblBoardCommitteeMember.getText();

	}

	public String verifyCalendarModule() {
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(calenderMenu);
		clickElementJS(calenderMenu);
		waitForInvisibility(loaderIcon);
		return lblMyCalendar.getText();
	}

	public String verifyDocumentArchiveClick() 
	{
		scrollToElement(documentMenu);
		waitForElementToBeClickable(documentMenu);

		clickElementJS(documentMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(archiveMenu);
		scrollToElement(archiveMenu);
		clickElementJS(archiveMenu);
		return lblArchive.getText();

	}

	public String verifyNewDocumentSummaryClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(newDocSummaryMenu);
		scrollToElement(newDocSummaryMenu);
		clickElementJS(newDocSummaryMenu);
		return lblNewDocumentSummary.getText();
	}

	public void ClickDocumentMenu() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(documentMenu);
		scrollToElement(documentMenu);
		clickElementJS(documentMenu);
	}

// For Enforcement policy
	public String verifyEnforcementPolicyMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(enforcementPolicyMenu);
		scrollToElement(enforcementPolicyMenu);
		clickElementJS(enforcementPolicyMenu);
		return lblEnforcementPolicy.getText();
	}

// For Graphs and Metrics
	public String verifyGraphsAndMetricsMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(graphsAndMetricsMenu);
		scrollToElement(graphsAndMetricsMenu);
		clickElementJS(graphsAndMetricsMenu);
		return lblGraphsAndMetrics.getText();
	}

//For InfoSummary menu
	public String verifyInfoSummaryMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(infoSummaryMenu);
		scrollToElement(infoSummaryMenu);
		clickElementJS(infoSummaryMenu);
		return lblInfoSummary.getText();
	}

//For Insurance menu
	public String verifyInsuranceMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(insuranceMenu);
		scrollToElement(insuranceMenu);
		clickElementJS(insuranceMenu);
		return lblInsurance.getText();
	}

//For Legal Summary
	public String verifyLegalSummaryMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(legalSummaryMenu);
		scrollToElement(legalSummaryMenu);
		clickElementJS(legalSummaryMenu);
		return lblLeagalSummary.getText();
	}

// For Map Menu    
	public String verifyMapMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(mapMenu);
		scrollToElement(mapMenu);
		clickElementJS(mapMenu);
		return lblMap.getText();
	}

	public void clickBreadCrumbMenu() {
		waitForElementToBeClickable(breadCrumbMenu);
		Actions actions = new Actions(driver);
		// Performs mouse move action onto the element
		actions.moveToElement(breadCrumbMenu).click().build().perform();
	}

	public String verifyPropertiesMenuClick() {
		scrollToElement(propertiesMenu);
		waitForElementToBeClickable(propertiesMenu);

		clickElementJS(propertiesMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(propertyDetailsMenu);
		scrollToElement(propertyDetailsMenu);
		clickElementJS(propertyDetailsMenu);
		waitForInvisibility(loaderIcon);
		return lblPropertyDetails.getText();
	}

	public String verifyResidentDirectoryMenu() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(residentDirectoryMenu);
		scrollToElement(residentDirectoryMenu);
		clickElementJS(residentDirectoryMenu);
		return lblResidentDirectory.getText();
	}

	public String verifyReportsMenuClick() {
		scrollToElement(reportsMenu);
		waitForElementToBeClickable(reportsMenu);

		clickElementJS(reportsMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(moveInSummaryMenu);
		scrollToElement(moveInSummaryMenu);
		clickElementJS(moveInSummaryMenu);
		waitForInvisibility(loaderIcon);
		return lblMoveInSummary.getText();
	}

// On Demand Report click
	public String verifyReportsOnDemandMenuClick() {
		scrollToElement(onDemandMenu);
		waitForElementToBeClickable(onDemandMenu);

		clickElementJS(onDemandMenu);
		waitForInvisibility(loaderIcon);

		return lblOnDemand.getText();
	}

	public String verifyReportsSummaryPrevMonthClick() {
		scrollToElement(summaryPrevMonthMenu);
		waitForElementToBeClickable(summaryPrevMonthMenu);
		clickElementJS(summaryPrevMonthMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(communityMenu);
		clickElementJS(communityMenu);

		return lblSummasryPrevMonth.getText();
	}

// Use to close the Community menu 
	public void clickCommunityMenu() {
		scrollToElement(communityMenu);
		waitForElementToBeClickable(communityMenu);
		clickElementJS(communityMenu);
	}

	public boolean isCiarBooksMenuVisible() {
		return isElementVisible(By.xpath("//span[normalize-space()='CiraBooks']")); // Check if menu element is visible
	}

	public boolean isAPMenuVisible() {
		return isElementVisible(By.xpath("//span[normalize-space()='Accounts Payable']")); // Check if menu element is
																							// visible
	}

// For CiraBooks
	public String verifyCiraBooksMenusClick() {
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbWorkSpaceMenu);
		clickElementJS(cbWorkSpaceMenu);
		waitForInvisibility(loaderIcon);
		return lblCBWorkSpace.getText();
	}

// For CB - Accounts Payable

	public String verifyCBAccountsPayableMenusClick() {
		scrollToElement(cbAccountsPayable);
		waitForElementToBeClickable(cbAccountsPayable);

		clickElementJS(cbAccountsPayable);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(cbAPExpenseDetails);
		scrollToElement(cbAPExpenseDetails);
		clickElementJS(cbAPExpenseDetails);
		waitForInvisibility(loaderIcon);
		return lblCBAPExpenseDetails.getText();
	}

	public String verifyCBAPLedgerMenuClick() {
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(cbAPLedger);
		scrollToElement(cbAPLedger);
		clickElementJS(cbAPLedger);
		waitForInvisibility(loaderIcon);

		return lblCBAPLedger.getText();
	}

	public String verifyAccountsPayableMySubmittedInvoiceMenu() {
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(cbMySubmittedInvoices);
		scrollToElement(cbMySubmittedInvoices);
		clickElementJS(cbMySubmittedInvoices);
		waitForInvisibility(loaderIcon);
		return lblMySubInvoices.getText();
	}

	public String verifyCbOpenApMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbOpenAPMenu);
		scrollToElement(cbOpenAPMenu);
		clickElementJS(cbOpenAPMenu);
		waitForInvisibility(loaderIcon);
		return lblOpenAP.getText();
	}

//Search Invoices
	public String verifyCbSearchInvoicesMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbSearchInvoicesMenu);
		scrollToElement(cbSearchInvoicesMenu);
		clickElementJS(cbSearchInvoicesMenu);
		waitForInvisibility(loaderIcon);
		return lblCBSearchInvoices.getText();
	}

//Submit Invoice
	public String verifyCBSubmitInvoiceMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbSubmitInvoiceMenu);
		scrollToElement(cbSubmitInvoiceMenu);
		clickElementJS(cbSubmitInvoiceMenu);
		waitForInvisibility(loaderIcon);
		return lblCBSubmitInvoice.getText();
	}

//Submit Invoice
	public String verifyCBVendorAgingMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbVendorAgingMenu);
		scrollToElement(cbVendorAgingMenu);
		clickElementJS(cbVendorAgingMenu);
		waitForInvisibility(loaderIcon);
		return lblVendorAging.getText();
	}

// To close Accounts Payable menu
	public void clickAccountPayableMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbAccountsPayable);
		scrollToElement(cbAccountsPayable);
		clickElementJS(cbAccountsPayable);
	}

//To close Accounts Receivable menu
	public void clickARMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbAccountsReceivable);
		scrollToElement(cbAccountsReceivable);
		clickElementJS(cbAccountsReceivable);
	}

//AR LEdger
	public String verifyCBARLedgerMenuClick() {
		clickARMenuClick();
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbARLedgerMenu);
		scrollToElement(cbARLedgerMenu);
		clickElementJS(cbARLedgerMenu);
		waitForInvisibility(loaderIcon);
		return lblCBARLedger.getText();
	}

//Assessment Rules
	public String verifyCBARAssessmentRulesMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbARAssessmentRulesMenu);
		scrollToElement(cbARAssessmentRulesMenu);
		clickElementJS(cbARAssessmentRulesMenu);
		waitForInvisibility(loaderIcon);
		return lblCBARAssessmentRules.getText();
	}

//Customer Aging 
	public String verifyCBARCustomerAgingMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbARCustomerAgingMenu);
		scrollToElement(cbARCustomerAgingMenu);
		clickElementJS(cbARCustomerAgingMenu);
		waitForInvisibility(loaderIcon);
		return lblCBARCustomerAging.getText();
	}

//Customer Aging 
	public String verifyCBARDelinquencyDetailMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(cbARDeliquencyDetailMenu);
		scrollToElement(cbARDeliquencyDetailMenu);
		clickElementJS(cbARDeliquencyDetailMenu);
		waitForInvisibility(loaderIcon);
		return lblCBARDeliquencyDetail.getText();
	}

//For Common Lots menu
	public String verifyCommonLotsMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(commonLotsMenu);
		scrollToElement(commonLotsMenu);
		clickElementJS(commonLotsMenu);
		waitForInvisibility(loaderIcon);
		return lblCommonLots.getText();

	}

// To click on Vendor Management menu
	public String verifyVendorManagementMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(vendorManagementMenu);
		scrollToElement(vendorManagementMenu);
		clickElementJS(vendorManagementMenu);
		waitForInvisibility(loaderIcon);
		return lblVendorManagement.getText();
	}

// This is for clicking on Information menu to close it
	public void informationMenuClick() {
		scrollToElement(informationMenu);
		clickElementJS(informationMenu);
	}

// For Community Assetsmenu
	public String verifyCommunityAssetsMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(communityAssetsMenu);
		scrollToElement(communityAssetsMenu);
		clickElementJS(communityAssetsMenu);
		waitForInvisibility(loaderIcon);
		return lblCommunityAssets.getText();
	}

// Community Notes 
	public String verifyCommunityNotesMenuClick() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(communityNotesMenu);
		scrollToElement(communityNotesMenu);
		clickElementJS(communityNotesMenu);
		waitForInvisibility(loaderIcon);
		return lblCommunityNotes.getText();
	}

// This method is a common method used to click on the menu and then Menu gets opened and its submenu 
	public void verifyModuleClicked(WebElement elementMenu) {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(elementMenu);
		scrollToElement(elementMenu);
		clickElementJS(elementMenu);
		waitForInvisibility(loaderIcon);
	}

// This is used to select the menu and click on the menuitems

// Helper function to click on a menu item
	@SuppressWarnings("deprecation")
	public void clickCiraBooksMenuItem(String menuItem) {
		// Expand CiraBooks menu if not already expanded
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clickElementJS(ciraBooksMenu);

		if (!ciraBooksMenu.getAttribute("class").contains("expanded")) {
			ciraBooksMenu.click();
		}

		// Click on the specified menu item
		if (menuItem == "CiraBooks Workspace") {
			WebElement menuElement = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'" + menuItem + "')][1]")));
			menuElement.click();
		} else {
			WebElement menuAP = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Accounts Payable']")));
			menuAP.click();

			WebElement menuElement = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'" + menuItem + "')]")));
			menuElement.click();
		}
	}

	public String verifyFRActualVsBudgetMenu() {
		waitForInvisibility(loaderIcon);
		scrollToElement(communityMenu);
		clickElementJS(communityMenu);

		waitForElementToBeClickable(ciraBooksMenu);
		if (!ciraBooksMenu.getAttribute("class").contains("expanded")) {
			ciraBooksMenu.click();
		}

		clickElementJS(financialReportsMenu);

		waitForElementToBeVisible(actualVsBudget);
		clickElementJS(actualVsBudget);
		waitForInvisibility(loaderIcon);

		clickElementJS(breadCrumbMenu);

		return lblActualVsBudget.getText();

	}

	public String verifyFRBenchmarkReportMenu() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(benchmarkReport);
		clickElementJS(benchmarkReport);
		waitForInvisibility(loaderIcon);
		return lblBenchmarkReport.getText();
	}

	public String verifyFRFinancialSummaryMenu() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(financialSummaryMenu);

		clickElementJS(financialSummaryMenu);

		waitForInvisibility(loaderIcon);
		clickElementJS(financialReportsMenu);
		return lblFinancialSummary.getText();
	}

	public String verifyGLGeneralLedgerReportMenu() {
		waitForInvisibility(loaderIcon);
		scrollToElement(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);

		waitForElementToBeClickable(generalLedgerMenu);

		if (!generalLedgerMenu.getAttribute("class").contains("expanded")) {
			generalLedgerMenu.click();
		}

		clickElementJS(generalLedgerReportMenu);

		waitForElementToBeClickable(generalLedgerReportMenu);
		clickElementJS(generalLedgerReportMenu);

		return lblGLReport.getText();
	}

	public String verifyTrialBalanceMenu() {

		waitForInvisibility(loaderIcon);

		scrollToElement(trialBalanceMenu);
		clickElementJS(trialBalanceMenu);

		waitForElementToBeClickable(trialBalanceMenu);

		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);

		return lblTrialBalance.getText();
	}

	public String verifyMyWorkQueueCommMgmtArchiApplMenu() {

		waitForInvisibility(loaderIcon);
		scrollToElement(myWorkQueueMenu);
		clickElementJS(myWorkQueueMenu);

		waitForElementToBeClickable(communityMgmtSubMenu);

		if (!communityMgmtSubMenu.getAttribute("class").contains("expanded")) {
			clickElementJS(communityMgmtSubMenu);
		}

		waitForInvisibility(loaderIcon);
		scrollToElement(architecturalSubMenu);

		clickElementJS(architecturalSubMenu);

		return lblArchitecturalApplication.getText();
	}

	public String verifyMyWorkQueueBoardApprovalMenu() {
		waitForInvisibility(loaderIcon);
		scrollToElement(boardApprovalSubMenu);

		clickElementJS(boardApprovalSubMenu);
		return lblBoardApproval.getText();
	}

	public String verifyMyWorkQueueMaintenanceWorkOrdersMenu() {
		waitForInvisibility(loaderIcon);
		scrollToElement(maintenanceWorkOrdersSubMenu);
		clickElementJS(maintenanceWorkOrdersSubMenu);
		return lblMaintenanceWorkOrders.getText();

	}

}
