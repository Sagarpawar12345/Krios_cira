package com.ciranet.community.dashboard.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class CommunityMetricsPage extends BasePage {

	public CommunityMetricsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='dx-button-content']//i[@class='dx-icon fas fa-map-marker-alt']")
	WebElement communitySearchIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement searchCommunityTextBox;

	@FindBy(xpath = "//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement searchIcon;

	@FindBy(xpath = "//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover']//span[contains(text(),'Herff Ranch')]")
	WebElement herffRanchCommunity;

	@FindBy(xpath = "//h4[@class='popup-title-text']")
	WebElement communityAlert;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertCloseIcon;

	@FindBy(xpath = "//h3[@class='tile-header page-header']//span[normalize-space()='Community Metrics']")
	WebElement communityMetrics;

	@FindBy(xpath = "//dx-box[@id='tile-content-1-community-metrics-widget']//span[@title='Toggle Fullscreen']")
	WebElement toggleFullscreen;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//span[normalize-space()='Lawsuits']")
	WebElement lawsuitsLink;

	@FindBy(xpath = "//div[contains(text(),'Lawsuits')]")
	WebElement lawsuitsTitle;

	@FindBy(xpath = "//div[contains(text(),'Add New Lawsuit')]")
	WebElement addLawsuitButton;

	@FindBy(xpath = "//div[@class='dx-texteditor-input-container']//input[@name='causeNumber']")
	WebElement causeNumberTextBox;

	@FindBy(xpath = "//div[@class='dx-texteditor-input-container']//input[@name='causeTitle']")
	WebElement causeTitleTextBox;

	@FindBy(xpath = "//div[@class='dx-texteditor-input-container']//textarea[@name='description']")
	WebElement descriptionTextBox;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//i[@class='fas fa-ellipsis-h']")
	WebElement attorney;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Select')])[1]")
	WebElement selectButton;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[31]")
	WebElement lawsuitShowIcon;

	@FindBy(xpath = "//div[contains(text(),'Show All')]")
	WebElement lawsuitShowAll;

	@FindBy(xpath = "(//div[@class='dx-texteditor-input-container']//input[@type='text'])[76]")
	WebElement unsatisfiedJudgementalAmountTextBox;

	@FindBy(xpath = "(//div[@class='dx-texteditor-input-container']//input[@type='text'])[77]")
	WebElement deactiveDate;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[12]")
	WebElement actionButton;

	@FindBy(xpath="//div[contains(text(),'Edit Lawsuit')]")
	WebElement editLawsuitLabel;

	@FindBy(xpath="//div[@class='dx-button-content']//span[normalize-space()='Close']")
	WebElement closeLawsuit;

	@FindBy(xpath="//a[@class='cc-hyperlink dx-theme-accent-as-text-color']//span[normalize-space()='Registered ACH Owners']")
	WebElement registeredACHOwners;

	@FindBy(xpath="//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover']//span[normalize-space()='113 Cactus Pear, LLC']")
	WebElement combinedOwner;

	@FindBy(xpath="//h2[@class='page-header']//span[contains(text(),'Property Owner Details')]")
	WebElement propertyOwnerDetail;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Community Alerts']")
	WebElement propertyCommunityAlert;

	@FindBy(xpath="//dx-button[@title='Close']//span[@class='dx-button-text'][normalize-space()='Close']")
	WebElement closeACHOwner;

	@FindBy(xpath="//span[normalize-space()='Open Work']")
	WebElement openWorkTab;

	@FindBy(xpath="//a[@class='cc-hyperlink dx-theme-accent-as-text-color']//span[normalize-space()='Email (accounting)']")
	WebElement emailAccounting;

	@FindBy(xpath="//span[normalize-space()='Compose New']")
	WebElement composeEmailLabel;
	public String communityMetricsPage() {

		waitForInvisibility(loaderIcon);
		clickElement(communitySearchIcon);
		waitForInvisibility(loaderIcon);
		clickElement(searchCommunityTextBox);
		waitForInvisibility(loaderIcon);
		searchCommunityTextBox.sendKeys("Herff Ranch");
		waitForInvisibility(loaderIcon);
		clickElement(searchIcon);
		waitForInvisibility(loaderIcon);
		clickElement(herffRanchCommunity);
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));
		if (isElementDisplayed(communityAlert)) {
			clickElement(communityAlertCloseIcon);

		}
		waitForInvisibility(loaderIcon);
		scrollToElement(communityMetrics);
		waitForInvisibility(loaderIcon);
		clickElement(toggleFullscreen);
		waitForInvisibility(loaderIcon);
		return communityMetrics.getText();

	}

	public String addLawsuit() {
		waitForInvisibility(loaderIcon);
		clickElement(lawsuitsLink);
		waitForInvisibility(loaderIcon);
		clickElement(lawsuitShowIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(lawsuitShowAll);
		waitForInvisibility(loaderIcon);
		clickElementJS(addLawsuitButton);
		waitForInvisibility(loaderIcon);
		String popupTitle = lawsuitsTitle.getText();
		clickElement(causeNumberTextBox);
		causeNumberTextBox.sendKeys("Test the Cause Numbers23");
		waitForInvisibility(loaderIcon);
		clickElement(causeTitleTextBox);
		causeTitleTextBox.sendKeys("Test the Cause Title");
		waitForInvisibility(loaderIcon);
		clickElement(descriptionTextBox);
		descriptionTextBox.sendKeys("Test Description");
		waitForInvisibility(loaderIcon);
		clickElement(attorney);
		waitForInvisibility(loaderIcon);
		clickElement(selectButton);
		waitForInvisibility(loaderIcon);
		clickElement(unsatisfiedJudgementalAmountTextBox);
		waitForInvisibility(loaderIcon);
		unsatisfiedJudgementalAmountTextBox.sendKeys("10");
		waitForInvisibility(loaderIcon);
		clickElementJS(deactiveDate);
		waitForInvisibility(loaderIcon);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY");
		String currentDate = LocalDate.now().format(formatter);
		deactiveDate.sendKeys(currentDate);
		deactiveDate.sendKeys(Keys.ENTER);
		waitForInvisibility(loaderIcon);
		clickElementJS(saveButton);
		waitForInvisibility(loaderIcon);
		return popupTitle;
	}
	public String editLawsuit() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		String labelEditLawsuit=editLawsuitLabel.getText();
		clickElement(descriptionTextBox);
		descriptionTextBox.clear();   
		descriptionTextBox.sendKeys("Edit the test description");
		causeNumberTextBox.sendKeys(Keys.ENTER);
		waitForInvisibility(loaderIcon);
		clickElementJS(saveButton);
		waitForInvisibility(loaderIcon);
		clickElement(closeLawsuit);
		waitForInvisibility(loaderIcon);
		return labelEditLawsuit;
	}

	public String registeredACHOwners() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(registeredACHOwners);
		waitForInvisibility(loaderIcon);
		clickElement(combinedOwner);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownerDetails = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownerDetails.get(2));
		if (isElementDisplayed(propertyCommunityAlert)) {
			clickElement(communityAlertCloseIcon);

		}
		waitForInvisibility(loaderIcon);
		String ownerDetail= propertyOwnerDetail.getText();	
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList achOwnerDetails = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) achOwnerDetails.get(1));
		waitForInvisibility(loaderIcon);
		clickElement(closeACHOwner);
		waitForInvisibility(loaderIcon);

		return ownerDetail;	   

	}

	public boolean tabSwitching() {
		waitForInvisibility(loaderIcon);
		clickElement(openWorkTab);
		if(isElementEnabled(openWorkTab)) {
			return true;		   
		}
		return false;
	}
	public String workArea() {
		waitForInvisibility(loaderIcon);
		clickElement(emailAccounting);
		waitForInvisibility(loaderIcon);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList emailCompose = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) emailCompose.get(3));
		waitForInvisibility(loaderIcon);
		String labelComposeEmail= composeEmailLabel.getText();
		waitForInvisibility(loaderIcon);
		driver.close();
		return labelComposeEmail;
	}

}
