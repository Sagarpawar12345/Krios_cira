package com.ciranet.myworkqueue.communitymanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class MaintenanceWorkOrdersPage extends BasePage
{
	public MaintenanceWorkOrdersPage(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;
	
	@FindBy(xpath = "//div[@title='Community Management']//div[@class='header-text']")
	WebElement communityManagementMenu;

	@FindBy(xpath = "//span[normalize-space()='Maintenance Work Orders']")
	WebElement workOrdersMenu;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooserButton;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooserButton;
	
	@FindBy(xpath = "//div[contains(text(),'Column Chooser')]")
	WebElement columnChooserLabel;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayoutButton;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy (xpath = "//span[normalize-space()='Closed Work Orders']")
	public WebElement closedWorkOrderTab;

	@FindBy (xpath = "//span[normalize-space()='Open Work Orders']")
	public WebElement openWorkOrderTab;

	@FindBy (xpath="(//input[@role='spinbutton'])[1]")
	public WebElement daysText;

	@FindBy (xpath = "//span[@class='dx-button-text']")
	public WebElement refreshButton;

	@FindBy (xpath = "//td[normalize-space()='Community: Plantation Oaks (Count = 1)']")
	public WebElement daysValidRecord;

	@FindBy (xpath = "(//span[@class='dx-button-text'][contains(.,'Action')])[1]")
	WebElement actionButton;

	@FindBy (xpath = "//span[normalize-space()='Manage Work Authorization']")
	WebElement manageWorkAuthorization;

	@FindBy(xpath = "//div[contains(text(),'Manage Task References')]")
	public WebElement manageTaskRef;

	@FindBy (xpath="//dx-button[@aria-label=\"Save\"]")
	public WebElement saveButton;

	@FindBy (xpath="//dx-button[@aria-label=\"Close\"]")
	public WebElement closeButton;

	@FindBy(xpath="//span[normalize-space()='Manage Proposals']")
	public WebElement manageProposal;

	@FindBy(xpath="//span[text()='Close']")
	public WebElement closePopUp;

	@FindBy(xpath="//div[text()=' View/Edit ']")
	public WebElement viewEdit;

	@FindBy(xpath="//span[text()='Save & Close']")
	public WebElement saveClosePopUp;

	@FindBy(xpath = "//dx-button[@type='success']//span[@class='dx-button-text'][normalize-space()='Close']")
	public WebElement saveClosePopUpError;

	@FindBy(xpath ="//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement responsibleIDDD;

	@FindBy(xpath ="//div[@class=\"dx-datagrid-content\"]//td[contains(text(),'Abhay Ranade')]")
	public WebElement responsibleIDValue;

	@FindBy(xpath="//span[text()='Close']")
	public WebElement popupClose;

	@FindBy(xpath="//span[text()='Save']")
	public WebElement popupSave;

	@FindBy (xpath ="//div[@class=\"button-multiple-icon-container\"]")
	public WebElement addWorkOrderButton;

	@FindBy (xpath ="//i[@class=\"dx-icon fas fa-times\"]")
	public WebElement addWorkOrderCloseButton;

	@FindBy (xpath ="//dx-drop-down-box[@class='dx-show-invalid-badge dx-dropdownbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-widget drop-down-box dx-texteditor-empty dx-dropdowneditor dx-state-hover']//div[@class='dx-dropdowneditor-icon']")
	public WebElement addWorkCommDrop;

	@FindBy (xpath = "(//input[@autocomplete='off'])[33]")
	public WebElement jobType;

	@FindBy (xpath = "(//div[@role='option'])[1]")
	public WebElement jobTypeValue;

	@FindBy (xpath="//div[@class='dx-datagrid-content']//td[normalize-space()='1100 Trinity Mills Condos']")
	public WebElement dropDownValue;

	@FindBy (xpath="(//input[@autocomplete=\"off\"])[35]")
	public WebElement referenceTypeText;

	@FindBy (xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[9]")
	public WebElement referenceTypeDrop;

	@FindBy (xpath="//div[contains(text(),'Property')]")
	public WebElement referenceTypeDropValue;

	@FindBy (xpath="(//div[@class='dx-field-item-content dx-field-item-content-location-bottom'])[16]")
	public WebElement reference;

	@FindBy (xpath="//i[@class=\"dx-icon dx-icon-more\"]")
	public WebElement referenceDrp;

	@FindBy (xpath="(//dx-button[@text=\"Select\"])[2]")
	public WebElement select;

	@FindBy(xpath="//span[text()='Save & Close']")
	public WebElement saveandCloseButton;

	@FindBy (xpath="//div[text()='Adding the work order.']")
	public WebElement closeButtons;

	@FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement closePop;

	@FindBy(xpath="//span[text()='Save']") 
	public WebElement save;

	@FindBy(xpath="(//span[text()='Close'])[1]")
	public WebElement close;

	@FindBy(xpath="//div[contains(text(),'Change Status')]")
	public WebElement changeStatus;

	@FindBy(xpath="//div[contains(text(),'Initial Request')]")
	public WebElement initialReq;

	@FindBy(xpath = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment4']")
	public WebElement loaderSeg4;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;

	public void workOrdersPageLanding() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(myWorkQueueMenu);
		clickElement(myWorkQueueMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(communityManagementMenu);
		clickElementJS(communityManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(workOrdersMenu);
		clickElementJS(workOrdersMenu);
	}

	public String columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(columnChooserButton);
		String colchooserTitle = columnChooserLabel.getText();
		waitForElementToBeClickable(closeColChooserButton);
		clickElement(closeColChooserButton);
		waitForInvisibility(loaderIcon);
		return colchooserTitle;
	}


	public boolean expandOptionClick() 
	{
		clickElementJS(expandIcon);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean collapseOptionClick() 
	{
		clickElementJS(collapseIcon);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(normalScreenIcon))
		{
			clickElementJS(normalScreenIcon);
			waitForInvisibility(loaderIcon);
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public boolean switchTab() 
	{
		clickElementJS(closedWorkOrderTab);
		waitForInvisibility(loaderIcon);

		if (closedWorkOrderTab.isEnabled()==true) 
		{
			System.out.println("Closed work order : True");
		}
		else
		{
			System.out.println("Closed work order : False");
		}

		clickElementJS(openWorkOrderTab);
		waitForInvisibility(loaderIcon);

		if (openWorkOrderTab.isEnabled()==true) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean closedDaysTextbox()
	{
		clickElementJS(closedWorkOrderTab);
		waitForInvisibility(loaderIcon);

		if (closedWorkOrderTab.isEnabled()) 
		{
			daysText.clear();
			daysText.sendKeys("300");
			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);

			clickElement(expandIcon);
			waitForInvisibility(loaderIcon);

			clickElement(collapseIcon);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean verifyManageWorkAuthorization() 
	{
		waitForInvisibility(loaderIcon);
		// calling function
		viewedit();
		waitForInvisibility(loaderIcon);

		clickElement(manageWorkAuthorization);
		waitForInvisibility(loaderIcon);
		String manageWorkAuthPopup = driver.getWindowHandle();
		driver.switchTo().window(manageWorkAuthPopup);

		if (isElementDisplayed(closeButton)) 
		{
			clickElement(closeButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean manageTaskReferences()
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(manageTaskRef);
		waitForInvisibility(loaderIcon);
		clickElement(popupSave);
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(manageTaskRef);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(closeButton)) 
		{
			clickElement(closeButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean manageProposal() 
	{
		waitForInvisibility(loaderIcon);
		//Calling function
		viewedit();
		clickElement(manageProposal);
		waitForInvisibility(loaderIcon);
		String managePropPopup = driver.getWindowHandle();
		driver.switchTo().window(managePropPopup);

		if (isElementDisplayed(closeButton)) 
		{
			clickElement(closeButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void addWork() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(addWorkOrderButton);
		waitForInvisibility(loaderIcon);
		clickElement(addWorkCommDrop);
		waitForInvisibility(loaderIcon);
		clickElement(dropDownValue);
		waitForInvisibility(loaderIcon);
		clickElement(jobTypeValue);
		waitForInvisibility(loaderIcon);
		clickElement(referenceTypeText);
		waitForInvisibility(loaderIcon);
		clickElement(referenceTypeDropValue);
		waitForInvisibility(loaderIcon);
		clickElement(referenceDrp);
		waitForInvisibility(loaderIcon);
		clickElement(select);
		waitForInvisibility(loaderIcon);
	}

	public boolean addNewWorkOrderClick()
	{
		if (isElementDisplayed(saveandCloseButton)) 
		{
			waitForInvisibility(loaderIcon);
			//calling function
			addWork();
			clickElement(saveandCloseButton);
			waitForInvisibility(loaderIcon);
			return false;
		}
		else 
		{
			return true;
		}
	}

	public boolean viewEditWorkOrder()
	{   		
		waitForInvisibility(loaderIcon);
		clickElementJS(expandIcon);
		viewedit();
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(saveClosePopUp)) 
		{
			clickElement(saveClosePopUp);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean closeAddWorkOrder()
	{
		clickElementJS(openWorkOrderTab);
		waitForInvisibility(loaderIcon);
		clickElementJS(addWorkOrderButton);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(close)) 
		{
			clickElement(close);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean viewEditCloseWorkOrderClick()
	{
		if (isElementDisplayed(collapseIcon)) 
		{
			waitForInvisibility(loaderIcon);
			viewedit();
			clickElement(popupClose);
			waitForInvisibility(loaderIcon);
			return false;

		}
		else 
		{
			return true;
		}
	}

	private void viewedit() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);
		clickElementJS(viewEdit);
		waitForInvisibility(loaderIcon);
	}

	public boolean viewEditSaveWorkOrderClick()
	{
		waitForInvisibility(loaderIcon);
		viewedit();
		clickElement(popupSave);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(popupClose)) 
		{
			clickElement(popupClose);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void changeStatus() 
	{
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		Actions action = new Actions(driver);
		action.moveToElement(changeStatus).build().perform();
		action.moveToElement(initialReq).click().perform();
		waitForInvisibility(loaderIcon);
	}
}