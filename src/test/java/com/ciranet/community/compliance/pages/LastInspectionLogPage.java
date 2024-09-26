package com.ciranet.community.compliance.pages;

import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class LastInspectionLogPage extends BasePage 
{
	public LastInspectionLogPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox;

	@FindBy(xpath = "//span[contains(text(),'Herff Ranch')]")
	WebElement herffRanchCommunity;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Compliance')]")
	WebElement navigationCompliance;

	@FindBy(xpath = "//span[contains(text(),'Last Inspection Log')]")
	WebElement navigationLastInspectionLog;

	@FindBy(xpath = "//h2[text()=' Last Inspection Log ']")
	WebElement pageTitle;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	private WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	private WebElement normalScreenIcon;

	@FindBy(xpath = "(//a[@class='cc-hyperlink dx-theme-accent-as-text-color'])[1]")
	WebElement logDetails;

	@FindBy(xpath = "//div[contains(text(),'Last Inspection Results Detail: Architectural / Last 180 Days')]")
	WebElement logDetailsLabel;

	@FindBy(xpath = "(//i[@title='History'])[1]")
	WebElement historyIcon;

	@FindBy(xpath = "//h4[text()='Violation History']")
	WebElement violationHistory;

	@FindBy(xpath = "(//i[@title='Images'])[1]")
	WebElement imageIcon;

	@FindBy(xpath = "//div[text()='Violation History Images']")
	WebElement historyImages;

	@FindBy(xpath = "(//dx-button[@title='Close'])[3]")
	WebElement imageCloseButton;

	@FindBy(xpath = "(//dx-button[@title='Close'])[2]")
	WebElement historyCloseButton;

	@FindBy(xpath = "(//dx-button[@title='Close'])[1]")
	WebElement logCloseButton;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public String lastInspectionLogMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(communityIcon);
		clickElement(textBox);
		enterText(textBox, "Herff Ranch");
		textBox.sendKeys(Keys.ENTER);
		clickElement(herffRanchCommunity);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));

		clickElementJS(crossMark);
		waitForInvisibility(loaderIcon);

		clickElement(navigationCompliance);
		waitForInvisibility(loaderIcon);
		clickElementJS(navigationLastInspectionLog);
		waitForInvisibility(loaderIcon);
		return pageTitle.getText();
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

	public String logDetails()
	{
		waitForInvisibility(loaderIcon);
		clickElement(logDetails);
		return logDetailsLabel.getText();
	}

	public String violationHistory() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(historyIcon);
		return violationHistory.getText();
	}

	public String historyImage() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(imageIcon);
		return historyImages.getText();
	}

	public String closeButtons() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(imageCloseButton);

		waitForInvisibility(loaderIcon);
		clickElement(historyCloseButton);

		waitForInvisibility(loaderIcon);
		clickElement(logCloseButton);

		waitForInvisibility(loaderIcon);
		return pageTitle.getText();
	}
}
