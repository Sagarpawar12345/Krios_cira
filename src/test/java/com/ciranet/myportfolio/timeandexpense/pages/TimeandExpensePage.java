package com.ciranet.myportfolio.timeandexpense.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class TimeandExpensePage extends BasePage{

	public TimeandExpensePage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	public WebElement entityDropdown;	

	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content'])[2]")
	public WebElement generalExpense;	

	@FindBy(xpath = "//div//span[normalize-space()='Mileage Expense']")
	public WebElement mileageExpense;

	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Refresh']")
	WebElement refreshButton;
	
	@FindBy(xpath = "//dx-box[@direction='row']//div[@class='dx-template-wrapper dx-item-content dx-toolbar-item-content']")
	public WebElement newTimeEntry;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[11]")
	public WebElement customerDrop;

	@FindBy(xpath="(//td[@aria-describedby='dx-col-16'])[2]")
	WebElement columnCustomerDropDown;

	@FindBy(xpath = "(//td[@aria-describedby='dx-col-16'])[2]")
	public WebElement customerValue;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[9]")
	public WebElement chargeCode;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[58]")
	public WebElement mileageChargeCode;

	@FindBy(xpath = "(//td[@aria-describedby='dx-col-16'])[2]")
	public WebElement chargeCodeValue;

    @FindBy(xpath="//div[@class='dx-button-content']//span[contains(text(),'Save')]")
    WebElement saveTime;
    
	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Save')])[2]")
	public WebElement saveMyPlaces;

	@FindBy(xpath = "(//div[@class='menu-text'])[3]")
	public WebElement mileageExpensebutton;

	@FindBy(xpath = "(//div[@class=\"dx-button-content\"]//span[@class='dx-button-text'])[2]")
	public WebElement myPlaces;

	@FindBy(xpath = "(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[35]")
	public WebElement actionMyplaces;

	@FindBy(xpath = "(//i[@class=\"dx-icon fas fa-times\"])[2]")
	public WebElement closeButton;

	@FindBy(xpath = "(//i[@class=\"dx-icon fas fa-times\"])[1]")
	public WebElement myPlacescloseButton;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-upload']")
	public WebElement submitForApproval;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Cancel']")
	public WebElement cancel;

	@FindBy(xpath= "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon'])[2]")
	public WebElement submit;

	@FindBy(xpath = "(//div[@class='dx-checkbox-container'])[2]")
	public WebElement submitForApprovalcheckbox;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[5]")
	public WebElement entityCustomerDropdown;

	@FindBy(xpath = "//td[normalize-space()='1100 Trinity Mills Condominium Owners Association']")
	public WebElement entityCustomerDropdownvalue;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	public WebElement chargeCodeValueButton;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense']")
	WebElement timeExpenseMenu;

	@FindBy(xpath = "//span[normalize-space()='Time & Expense Management']")
	WebElement timeExpenseManagementMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	public WebElement labelTimeandExpense;

	@FindBy(xpath="//span[normalize-space()='My Portfolio']")
	WebElement myPortfolioClick;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath="(//div[@class='dx-widget dx-checkbox dx-select-checkbox dx-datagrid-checkbox-size'])[1]")
	WebElement selectAllCheckBox;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Submit']")
	WebElement submitMileage;
	
	@FindBy(xpath="//div[@class='dx-template-wrapper dx-popup-title dx-has-close-button']")
    WebElement errorMessage;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Close']")
	WebElement closeErrorMessage;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Add New Place']")
	WebElement addNewPlace;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@type='text'])[12]")
	WebElement placeName;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@type='text'])[13]")
	WebElement placeAddress;
	
	@FindBy(xpath="//dx-button[@title='Close']//span[@class='dx-button-text'][normalize-space()='Close']")
	WebElement closeMyNewPace;
	
	@FindBy(xpath="//div[contains(text(),'Add New My Place')]")
	public WebElement labelMyPlace;
	
	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='New Expense Entry']")
	WebElement newExpenseEntryButton;

	public String timeandExpensePageLanding() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myPortfolioClick);		
		waitForInvisibility(loaderIcon);
		scrollToElement(timeExpenseMenu);
		clickElement(timeExpenseMenu);
		waitForInvisibility(loaderIcon);	
		scrollToElement(timeExpenseManagementMenu);
		clickElementJS(timeExpenseManagementMenu);
		waitForInvisibility(loaderIcon);				
		return labelTimeandExpense.getText();
	}

	public String newTimeEntrySaveButton()
	{
		waitForInvisibility(loaderIcon);
		clickElement(entityCustomerDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(entityCustomerDropdownvalue);
		waitForInvisibility(loaderIcon);
		clickElement(refreshButton);
		clickElement(newTimeEntry);
		waitForInvisibility(loaderIcon);
		clickElement(chargeCode);
		waitForInvisibility(loaderIcon);
		clickElement(chargeCodeValueButton);
		waitForInvisibility(loaderIcon);
		clickElement(saveTime);
		waitForInvisibility(loaderIcon);
		if(isElementDisplayed(errorMessage)) {
			clickElement(closeErrorMessage);
		}
		waitForInvisibility(loaderIcon);
		return labelTimeandExpense.getText();		
	}

	public boolean tabSwitching()
	{
		waitForInvisibility(loaderIcon);
		if(isElementDisplayed(generalExpense)) {
			clickElement(generalExpense);
		}
		
		waitForInvisibility(loaderIcon);
		return true;
	}
	public String submitForApprovalCancelButton() {
		waitForInvisibility(loaderIcon);
		clickElement(newExpenseEntryButton);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElement(chargeCode);
		waitForInvisibility(loaderIcon);
		clickElement(chargeCodeValueButton);
		waitForInvisibility(loaderIcon);
		clickElement(saveTime);
		if(isElementDisplayed(errorMessage)) {
			clickElement(closeErrorMessage);
		}
	
		waitForInvisibility(loaderIcon);
		clickElementJS(submitForApproval);
		waitForInvisibility(loaderIcon);
		clickElement(cancel);
		waitForInvisibility(loaderIcon);
		return labelTimeandExpense.getText();
	}
	
	public String submitMileageExpenses() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(mileageExpense);
		waitForInvisibility(loaderIcon);
		clickElement(submitForApproval);
		waitForInvisibility(loaderIcon);
		clickElement(selectAllCheckBox);
		waitForInvisibility(loaderIcon);
		clickElement(submitMileage);
		return labelTimeandExpense.getText();
	}
	
	public String myPlaces()
	{	
		waitForInvisibility(loaderIcon);
		clickElement(myPlaces);
		waitForInvisibility(loaderIcon); 
	    clickElementJS(addNewPlace);
		waitForInvisibility(loaderIcon);
		String myPlace=labelMyPlace.getText();
		clickElement(placeName);
		waitForInvisibility(loaderIcon);
		placeName.sendKeys("Testing");
		waitForInvisibility(loaderIcon);
		clickElement(placeAddress);
		waitForInvisibility(loaderIcon);
		placeAddress.sendKeys("Dallas");
		clickElement(saveMyPlaces);
		waitForInvisibility(loaderIcon);
		clickElement(closeMyNewPace);
		 return myPlace;
		
		
	}
}
