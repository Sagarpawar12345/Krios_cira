package com.ciranet.myworkqueue.communitymanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
//Every line of code that runs in Java must be inside a class
public class ViolationReviewPage extends BasePage 
{
	public ViolationReviewPage(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	private WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	private WebElement normalScreenIcon;

	@FindBy(xpath = "(//div[@class='dx-button-content'])[31]")
	WebElement actionsButton;

	@FindBy(xpath = "//div[text()='Violation Inspection History']")
	WebElement violationHistoryPopupTitle;

	@FindBy(xpath = "//span[text()='Approve']")
	WebElement approveButton;

	@FindBy(xpath = "//div[@aria-label='No']")
	WebElement noButton;

	@FindBy(xpath = "(//textarea[@class='dx-texteditor-input'])[1]")
	WebElement violationNotesTextArea;

	@FindBy(xpath = "(//i[@title='Images'])[2]")
	WebElement imagesColumn;

	@FindBy(xpath = "(//dx-button[@aria-label='Close'])[2]")
	WebElement closeButton;

	@FindBy(xpath = "(//i[@title='Logs'])[2]")
	WebElement logsColumn;

	@FindBy(xpath = "(//dx-button[@aria-label='Close'])[2]")
	WebElement logsCloseButton;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	WebElement myWorkQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementLabel;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Violation Review')]")
	WebElement violationReviewMenu;

	@FindBy(xpath = "//h2[contains(text(),'Open Violations Requiring Review')]")
	WebElement violationReviewLabel;	

	// method declaration
	public String ViolationReviewMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		clickElementJS(communityManagementLabel);
		clickElementJS(violationReviewMenu);
		waitForInvisibility(loaderIcon);
		return violationReviewLabel.getText();
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

	public String ViolationInspectionHistoryPopup() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(actionsButton);
		waitForInvisibility(loaderIcon);

		String popupTitle = violationHistoryPopupTitle.getText();
		waitForInvisibility(loaderIcon);
		clickElementJS(approveButton);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(noButton);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(violationNotesTextArea);
		waitForInvisibility(loaderIcon);
		violationNotesTextArea.sendKeys("Violation Notes Requiring Review");
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(imagesColumn);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeButton);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(logsColumn);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(logsCloseButton);
		waitForInvisibility(loaderIcon);
		return popupTitle;
	}
}