package com.ciranet.myworkqueue.communitymanagement.pages;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.ciranet.basepage.BasePage;

public class FulfillmentQueuePage extends BasePage
{
	public FulfillmentQueuePage(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//div[@title='My Work Queue']//div[@class='header-text']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//div[@title='Community Management']//div[@class='header-text']")
	WebElement communityManagementMenu;

	@FindBy(xpath = "//div[@title='Fulfillment Queue']//div[@class='header-text']")
	WebElement fulfillmentQueueMenu;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooserButton;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooserButton;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayoutButton;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Jobs']")
	public WebElement closedJobsTab;

	@FindBy (xpath = "//span[normalize-space()='Active Jobs']")
	public WebElement activeJobsTab;

	@FindBy(xpath="(//span[text()='Action'])[1]")
	public WebElement actionButton;

	@FindBy(xpath="(//div[text()=' View/Edit '])[1]")
	public WebElement viewEdit;

	@FindBy(xpath="//span[text()='Save']")
	public WebElement actionSaveButton;

	@FindBy(xpath="//span[text()='Save & Close']")
	public WebElement actionSaveCloseButton;

	@FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement errorClose;

	@FindBy(xpath="//span[text()='Close']")
	public WebElement closeButton;

	@FindBy(xpath="//span[text()='Refresh Queue']")
	public WebElement refreshQueueButton;

	@FindBy(xpath="//div[@title='Close']//div[@class='dx-button-content']")
	public WebElement popupClose;	

	@FindBy(xpath="//span[text()='Documents']")
	public WebElement documents;

	@FindBy(xpath="//i[@class='dx-icon fas fa-times']")
	public WebElement documentsCloseButton;

	@FindBy(xpath="//span[text()='Completion Job']")
	public WebElement completionJob;

	@FindBy(xpath="//i[@title='Show Notes']")
	public WebElement showNotes;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Close']")
	public WebElement completionJobClose;

	@FindBy(xpath="(//div[@class='dx-item-content dx-toolbar-item-content'][contains(.,'Save')])[1]")
	public WebElement completionJobSave;

	@FindBy(xpath="(//div[@class='dx-item-content dx-toolbar-item-content'][contains(.,'Save & Close')])[1]")
	public WebElement completionJobSaveandClose;

	@FindBy(xpath="(//textarea[@role='textbox'])[4]")
	public WebElement textBox;

	@FindBy(xpath="(//span[text()='Save'])[2]")
	public WebElement textBoxSave;

	@FindBy(xpath="//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement communityFilter;

	@FindBy(xpath="//td[normalize-space()='1100 Trinity Mills Condos']")
	public WebElement communityFilterValue;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
	public WebElement searchBy;

	@FindBy(xpath="//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Request Date']")
	public WebElement searchByValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[2]")
	public WebElement beginDate;

	@FindBy(xpath="//div[@title='Search']")
	public WebElement searchButton;

	@FindBy(xpath="//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']")
	public WebElement closedTabLoader;

	@FindBy(xpath="//dx-button[@aria-label='Add Job']") 
	public WebElement addJobButton;

	@FindBy(xpath="(//div[@class='dx-texteditor-input-container'])[49]")
	public WebElement jobType;

	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	public WebElement jobValue;

	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[2]")
	public WebElement jobValueCompletedJobButton;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[19]")
	public WebElement sendTo;

	@FindBy(xpath="//div[text()='Amberwood']")
	public WebElement sendToValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[20]")
	public WebElement paperType;

	@FindBy(xpath="//div[text()='Standard Weight']")
	public WebElement paperTypeValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[21]")
	public WebElement ink;

	@FindBy(xpath="//div[text()='Black & White']")
	public WebElement inkValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[22]")
	public WebElement paperColor;

	@FindBy(xpath="//div[text()='White']")
	public WebElement paperColorValue;

	@FindBy(xpath="(//label[@class='dx-field-item-label dx-field-item-label-location-top'])[11]")
	public WebElement postage;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[23]")
	public WebElement postagePaid;

	@FindBy(xpath="(//div[text()='Yes'])[2]")
	public WebElement postagePaidValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[24]")
	public WebElement residents;

	@FindBy(xpath="(//div[text()='No'])[2]")
	public WebElement residentsValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[25]")
	public WebElement outside;

	@FindBy(xpath="//div[text()='None']")
	public WebElement outsideValue;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon' and @aria-label='Save & Close']")
	public WebElement saveClose;

	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[5]")
	public WebElement addCompletionJob;

	@FindBy(xpath="(//div[@class='dx-texteditor-input-container'])[68]")
	public WebElement closeJob;

	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	public WebElement closeJobValue;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Add Item']")
	public WebElement addItem;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @aria-label='Close']")
	public WebElement addCompletionJobClose;

	@FindBy(xpath="//dx-button[@aria-label='Add Completed Job']")
	public WebElement addCompletedJob;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-dialog-button' and @aria-label='Yes']")
	public WebElement confirmation;

	@FindBy(xpath="//dx-button[@aria-label='Close']//div[@class='dx-button-content']")
	public WebElement confirmationOk;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Close']")
	public WebElement completedJobClose;

	@FindBy(xpath="//td[@aria-label='Sunday, November 1, 2020' and @class='dx-calendar-cell dx-calendar-contoured-date' ]")
	public WebElement beginDateValue;

	@FindBy(xpath="//div[@title='Save & Add Documents']")
	public WebElement saveDocument;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @aria-label='Close']")
	public WebElement addJobButtonClose;

