package com.ciranet.community.communications.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;

public class MassCommunicationPage extends BasePage
{
	public MassCommunicationPage(WebDriver driver) 
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

	@FindBy(xpath = "//span[normalize-space()='Communications']")
	WebElement communicationsMenu;

	@FindBy(xpath = "//span[normalize-space()='Mass Communications']")
	WebElement massCommunicationMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[1]")
	WebElement fromDropdownClick;

	@FindBy(xpath = "//div[@class='dx-item-content dx-list-item-content'][contains(.,'Scheduled Date')]")
	WebElement fromDropdownFirstValue;

	@FindBy(xpath = "//div[@class='dx-item-content dx-list-item-content'][contains(.,'Processed Date')]")
	WebElement fromDropdownSecondValue;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[3]")
	WebElement fromDropdownDateSelection;

	@FindBy(xpath = "(//input[contains(@class,'dx-texteditor-input')])[4]")
	WebElement toDropdownDateSelection;

	@FindBy(xpath = "//span[@class='dx-button-text'][contains(.,'Search')]")
	WebElement searchButton;

	@FindBy(xpath = "//span[contains(.,'Schedule Communication')]")
	WebElement scheduleCommunicationButton;

	@FindBy(xpath = "//div[@class='dx-toolbar-items-container'][contains(.,'Schedule Communication')]")
	WebElement scheduleCommunicationpopup;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement scheduleCommunicationCloseButtton;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[4]")
	WebElement contactListClick;

	@FindBy(xpath = "//div[contains(text(),'All Contacts')]")
	WebElement contactListFirstValue;

	@FindBy(xpath = "//div[contains(text(),'Household Members')]")
	WebElement contactListSecondValue;

	@FindBy(xpath = "//div[@class='dx-texteditor-input-container dx-tag-container dx-native-click']")
	WebElement contactTypeClick;

	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[3]")
	WebElement contactTypeValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[6]")
	WebElement messageTypeClick;

	@FindBy(xpath = "//div[contains(text(),'Emergency Community Notification')]")
	WebElement messageTypeValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh Recipients']")
	WebElement refreshRecipientsButton;

	@FindBy(xpath = "(//span[@class='dx-button-text'][normalize-space()='Reset'])[1]")
	WebElement resetButton;

	@FindBy(xpath = "(//input[@aria-label='Filter cell'])[3]")
	WebElement scheduledBysearchbox;

	@FindBy(xpath = "(//span[contains(.,'Steve Roebuck')])[1]")
	WebElement scheduledByHyperlink;

	@FindBy(xpath = "//span[normalize-space()='New Template']")
	WebElement newTemplateButton;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement newTemplateCloseButton;

	@FindBy(xpath = "(//input[@aria-label='Filter cell'])[4]")
	WebElement statuSsearchbox;

	@FindBy(xpath = "(//div[@class='dx-button-content'][contains(.,'Action')])[1]")
	WebElement actionButton;

	@FindBy(xpath = "(//span[normalize-space()='Re-Schedule']")
	WebElement reScheduleButton;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeButton;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-chevron-right']")
	WebElement contentButton;


	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public void selectStatusFilters() throws AWTException 
	{	
		waitForElementToBeVisible(statuSsearchbox);
		clickElement(statuSsearchbox);
		statuSsearchbox.clear();
	}

	public void dropdownDateSelection() throws AWTException 
	{	
		waitForElementToBeVisible(fromDropdownClick);
		if (isElementDisplayed(fromDropdownClick)) 
		{
			clickElement(fromDropdownClick);
			clickElement(fromDropdownSecondValue);
			fromDropdownDateSelection.clear();
			fromDropdownDateSelection.sendKeys("01/01/2020");

			clickElement(toDropdownDateSelection);
			toDropdownDateSelection.clear();

			// Get today's date
			LocalDate today = LocalDate.now();

			// Define the date format you need
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			// Format tomorrow's date as a string
			String todayDate = today.format(formatter);

			// Use sendKeys to enter tomorrow's date in the web element
			// Assuming addEditAnnouncementExpires is the WebElement for the expiration date field
			toDropdownDateSelection.sendKeys(todayDate);

			clickElement(searchButton);
			waitForInvisibility(loaderIcon);
		}

	}

