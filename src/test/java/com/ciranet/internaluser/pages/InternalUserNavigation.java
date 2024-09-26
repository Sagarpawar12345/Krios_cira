package com.ciranet.internaluser.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

//Every line of code that runs in Java must be inside a class
public class InternalUserNavigation extends BasePage
{
	public InternalUserNavigation(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects	
	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	public WebElement hamburgerMenu;

	@FindBy(xpath = "//dx-text-box[@placeholder='Search Navigation']")
	public WebElement searchNavigation;

	@FindBy(xpath = "//span[normalize-space()='My Portfolio']")
	WebElement myPortfolioMenu;

	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement accountManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Achievements']")
	WebElement achievementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement achievementsheader;

	@FindBy(xpath = "//span[normalize-space()='Cloud Drive']")
	WebElement cloudDriveMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cloudDrivesheader;

	@FindBy(xpath = "//input[@id='loginUsername']")
	WebElement cloudDriveusername;

	@FindBy(xpath = "//button[@class='btn btn-primary set-username-btn']")
	WebElement cloudDriveContinueBtn;

	@FindBy(xpath = "//input[@id='j_password']")
	WebElement cloudDrivePwd;

	@FindBy(xpath = "//button[@id='loginBtn']")
	WebElement cloudDriveLoginBtn;

	@FindBy(xpath = "//span[normalize-space()='Map of My Communities']")
	WebElement mapofMyCommunitiesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement mapofMyCommunitiesHeader;

	@FindBy(xpath = "//span[normalize-space()='My Communities']")
	WebElement myCommunitiesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myCommunitiesHeader;

	@FindBy(xpath = "//span[normalize-space()='My Tests']")
	WebElement myTestsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myTestsheader;

	@FindBy(xpath = "//span[normalize-space()='My Text']")
	WebElement myTextMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myTextMenuHeader;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Revenue Management')]")
	public WebElement revenueManagementMenu;

	@FindBy(xpath = "//span[normalize-space()='Billing Item Management']")
	public WebElement billingItemManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement billingItemManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Billing Queue Management']")
	public WebElement billingQueueManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement billingQueueManagementheader;

	@FindBy(xpath = "//span[normalize-space()='My Customer Charges']")
	public WebElement myCustomerChargesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myCustomerChargesheader;

	@FindBy(xpath = "//span[normalize-space()='** Test Plan Configuration **']")
	WebElement testPlanConfigurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement testPlanConfigurationheader;

	@FindBy(xpath = "//span[normalize-space()='** Testing Configuration **']")
	WebElement testingConfigurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement testingConfigurationheader;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense']")
	WebElement timeExpenseMenu;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense Management']")
	WebElement timeExpenseManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement timeExpenseManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense Submission']")
	WebElement timeExpenseSubmissionMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement timeExpenseSubmissionheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor Management']")
	WebElement vendorManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorManagementheader;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks']")
	WebElement ciraBooksMenu;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Workspace']")
	WebElement ciraBooksWorkspaceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement ciraBooksWorkspaceheader;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountsPayableMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountsPayableheader;

	@FindBy(xpath = "//span[normalize-space()='Accounts Receivable']")
	WebElement accountsReceivableMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement accountsReceivableheader;

	@FindBy(xpath = "//span[normalize-space()='AP Batches']")
	WebElement apBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='AP Bill Analysis']")
	WebElement apBillAnalysisMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apBillAnalysisheader;

	@FindBy(xpath = "//span[normalize-space()='AP Ledger']")
	WebElement apLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apLedgerheader;

	@FindBy(xpath = "//span[normalize-space()='AP Unapplied Payments']")
	WebElement apUnappliedPaymentsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement apUnappliedPaymentsheader;

	@FindBy(xpath = "//span[normalize-space()='Check Printing Management']")
	WebElement checkPrintingManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement checkPrintingManagementheader;

	@FindBy(xpath = "//span[normalize-space()='EFT Payment Management']")
	WebElement eftPaymentManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement eftPaymentManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Local Office Only Check Printing']")
	WebElement localOfficeOnlyCheckPrintingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement localOfficeOnlyCheckPrintingheader;

	@FindBy(xpath = "//span[normalize-space()='Manage AAP Workflow Vendor Edit']")
	WebElement manageAAPWorkflowVendorEditMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement manageAAPWorkflowVendorEditheader;

	@FindBy(xpath = "//span[normalize-space()='My Submitted Invoices']")
	WebElement mySubmittedInvoicesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement mySubmittedInvoicesheader;

	@FindBy(xpath = "//span[normalize-space()='Reimbursement Request']")
	WebElement reimbursementRequestMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement reimbursementRequestheader;

	@FindBy(xpath = "//span[normalize-space()='Search Invoices']")
	WebElement searchInvoicesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement searchInvoicesheader;

	@FindBy(xpath = "//span[normalize-space()='Submit Invoice']")
	WebElement submitInvoiceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement submitInvoiceheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor 1099']")
	WebElement vendor1099Menu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendor1099header;

	@FindBy(xpath = "//span[normalize-space()='Vendor Aging']")
	WebElement vendorAgingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorAgingheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor Missing Bills']")
	WebElement vendorMissingBillsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement vendorMissingBillsheader;

