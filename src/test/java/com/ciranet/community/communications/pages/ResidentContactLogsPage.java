package com.ciranet.community.communications.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ciranet.basepage.BasePage;

public class ResidentContactLogsPage extends BasePage {
	public ResidentContactLogsPage(WebDriver driver) {
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

	@FindBy(xpath = "//span[normalize-space()='Resident Contact Logs']")
	WebElement residentContactLogsMenu;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//span[@class='dx-button-text']")
	WebElement alertPopupAddButton;

	@FindBy(xpath = "//h4[@class='popup-title-text']")
	WebElement communityAlertsPopup;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertsCloseButton;

	@FindBy(xpath = "//i[@class='fa fa-bullhorn announcement-button']")
	WebElement announcementButton;

	@FindBy(xpath = "//span[normalize-space()='2403']")
	WebElement historicalHyperlink;

	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement lblheader;

	public void pressEscapeKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public boolean searchCommunity(String communitySearchKeyword) {
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

		try {
			pressEscapeKey();
		} catch (AWTException e) {
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

		scrollToElement(residentContactLogsMenu);

		if (isElementDisplayed(residentContactLogsMenu)) {
			waitForInvisibility(loaderIcon);
			clickElement(residentContactLogsMenu);

			waitForInvisibility(loaderIcon);

			return true;

		} else {
			return false;
		}
	}

	public boolean verfiyHistoricalHyperlink() {
		waitForElementToBeVisible(historicalHyperlink);

		if (isElementDisplayed(historicalHyperlink)) {

			clickElement(historicalHyperlink);
			waitForInvisibility(loaderIcon);
			waitForInvisibility(loaderIcon);

			// Maximize the new window
			driver.manage().window().maximize();
			waitForInvisibility(loaderIcon);

			try {
				pressEscapeKey();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			waitForInvisibility(loaderIcon);

			return true;
		} else {
			return false;
		}

	}

}
