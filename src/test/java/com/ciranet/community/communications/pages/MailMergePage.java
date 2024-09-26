package com.ciranet.community.communications.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;

public class MailMergePage extends BasePage
{
	public MailMergePage(WebDriver driver) 
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

	@FindBy(xpath = "//span[normalize-space()='Mail Merge']")
	WebElement mailMergeMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblheader;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon'][1]")
	WebElement dropdownClick;

	@FindBy(xpath = "//div[contains(text(),'Labels')]")
	WebElement labelsDropdownValue;

	@FindBy(xpath = "//div[contains(text(),'Letters')]")
	WebElement lettersDropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Browse'][1]")
	WebElement browseButton;

	@FindBy(xpath ="//a[@class='fas fa-question-circle']")
	WebElement helpMailMerge;

	@FindBy(xpath ="//span[normalize-space()='Create Labels']")
	WebElement createLabelsButton;

	@FindBy(xpath ="//span[normalize-space()='Create Letters']")
	WebElement createLettersButton;

	@FindBy(xpath ="(//span[@class='dx-checkbox-icon'])[2]")
	WebElement checkBox;

	@FindBy(xpath ="//span[normalize-space()='View/Save Standard Letterhead Template']")
	WebElement viewSaveStandardLetterheadTemplate;

	@FindBy(xpath ="//span[normalize-space()='R0106756L0064612']")
	WebElement customerId;

	@FindBy(xpath ="//span[normalize-space()='Alexis Celis & Juana M Luna']")
	WebElement combinedOwner;

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

		scrollToElement(mailMergeMenu);

		if (isElementDisplayed(mailMergeMenu))
		{
			waitForInvisibility(loaderIcon);
			clickElement(mailMergeMenu);
			waitForInvisibility(loaderIcon);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyDropdownselection() 
	{
		waitForElementToBeVisible(dropdownClick);
		if (isElementDisplayed(dropdownClick))
		{
			clickElement(dropdownClick);

			if (isElementDisplayed(labelsDropdownValue))
			{
				clickElement(labelsDropdownValue);
				waitForInvisibility(loaderIcon);

				if (isElementDisplayed(dropdownClick))
				{
					clickElement(dropdownClick);
					clickElement(lettersDropdownValue);
					waitForInvisibility(loaderIcon);
					waitForElementToBeVisible(browseButton);
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyCreateLabels() 
	{
		waitForElementToBeVisible(dropdownClick);
		if (isElementDisplayed(dropdownClick))
		{
			clickElement(dropdownClick);

			if (isElementDisplayed(labelsDropdownValue))
			{
				clickElement(labelsDropdownValue);
				waitForInvisibility(loaderIcon);

				clickElement(checkBox);
				waitForInvisibility(loaderIcon);

				clickElement(createLabelsButton);
				waitForInvisibility(loaderIcon);
			}
			return true;
		}
		return false;
	}

	public boolean verifyBrowseButton() throws AWTException 
	{
		clickElement(dropdownClick);
		clickElement(lettersDropdownValue);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(browseButton);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(browseButton))
		{
			clickElement(browseButton);

			Robot robot = new Robot();  // Robot class throws AWT Exception

			StringSelection s = new StringSelection(System.getProperty("user.dir") +
					"\\src\\test\\java\\com\\ciranet\\testdata\\Template.rtf");

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

			waitForElementToBeVisible(checkBox);

			clickElement(checkBox);
			waitForInvisibility(loaderIcon);
			waitForInvisibility(loaderIcon);

			waitForElementToBeVisible(createLettersButton);
			waitForInvisibility(loaderIcon);

			clickElement(createLettersButton);
			waitForInvisibility(loaderIcon);

			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean verifyViewSaveStandardLetterheadTemplate() throws AWTException 
	{

		clickElement(dropdownClick);
		clickElement(lettersDropdownValue);
		waitForInvisibility(loaderIcon);


		Robot robot = new Robot();  // Robot class throws AWT Exception

		if (isElementDisplayed(viewSaveStandardLetterheadTemplate))
		{
			clickElement(viewSaveStandardLetterheadTemplate);
			waitForInvisibility(loaderIcon);

			//pressing enter
			robot.keyPress(KeyEvent.VK_ENTER);

			//releasing enter
			robot.keyRelease(KeyEvent.VK_ENTER);

			return true;
		}

		else
		{
			return false;
		}
	}

	public boolean helpMailMerge() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(helpMailMerge);
		clickElement(helpMailMerge);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		waitForInvisibility(loaderIcon);
		driver.close();
		driver.switchTo().window(tabs2.get(1));
		waitForElementToBeVisible(helpMailMerge);
		return true;
	}

	public boolean verifyCustomerIdhyperlink() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(customerId);
		clickElement(customerId);
		waitForInvisibility(loaderIcon);

		// Get a list of all open window handles
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		waitForInvisibility(loaderIcon);

		// Switch to the remaining tab (second tab in this case)
		driver.switchTo().window(windowHandles.get(2));

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

		// Switch to the remaining tab (second tab in this case)
		driver.switchTo().window(windowHandles.get(1));

		return true;
	}


	public boolean verifyCombinedOwnerhyperlink() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(combinedOwner);
		clickElement(combinedOwner);
		waitForInvisibility(loaderIcon);

		// Get a list of all open window handles
		List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		waitForInvisibility(loaderIcon);

		// Switch to the remaining tab (second tab in this case)
		driver.switchTo().window(windowHandles.get(2));

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

		// Switch to the remaining tab (second tab in this case)
		driver.switchTo().window(windowHandles.get(1));
		return true;
	}





}