	@FindBy(xpath = "//span[normalize-space()='AR Batches']")
	WebElement arBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='AR Collections']")
	WebElement arCollectionMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arCollectionheader;

	@FindBy(xpath = "//span[normalize-space()='AR Invoice Analysis']")
	WebElement arInvoiceAnalysisMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arInvoiceAnalysisheader;

	@FindBy(xpath = "//span[normalize-space()='AR Ledger']")
	WebElement arLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arLedgereheader;

	@FindBy(xpath = "//span[normalize-space()='Add Payments']")
	WebElement addPaymentsMenu;	

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement addPaymentsheader;

	@FindBy(xpath = "//span[normalize-space()='Customer Aging']")
	WebElement customerAgingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement customerAgingheader;

	@FindBy(xpath = "//span[normalize-space()='Generate Builder Statements']")
	WebElement generateBuilderStatementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generateBuilderStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Lot Payment Allocation']")
	WebElement lotPaymentAllocationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lotPaymentAllocationheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Management']")
	WebElement cashManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cashManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Bank Accounts']")
	WebElement bankAccountsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement bankAccountsheader;

	@FindBy(xpath = "//span[normalize-space()='Bank Reconciliation']")
	WebElement bankReconciliationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement bankReconciliationheader;

	@FindBy(xpath = "//span[normalize-space()='CM Batches']")
	WebElement cmBatchesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cmBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement cashReceiptsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement cashReceiptsheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement createCashReceiptsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement createCashReceiptsheader;

	@FindBy(xpath = "//span[normalize-space()='Deposits']")
	WebElement depositsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement depositsheader;

	@FindBy(xpath = "//span[normalize-space()='Funds Transfer']")
	WebElement fundsTransferMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement fundsTransferheader;

	@FindBy(xpath = "//span[normalize-space()='Lockbox Payment File']")
	WebElement lockboxPaymentFileMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lockboxPaymentFileheader;

	@FindBy(xpath = "//span[normalize-space()='Manage Bank Statements']")
	WebElement manageBankStatementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement manageBankStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Unmatched Transactions']")
	WebElement unmatchedTransactionsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement unmatchedTransactionsheader;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Entity']")
	WebElement ciraBooksEntityMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement ciraBooksEntityheader;

	@FindBy(xpath = "//span[normalize-space()='Audit Log']")
	WebElement auditLogMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement auditLogheader;

	@FindBy(xpath = "//span[normalize-space()='Configuration']")
	WebElement configurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement configurationheader;

	@FindBy(xpath = "//span[normalize-space()='Financial Reports']")
	WebElement financialReportsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement financialReportsheader;

	@FindBy(xpath = "//span[normalize-space()='Actual vs Budget']")
	WebElement actualBudgetMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement actualBudgetheader;

	@FindBy(xpath = "//span[normalize-space()='Benchmark Report']")
	WebElement benchmarkReportMenu; 

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement benchmarkReportheader;

	@FindBy(xpath = "//span[normalize-space()='Financial Summary']")
	WebElement financialSummaryMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement financialSummaryheader;

	@FindBy(xpath = "//span[normalize-space()='General Ledger']")
	WebElement generalLedgerMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generalLedgerheader;

	@FindBy(xpath = "//span[normalize-space()='Budget']")
	WebElement budgetMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement budgetheader;

	@FindBy(xpath = "//span[normalize-space()='General Ledger Report']")
	WebElement generalLedgerReportMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement generalLedgerReportheader;

	@FindBy(xpath = "//span[normalize-space()='Journal Entries']")
	WebElement journalEntriesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement journalEntriesheader;

	@FindBy(xpath = "//div[@title='Journal Entry Templates']")
	WebElement journalEntryTemplatesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement journalEntryTemplatesheader;

	@FindBy(xpath = "//span[normalize-space()='Open / Close Books']")
	WebElement openCloseBooksMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement openCloseBooksheader;

	@FindBy(xpath = "//span[normalize-space()='Trial Balance']")
	WebElement trialBalanceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement trialBalanceheader;

	@FindBy(xpath = "//span[normalize-space()='Upload Budgets']")
	WebElement uploadBudgetsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement uploadBudgetsheader;

	@FindBy(xpath = "//span[normalize-space()='Upload JEs']")
	WebElement uploadJEsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement uploadJesHeader;

	@FindBy(xpath = "//span[normalize-space()='User Setup']")
	WebElement usetupMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement usetupheader;

	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arloadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arloadheader;

	@FindBy(xpath = "//div[@title='My Portfolio']//i[@class='fas fa-chevron-right header-icon-button-right']")
	WebElement myPortfolioClick;

	@FindBy(xpath = "//span[normalize-space()='** Report Templates **']")
	WebElement reportTemplates;

	@FindBy(xpath = "//span[normalize-space()='Owner ACH Setup']")
	WebElement achImportMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement achImportheader;

	@FindBy(xpath = "//span[normalize-space()='Portal User Management']")
	WebElement userManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement userManagementheader;

	@FindBy(xpath = "//span[normalize-space()='Corp Invoice']")
	WebElement corpInvoiceUploadToolMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement corpInvoiceUploadToolheader;

	@FindBy(xpath = "//div[@title='Lot Load']")
	WebElement lotLoadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lotLoadheader;

	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arLoadMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement arLoadheader;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-mail-bulk']")
	WebElement ciraMailIcon;

	@FindBy(xpath = "//i[@class='fas fa-bars fa-stack-1x fa-inverse']")
	WebElement logCallCreateCaseIcon;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-hand-holding-usd']")
	WebElement timeAndExpensesIcon;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement logCallCreateCaseMenuheader;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-question']")
	WebElement helpiconMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement helpiconheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement batchJobEmailsConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement closingPortalConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityAccountingConfigurationsheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement enforcementConfigurationsheader;

	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	WebElement myWorkQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Architectural Application')]")
	WebElement architecturalAplicationLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Automated Document Print ')]")
	WebElement automatedDocumentPrintLabel;
	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='Employee Management']")
	WebElement employeeManagement;

	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='Remit To Addresses']")
	WebElement remitToAddresses;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Board Approvals')]")
	public WebElement boardApprovals;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Common Lots Appraisal ')]")
	public WebElement commonLotsApprisal;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Fulfillment Queue ')]")
	public WebElement fulfillmentQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Maintenance Work Orders ')]")
	public WebElement maintenanceWorkOrderlabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Violation Review ')]")
	public WebElement violationReviewLabel;

	@FindBy(xpath = "(//i[@class='fas fa-chevron-left header-icon-button-back'])[1]")
	public WebElement communityManagementLefticon;

	@FindBy(xpath = "(//i[@class='fas fa-chevron-left header-icon-button-back'])[2]")
	public WebElement communityOnBoardingClosed;

	@FindBy(xpath = "//span[contains(text(),' Community On-Boarding ')]")
	public WebElement communityOnBoardingLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Add Community ')]")
	public WebElement addCommunity;

	@FindBy(xpath = "//h3[contains(text(),'Organization Details')]")
	public WebElement addCommunityHeader;

	@FindBy(xpath = "//span[contains(text(),' On-Boarding Checklist ')]")
	public WebElement onBoardingChecklist;

	@FindBy(xpath = "//span[contains(text(),' On-Boarding Flags ')]")
	public WebElement onBoardingFlags;

	@FindBy(xpath = "//span[contains(text(),' Schedule First Assessment ')]")
	public WebElement scheduleFirstAssessment;

	@FindBy(xpath = "//span[contains(text(),'Schedule Initial Statement ')]")
	public WebElement scheduleInitialAssessment;

	@FindBy(xpath = "//span[contains(text(), ' Disclosure Processing ')]")
	public WebElement discloserProcessingLabel;

	@FindBy(xpath = "//span[contains(text(), 'Closing Portal Location Manager ')]")
	public WebElement closingPortalLocationManager;

	@FindBy(xpath = "//span[contains(text(), ' Closing Requests ')]")
	public WebElement closingRequestLabel;

	@FindBy(xpath = "//span[contains(text(), ' Community Blocks ')]")
	public WebElement communityBlockLabel;

	@FindBy(xpath = "//span[contains(text(), 'Property Conveyances')]")
	public WebElement propertyConveyancesLabel;

	@FindBy(xpath = "//div[@title='Disclosure Processing']//div[@class='header-text']")
	public WebElement discloserProcessingLabelClose;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Internal Tasks ')]")
	public WebElement internalTask;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' My Work Inbox ')]")
	public WebElement myWorkInbox;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Payables Workflow ')]")
	public WebElement payableWorkflow;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Invoice Approval ')]")
	public WebElement invoiceApproval;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Metrics')]")
	public WebElement metrics;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Process Invoice')]")
	public WebElement processInvoice;

	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburger;

	@FindBy(xpath = "//div[@title='Process Tracker']//div[@class='header-text']")
	WebElement processTracker;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Annual Budget Preparation ')]")
	WebElement annualBudgetPreparation;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Annual Coupon Order ')]")
	WebElement annualCouponOrder;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Annual Statement Generation Process ')]")
	WebElement annualStatementGenarationProcess;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Financial Report Publishing ')]")
	WebElement financialReportPublishing;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Management Report Generation ')]")
	WebElement managementReportPublishing;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Projects / Tasks ')]")
	WebElement projectTask;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Receivables Lockbox ')]")
	WebElement receivableLockbox;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Bank Returns ')]")
	WebElement bankReturns;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Order Annual Coupons')]")
	WebElement orderAnnualCoupon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Payment Post Errors ')]")
	WebElement paymentPostError;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Statement Approvals')]")
	WebElement statementApprovel;

	@FindBy(xpath="//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement errorPopupTitle;
	@FindBy(xpath="//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement closeErrorPopupTitle;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblArchitecturalAplicationLabel1;
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblArchitecturalAplicationLabel11;
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-item-content dx-box-item-content'])[4]")
	public WebElement lblAutomatedPrintDocument;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Board Approvals ')]")
	public WebElement lblBoardApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Common Lots Appraisal ')]")
	public WebElement lblCommonLotsApprisal;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Fulfillment Queue ')]")
	public WebElement lblFulfillmentQueue;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Maintenance Work Orders ')]")
	public WebElement lblMaintenanceWorkOrder;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Open Violations Requiring Review ')]")
	public WebElement lblViolationReviewingReview;
	@FindBy(xpath = "//h3[contains(text(),'Organization Details')]")
	public WebElement addCommunitylabel;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' On-Boarding Checklist ')]")
	public WebElement lblOnBoardingChecklist;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Modify an On-Boarding Community ')]")
	public WebElement lblOnBoardingFlag;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Schedule First Assessment')]")
	public WebElement lblSceduleFirstAssessment;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Schedule Initial Statement ')]")
	public WebElement scheduleInitialAssessmentLabel;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Closing Portal Location Manager ')]")
	public WebElement lblClosingPortalLocationManager;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Closing Requests ')]")
	public WebElement lblClosingRequest;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' SOA Community Blocks Config ')]")
	public WebElement llCommunityBlocks;
	@FindBy(xpath = "//h2[contains(text(),' Property Ownership Conveyance ')]")
	public WebElement lblPropertyConveyances;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Internal Tasks')]")
	public WebElement lblInternalTask;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' My Work Inbox ')]")
	public WebElement lblMyWorkInbox;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AAP Workflow Queue ')]")
	public WebElement lblInvoiceApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AAP Workflow Metrics ')]")
	public WebElement lblMetrics;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Budget Preparation ')]")
	public WebElement lblAnnualBudgetPreparation;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Coupon Process ')]")
	public WebElement lblAnnualCouponProcess;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Annual Statement Generation Process ')]")
	public WebElement lblAnnualStatementGenerationProcess;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Financial Report Publishing ')]")
	public WebElement lblFinancialReportPublishing;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Monthly Management Report Generation ')]")
	public WebElement lblMonthlyManagementReportGeneration;	
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement lblProjectTask;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Bank Returns ')]")
	public WebElement lblBankReturns;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Order Annual Coupons ')]")
	public WebElement lblOrderAnnualCoupon;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Payment Post Errors ')]")
	public WebElement lblPaymentPostError;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Statement Approvals ')]")
	public WebElement lblStatementApproval;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AP Batches ')]")
	public WebElement lblAPBatches;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' AP Bill Analysis ')]")
	public WebElement lblAPBillAnalysis;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'AP Ledger')]")
	public WebElement lblAPLedger;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Check Printing Management For Management Companies ')]")
	public WebElement lblCCBCheckPrintingManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' EFT Payment Management ')]")
	public WebElement lblCCBEFTPaymentManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' New AP Bill ')]")
	public WebElement lblCCBNewAPBills;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Select Bills to Pay ')]")
	public WebElement lblCCBSelectBillstoPay;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Vendor 1099 ')]")
	public WebElement lblCCBVendor1099;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Vendor Aging')]")
	public WebElement lblCCBVendorAging;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Vendor Management ')]")
	public WebElement lblCCBVendorManagement;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Work Queue Management')]")
	public WebElement lblCCBWorkQueueManagement;
	@FindBy(xpath = "//h2[@class='page-header flex-center-aligned-row']")
	public WebElement lblARBatches;
	@FindBy(xpath = "//h2[contains(text(),' AR Invoice Analysis ')]")
	public WebElement lblARInvoiceAnalysis;
	@FindBy(xpath = "//h2[contains(text(),' AR Ledger ')]")
	public WebElement lblARLedger;
	@FindBy(xpath = "//h2[contains(text(),' Customer Aging ')]")
	public WebElement lblCustomerAging;
	@FindBy(xpath = "//h2[contains(text(),' Customer Management ')]")
	public WebElement llcCustomerManagement;
	@FindBy(xpath = "//h2[contains(text(),' New AR Adjustment ')]")
	public WebElement lblNewARAdjustment;
	@FindBy(xpath = "//h2[contains(text(),' New AR Invoice ')]")
	public WebElement lblNewARInvoice;
	@FindBy(xpath = "//h2[contains(text(),' New AR Payment ')]")
	public WebElement lblNewARPAyment;
	@FindBy(xpath = "//h2[contains(text(),' Bank Accounts ')]")
	public WebElement lblBankAccount;
	@FindBy(xpath = "//h2[contains(text(),' CM Batches ')]")
	public WebElement lblCMBatches;
	@FindBy(xpath = "//h2[contains(text(),' Cash Receipts ')]")
	public WebElement lblCashReceipts;
	@FindBy(xpath = "//h2[contains(text(),' Deposits ')]")
	public WebElement lblDeposits;
	@FindBy(xpath = "//h2[contains(text(),' Bank Reconciliation ')]")
	public WebElement lblReconcileBankAccount;
	@FindBy(xpath = "//h2[contains(text(),' Audit Log ')]")
	public WebElement lblAuditLog;
	@FindBy(xpath = "//h2[contains(text(),' Configuration for Management Companies ')]")
	public WebElement lblConfiguration;
	@FindBy(xpath = "//h2[contains(text(),' Budgets ')]")
	public WebElement lblBudget;
	@FindBy(xpath = "//h2[@class='page-header flex-center-aligned-row']")
	public WebElement lblGeneralLedgerReport;
	@FindBy(xpath = "//h2[contains(text(),' Journal Entries ')]")
	public WebElement lblGeneralEntries;
	@FindBy(xpath = "//h2[contains(text(),' Journal Entry Template ')]")
	public WebElement lblJournalEntryTemplate;
	@FindBy(xpath = "//h2[contains(text(),' Open - Close Books ')]")
	public WebElement lblOpenCloseBook;
	@FindBy(xpath = "//h2[contains(text(),' Trial Balance ')]")
	public WebElement lblTrialBalance;
	@FindBy(xpath = "//h2[contains(text(),' Upload Budgets ')]")
	public WebElement lblUploadBudgets;
	@FindBy(xpath = "//h2[contains(text(),' Upload JE ')]")
	public WebElement lblUploadJE;
	@FindBy(xpath = "//h2[contains(text(),' Reports ')]")
	public WebElement lblReports;
	@FindBy(xpath = "//h2[contains(text(),' Billing Item Management ')]")
	public WebElement lblBillingItemManagement;
	@FindBy(xpath = "//h2[contains(text(),' Billing Queue Management ')]")
	public WebElement lblBillingQueueManagement;
	@FindBy(xpath = "//h2[contains(text(),' Customer Contracts ')]")
	public WebElement lblCustomerContracts;
	@FindBy(xpath = "//h2[contains(text(),' Billing Item Category Setup ')]")
	public WebElement lblRevenueBillingItemCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Billing Rules Setup ')]")
	public WebElement lblRevenueBillingRulesSetup;
	@FindBy(xpath = "//h2[contains(text(),' Contract Form Setup ')]")
	public WebElement lblRevenueContractFormSetup;
	@FindBy(xpath = "//h2[contains(text(),' Customer Category Setup ')]")
	public WebElement lblRevenueCustomerCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Product Category Setup ')]")
	public WebElement lblRevenueProductCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Products Setup ')]")
	public WebElement lblRenenueProductsSetup;
	@FindBy(xpath = "//h2[contains(text(),' Subscriptions Setup ')]")
	public WebElement lblRevenueSubscriptionsSetup;
	@FindBy(xpath = "//h2[contains(text(),' Payroll Reimbursements ')]")
	public WebElement lblPayrollReibursements;
	@FindBy(xpath = "//h2[contains(text(),' Charge Code Category Setup ')]")
	public WebElement lblChargeCodeCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),' Charge Code Setup ')]")
	public WebElement lblChargeCodeSetUp;
	@FindBy(xpath = "//h2[contains(text(),' Charge Rate Category Setup ')]")
	public WebElement lblChargeRateCategorySetup;
	@FindBy(xpath = "//h2[contains(text(),'Charge Rate Setup')]")
	public WebElement lblChargeRatesSetUp;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Customer Defined Info - RealManage')]")
	public WebElement lblModuleConfigurations;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Egnyte Configuration - Global')]")
	public WebElement lblEgnyteConfiguration;
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Help - Global')]")
	public WebElement lblHelp;
	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),' Search ')]")
	public WebElement lblAdvancedSearch;
	@FindBy(xpath = "//h2[contains(text(),' Directory ')]")
	public WebElement lblUserDirectory;
	@FindBy(xpath = "//h2[contains(text(),'Contact Us')]")
	public WebElement lblContactUs;
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' CiraBooks Corporate ')]")
	WebElement corporateCiraBook;

	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountPayable;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Batches')]")
	WebElement ccbAPBatches;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Bill Analysis')]")
	WebElement ccbAPBillAnalysis;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AP Ledger')]")
	WebElement ccbAPLedger;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Check Printing Management')]")
	WebElement ccbCheckPrintingManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'EFT Payment Management')]")
	WebElement ccbEFTPaymentManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'New AP Bill')]")
	WebElement ccbNewAPBill;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Select Bills to Pay')]")
	WebElement ccbSelectBillstiPay;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Vendor 1099')]")
	WebElement ccbVendor1099;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Vendor Aging')]")
	WebElement ccbVendorAging;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Vendor Management')]")
	WebElement ccbVendorManagement;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Work Queue Management')]")
	WebElement ccbWorkQueueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Accounts Receivable ')]")
	WebElement accountReceivable;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AR Batches')]")
	WebElement ccbARBatches;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'AR Invoice Analysis')]")
	WebElement ccbARInvoiceAnalysis;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'AR Ledger')]")
	WebElement ccbARLedger;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Customer Aging')]")
	WebElement ccbCustomerAging;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'Customer Management')]")
	WebElement ccbCustomerManagement;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Adjustment')]")
	WebElement ccbNewARAdjustment;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Invoice')]")
	WebElement ccbNewARInvoice;

	@FindBy(xpath = "//div[@class='tree-item-template']//span[contains(text(),'New AR Payment')]")
	WebElement ccbNewARPayment;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Cash Management ')]")
	WebElement cashManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Bank Accounts')]")
	WebElement ccbBankAccount;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'CM Batches')]")
	WebElement ccbCMBatches;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Cash Receipts')]")
	WebElement ccbCashReceipts;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Deposits')]")
	WebElement ccbDeposits;

	@FindBy(xpath = "//div[@class='dx-item dx-treeview-item']//span[contains(text(),'Reconcile Bank Account')]")
	WebElement ccbReconcileBankAccount;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Entity ')]")
	WebElement entity;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Audit Log ')]")
	WebElement ccbAuditLog;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Configuration')]")
	WebElement ccbConfiguration;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'General Ledger')]")
	WebElement genaralLedger;

	@FindBy(xpath = "(//div[@class='header-text']//span[contains(text(),'Budget')])[1]")
	WebElement ccbBudget;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Journal Entries')]")
	WebElement ccbGeneralLedgerReport;

	@FindBy(xpath = "//div[@class='selected-header-text']//span[contains(text(),'Journal Entries')]")
	WebElement ccbJournalEntries;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Journal Entry Template')]")
	WebElement ccbGenaralEntryTemplate;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Open/Close Books')]")
	WebElement ccbOpenCloseBook;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Trial Balance')]")
	WebElement ccbTrialBalance;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Upload Budgets')]")
	WebElement ccbUploadBudgets;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Upload JEs')]")
	WebElement ccbUploadJE;

	@FindBy(xpath = "(//div[@class='header-text']//span[contains(text(),'Reports')])[1]")
	WebElement ccbReports;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Revenue Management ')]")
	WebElement ccbRevenueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Item Management ')]")
	WebElement ccbBillingItemManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Queue Management ')]")
	WebElement ccbBillingQueueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Customer Contracts ')]")
	WebElement ccbCustomerContracts;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Setup ')]")
	WebElement ccbRevenumManagementSetup;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Item Categories ')]")
	WebElement ccbRevenueBillingItemCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Rules ')]")
	WebElement ccbRevenueBillingRules;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Contract Forms ')]")
	WebElement ccbRevenueCotractForms;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Customer Categories ')]")
	WebElement ccbRevenueCustomerCategories;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Product Categories ')]")
	WebElement ccbRevenueProductCategories;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Products ')]")
	WebElement ccbRevenueProducts;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Subscriptions ')]")
	WebElement ccbRevenueSubscriptions;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Time & Expense Management ')]")
	WebElement ccbTimeExpenseManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Payroll Reimbursement')]")
	WebElement ccbPayrollReimbeursement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Setup ')]")
	WebElement ccbTimeExpenseManagementsetup;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Code Categories ')]")
	WebElement ccbChargeCodeCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Codes ')]")
	WebElement ccbChargeCodes;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Rate Categories ')]")
	WebElement ccbChargeRateCategory;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Charge Rates ')]")
	WebElement ccbChargeRates;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Configurations ')]")
	WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Modules')]")
	WebElement modules;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Customer Defined Info')]")
	WebElement customerDefinedInfo;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement customerDefinedInfoContext;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement customerDefinedInfoContextvalue;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Egnyte Configuration')]")
	WebElement egnyteConfiguration;

	@FindBy(xpath = "//div[@class='dx-item dx-menu-item']//span[contains(text(),'Help')]")
	WebElement help;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement advancedSearch;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[2]")
	WebElement userDirectory;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[3]")
	WebElement contactUs;

	@FindBy(xpath = "(//div[@class='button-container']//div[@class='dx-template-wrapper dx-button-content'])[4]")
	WebElement calendar;
	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
	WebElement processInvoiceErrorMessage;
	@FindBy(xpath = "//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement processInvoiceCloseButton;
	
	@FindBy(xpath="//h2[@class='page-header']")
	WebElement pageHeaderLabel;
	

	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	// method declaration
	public String checkAllModulesLinkPageLanding()  
	{
		waitForInvisibility(loaderIcon);
		clickElement(myPortfolioMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(accountManagementMenu);
		clickElementJS(accountManagementMenu);

		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String AchievementsPageLanding() 
	{
		scrollToElement(achievementsMenu);

		waitForElementToBeClickable(achievementsMenu);
		clickElementJS(achievementsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public boolean CloudDrivePageLanding() 
	{
		if(isElementDisplayed(cloudDriveMenu)) {
		waitForElementToBeClickable(cloudDriveMenu);
		clickElementJS(cloudDriveMenu);
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList parentTab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) parentTab.get(0));
		return true;
		}
		else {
			return false;
		}
	}
	public String MapofMyCommunitiesPageLanding() 
	{
		scrollToElement(mapofMyCommunitiesMenu);
		waitForElementToBeClickable(mapofMyCommunitiesMenu);
		clickElementJS(mapofMyCommunitiesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String myCommunitiesPageLanding() throws AWTException 
	{
		scrollToElement(myCommunitiesMenu);
		waitForElementToBeClickable(myCommunitiesMenu);
		clickElementJS(myCommunitiesMenu);
		waitForInvisibility(loaderIcon);

		//Caling Esc key function
		pressEscapeKey();
		return pageHeaderLabel.getText();
	}

	public boolean myTestsPageLanding()  
	{
		waitForInvisibility(loaderIcon);
		if(isElementDisplayed(myTestsMenu))
		{
		waitForElementToBeClickable(myTestsMenu);
		scrollToElement(myTestsMenu);
		clickElementJS(myTestsMenu);
		waitForInvisibility(loaderIcon);
		ArrayList parentTab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) parentTab.get(0));
		scrollToElement(myTestsMenu);
		return true;		
		}
		else {
			
			return false;
		}		
	
	}

	public boolean myTextPageLanding() 
	{ 
		if(isElementDisplayed(myTextMenu)) {
		scrollToElement(myTextMenu);
		waitForElementToBeClickable(myTextMenu);
		clickElementJS(myTextMenu);
		waitForInvisibility(loaderIcon);

		ArrayList parentTab = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) parentTab.get(0));		
		return true;		
		}
		else {
			
			return false;
		}		
}

	public boolean navigateToRevenueManagement() 
	{
		waitForInvisibility(loaderIcon);
		if(isElementEnabled(revenueManagementMenu)) {
		scrollToElement(revenueManagementMenu);
		
		clickElement(revenueManagementMenu);
		waitForInvisibility(loaderIcon);
		return false;
		}
		else {
			return true;
		}
	}

	public String billingItemManagementPageLanding() 
	{
		
		waitForInvisibility(loaderIcon);
		scrollToElement(revenueManagementMenu);
		clickElement(revenueManagementMenu);
		waitForElementToBeClickable(billingItemManagementMenu);
		clickElementJS(billingItemManagementMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String billingQueueManagementPageLanding() 
	{   
		waitForInvisibility(loaderIcon);
		scrollToElement(billingQueueManagementMenu);
		waitForElementToBeClickable(billingQueueManagementMenu);
		clickElementJS(billingQueueManagementMenu);
		waitForInvisibility(loaderIcon);
		
		clickElementJS(corporateCiraBook);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String myCustomerChargesPageLanding() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(myPortfolioMenu);
		clickElementJS(myPortfolioMenu);
		scrollToElement(revenueManagementMenu);
		clickElementJS(myCustomerChargesMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(revenueManagementMenu);
		waitForElementToBeClickable(revenueManagementMenu);
		return pageHeaderLabel.getText();
	}

	public String testPlanConfigurationPageLanding() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myPortfolioMenu);
		clickElementJS(revenueManagementMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(testPlanConfigurationMenu);	
		clickElementJS(testPlanConfigurationMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String testingConfigurationPageLanding() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(testingConfigurationMenu);
	
		clickElementJS(testingConfigurationMenu);
		waitForInvisibility(loaderIcon);
		hamburgerMenu.click();
		return pageHeaderLabel.getText();
	}

	public String timeExpenseManagementPageLanding()  
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(timeExpenseMenu);
	
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(timeExpenseManagementMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String timeandExpenseSubmissionPageLanding()  
	{
		clickElementJS(timeExpenseSubmissionMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(timeExpenseMenu);
	
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String vendorManagementPageLanding()  
	{
		scrollToElement(vendorManagementMenu);
	
		clickElementJS(vendorManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(myPortfolioMenu);
		
		clickElementJS(myPortfolioMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	//My Work Queue Pages

	public String architecturalApplication() {
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		waitForInvisibility(loaderIcon);
		clickElementJS(communityManagementLabel);
		waitForInvisibility(loaderIcon);
	
		clickElement(architecturalAplicationLabel);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String automatedDocumentPrint() {
		waitForInvisibility(loaderIcon);
		clickElementJS(automatedDocumentPrintLabel);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String boardApprovals() {
		waitForInvisibility(loaderIcon);
		clickElementJS(boardApprovals);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String commonLotsApprisal() {
		waitForInvisibility(loaderIcon);
		clickElementJS(commonLotsApprisal);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String fullfillmentQueue() {
		waitForInvisibility(loaderIcon);
		clickElementJS(fulfillmentQueue);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String maintenanceWorkOrder() {
		waitForInvisibility(loaderIcon);
		clickElementJS(maintenanceWorkOrderlabel);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String violationReview() {
		waitForInvisibility(loaderIcon);
		clickElementJS(violationReviewLabel);
		waitForInvisibility(loaderIcon);
		
		clickElementJS(communityManagementLabel);
		return pageHeaderLabel.getText();
	}

	public String addCommunity() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communityOnBoardingLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Community On-Boarding Label is clicked");
		clickElementJS(addCommunity);
		waitForInvisibility(loaderIcon);
	
		return addCommunitylabel.getText();
	}

	public String onBoardCheckList() {
		waitForInvisibility(loaderIcon);
		scrollToElement(onBoardingChecklist);
		clickElement(onBoardingChecklist);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String onBoardingFlag() {
		waitForInvisibility(loaderIcon);
		clickElementJS(onBoardingFlags);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String scheduleFirstAssessment() {
		waitForInvisibility(loaderIcon);
		scrollToElement(scheduleFirstAssessment);
		clickElement(scheduleFirstAssessment);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String scheduleInitialAssessment() {
		waitForInvisibility(loaderIcon);
		scrollToElement(scheduleInitialAssessment);
		clickElement(scheduleInitialAssessment);
		waitForInvisibility(loaderIcon);
		
		clickElementJS(communityOnBoardingLabel);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String closingPortalLocationManager() {
		waitForInvisibility(loaderIcon);
		clickElementJS(discloserProcessingLabel);
		waitForInvisibility(loaderIcon);
	
		clickElementJS(closingPortalLocationManager);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String closingRequests() {
		waitForInvisibility(loaderIcon);
		clickElementJS(closingRequestLabel);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String communityBlocks() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communityBlockLabel);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String propertyConveyances() {
		waitForInvisibility(loaderIcon);
		clickElementJS(propertyConveyancesLabel);
		waitForInvisibility(loaderIcon);
		System.out.println("Property Conveyances Label is clicked");
		clickElementJS(discloserProcessingLabel);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String discloserProcessingClose() {
		waitForInvisibility(loaderIcon);
		clickElementJS(discloserProcessingLabelClose);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String internalTask() {
		waitForInvisibility(loaderIcon);
		clickElementJS(internalTask);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String myWorkInbox() {
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkInbox);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String invoiceApproval() {
		waitForInvisibility(loaderIcon);
		clickElementJS(payableWorkflow);
	
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceApproval);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String metrics() {
		waitForInvisibility(loaderIcon);
		clickElementJS(metrics);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
		
	}

	public void processInvoice() {
		waitForInvisibility(loaderIcon);
		if(isElementDisplayed(processInvoice))
		{
			clickElementJS(processInvoice);	
			
		
		}
		if(isElementDisplayed(errorPopupTitle)) {
			clickElement(closeErrorPopupTitle);

		}
	
		waitForInvisibility(loaderIcon);
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
	
		clickElementJS(payableWorkflow);
		waitForInvisibility(loaderIcon);
	}

	public String annualBudgetPreparation() {
		waitForInvisibility(loaderIcon);
		scrollToElement(processTracker);
		clickElement(processTracker);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(annualBudgetPreparation);
		waitForInvisibility(loaderIcon);
		
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String annualCouponOrder() {
		waitForInvisibility(loaderIcon);
		scrollToElement(annualCouponOrder);
		clickElementJS(annualCouponOrder);
		waitForInvisibility(loaderIcon);
	
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String annualStatementGenerationProcess() {
		waitForInvisibility(loaderIcon);
		scrollToElement(annualStatementGenarationProcess);
		clickElementJS(annualStatementGenarationProcess);
		waitForInvisibility(loaderIcon);
	
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	
	}

	public String financialReportPublishing() {
		waitForInvisibility(loaderIcon);
		scrollToElement(financialReportPublishing);
		clickElement(financialReportPublishing);
		waitForInvisibility(loaderIcon);
	
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String managementReportPublishing() {
		waitForInvisibility(loaderIcon);
		scrollToElement(managementReportPublishing);
		clickElement(managementReportPublishing);
		waitForInvisibility(loaderIcon);
	
		clickElement(hamburgerMenu);
		waitForInvisibility(loaderIcon);
	
		clickElement(processTracker);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public String projectTask() {
		waitForInvisibility(loaderIcon);
		scrollToElement(projectTask);
		waitForInvisibility(loaderIcon);
	
		return pageHeaderLabel.getText();
	}

	public String bankReturns() {
		waitForInvisibility(loaderIcon);
		scrollToElement(receivableLockbox);
		clickElement(receivableLockbox);
		waitForInvisibility(loaderIcon);
	
		scrollToElement(bankReturns);
		clickElement(bankReturns);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String orderAnnualCoupon() {
		waitForInvisibility(loaderIcon);
		scrollToElement(orderAnnualCoupon);
		clickElement(orderAnnualCoupon);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}

	public void paymentPostError() {
		waitForInvisibility(loaderIcon);
		scrollToElement(paymentPostError);
		clickElement(paymentPostError);
		waitForInvisibility(loaderIcon);
		
	}

	public String statementApproval() {
		waitForInvisibility(loaderIcon);
		scrollToElement(statementApprovel);
		clickElement(statementApprovel);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(receivableLockbox);
		waitForInvisibility(loaderIcon);
		
		return pageHeaderLabel.getText();
	}




	public String ciraBooksModule()  
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(ciraBooksWorkspaceMenu);
		waitForElementToBeClickable(ciraBooksWorkspaceMenu);
		clickElementJS(ciraBooksWorkspaceMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String accountsPayablePageLanding()  
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(apBatchesMenu);
		waitForElementToBeClickable(apBatchesMenu);
		clickElementJS(apBatchesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}
	
	public String apBillAnalysisPageLanding()  
	{

		scrollToElement(apBillAnalysisMenu);
		waitForElementToBeClickable(apBillAnalysisMenu);
		clickElementJS(apBillAnalysisMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String apLedgerPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String apUnappliedPaymentsPageLanding() 
	{

		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(apUnappliedPaymentsMenu);
		waitForElementToBeClickable(apUnappliedPaymentsMenu);
		clickElementJS(apUnappliedPaymentsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String checkPrintingManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(checkPrintingManagementMenu);
		waitForElementToBeClickable(checkPrintingManagementMenu);
		clickElementJS(checkPrintingManagementMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String eftPaymentManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(eftPaymentManagementMenu);
		waitForElementToBeClickable(eftPaymentManagementMenu);
		clickElementJS(eftPaymentManagementMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String localOfficeOnlyCheckPrintingPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String manageAAPWorkflowVendorEditLanding() 
	{	
		scrollToElement(manageAAPWorkflowVendorEditMenu);
		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String mySubmittedInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(mySubmittedInvoicesMenu);
		clickElementJS(mySubmittedInvoicesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String reimbursementRequestPageLanding() 
	{	
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(reimbursementRequestMenu);
		waitForElementToBeClickable(reimbursementRequestMenu);
		clickElementJS(reimbursementRequestMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String searchInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String submitInvoicePageLanding() 
	{	
		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String vendor1099PageLanding() 
	{
		scrollToElement(vendor1099Menu);
		waitForElementToBeClickable(vendor1099Menu);
		clickElementJS(vendor1099Menu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String vendorAgingPageLanding() 
	{
		scrollToElement(vendorAgingMenu);
		waitForElementToBeClickable(vendorAgingMenu);
		clickElementJS(vendorAgingMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String vendorMissingBillsPageLanding() 
	{
		scrollToElement(vendorMissingBillsMenu);
		waitForElementToBeClickable(vendorMissingBillsMenu);
		clickElementJS(vendorMissingBillsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String accountsReceivablePageLanding() 
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(arBatchesMenu);
		waitForElementToBeClickable(arBatchesMenu);
		clickElementJS(arBatchesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String arCollectionPageLanding()  
	{
		scrollToElement(arCollectionMenu);
		waitForElementToBeClickable(arCollectionMenu);
		clickElementJS(arCollectionMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String arInvoiceAnalysisPageLanding()
	{
		scrollToElement(arInvoiceAnalysisMenu);
		waitForElementToBeClickable(arInvoiceAnalysisMenu);
		clickElementJS(arInvoiceAnalysisMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String arLedgerPageLanding()
	{
		scrollToElement(arLedgerMenu);
		waitForElementToBeClickable(arLedgerMenu);
		clickElementJS(arLedgerMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String addPaymentsPageLanding()
	{
		scrollToElement(addPaymentsMenu);
		waitForElementToBeClickable(addPaymentsMenu);
		clickElementJS(addPaymentsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String customerAgingPageLanding()
	{
		scrollToElement(customerAgingMenu);
		waitForElementToBeClickable(customerAgingMenu);
		clickElementJS(customerAgingMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String generateBuilderStatementsPageLanding()
	{
		scrollToElement(generateBuilderStatementsMenu);
		waitForElementToBeClickable(generateBuilderStatementsMenu);
		clickElementJS(generateBuilderStatementsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String lotPaymentAllocationPageLanding()
	{
		scrollToElement(lotPaymentAllocationMenu);
		waitForElementToBeClickable(lotPaymentAllocationMenu);
		clickElementJS(lotPaymentAllocationMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	//=============================== Cash Management page code starts here ===========================
	public String cashManagementPageLanding() 
	{
		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(bankAccountsMenu);
		waitForElementToBeClickable(bankAccountsMenu);
		clickElementJS(bankAccountsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String bankReconciliationPageLanding() 
	{
		scrollToElement(bankReconciliationMenu);
		waitForElementToBeClickable(bankReconciliationMenu);
		clickElementJS(bankReconciliationMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String cmBatchesPageLanding() 
	{	
		scrollToElement(cmBatchesMenu);
		waitForElementToBeClickable(cmBatchesMenu);
		clickElementJS(cmBatchesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String cashReceiptsPageLanding() 
	{
		scrollToElement(cashReceiptsMenu);
		waitForElementToBeClickable(cashReceiptsMenu);
		clickElementJS(cashReceiptsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String createCashReceiptsPageLanding() 
	{	
		scrollToElement(createCashReceiptsMenu);
		waitForElementToBeClickable(createCashReceiptsMenu);
		clickElementJS(createCashReceiptsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String depositsPageLanding() 
	{
		scrollToElement(depositsMenu);
		waitForElementToBeClickable(depositsMenu);
		clickElementJS(depositsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String fundsTransferPageLanding() 
	{
		scrollToElement(fundsTransferMenu);
		waitForElementToBeClickable(fundsTransferMenu);
		clickElementJS(fundsTransferMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String lockboxPaymentFilePageLanding() 
	{	
		scrollToElement(lockboxPaymentFileMenu);
		waitForElementToBeClickable(lockboxPaymentFileMenu);
		clickElementJS(lockboxPaymentFileMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String manageBankStatementsPageLanding() 
	{
		scrollToElement(manageBankStatementsMenu);
		waitForElementToBeClickable(manageBankStatementsMenu);
		clickElementJS(manageBankStatementsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String unmatchedTransactionsPageLanding() 
	{	
		scrollToElement(unmatchedTransactionsMenu);
		waitForElementToBeClickable(unmatchedTransactionsMenu);
		clickElementJS(unmatchedTransactionsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	//=============================== CiraBooks Entity page code starts here ===========================
	public String ciraBooksEntityPageLanding() 
	{	
		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(auditLogMenu);
		waitForElementToBeClickable(auditLogMenu);
		clickElementJS(auditLogMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String configurationPageLanding() 
	{
		scrollToElement(configurationMenu);
		waitForElementToBeClickable(configurationMenu);
		clickElementJS(configurationMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String financialReportsPageLanding()  
	{
		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(actualBudgetMenu);
		waitForElementToBeClickable(actualBudgetMenu);
		clickElementJS(actualBudgetMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String benchmarkReportPageLanding() 
	{
		scrollToElement(benchmarkReportMenu);
		waitForElementToBeClickable(benchmarkReportMenu);
		clickElementJS(benchmarkReportMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String financialSummaryPageLanding() 
	{
		scrollToElement(financialSummaryMenu);
		waitForElementToBeClickable(financialSummaryMenu);
		clickElementJS(financialSummaryMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	//=============================== General Ledger page code starts here ===========================
	public String generalLedgerPageLanding()
	{
		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(budgetMenu);
		waitForElementToBeClickable(budgetMenu);
		clickElementJS(budgetMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String generalLedgerReportPageLanding()
	{
		scrollToElement(generalLedgerReportMenu);
		waitForElementToBeClickable(generalLedgerReportMenu);
		clickElementJS(generalLedgerReportMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String journalEntriesPageLanding()
	{	
		scrollToElement(journalEntriesMenu);
		waitForElementToBeClickable(journalEntriesMenu);
		clickElementJS(journalEntriesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String journalEntryTemplatesPageLanding()
	{	
		scrollToElement(journalEntryTemplatesMenu);
		waitForElementToBeClickable(journalEntryTemplatesMenu);
		clickElementJS(journalEntryTemplatesMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String openCloseBooksPageLanding()
	{
		scrollToElement(openCloseBooksMenu);
		waitForElementToBeClickable(openCloseBooksMenu);
		clickElementJS(openCloseBooksMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String trialBalancePageLanding()
	{
		scrollToElement(trialBalanceMenu);
		waitForElementToBeClickable(trialBalanceMenu);
		clickElementJS(trialBalanceMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String uploadBudgetsPageLanding()
	{	
		scrollToElement(uploadBudgetsMenu);
		waitForElementToBeClickable(uploadBudgetsMenu);
		clickElementJS(uploadBudgetsMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String uploadJesPageLanding() 
	{

		scrollToElement(uploadJEsMenu);
		waitForElementToBeClickable(uploadJEsMenu);
		clickElementJS(uploadJEsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}


	//Corporate Cirabook Pages
	public void corporateCirabook() {

		waitForInvisibility(loaderIcon);
		scrollToElement(corporateCiraBook);
		waitForElementToBeClickable(corporateCiraBook);
		clickElementJS(corporateCiraBook);
		waitForInvisibility(loaderIcon);

		System.out.println("Corporate CiraBook Label is clicked");

	}

	public String apBatches() {

		waitForInvisibility(loaderIcon);
		scrollToElement(accountPayable);
		clickElement(accountPayable);
		System.out.println("Account Receivalble Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPBatches);
		waitForInvisibility(loaderIcon);
		System.out.println("AP Batches Label is clicked and page open successfully");
		return pageHeaderLabel.getText();

	}

	public String apBillAnalysis() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPBillAnalysis);
		System.out.println("AP Bill Analysis Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String apLedger() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAPLedger);
		System.out.println("AP Ledger Label is clicked and page open successfully");
		return pageHeaderLabel.getText();

	}

	public String ccbCheckPrintingManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCheckPrintingManagement);
		System.out.println("CCBCheck Printing Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElement(hamburger);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbEFTPaymentManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbEFTPaymentManagement);
		System.out.println("EFT Payment Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbNewAPBill() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewAPBill);
		System.out.println("New AP Bill Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String selectBillstoPay() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbSelectBillstiPay);
		waitForInvisibility(loaderIcon);
		System.out.println("Select Bills to PAy Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbVendor1099() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendor1099);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor 1099 Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbVendorAging() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendorAging);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor Aging Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbVendorManagement() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbVendorManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("Vendor Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbVendorWorkQueueManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbWorkQueueManagement);
		System.out.println("Work Queue Management Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(accountPayable);
		System.out.println("Account Payable label is closed");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbARBatches() {
		waitForInvisibility(loaderIcon);
		scrollToElement(accountReceivable);
		clickElement(accountReceivable);
		System.out.println("Account Receivalble Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARBatches);
		System.out.println("CCB AP Batches Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbARInvoiceAnalysis() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARInvoiceAnalysis);
		System.out.println("CCB AR Invoice Analysis Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbARLedger() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbARLedger);
		System.out.println("CCB AR Ledger Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbCustomerAging() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerAging);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Customer Aging Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbCustomerManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerManagement);
		System.out.println("CCB Customer MAnagement Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbNewARAdjustment() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARAdjustment);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB New AR Adjustment Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbNewARInvoice() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARInvoice);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB New AR Invoice Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbNewARPayment() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbNewARPayment);
		System.out.println("CCB New AR Payment Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(accountReceivable);
		System.out.println("Account Receivalble label is closed");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbBankAccounts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(cashManagement);
		System.out.println("Cash Managemnet Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBankAccount);
		System.out.println("CCB Bank Account Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbCMBatches() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCMBatches);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB CM Batches Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbCashReceipts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCashReceipts);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB CM Receipts Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbDeposits() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbDeposits);
		waitForInvisibility(loaderIcon);
		System.out.println("CCB Deposits Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbReconcileBankAccount() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbReconcileBankAccount);
		System.out.println("CCB Reconcile Bank Account Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(cashManagement);
		System.out.println("Cash Management label is closed");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbAuditLog() {
		waitForInvisibility(loaderIcon);
		clickElementJS(entity);
		System.out.println("Entity Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbAuditLog);
		System.out.println("CCB Audit Log Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbConfiguration() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbConfiguration);
		System.out.println("CCB Configuration Label is clicked and page open successfully");
		waitForInvisibility(loaderIcon);
		clickElement(hamburgerMenu);
		System.out.println("Hamburger Menu is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		clickElementJS(entity);
		System.out.println("Entity label is closed");
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbBudget() {
		waitForInvisibility(loaderIcon);
		clickElementJS(genaralLedger);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBudget);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbGeneralLedgerReports() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbGeneralLedgerReport);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbJournalEntries() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbJournalEntries);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbJournalEntryTemplate() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbGenaralEntryTemplate);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbOpenCloseBook() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbOpenCloseBook);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbTrialBalance() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTrialBalance);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbUploadBudgets() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbUploadBudgets);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbUploadJE() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbUploadJE);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(genaralLedger);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbReports() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbReports);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbBillingItemManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueManagement);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBillingItemManagement);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbBillingQueueManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbBillingQueueManagement);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbCuctomerContracts() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbCustomerContracts);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbSetupBillingItemCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenumManagementSetup);
		System.out.println("CCB Revenue Management Setup Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueBillingItemCategory);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbBillingRules() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueBillingRules);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbContractForms() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueCotractForms);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbCustomerCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueCustomerCategories);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbProductCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueProductCategories);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbProduct() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueProducts);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbSubscription() {

		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueSubscriptions);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbRevenueManagement);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbTimeExpenseManagement() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagement);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbPayrollReimbeursement);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String ccbChargeCodeCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagementsetup);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeCodeCategory);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbChargeCodes() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeCodes);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbChargeRateCategory() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeRateCategory);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String ccbChargeRates() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbChargeRates);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(ccbTimeExpenseManagement);
		waitForInvisibility(loaderIcon);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();

	}

	public String moduleClicked() 
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}
	
	//Footer Tool bar
	public void advancedSearch() {
		waitForInvisibility(loaderIcon);
		clickElement(advancedSearch);
		
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public String userDirectory() {
		waitForInvisibility(loaderIcon);
		clickElement(userDirectory);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public String contactUs() {
		waitForInvisibility(loaderIcon);
		clickElement(contactUs);
		
		waitForInvisibility(loaderIcon);
		return pageHeaderLabel.getText();
	}

	public void calendar() {
		waitForInvisibility(loaderIcon);
		clickElement(calendar);
		System.out.println("Calendar icon is clicked and page loaded successfully");
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));

	}

	public void ciramailMenu() 
	{
		ciraMailIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void logcallCreateCaseIconClick() 
	{
		logCallCreateCaseIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void timeAndExpenseManagementIconClick() 
	{
		timeAndExpensesIcon.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

	public void helpIcon() 
	{
		helpiconMenu.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList browserTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) browserTabs.get(0));
	}

}
