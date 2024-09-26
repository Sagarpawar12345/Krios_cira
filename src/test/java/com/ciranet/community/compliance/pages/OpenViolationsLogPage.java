package com.ciranet.community.compliance.pages;

import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class OpenViolationsLogPage extends BasePage 
{
	public OpenViolationsLogPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox;

	@FindBy(xpath = "(//span[contains(text(),'Amberwood')])[1]")
	WebElement amberwoodCommunity;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Compliance')]")
	WebElement navigationCompliance;

	@FindBy(xpath = "//span[contains(text(),'Open Violations Log')]")
	WebElement navigationOpenViolationsLog;

	@FindBy(xpath = "//h2[text()=' Open Violations Log ']")
	WebElement pageTitle;

	@FindBy(xpath = "(//a[@class='cc-hyperlink dx-theme-accent-as-text-color'])[9]")
	WebElement logDetails;

	@FindBy(xpath = "//div[text()='Open Violations Log Detail']")
	WebElement logDetailsLabel;

	@FindBy(xpath = "(//i[@class='cc-1-5x cc-hyperlink dx-theme-accent-as-text-color fas fa-history'])[1]")
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

	public String openViolationsLogMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(communityIcon);
		clickElement(textBox);
		enterText(textBox, "Amberwood");
		textBox.sendKeys(Keys.ENTER);
		clickElement(amberwoodCommunity);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));

		clickElementJS(crossMark);
		waitForInvisibility(loaderIcon);

		clickElement(navigationCompliance);
		waitForInvisibility(loaderIcon);
		clickElement(navigationOpenViolationsLog);
		waitForInvisibility(loaderIcon);
		return pageTitle.getText();
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