	public void dropdownDateSelect() throws AWTException 
	{	
		waitForElementToBeVisible(fromDropdownClick);
		if (isElementDisplayed(fromDropdownClick)) 
		{
			clickElement(fromDropdownClick);
			clickElement(fromDropdownFirstValue);
			fromDropdownDateSelection.clear();
			fromDropdownDateSelection.sendKeys("01/01/2020");

			clickElement(toDropdownDateSelection);
			toDropdownDateSelection.clear();

			// Get today's date
			LocalDate today = LocalDate.now();

			// Define the date format you need
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			// Format tomorrow's date as a string
			String todayDate = today.format(formatter);

			// Use sendKeys to enter tomorrow's date in the web element
			// Assuming addEditAnnouncementExpires is the WebElement for the expiration date field
			toDropdownDateSelection.sendKeys(todayDate);

			clickElement(searchButton);
			waitForInvisibility(loaderIcon);
		}
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

		scrollToElement(massCommunicationMenu);

		if (isElementDisplayed(massCommunicationMenu))
		{
			waitForInvisibility(loaderIcon);
			clickElement(massCommunicationMenu);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyFromScheduledDateDropdown() 
	{
		waitForElementToBeVisible(fromDropdownClick);
		if (isElementDisplayed(fromDropdownClick)) 
		{
			clickElement(fromDropdownClick);
			clickElement(fromDropdownFirstValue);
			fromDropdownDateSelection.clear();
			fromDropdownDateSelection.sendKeys("01/01/2020");

			clickElement(toDropdownDateSelection);
			toDropdownDateSelection.clear();

			// Get today's date
			LocalDate today = LocalDate.now();

			// Define the date format you need
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			// Format tomorrow's date as a string
			String todayDate = today.format(formatter);

			// Use sendKeys to enter tomorrow's date in the web element
			// Assuming addEditAnnouncementExpires is the WebElement for the expiration date field
			toDropdownDateSelection.sendKeys(todayDate);

			clickElement(searchButton);
			waitForInvisibility(loaderIcon);

			return true;
		}

		else 
		{
			return false;
		}
	}


	public boolean verifyFromProcessedDateDropdown() 
	{
		waitForElementToBeVisible(fromDropdownClick);
		if (isElementDisplayed(fromDropdownClick)) 
		{
			clickElement(fromDropdownClick);
			clickElement(fromDropdownSecondValue);
			fromDropdownDateSelection.clear();
			fromDropdownDateSelection.sendKeys("01/01/2020");

			clickElement(toDropdownDateSelection);
			toDropdownDateSelection.clear();

			// Get today's date
			LocalDate today = LocalDate.now();

			// Define the date format you need
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			// Format tomorrow's date as a string
			String todayDate = today.format(formatter);

			// Use sendKeys to enter tomorrow's date in the web element
			// Assuming addEditAnnouncementExpires is the WebElement for the expiration date field
			toDropdownDateSelection.sendKeys(todayDate);

			clickElement(searchButton);
			waitForInvisibility(loaderIcon);

			return true;
		}

		else 
		{
			return false;
		}
	}

	public boolean verifyScheduleCommunicationRefreshButton()
	{
		try 
		{
			dropdownDateSelection();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		waitForElementToBeVisible(scheduleCommunicationButton);
		clickElement(scheduleCommunicationButton);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(resetButton);

		if (isElementDisplayed(resetButton))
		{
			clickElement(resetButton);
			System.out.println("Reset Button clicked");
			waitForInvisibility(loaderIcon);

			clickElement(scheduleCommunicationCloseButtton);

			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean verifyScheduleCommunicationRefreshRecipientsButton()
	{
		try 
		{
			dropdownDateSelection();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		waitForElementToBeVisible(scheduleCommunicationButton);
		clickElement(scheduleCommunicationButton);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(refreshRecipientsButton);

		if (isElementDisplayed(refreshRecipientsButton))
		{
			clickElement(refreshRecipientsButton);
			System.out.println("Refresh Recipients Button clicked");
			waitForInvisibility(loaderIcon);
			clickElement(scheduleCommunicationCloseButtton);

			return true;
		}
		else
		{
			return false;
		}
	}



	public boolean verifyScheduledByHyperlink() 
	{
		try 
		{
			dropdownDateSelection();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		waitForElementToBeVisible(scheduledBysearchbox);
		clickElement(scheduledBysearchbox);
		scheduledBysearchbox.clear();
		scheduledBysearchbox.sendKeys("Steve Roebuck");
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(scheduledByHyperlink))
		{
			clickElement(scheduledByHyperlink);
			waitForInvisibility(loaderIcon);
			try 
			{
				pressEscapeKey();
			} 
			catch (AWTException e) 
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

	public boolean verifyNewTemplateButton() 
	{
		try 
		{
			dropdownDateSelection();
		} 
		catch (AWTException e) 
		{
			e.printStackTrace();
		}

		waitForElementToBeVisible(newTemplateButton);

		if (isElementDisplayed(newTemplateButton))
		{
			clickElement(newTemplateButton);
			waitForInvisibility(loaderIcon);
			clickElement(newTemplateCloseButton);

			return true;
		}
		else
		{
			return false;				
		}
	}

	public boolean verifyStatusCancel() 
	{
		try 
		{
			dropdownDateSelect();
			waitForInvisibility(loaderIcon);
			selectStatusFilters();

			statuSsearchbox.sendKeys("Cancelled");
			waitForInvisibility(loaderIcon);

			if (isElementDisplayed(actionButton))
			{
				return false;
			}

		}
		catch (AWTException e) 
		{
			e.printStackTrace();
		}
		return true;
	}

	public boolean verifyStatusProcessed() throws AWTException 
	{
		dropdownDateSelect();
		waitForInvisibility(loaderIcon);
		selectStatusFilters();

		statuSsearchbox.sendKeys("Processed");
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(closeButton);

		if (isElementDisplayed(closeButton))
		{
			clickElement(closeButton);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyStatusScheduled() throws AWTException 
	{
		dropdownDateSelect();
		waitForInvisibility(loaderIcon);
		selectStatusFilters();

		statuSsearchbox.sendKeys("Scheduled");
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(closeButton);

		if (isElementDisplayed(closeButton))
		{
			clickElement(closeButton);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyStatusPendingApproval() throws AWTException 
	{
		dropdownDateSelect();
		waitForInvisibility(loaderIcon);
		selectStatusFilters();

		statuSsearchbox.sendKeys("Pending Approval");
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);

		waitForElementToBeVisible(closeButton);

		if (isElementDisplayed(closeButton))
		{
			clickElement(closeButton);
			return true;
		}
		else
		{
			return false;
		}
	}
}
