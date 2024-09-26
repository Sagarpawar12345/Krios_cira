package com.ciranet.myworkqueue.disclosureprocessing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ClosingRequestsPage extends BasePage 
{
		public ClosingRequestsPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Fulfill')])[1]")
	public WebElement fulfillButton;

	@FindBy(xpath = "(//div[@class='dx-switch-on'])[3]")
	public WebElement compactOn;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement closeButton;

	@FindBy(xpath = "//dx-switch[@aria-label='ON']//div[@class='dx-switch-handle']")
	public WebElement compactOff;

	@FindBy(xpath = "//div[@class='cc-wizard-horizontal-content dx-template-wrapper dx-item-content dx-box-item-content']")
	public WebElement wizard;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[1]")
	public WebElement actionButton;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[2]")	
	public WebElement transferTo;
	
	@FindBy(xpath="//div[@class='menu-text'][normalize-space()='Collections']")
	public WebElement collection;

	@FindBy(xpath="//div[contains(text(),'Processing')]")
	public WebElement processing;

	@FindBy(xpath="//div[@class='menu-text'][normalize-space()='Transition']")
	public WebElement transition;

	@FindBy(xpath = " (//div[@ng-reflect-klass='menu-text'])[4]")
	public WebElement assignProperty;

	@FindBy(xpath = "(//div[@class='dx-texteditor-input-container'])[43]")
	public WebElement communityDropDown;

	@FindBy(xpath = "(//div//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	public WebElement communityDropdownValue;

	@FindBy(xpath="(//input[@role='textbox'])[25]")
	public WebElement searchText;

	@FindBy(xpath = "(//i[@class='dx-icon dx-icon-search'])[2]")
	public WebElement searchButtonProperty;

	@FindBy(xpath = "(//div[@class='dx-checkbox-container'])[2]")
	public WebElement checkBox;

	@FindBy(xpath = "//dx-button[@title='Cancel']//div[@class='dx-button-content']")
	public WebElement cancelButton;

	@FindBy(xpath="//div[contains(text(),'Cancel Request')]")
	public WebElement cancelRequest;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
	public WebElement cancelReason;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[contains(text(),'Search')]")
	public WebElement searchTab;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Open Requests (Auto fulfill)']")
	public WebElement openRequestTab;

	@FindBy(xpath="(//input[@autocomplete='off' and @role='textbox'])[2]")
	public WebElement propertyAddress;

	@FindBy(xpath="(//input[@autocomplete='off'])[6]")
	public WebElement toDate;

	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@type='text'])[4]")
	public WebElement fromDate;

	@FindBy(xpath="//a[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text dx-calendar-caption-button']")
	public WebElement currentYear;

	@FindBy(xpath="//i[@class='dx-icon dx-icon-chevronleft']")
	public WebElement lastYear;

	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement month;

	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement date;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-search']")
	public WebElement searchButton;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[1]")
	public WebElement actionCheck;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-text-content-alignment-right'])[1]")
	public WebElement rush;

	@FindBy(xpath="(//div//span[@class='dx-header-filter dx-header-filter-empty'])[9]")
	public WebElement requestType;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[6]")
	public WebElement community;

	@FindBy(xpath="(//div[@class='dx-column-indicators'])[10]")
	public WebElement location;
	
	@FindBy(xpath="//div[@role='presentation']//div[contains(text(),'Location')]")
	public WebElement labelLocation;

	@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text'])[1]")
	public WebElement locationOk;

	@FindBy(xpath="(//i[@class='cc-1-5x fas fa-envelope'])[1]")
	public WebElement emailLabel;
	
	@FindBy(xpath="//i[@class='dx-icon cc-icon fas fa-search']")
	public WebElement searchIcon;

	@FindBy(xpath="//input[@aria-label='Search in the data grid']")
	public WebElement searchField;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container']//span[@class='dx-icon dx-icon-clear'])[2]")
	public WebElement clearSearch;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[7]")
	public WebElement propertyReasonLabel;

	@FindBy(xpath="(//div[@class='dx-template-wrapper'])[2]")
	public WebElement communityvalue;
	
	@FindBy(xpath="//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	public WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	public WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	public WebElement communityColumn;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-columnchooser fa-stack-2x']")
	public WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement columnChooserClose;
	
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	public WebElement myWorkQueue;
    
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Disclosure Processing')]")
	public WebElement discloserProcessing;
	
	@FindBy(xpath="//span[normalize-space()='Closing Requests']")
	public WebElement closingRequest;
	
	@FindBy(xpath="dx-loadindicator-icon")
	public WebElement loaderIcon;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@type='text'])[15]")
	public WebElement managementCompanySearchFilter;
	
	@FindBy(xpath="//h2[contains(text(),'Closing Requests')]")
	public WebElement llbClosingRequest;
	
	@FindBy (css=".dx-cell-focus-disabled[aria-describedby='dx-col-577']")
	public WebElement llbCollections;
	
	@FindBy(xpath="(//td[@aria-describedby='dx-col-517'])[4]")
	WebElement collectionsValue;
	
	@FindBy(xpath="//td[normalize-space()='Transition']")
	public WebElement transitionValue;
	
	@FindBy(xpath="//div[contains(text(),'Resale/SOA Change Request Property')]")
	public WebElement assignPropertyPopupTitle;
	
	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement cancelButtonCancelRequest;
	
	@FindBy(xpath="//span[contains(text(),'Cancel Reason:')]")
	public WebElement labelCancelReason;
	
	@FindBy(xpath="//div//span[contains(text(),'Property Address:')]")
	public WebElement labelPropertyAddress;

	public String closingRequestsMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		clickElementJS(discloserProcessing);
		waitForInvisibility(loaderIcon);
		scrollToElement(closingRequest);
		clickElement(closingRequest);
		waitForInvisibility(loaderIcon);
		return llbClosingRequest.getText();
}

	public boolean toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(fullScreenIcon);
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(normalScreenIcon)) {
		clickElementJS(normalScreenIcon);
		waitForInvisibility(loaderIcon);
		return true;
		} else {
				return false;
		}
	}
	
	public boolean searchButton()
	{
		waitForInvisibility(loaderIcon);
		if(isElementEnabled(searchIcon)) {
			waitForInvisibility(loaderIcon);		
			clickElement(searchIcon);
			waitForInvisibility(loaderIcon);				
			System.out.println("Search button clicked");
			return true;
		}

		else {
			return false;
		}
	}
	
	
	public String verifyActionTransfertoCollections()

	{
		waitForInvisibility(loaderIcon);
		scrollToElement(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		scrollToElement(transferTo);
		clickElement(transferTo);
		waitForInvisibility(loaderIcon);
		clickElementJS(processing);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		scrollToElement(transferTo);
		clickElement(transferTo);
		waitForInvisibility(loaderIcon);		
		clickElementJS(collection);
		waitForInvisibility(loaderIcon);
		return collectionsValue.getText();
	}
	
	public String verifyActionTransfertoTransition()
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		scrollToElement(transferTo);
		clickElement(transferTo);
		waitForInvisibility(loaderIcon);
		
		clickElementJS(processing);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		scrollToElement(transferTo);
		clickElement(transferTo);
		waitForInvisibility(loaderIcon);
		
		clickElementJS(transition);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		return transitionValue.getText();
		
		}
	
		
	public String verifyActionAssignProperty()
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(actionButton);
		clickElement(actionButton);
		clickElementJS(assignProperty);
		waitForInvisibility(loaderIcon);
		String propertyPopupTitle = assignPropertyPopupTitle.getText();
		waitForInvisibility(loaderIcon);
	    clickElement(communityDropDown);
	    waitForInvisibility(loaderIcon);
		clickElementJS(communityDropdownValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(searchText);
		waitForInvisibility(loaderIcon);
		enterText(searchText, "1100 Trinity Mills");
		waitForInvisibility(loaderIcon);
		clickElement(searchButtonProperty);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(cancelButton);
		waitForInvisibility(loaderIcon);
		return propertyPopupTitle;
	
	}
	public String actionCancelRequest() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(actionButton);
		clickElement(actionButton);	
		scrollToElement(cancelRequest);
		clickElement(cancelRequest);
		waitForInvisibility(loaderIcon);
		String cancelReasonLabel = labelCancelReason.getText();
		clickElement(cancelButtonCancelRequest);
		waitForInvisibility(loaderIcon);
		return cancelReasonLabel;
		
			}

	public boolean switchingTabs() 
	{
		waitForInvisibility(loaderIcon);
		if(isElementEnabled(openRequestTab)) {
			clickElement(openRequestTab);
			return true;
			
		}
		
		else {
			return false;
		}
		
	}
	
	public String requestTypeFilter() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(rush);
		waitForInvisibility(loaderIcon);
		clickElementJS(community);
		waitForInvisibility(loaderIcon);
		clickElementJS(requestType);
		waitForInvisibility(loaderIcon);
	    clickElementJS(location);
	    waitForInvisibility(loaderIcon);
		clickElementJS(locationOk);
		waitForInvisibility(loaderIcon);
		return labelLocation.getText();
}
	
	public String searchTab() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(searchTab);
		clickElementJS(searchTab);
		waitForInvisibility(loaderIcon);
		clickElementJS(propertyAddress);
		waitForInvisibility(loaderIcon);
		propertyAddress.sendKeys("1100");
        clickElementJS(fromDate);
        waitForInvisibility(loaderIcon);
		fromDate.clear();
		waitForInvisibility(loaderIcon);
		fromDate.sendKeys("09/01/2019");
		waitForInvisibility(loaderIcon);
		clickElementJS(searchButton);
		waitForInvisibility(loaderIcon);
		return labelPropertyAddress.getText();
		
		
	}

	
}