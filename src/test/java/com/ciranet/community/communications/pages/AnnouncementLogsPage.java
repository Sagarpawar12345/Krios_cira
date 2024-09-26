package com.ciranet.community.communications.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;

public class AnnouncementLogsPage extends BasePage
{
	public AnnouncementLogsPage(WebDriver driver) 
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

	@FindBy(xpath = "//span[normalize-space()='Announcement Logs']")
	WebElement announcementLogsMenu;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[contains(text(),'Active')]")
	WebElement activeTab;

	@FindBy(xpath = "//div[contains(text(),'Expired')]")
	WebElement expiredTab;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath="//div[@role='toolbar']//div[@class='dx-toolbar-before']")
	WebElement addNewAnnouncementPopup;

	@FindBy(xpath="//span[normalize-space()='Add New Announcement']")
	WebElement addNewAnnouncementButton;

	@FindBy(xpath="//input[contains(@aria-required,'true')]")
	WebElement addEditAnnouncementHeading;

	@FindBy(xpath="//input[contains(@aria-activedescendant,'dx-201449ea-0020-eae0-abd5-6ab2e7ea47ce')]")
	WebElement addEditAnnouncementReleaseDate;

	@FindBy(xpath="(//input[@autocomplete='off'])[4]")
	WebElement addEditAnnouncementExpires;

	@FindBy(xpath="//textarea[contains(@autocomplete,'off')]")
	WebElement addEditAnnouncementContent;

	@FindBy(xpath="//span[normalize-space()='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath="(//I[@class='dx-icon dx-icon-edit'])[1]")
	WebElement editButton;

	@FindBy(xpath="(//i[@class='dx-icon far fa-trash-alt'])[1]")
	WebElement deleteButton;

	@FindBy(xpath="//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']")
	WebElement announcementAddMessage;

	@FindBy(xpath="//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']")
	WebElement announcementDeleteMessage;

	@FindBy(xpath="//span[@class='dx-button-text'][text()='Yes']")
	WebElement announcementDeleteYesButton;
	
	@FindBy(xpath ="//a[@class='fas fa-question-circle']")
	WebElement helpAnnouncements;

	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
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

		scrollToElement(announcementLogsMenu);


		if (isElementDisplayed(announcementLogsMenu))
		{
			waitForInvisibility(loaderIcon);
			clickElement(announcementLogsMenu);

			waitForInvisibility(loaderIcon);

			return true;

		}
		else
		{
			return false;
		}
	}

	public boolean verfiyswitchingtabs() 
	{
		waitForElementToBeVisible(expiredTab);

		if (isElementDisplayed(expiredTab))
		{

			clickElement(expiredTab);
			waitForInvisibility(loaderIcon);

			waitForElementToBeVisible(activeTab);
			clickElement(activeTab);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;	
		}

	}

	public boolean verfiyaddNewAnnouncement() 
	{
		waitForElementToBeVisible(addNewAnnouncementButton);

		if (isElementDisplayed(addNewAnnouncementButton))
		{
			clickElement(addNewAnnouncementButton);
			waitForInvisibility(loaderIcon);
			
			waitForElementToBeVisible(addEditAnnouncementHeading);
			clickElement(addEditAnnouncementHeading);
			addEditAnnouncementHeading.sendKeys("Added Announcement");

			// Get today's date
			LocalDate today = LocalDate.now();

			// Add one day to get tomorrow's date
			LocalDate tomorrow = today.plusDays(1);

			// Define the date format you need
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

			// Format tomorrow's date as a string
			String tomorrowDate = tomorrow.format(formatter);

			// Use sendKeys to enter tomorrow's date in the web element
			// Assuming addEditAnnouncementExpires is the WebElement for the expiration date field
			addEditAnnouncementExpires.sendKeys(tomorrowDate);
			waitForInvisibility(loaderIcon);

			clickElement(addEditAnnouncementContent);
			addEditAnnouncementContent.sendKeys("Add and Edit Announcement contents");

			clickElement(saveButton);
			waitForInvisibility(loaderIcon);

			return true;
		}
		else
		{
			return false;	
		}

	}

	public boolean verfiyeditAnnouncement() 
	{
		waitForElementToBeVisible(activeTab);
		waitForElementToBeVisible(editButton);
		clickElement(editButton);
		waitForInvisibility(loaderIcon);

		clickElement(addEditAnnouncementContent);
		addEditAnnouncementContent.clear();
		addEditAnnouncementContent.sendKeys("Edited Announcement contents");

		clickElement(saveButton);
		waitForInvisibility(loaderIcon);

		if (isElementVisible(By.xpath("//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']")))
		{
			waitForInvisibility(loaderIcon);
			
		}
		return true;
	}

	public boolean verfiydeleteAnnouncement() 
	{
		clickElement(deleteButton);
		waitForInvisibility(loaderIcon);

		clickElement(announcementDeleteYesButton);
		waitForInvisibility(loaderIcon);

		if (isElementVisible(By.xpath("//div[@class='dx-overlay-content dx-toast-success dx-toast-content dx-resizable']")))
		{
			waitForInvisibility(loaderIcon);
		}
		return true;
	}
	
	public boolean verifyHelpAnnouncements() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(helpAnnouncements);
		clickElement(helpAnnouncements);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		waitForInvisibility(loaderIcon);
		driver.close();
		driver.switchTo().window(tabs2.get(1));
		waitForElementToBeVisible(helpAnnouncements);
		return true;
	}

}



