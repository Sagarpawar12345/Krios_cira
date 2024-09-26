package com.ciranet.myworkqueue.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ProjectsTasksPage extends BasePage{

	public ProjectsTasksPage(WebDriver driver) 
	{
		super(driver);
	}

	// Initialising of object
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//span[normalize-space()='Projects / Tasks']")
	WebElement projectTaskmenu;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	WebElement ownersearchBox;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement toolbarMenu;

	@FindBy(xpath = "//ul[contains(@class,'dx-treeview-node-container dx-treeview-node-container-opened')]//li//div//span[contains(text(),'My Work Queue')]")
	WebElement menuMyWorkQueue;

	@FindBy(xpath = "//span[normalize-space()='Open Tasks']")
	WebElement openTaskTab;

	@FindBy(xpath = "(//div[@id='dx-d24991e9-3d1a-1189-1d38-cb2e46db23cc'])[1]")
	WebElement openTabStatus;

	@FindBy(xpath = "//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Tasks']")
	WebElement closedTasksTab;

	@FindBy (xpath = "(//div[@class='dx-item dx-tab dx-tab-selected dx-state-hover'])[1]")
	WebElement closeTabStatus;

	@FindBy(xpath = "//span[normalize-space()='Projects / Tasks']")
	WebElement menuProjectTasks;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[1]")
	WebElement activeFilterDropdown;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Action']")
	WebElement actionButton;

	@FindBy(xpath = "//div[@class='menu-text'][normalize-space()='View / Edit']")
	WebElement vieweditOption;

	@FindBy(xpath = "//div[@class='dx-template-wrapper']//textarea[@role='textbox']")
	WebElement updateShortDesc;

	@FindBy(xpath = "//div//span[normalize-space()='Save']")
	WebElement saveAction;

	@FindBy(xpath = "//div[contains(text(),'All Tasks')]")
	WebElement allTaskFiltervalue;

	@FindBy(xpath = "//div[contains(text(),'My Tasks')]")
	WebElement myTaskFiltervalue;

	@FindBy(xpath ="(//input[contains(@autocomplete,'off')])[2]")
	WebElement activeFilterValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButtonClick;

	@FindBy(xpath = "//span[normalize-space()='Add New Project / Task']")
	WebElement addNewProjectTaskbuttton;

	@FindBy(xpath = "//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']")
	WebElement popupAddTask;

	@FindBy(xpath = "//dx-button[@title='Cancel']//div[@class='dx-button-content']")
	WebElement buttonCancel;

	@FindBy(xpath = "//span[normalize-space()='Notification Settings']")
	WebElement notificationbutton;

	@FindBy(xpath = "//dx-switch[@aria-label='No']//div[@class='dx-switch-off'][normalize-space()='No']")
	WebElement disableEmailnotification;

	@FindBy(xpath = "//dx-switch[@aria-label='Yes']//div[@class='dx-switch-on'][normalize-space()='Yes']")
	WebElement enableEmailnotification;

	@FindBy(xpath="(//div[@class='dx-switch-off'][contains(.,'No')])[2]")
	WebElement notifyMyselfNo;

	@FindBy(xpath = "//dx-switch[@aria-label='Yes']//div[@class='dx-switch-on'][normalize-space()='Yes']")
	WebElement notifyMyselfYes;

	@FindBy(xpath = "//dx-button[@aria-label='Close']//div[@class='dx-button-content']")
	WebElement notificationClosebutton;

	@FindBy(xpath = "//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']")
	public String notificationSettingsPopUp;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	WebElement expandIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	WebElement collapseIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-text dx-button-danger dx-button-has-icon']//i[@class='dx-icon cc-icon fas fa-times-circle']")
	WebElement fullscreenClose;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;
	
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-columnchooser fa-stack-2x']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement columnChooserClose;

	@FindBy(xpath = "//sup[@class='page-help-icon']")
	WebElement helpProjectTask;

	@FindBy(xpath = "//span[normalize-space()='Add New Project / Task']")
	WebElement addNewProjectTaskButton;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	WebElement addNewTaskCommunity;

	@FindBy(xpath = "//div//td[normalize-space()='1100 Trinity Mills Condominium Owners Association']")
	WebElement addNewTaskCommunityfilter;

	@FindBy(css = "textarea[spellcheck='false']")
	WebElement addNewTaskItem;

	@FindBy(xpath = "//textarea[@role='textbox']")
	WebElement addNewTaskShortDescription;

	@FindBy(xpath = "//dx-text-box[@class='dx-show-invalid-badge dx-textbox dx-texteditor dx-editor-outlined dx-texteditor-empty dx-widget dx-state-hover dx-state-focused']//input[@role='combobox']")
	WebElement addNewTaskResponsible;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[23]")
	WebElement addNewTaskResponsiblefilter;

	@FindBy(xpath = "//dx-date-box[@type='date']//input[@role='combobox']")
	WebElement addNewTaskDueDate;

	@FindBy(xpath = "//dx-select-box[@class='dx-show-invalid-badge dx-selectbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-texteditor-empty dx-widget dx-dropdowneditor dx-dropdowneditor-field-clickable dx-state-focused dx-dropdowneditor-active dx-state-hover dx-skip-gesture-event']//div[@class='dx-dropdowneditor-icon']")
	WebElement addNewTaskStatus;

	@FindBy(xpath = "//div[contains(text(),'In Progress')]")
	WebElement addNewTaskStatusfilter;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	WebElement addNewTaskCancelButton;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement addNewTaskShortSaveButton;

	@FindBy (xpath="//span[@class='dx-tab-text'][contains(.,'Closed Tasks')]")
	WebElement closeTab;

	@FindBy (xpath="//input[@max='3650']")
	WebElement daysText;

	@FindBy (xpath="//span[@class='dx-button-text']")
	WebElement refreshButton;

	@FindBy (xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement expandandCollapse;

	@FindBy (xpath="//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	WebElement rightArrow;

	@FindBy (xpath="//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	WebElement leftArrow;

	@FindBy (xpath="//i[@class='fas fa-user-circle']")
	WebElement userProfile;

	@FindBy (xpath="//span[normalize-space()='Logout']")
	WebElement logoutClick;
	
	@FindBy(xpath = "//div[contains(text(),'Add New Task')]")
	WebElement titleAddNewTask;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public boolean ProjectTaskPageLanding() 
	{	
		waitForInvisibility(loaderIcon);
		clickElement(myWorkQueueMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(projectTaskmenu);    	
		waitForElementToBeClickable(projectTaskmenu);
		if (isElementEnabled(projectTaskmenu)){
			clickElement(projectTaskmenu);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
			return false;
	}

	public boolean helpProjectTask() 
	{
		waitForElementToBeVisible(helpProjectTask);
		waitForInvisibility(loaderIcon);
		switchToNewTabAndVerifyURL(helpProjectTask);
		return true;
	}

	
	public boolean Activefilterselection() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(openTaskTab);
		System.out.println("Open Task Tab Selected");		

		waitForElementToBeClickable(activeFilterDropdown);
		clickElement(activeFilterDropdown);
		waitForInvisibility(loaderIcon);
		
		activeFilterDropdown.click();
		scrollToElement(activeFilterDropdown);
		waitForElementToBeClickable(activeFilterDropdown);
		clickElement(activeFilterDropdown);
		waitForInvisibility(loaderIcon);
		System.out.print("Active Filter is clicked\n");

		scrollToElement(allTaskFiltervalue);
		waitForElementToBeClickable(allTaskFiltervalue);
		clickElement(allTaskFiltervalue);
		waitForInvisibility(loaderIcon);

		System.out.println("All Task Filter selected");
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean Switchtab() 
	{ 

		waitForElementToBeClickable(closedTasksTab);
		closedTasksTab.click();
		waitForInvisibility(loaderIcon);
		System.out.println("Closed Task Tab Selected");

		if (isElementEnabled(closedTasksTab)) 
		{
			System.out.println("Closed Task Status : True");
		}
		else
		{
			System.out.println("Closed Task Status : False");
		}

		waitForElementToBeVisible(openTaskTab);
		clickElement(openTaskTab);
		System.out.println("Open Task Tab Selected");

		waitForInvisibility(loaderIcon);

		if (isElementEnabled(openTaskTab)) 
		{
			System.out.println("Open Task Status : True");
		}

		else
		{
			System.out.println("Open Task Status : False");

		}
		return true;
	}

	public boolean refreshButtonClick() 
	{
		waitForElementToBeClickable(refreshButtonClick);
		clickElement(refreshButtonClick);
		waitForInvisibility(loaderIcon);
		System.out.println("Verify Refresh");

		waitForElementToBeClickable(openTaskTab);

		if (isElementDisplayed(openTaskTab)) 
		{
			System.out.println("Refresh button clicked");
			return true;
		}

		else
		{
			System.out.println("Refresh button is not clicked");
			return false;
		}
	}
	

	public boolean NotificationSetting() 
	{
		waitForElementToBeClickable(notificationbutton);
		clickElement(notificationbutton);
		waitForInvisibility(loaderIcon);
		System.out.println("Notification Setting Button Clicked \n Status : " + notificationbutton.isSelected());

		String notificaionSettingPopup = driver.getWindowHandle();
		switchToWindow(notificaionSettingPopup);
		waitForInvisibility(loaderIcon);

		System.out.println("Inside Notification Setting popup");

		waitForElementToBeClickable(disableEmailnotification);
		clickElementJS(disableEmailnotification);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(enableEmailnotification);
		clickElementJS(enableEmailnotification);
	
		waitForElementToBeClickable(notificationClosebutton);
		clickElementJS(notificationClosebutton); 
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(openTaskTab);

		if (isElementDisplayed(openTaskTab)) 
		{
			System.out.println("Notification settings button clicked");
			return true;
		}

		else
		{
			System.out.println("Notification settings button not clicked");
			return false;
		}
	}

	public boolean expandCollapseClick ()
	{
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(rightArrow);
		
		if(isElementDisplayed(rightArrow))
		{
			clickElementJS(rightArrow);
			System.out.println("Clicked to Hide Menu");
		}
		else
		{
			System.out.println("Status : Menu Display");
		}
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(leftArrow);

		if(isElementDisplayed(leftArrow))
		{
			clickElement(leftArrow);
			System.out.println("Clicked to Display Menu");
			return true;
		}
		else
		{
			System.out.println("Status : Menu Hidden");
			return false;
		}
	}

	public boolean ToolBarFullScreen() 
	{	
		waitForElementToBeClickable(fullScreenIcon);
		clickElementJS(fullScreenIcon);
		System.out.println("Fullscreen Selected");

		if(isElementDisplayed(fullscreenClose))
		{
			System.out.println("Status : FullScreen");
			return true;
		}
		else
		{
			System.out.println("FullScreen not clicked");
			return false;
		}
		
	}

	public boolean ToolBarNormalScreen() 
	{
		waitForElementToBeClickable(fullscreenClose);
		waitForElementToBeClickable(normalScreenIcon);
		
		if (isElementDisplayed(fullscreenClose))
		{
			clickElementJS(normalScreenIcon);
			System.out.println("Normal Screen Selected");
			return true;
		}
		else
		{
			System.out.println("Normal Screen not clicked");
			return false;
		}
		
	}

	public boolean columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(resetLayout);
		clickElementJS(columnChooser);
		waitForInvisibility(loaderIcon);
		clickElement(columnChooserClose);
		System.out.println("Column Chooser closed");
		return true;
	}

	public String AddNewProjectTaskButtonClick() 
	{
		clickElement(openTaskTab);
		System.out.println("Open Task Tab Selected");
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(addNewProjectTaskButton);
		clickElement(addNewProjectTaskButton);
		waitForInvisibility(loaderIcon);

		System.out.println("Add New Project Task Button Clicked");
		String addNewTaskTitle = getElementText(titleAddNewTask);

		String addNewTaskPopup = driver.getWindowHandle();
		
		switchToWindow(addNewTaskPopup);
		System.out.println("Inside Add Task PopUp");
		waitForElementToBeClickable(addNewTaskCommunity);
		clickElement(addNewTaskCommunity);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(addNewTaskCancelButton);
		clickElementJS(addNewTaskCancelButton);
		
		System.out.println("Data Added and Clicked on Cancel");
		
		return addNewTaskTitle; 
	}

	public boolean closedWithinDaysTextbox()
	{
		waitForInvisibility(loaderIcon);
		//Days Verify
		clickElement(closeTab);
		waitForInvisibility(loaderIcon);
		clickElement(daysText);
		enterText(daysText,"400");
		System.out.println("Entered 400 Days Filter");
		clickElement(refreshButton);

		System.out.println("Clicked on Refresh");
		waitForInvisibility(loaderIcon);
		return true;
	}

	public void verifyActionButton() 
	{
		closedWithinDaysTextbox();

		waitForElementToBeClickable(actionButton);
		clickElement(actionButton);

		waitForElementToBeClickable(vieweditOption);
		clickElement(vieweditOption);
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		clickElement(updateShortDesc);
		enterText(updateShortDesc,"Updated Short Description");
		waitForElementToBeClickable(buttonCancel);
		clickElement(buttonCancel);
		waitForInvisibility(loaderIcon);

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println("Task Updated on Date : " + formatter.format(date));
	}

	public void userlogout() 
	{
		waitForElementToBeClickable(userProfile);
		clickElement(userProfile);
		
		waitForElementToBeClickable(userProfile);
		scrollToElement(logoutClick);
		clickElement(logoutClick);
	}
}