package com.ciranet.myworkqueue.disclosureprocessing.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class PropertyConveyancePage extends BasePage
{
	public PropertyConveyancePage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//span[normalize-space()='Disclosure Processing']")
	WebElement disclosureProcessingMenu;

	@FindBy(xpath = "//span[normalize-space()='Property Conveyances']")
	WebElement propertyConveyanceMenu;
	
	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//td[@aria-label='Column Community']")
	WebElement communityColumn;

	@FindBy(xpath="(//div[@aria-label='Action'])[1]")
	WebElement actionButtonOfFirstRow;

	@FindBy(xpath = "(//span[text()='Action'])[3]")
	WebElement actionButton;

	@FindBy(xpath ="(//div[@ng-reflect-klass='menu-text'])[2]")
	WebElement editCommunity;

	@FindBy(xpath ="(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[3]")
	WebElement editCommunityCancelButton;

	@FindBy(xpath ="(//input[@type='text'])[16]")
	WebElement communityDrpDown;

	@FindBy(xpath ="//td[text()=\"1100 Trinity Mills Condos\"]")
	WebElement communityValueDrpDown;

	@FindBy(xpath ="(//span[@class='dx-button-text'])[54]")
	WebElement editCoummunityUpdate;

	@FindBy(xpath ="(//div[@aria-label='Action'])[3]")
	WebElement actionClearCoummunity;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Clear Community')]")
	WebElement clearCoummunity;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	WebElement processPropertyConveyanceMenu;

	@FindBy(xpath = "//div[@class='dx-switch-off']")
	WebElement compactModeOff;

	@FindBy(xpath = "//div[@class='dx-switch-on']")
	WebElement compactModeOn;

	@FindBy(xpath = "(//div[@role='tab'])[2]")
	WebElement completedTab;

	@FindBy(xpath ="(//div[@role='tab'])[1]")
	WebElement openTab;

	@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[2]")
	WebElement fromDate;

	@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[3]")
	WebElement toDate;

	@FindBy(xpath ="(//div[@class='menu-text'])[3]")
	WebElement deleteCoummunity;

	@FindBy(xpath = "//dx-button[@hint='Refresh'][contains(.,'Refresh')]") // "(//div[contains(@class,'dx-button-content')])[16]")
	public WebElement refreshButton;

	@FindBy(xpath = "(//div[@class=\"dx-button-content\"])[13]")
	public WebElement showSearch;

	@FindBy(xpath = "(//div[@aria-label='Action'])[1]")
	public WebElement actionProcess;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	public WebElement processProperty;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement selectCommunity;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[22]")
	public WebElement propertyAdress;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	public WebElement search;

	@FindBy(xpath = "//td[normalize-space()='161 Gilbert Street']")
	public WebElement communityDropdown;

	@FindBy(xpath = "(//td[normalize-space()='161 Gilbert Street'])[2]")
	public WebElement communityValue;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//span//span[1]")
	public WebElement nextbutton;	

	@FindBy(xpath = "//div[@title='Next']//span//span[1]")
	public WebElement nextbutton2;

	@FindBy(xpath = "(//input[contains(@class,'dx-texteditor-input')])[29]")
	public WebElement owner;

	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[4]")
	public WebElement ownerSearch;

	@FindBy(xpath = "(//td[text()=\"Romich\"])[1]")
	public WebElement ownerValue;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement close;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	public WebElement iSquare;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	public WebElement iSquarePlus;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement resetButton;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderofPropertyOwnershipConveyance;

	@FindBy(xpath = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderOfPage;

	@FindBy(xpath = "(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[2]")
	private WebElement searchWorkQueue;
	
	@FindBy(xpath = "//div[@class='dx-group-panel-message']")
	private WebElement toGroupPanel;

	public String propertyConveyancePageLanding() 
	{
		clickElement(myWorkQueueMenu);
		clickElement(disclosureProcessingMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(propertyConveyanceMenu);
		scrollToElement(propertyConveyanceMenu);
		
		if(isElementDisplayed(propertyConveyanceMenu))
		{
			clickElementJS(propertyConveyanceMenu);
			waitForInvisibility(loaderIcon);
			
		}
		return lblheader.getText();
	}

	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public boolean toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(fullScreenIcon);
		clickElement(fullScreenIcon);
		waitForInvisibility(loaderIcon);

		if (normalScreenIcon.isDisplayed()) 
		{
			waitForInvisibility(loaderIcon);
			return true;

		}
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

	public boolean actionEditCommunityCancel() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editCommunity);
		waitForInvisibility(loaderIcon);
		
		if(isElementDisplayed(editCommunityCancelButton))
		{
			clickElement(editCommunityCancelButton);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(resetLayout);
		clickElementJS(columnChooser);
		clickElement(closeColChooser);
		return true;
	}

	public boolean compactModeToggleOnPropertyConveyancePopup() throws AWTException 
	{
		waitForInvisibility(loaderOfPage);
		clickElementJS(actionProcess);
		clickElement(processProperty);
		String managePopup = driver.getWindowHandle();
		driver.switchTo().window(managePopup);
		waitForInvisibility(loaderOfPage);
		clickElementJS(compactModeOff);
		waitForElementToBeClickable(compactModeOn);
		
		if(isElementDisplayed(compactModeOn))
		{
			clickElementJS(compactModeOn);
			pressEscapeKey();
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean searchWorkQueueButtonClick() 
	{
		waitForInvisibility(loaderIcon);
		completedTab();
		fromDate.clear();
		fromDate.sendKeys("01/01/2020");
		waitForInvisibility(loaderIcon);
		driver.findElement(By.xpath("(//input[contains(@class,'dx-texteditor-input')])[4]")).sendKeys("1100");
		waitForInvisibility(loaderIcon);
		clickElementJS(searchWorkQueue);
		if(isElementDisplayed(openTab))
		{
			clickElementJS(openTab);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean toggleCompletedOpenTabClick() 
	{
		waitForInvisibility(loaderIcon);
		completedTab();
		if (isElementDisplayed(fromDate))
		{
			waitForInvisibility(loaderIcon);
			clickElementJS(openTab);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void completedTab() 
	{
		clickElementJS(completedTab);
		waitForInvisibility(loaderIcon);
	}

	public boolean verifyActionDelete() throws AWTException
	{
		if(isElementDisplayed(actionButton))
		{
			waitForInvisibility(loaderIcon);
			clickElement(actionButton);
			clickElement(deleteCoummunity);
			waitForInvisibility(loaderIcon);
			pressEscapeKey();
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void escapeCode() 
	{
		Robot robot;
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
	}

	public boolean verifyRefreshButton() 
	{	
		if(isElementDisplayed(refreshButton))
		{
			waitForInvisibility(loaderIcon);
			clickElementJS(refreshButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean expandOptionClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(communityColumn);
		clickElement(toGroupPanel);
		Actions act=new Actions(driver);
		act.dragAndDrop(communityColumn, toGroupPanel).build().perform();
		waitForInvisibility(loaderIcon);
		clickElement(iSquare);
		waitForInvisibility(loaderIcon);
		clickElement(iSquarePlus);
		waitForInvisibility(loaderIcon);
		
		if(isElementDisplayed(resetButton))
		{
			clickElement(resetButton);
			return true;
		}
		else 
		{
			return false;
		}
	}
}
