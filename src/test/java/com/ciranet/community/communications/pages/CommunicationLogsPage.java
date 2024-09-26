package com.ciranet.community.communications.pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;
import org.openqa.selenium.interactions.Actions;

public class CommunicationLogsPage extends BasePage
{
	public CommunicationLogsPage(WebDriver driver) 
	{
		super(driver);

	}

	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;

	@FindBy(xpath = "//i[@class='dx-icon far fa-compass fa-2x']")
	WebElement navigationSearchIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement toolbarMenu;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitysearchBox;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitysearchButton;

	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;

	@FindBy(xpath = "//span[normalize-space()='Community']")
	WebElement communityMenu;

	@FindBy(xpath = "//span[contains(.,'Communications')]")
	WebElement communicationsMenu;

	@FindBy(xpath = "//span[contains(.,'Communication Logs')]")
	WebElement communicationLogsMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	WebElement loaderIcon;

	@FindBy(xpath = "//input[@role='spinbutton'][1]")
	WebElement communicationLogsInPastTextbox;

	@FindBy(xpath = "//input[@role='combobox'][1]")
	WebElement dropdownButton;

	@FindBy(xpath = "//div[contains(text(),'Community Only')]")
	WebElement selectCommunityOnlydropdownValue;

	@FindBy(xpath = "//div[contains(text(),'All')]")
	WebElement selectAlldropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='fas fa-star fa-stack-1x dx-theme-accent-as-text-color']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath ="//a[@class='fas fa-question-circle']")
	WebElement helpCommunicationLogs;

	@FindBy(xpath ="//a[normalize-space()='CiraNet Module: Communications Log']")
	WebElement ciraNetModuleCommunicationsLog;

	@FindBy(xpath ="(//*[@id=\"menutemplate\"]/div/div[2])[1]")
	WebElement actionsButton;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'View Details')]")
	WebElement actionsViewDetails;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Links')]")
	WebElement actionsLinks;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Internal Tasks')]")
	WebElement actionsLinksInternalTask;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Project Tasks')]")
	WebElement actionsLinksProjectTask;

	@FindBy(xpath ="//span[@class='dx-button-text'][contains(.,'New Internal Task')]")
	WebElement internalTaskNewInternalTask;

	@FindBy(xpath ="//div[@class='dx-toolbar-items-container'][contains(.,'Internal Task Link View')]")
	WebElement internalTasklinkViewpopup;

	@FindBy(xpath ="//span[@class='dx-button-text'][contains(.,'Refresh')]")
	WebElement internalTaskRefreshButton;

	@FindBy(xpath ="//i[contains(@class,'dx-icon dx-icon-close')]")
	WebElement addCloseButton;

	@FindBy(xpath ="(//span[contains(.,'1865 Amberwood Loop')])[1]")
	WebElement propertyAddresshyperlinks;

	@FindBy(xpath ="//input[contains(@aria-describedby,'dx-col-463')]")
	WebElement propertyAddressSearch;

	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public void actionButton() throws AWTException 
	{
		isElementDisplayed(actionsButton);
		clickElement(actionsButton);
		waitForInvisibility(loaderIcon);
	}

	public void pressTabKey() throws AWTException 
	{
		Robot robot = new Robot();
		// Press the Tab key
		robot.keyPress(KeyEvent.VK_TAB);
		// Release the Tab key
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		// Refresh button clicked
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release the Enter key
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public boolean verifySearchCommunity(String communitySearchKeyword) 
	{
		waitForElementToBeVisible(communityIcon);
		clickElement(communityIcon);
		waitForElementToBeVisible(communitysearchBox);
		clickElement(communitysearchBox);
		communitysearchBox.sendKeys(communitySearchKeyword);
		clickElement(communitysearchButton);

		waitForElementToBeVisible(amberwoodLink);
		waitForInvisibility(loaderIcon);
		clickElement(amberwoodLink);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);

		try 
		{
			pressEscapeKey();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		waitForInvisibility(loaderIcon);

		// Get a list of all open window handles
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		waitForInvisibility(loaderIcon);

		// Switch to the remaining tab (second tab in this case)
		driver.switchTo().window(windowHandles.get(1));

		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);

		wait.until(ExpectedConditions.visibilityOf(communicationsMenu));
		waitForElementToBeVisible(communicationsMenu);
		clickElement(communicationsMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(communicationLogsMenu);


		if (isElementDisplayed(communicationLogsMenu))
		{
			waitForInvisibility(loaderIcon);
			clickElement(communicationLogsMenu);
			waitForInvisibility(loaderIcon);
			waitForElementToBeVisible(communicationLogsInPastTextbox);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyCommunicationLogsInPastdays() 
	{
		waitForElementToBeVisible(communicationLogsInPastTextbox);
		if (isElementDisplayed(communicationLogsInPastTextbox))
		{
			clickElement(communicationLogsInPastTextbox);
			communicationLogsInPastTextbox.clear();
			communicationLogsInPastTextbox.sendKeys("300");

			clickElement(dropdownButton);
			clickElement(selectCommunityOnlydropdownValue);

			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyCommunicationLogsInPastdaysAll() 
	{
		waitForElementToBeVisible(communicationLogsInPastTextbox);
		if (isElementDisplayed(communicationLogsInPastTextbox))
		{
			clickElement(communicationLogsInPastTextbox);
			communicationLogsInPastTextbox.clear();
			communicationLogsInPastTextbox.sendKeys("300");

			clickElement(dropdownButton);
			clickElement(selectAlldropdownValue);

			clickElement(refreshButton);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;
		}
	}	

	public boolean verifyActionsViewDetails() 
	{
		// Store the current window handle
		String originalWindow = driver.getWindowHandle();

		try 
		{
			actionButton();
		}
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		clickElement(actionsViewDetails);
		waitForInvisibility(loaderIcon);
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : allWindows) 
		{
			if (!windowHandle.equals(originalWindow)) 
			{
				driver.switchTo().window(windowHandle);
				waitForInvisibility(loaderIcon);
				//driver.close();
				driver.quit();
			}

			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
			driver.switchTo().window(tabs2.get(2));
			waitForInvisibility(loaderIcon);


		}
		return true;
	}

	public boolean verifyActionsLinksInternalTask() throws AWTException 
	{
		Robot robot = new Robot();

		try 
		{
			actionButton();
		}
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		clickElement(actionsLinks);
		clickElement(actionsLinksInternalTask);
		waitForInvisibility(loaderIcon);

		clickElement(internalTasklinkViewpopup);
		waitForInvisibility(loaderIcon);

		pressTabKey();

		waitForInvisibility(loaderIcon);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		// Press the Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		// Release the Enter key
		robot.keyRelease(KeyEvent.VK_ENTER);

		try 
		{
			pressEscapeKey();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		pressTabKey();

		try 
		{
			pressEscapeKey();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		clickElement(addCloseButton);
		waitForInvisibility(loaderIcon);

		return true;

	}


	public boolean verifyActionsLinksProjectTask() throws AWTException 
	{
		Robot robot = new Robot();

		try 
		{
			actionButton();
		}
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		clickElement(actionsLinks);
		clickElement(actionsLinksProjectTask);
		waitForInvisibility(loaderIcon);

		pressTabKey();

		waitForInvisibility(loaderIcon);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		// Press the Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		// Release the Enter key
		robot.keyRelease(KeyEvent.VK_ENTER);

		try 
		{
			pressEscapeKey();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		pressTabKey();

		try 
		{
			pressEscapeKey();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
		clickElement(addCloseButton);
		waitForInvisibility(loaderIcon);

		return true;

	}

	public boolean verifypropertyAddresshyperlinks() throws AWTException 
	{
		if (isElementDisplayed(propertyAddresshyperlinks))
		{
			clickElement(propertyAddresshyperlinks);
			waitForInvisibility(loaderIcon);

			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			return true;
		}
		else
		{
			return false;
		}		
	}




	public boolean helpCommunicationLogs() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(helpCommunicationLogs);
		clickElement(helpCommunicationLogs);
		waitForInvisibility(loaderIcon);
		return true;
	}

}

