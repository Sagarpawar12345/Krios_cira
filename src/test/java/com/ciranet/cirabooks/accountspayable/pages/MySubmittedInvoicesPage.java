package com.ciranet.cirabooks.accountspayable.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class MySubmittedInvoicesPage extends BasePage{
	public MySubmittedInvoicesPage(WebDriver driver) {
		super(driver);
	}
   
	@FindBy(xpath="//div[@class='header-text']//span[normalize-space()='CiraBooks']")
	WebElement ciraBookMenu;
	
	@FindBy(xpath="//div[@class='header-text']//span[normalize-space()='Accounts Payable']")
	WebElement accountPayableMenu;
	
	@FindBy(xpath = "//span[normalize-space()='My Submitted Invoices']")
	WebElement mySubmittedInvoicesMenu;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath="//h2[@class='page-header']")
	WebElement mySubmittedInvoicesPageTitle;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[@class='dx-button-text']")
	WebElement submitInvoiceButton;
	
	@FindBy(xpath="//div[contains(text(),'AP Payment Request')]")
	WebElement apPaymentRequestLabel;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[6]")
	WebElement communityDropdown;
	
	@FindBy(xpath="//div[@class='community-cell-template dx-template-wrapper']//span[contains(text(),'1100 Trinity Mills Condos')]")
	WebElement communityDropdownValue;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[7]")
	WebElement handlingDropdown;
	
	@FindBy(xpath="//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Standard']")
	WebElement handlindDropdownValue;
	
	@FindBy(xpath="//textarea[@role='textbox']")
	WebElement notesTextBox;
    
	@FindBy(xpath="//div[@class='dx-radiobutton-icon dx-radiobutton-icon-checked']")
	WebElement invoiceRadioButton;
	
	@FindBy(xpath="//div[@class='dx-radiobutton-icon']")
	WebElement generatedRadioButton;
	
	@FindBy(xpath="(//input[@role='spinbutton'])[3]")
	WebElement totalAmountTextBox;
	
	@FindBy(xpath="//div[@aria-label='fas fa-ellipsis-h']//i[@class='dx-icon fas fa-ellipsis-h']")
	WebElement payeeIcon;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//span[contains(text(),'Select')])[2]")
	WebElement selectPayeeValue;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Details']")
	WebElement vendorAccountDetailsIcon;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Add New Vendor Account']")
	WebElement addVendorAccountButton;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@class='dx-texteditor-input'])[36]")
	WebElement vendorAccountNumber;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@class='dx-texteditor-input'])[37]")
	WebElement vendorAccountDescription;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveVendorAccountButton;
	
	@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//span[@class='dx-button-text'][normalize-space()='Close'])[2]")
	WebElement vendorAccountInformationCloseButton;
	
	@FindBy(xpath="(//input[@role='combobox'])[9]")
	WebElement dueDateField;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Submit For Data Processing']")
	WebElement submitForDataProcessingButton;
	
	@FindBy(xpath="(//div[@class='dx-widget dx-button-mode-contained dx-button-normal dx-dropdowneditor-button'])[10]")
	WebElement vendorAccountDropdownIcon;
	
	@FindBy(xpath="//tr[@class='dx-row dx-data-row dx-column-lines dx-row-focused']")
	WebElement vendorAccountDropdownValue;
	
	@FindBy(xpath="//div[@class='dx-first-col dx-last-row dx-field-item dx-col-0 dx-field-item-optional dx-flex-layout dx-label-v-align']//div[@class='row-container']")
	WebElement printAsTextBox;
	
	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-today dx-calendar-contoured-date']")
	WebElement calendarDate;
	
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-retweet']")
	WebElement resetButton;
	
	@FindBy(xpath="//i[@title='Vendor Activities']")
	WebElement vendorActivityIcon;
	
	@FindBy(xpath="(//i[@class='dx-icon fas fa-times'])[2]")
	WebElement closeVendorActivityButton;
	
	@FindBy(xpath="//div[contains(text(),'Vendor History')]")
	WebElement vendorHistoryTitle;
	
	@FindBy(xpath="//i[@title='Board Approval']")
	WebElement boardApprovalIcon;
	
	@FindBy(xpath="//div[contains(text(),'Approval Requirements')]")
	WebElement boardApprovalTitle;
	
	@FindBy(xpath="(//div[@class='icon-container half-width'])[1]")
	WebElement notesIcon;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-container']//textarea[@role='textbox'])[3]")
	WebElement notesTextArea;
	
	@FindBy(xpath="(//div[@class='dx-toolbar-items-container'])[13]")
	WebElement notesTitle;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//span[contains(text(),'Close')])[1]")
	WebElement apPaymentRequestCloseButton;
	
	@FindBy(xpath="(//div[@data-dx_placeholder='Select GL Account...'])[1]")
	WebElement glAccountDropdown;
	
	@FindBy(xpath="//td[@class='dx-cell-focus-disabled'][normalize-space()='Accounts Receivable']")
	WebElement glAccountDropdownValue;
	
	@FindBy(xpath="//div[@class=\"dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable\"]")
	WebElement apPaymentRequestPopup;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Browse']")
	WebElement browseButton;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//span[contains(text(),'Close')])[2]")
	WebElement closeSuccessfullySubmittedButton;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//span[contains(text(),'Close')])[1]")
	WebElement closeApPAymentRequestButton;
	
	@FindBy(xpath="//i[@class='dx-icon fas fa-2x fa-times']")
	WebElement closeBoardApprovel;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveNotesButton;
	
	public String mySubmittedInvoicesMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(ciraBookMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(accountPayableMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(mySubmittedInvoicesMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(mySubmittedInvoicesMenu);
		waitForInvisibility(loaderIcon);
		
		return mySubmittedInvoicesPageTitle.getText();
	}
    
	public String addSubmitedInvoice() throws AWTException
	{
		waitForInvisibility(loaderIcon);
		clickElement(submitInvoiceButton);
		String labelApPaymentRequest=apPaymentRequestLabel.getText();
		clickElement(communityDropdown);
		clickElementJS(communityDropdownValue);
		clickElement(handlingDropdown);
		clickElementJS(handlindDropdownValue);
		clickElement(notesTextBox);
		notesTextBox.sendKeys("Notes for invoice");
		Robot robot = new Robot();
		clickElement(invoiceRadioButton);
		waitForInvisibility(loaderIcon);
		clickElement(browseButton);
		StringSelection s = new StringSelection(System.getProperty("user.dir") +
				"\\src\\test\\java\\com\\ciranet\\testdata\\mySubmittedInvoices.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// pressing ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		waitForInvisibility(loaderIcon);
		
		robot.keyPress(KeyEvent.VK_V);
		waitForInvisibility(loaderIcon);
		
		// releasing ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		waitForInvisibility(loaderIcon);
		
		robot.keyRelease(KeyEvent.VK_V);
		waitForInvisibility(loaderIcon);
		
		// pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		waitForInvisibility(loaderIcon);

		// releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitForInvisibility(loaderIcon);
        clickElementJS(submitForDataProcessingButton);
        waitForInvisibility(loaderIcon);
        clickElement(closeSuccessfullySubmittedButton);
     	return labelApPaymentRequest;		
	}
	
	public String reset() 
	{
		waitForInvisibility(loaderIcon);		
		waitForInvisibility(loaderIcon);
		String labelApPaymentRequest=apPaymentRequestLabel.getText();
		clickElement(communityDropdown);		
		clickElementJS(communityDropdownValue);		
		clickElement(handlingDropdown);		
		clickElementJS(handlindDropdownValue);		
		clickElement(resetButton);
		return labelApPaymentRequest;		
	}
	
	public String vendorActivity() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(communityDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(communityDropdownValue);
		waitForInvisibility(loaderIcon);
		clickElement(handlingDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(handlindDropdownValue);
		waitForInvisibility(loaderIcon);
		clickElement(notesTextBox);
		notesTextBox.sendKeys("Notes for invoice");
		waitForInvisibility(loaderIcon);	
		clickElement(generatedRadioButton);
		waitForInvisibility(loaderIcon);
		scrollToElement(totalAmountTextBox);
        clickElement(totalAmountTextBox);
        totalAmountTextBox.sendKeys("1");	
        waitForInvisibility(loaderIcon);
        scrollToElement(payeeIcon);
        waitForInvisibility(loaderIcon);
        clickElement(payeeIcon);
        waitForInvisibility(loaderIcon);
        clickElement(selectPayeeValue);
        waitForInvisibility(loaderIcon);
        clickElement(vendorActivityIcon);
        waitForInvisibility(loaderIcon);
        String titleVendorHistory=vendorHistoryTitle.getText();
        clickElement(closeVendorActivityButton);
        waitForInvisibility(loaderIcon);
        return titleVendorHistory;      
	}
	
	public String boardApproval() 
	{
		 waitForInvisibility(loaderIcon);
		 clickElement(boardApprovalIcon);
	     waitForInvisibility(loaderIcon);
	     String titleBoardApproval=boardApprovalTitle.getText();
	     clickElement(closeBoardApprovel);
	     waitForInvisibility(loaderIcon);
	     return titleBoardApproval;       
	}
	
	public String addNotes() 
	{
		 waitForInvisibility(loaderIcon);
		 clickElement(notesIcon);
	     waitForInvisibility(loaderIcon);
	     String titleNotes=notesTitle.getText();
	     clickElement(notesTextArea);
	     notesTextArea.sendKeys("Test Notes");
	     clickElement(saveNotesButton);
	     waitForInvisibility(loaderIcon);
	     clickElement(apPaymentRequestCloseButton);
	     waitForInvisibility(loaderIcon);
	     return titleNotes;
	}
}