	@FindBy(xpath="//dx-button[@type='success']")
	public WebElement addSuccessMsg;

	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	public void fulfillmentQueueMenu() 
	{	
		waitForInvisibility(loaderIcon);	
		clickElementJS(myWorkQueueMenu);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);	
		clickElementJS(communityManagementMenu);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);	
		clickElementJS(fulfillmentQueueMenu);
		waitForInvisibility(loaderIcon);
	}

	public boolean toolBarFullScreen() 
	{		
		waitForInvisibility(loaderIcon);
		scrollToElement(fullScreenIcon);
		clickElement(fullScreenIcon);
		waitForInvisibility(loaderIcon);

		//if statement to specify a block of Java code to be executed if a condition is true
		if (normalScreenIcon.isDisplayed()) 
		{
			waitForInvisibility(loaderIcon);
			return true;

		}
		//block of code to be executed if the condition is false
		else 
		{
			return false;
		}
	}

	public boolean toolBarNormalScreen() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(normalScreenIcon);
		clickElementJS(normalScreenIcon);
		waitForInvisibility(loaderIcon);

		if (fullScreenIcon.isDisplayed()) 
		{
			waitForInvisibility(loaderIcon);
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public boolean expandCollapseOptionClick() 
	{
		clickElement(collapseIcon);
		waitForInvisibility(collapseIcon);

		clickElement(expandIcon);
		waitForInvisibility(expandIcon);

		return true;
	}

	public boolean columnChooserClick() 
	{

		clickElement(resetLayoutButton);
		waitForInvisibility(loaderIcon);
		clickElement(columnChooserButton);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeColChooserButton);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean switchTab() 
	{
		waitForInvisibility(loaderIcon);	
		clickElement(closedJobsTab);

		if (closedJobsTab.isEnabled() == true) 
		{
			System.out.println("Closed jobs tab : True");
		} 
		else 
		{
			System.out.println("Closed jobs tab : False");
		}

		clickElement(activeJobsTab);
		waitForInvisibility(loaderIcon);
		if (activeJobsTab.isEnabled() == true) 
		{
			return true;
		}

		else 
		{
			return false;
		}
	}

	//method is a block of code which only runs when it is called
	public void viewedit() 
	{		
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(viewEdit);
		waitForInvisibility(loaderIcon);
	}

	public boolean actionSaveClick()
	{
		//Call a Method in Java
		viewedit();
		waitForInvisibility(loaderIcon);	
		clickElement(actionSaveButton);
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

	public boolean verifyActionCloseButton() 
	{ 
		//Call a Method in Java
		viewedit();

		String fulfillmentPopup = driver.getWindowHandle();
		driver.switchTo().window(fulfillmentPopup);
		wait.until(ExpectedConditions.elementToBeClickable(popupClose));
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

	public boolean actionSaveCloseClick() 
	{
		waitForInvisibility(loaderIcon);
		//Call a Method in Java
		viewedit();

		clickElement(actionSaveCloseButton);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElement(errorClose);
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(closeButton)) 
		{
			clickElement(closeButton);
			waitForInvisibility(loaderIcon);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean refreshQueueButton() 
	{
		if (isElementDisplayed(refreshQueueButton)) 
		{
			clickElement(refreshQueueButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean actionDocumentTabClick()
	{   
		waitForInvisibility(loaderIcon);
		//Call a Method in Java
		viewedit();

		if (isElementDisplayed(documents)) 
		{
			clickElement(documents);
			waitForInvisibility(loaderIcon);
			clickElement(documentsCloseButton);
			waitForInvisibility(loaderIcon);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean actionCompletiontTabclick() 
	{
		waitForInvisibility(loaderIcon);
		viewedit();
		waitForInvisibility(loaderIcon);
		clickElement(completionJob);
		waitForInvisibility(loaderIcon);
		clickElement(showNotes);
		waitForInvisibility(loaderIcon);
		textBox.sendKeys("Notes of Fulfillment");
		waitForInvisibility(loaderIcon);
		clickElement(textBoxSave);
		clickElement(completionJobClose);
		waitForInvisibility(loaderIcon);

		//********************************* Save Button Click *******************************************
		//Call a Method in Java
		viewedit();
		clickElement(completionJob);
		waitForInvisibility(loaderIcon);

		clickElement(showNotes);
		waitForInvisibility(loaderIcon);
		textBox.sendKeys("Notes of Fulfillment ");
		clickElement(textBoxSave);

		waitForInvisibility(loaderIcon);
		clickElement(completionJobSave);
		waitForInvisibility(loaderIcon);
		Robot robot;
		try 
		{
			//creating a constructor of the Robot class  
			robot = new Robot();
			//pressing key by invoking the keyPress() method 
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			robot.delay(300);
		} 
		catch (java.awt.AWTException e) 
		{
			e.printStackTrace();
		}

		String emailPopup = driver.getWindowHandle();
		driver.switchTo().window(emailPopup);

		clickElement(completionJobSaveandClose);
		waitForInvisibility(loaderIcon);
		try 
		{
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			robot.delay(300);
		} 
		catch (java.awt.AWTException e) 
		{
			e.printStackTrace();
		}
		String emailPopupwindow = driver.getWindowHandle();
		driver.switchTo().window(emailPopupwindow);

		if (isElementDisplayed(completionJobClose)) 
		{
			clickElement(completionJobClose);
			waitForInvisibility(loaderIcon);
			return true;
		}

		else 
		{
			return false;
		}
	}

	public boolean addJobSaveAndCloseButton() 
	{
		clickElement(addJobButton);
		waitForInvisibility(loaderIcon);
		String addjobPopupwindow = driver.getWindowHandle();
		driver.switchTo().window(addjobPopupwindow);
		clickElement(jobType);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(jobValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(sendTo);
		waitForInvisibility(loaderIcon);
		clickElementJS(sendTo);
		clickElementJS(sendToValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(paperType);
		waitForInvisibility(loaderIcon);
		clickElementJS(paperTypeValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(ink);
		waitForInvisibility(loaderIcon);
		clickElementJS(inkValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(paperColor);
		waitForInvisibility(loaderIcon);
		clickElementJS(paperColorValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(postage);
		waitForInvisibility(loaderIcon);
		clickElementJS(postagePaid);
		waitForInvisibility(loaderIcon);
		clickElementJS(postagePaidValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(residents);
		waitForInvisibility(loaderIcon);
		clickElementJS(residentsValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(outside);
		waitForInvisibility(loaderIcon);
		clickElementJS(outsideValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(saveClose);
		waitForInvisibility(loaderIcon);
		String addPopup = driver.getWindowHandle();
		driver.switchTo().window(addPopup);
		if (isElementDisplayed(confirmationOk)) 
		{
			clickElementJS(confirmationOk);
			waitForInvisibility(loaderIcon);
			try 
			{
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.delay(300);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				robot.delay(300);
			} 
			catch (java.awt.AWTException e) 
			{
				e.printStackTrace();
			}
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean addCompletionJobtab() 
	{
		clickElement(addJobButton);
		waitForInvisibility(loaderIcon);
		clickElementJS(addCompletionJob);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeJob);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeJobValue);
		waitForInvisibility(loaderIcon);
		clickElement(addItem);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(addCompletionJobClose)) 
		{
			clickElementJS(addCompletionJobClose);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean addCompletedJobbuttonSaveandAddDocuments()
	{
		clickElementJS(addCompletedJob);
		waitForInvisibility(loaderIcon);
		String addcompletedJobPopup = driver.getWindowHandle();
		driver.switchTo().window(addcompletedJobPopup);
		waitForInvisibility(loaderIcon);
		clickElementJS(confirmation);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(saveDocument)) 
		{
			clickElementJS(saveDocument);
			waitForInvisibility(loaderIcon);
			try 
			{
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.delay(300);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				robot.delay(300);
			} 
			catch (java.awt.AWTException e) 
			{
				e.printStackTrace();
			}
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean addCompletedJobButtonClick() 
	{
		if (isElementDisplayed(completedJobClose)) 
		{
			clickElementJS(completedJobClose);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean closedJobsSearchButton()
	{
		clickElementJS(closedJobsTab);
		waitForInvisibility(loaderIcon);
		if (closedJobsTab.isEnabled() == true) 
		{
			System.out.println("Closed jobs tab : True");
		} 
		else 
		{
			System.out.println("Closed jobs tab : False");
		}
		clickElementJS(communityFilter);
		waitForInvisibility(loaderIcon);
		clickElementJS(communityFilterValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(beginDate);
		waitForInvisibility(loaderIcon);
		beginDate.clear();
		beginDate.sendKeys("09/01/2020");
		clickElementJS(searchButton);
		waitForInvisibility(loaderIcon);

		if(actionButton.isDisplayed()==true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}