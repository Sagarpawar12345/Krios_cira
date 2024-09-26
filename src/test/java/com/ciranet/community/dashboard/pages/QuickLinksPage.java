package com.ciranet.community.dashboard.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;


public class QuickLinksPage extends BasePage{
	// Initializing the Page Objects:
	public QuickLinksPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-map-marker-alt']")
	WebElement communitySearchIcon;

	@FindBy(xpath="//input[@role='textbox']")
	WebElement searchCommunityTextBox;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement searchIcon;
	
	@FindBy(xpath = "//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover']//span[contains(text(),'Amberwood')]")
	WebElement communityLinkClick;
	
	@FindBy(xpath="//h4[@class='popup-title-text']")
	WebElement communityAlert;
	
	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertCloseIcon;
	
	@FindBy(xpath="//div[@class='dx-loadpanel-content-wrapper']")
	WebElement loaderIcon;

	@FindBy(xpath = "//h3[@class='tile-header page-header']//span[normalize-space()='Quick Links']")
	WebElement quickLinks;

	@FindBy(partialLinkText = "Add / Edit Project - Tasks")
	WebElement addEditProjectTasksLink;
	
	@FindBy(xpath="//h3[@class='tile-header page-header']//span[normalize-space()='Community Metrics']")
	WebElement communityMetrics;
	
	@FindBy(xpath = "//dx-button[@title='Community Search']")
	WebElement communityIcon;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	WebElement communitysearchBox;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement communitysearchButton;
		
	public boolean verifyQuickLinksText() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(communityIcon);
	    clickElement(communityIcon);
	    waitForElementToBeVisible(communitysearchBox);
	    clickElement(communitysearchBox);
	    communitysearchBox.sendKeys("Amberwood");
	    clickElement(communitysearchButton);

	    waitForElementToBeVisible(communityLinkClick);
		
	    clickElement(communityLinkClick);
        ArrayList<String> communityTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(communityTab.get(1));
				
		if(isElementDisplayed(communityAlert)) 
		{
			clickElementJS(communityAlertCloseIcon);			
		}	
		
		waitForInvisibility(loaderIcon);
		scrollToElement(quickLinks);
		waitForInvisibility(loaderIcon);
		
		if (isElementDisplayed(quickLinks)) {
			return true;
		}
		else {
			return false;
		}	
    }
	
	// This method is used to check the Window Tab gets opened and returns status as True or False.
	public boolean verifyQuickLinksClick(String linkText) {
		if (!isElementDisplayed(driver.findElement(By.xpath("//div[@class='context-summary context-summary-lg']")))) {
			verifyQuickLinksText();
		}
		WebElement elementLink = driver.findElement(By.partialLinkText(linkText));
		
		waitForElementToBeClickable(elementLink);
		scrollToElement(elementLink);
		clickElementJS(elementLink);
		waitForInvisibility(loaderIcon);
		
		ArrayList<String> quickLinksTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(quickLinksTab.get(2));
		waitForInvisibility(loaderIcon);
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is : "+ pageTitle);
		driver.close();
		driver.switchTo().window(quickLinksTab.get(1));
		return true;
	}
	
	// This method is used to check the Popup's Title and closes the popup by pressing ESC button.
	public String verifyQuickLinksClickAndPressEscapeButton(String linkText) {
		if (!isElementVisible(By.xpath("//div[@class='context-summary context-summary-lg']"))) {
			verifyQuickLinksText();
		}
		
		Actions actions = new Actions(driver);

		waitForInvisibility(loaderIcon);
		scrollToElement(quickLinks);

		WebElement elementLink = driver.findElement(By.partialLinkText(linkText));
		isElementVisible(By.partialLinkText(linkText));
		
		waitForElementToBeClickable(elementLink);
		scrollToElement(elementLink);
		clickElementJS(elementLink);
		waitForInvisibility(loaderIcon);
		WebElement popup = driver.findElement(By.xpath("//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']"));
		String popupTitle = popup.getText();
		System.out.println("Popup Title is " + popupTitle);
		actions.sendKeys(Keys.ESCAPE).perform();
		return popupTitle;
	}
}
