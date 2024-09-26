package com.ciranet.corporatecirabooks.accountsreceivable.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class NewARPaymentPage extends BasePage
{
	public NewARPaymentPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'CiraBooks Corporate')]")
	private WebElement corporateCiraBooks;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Accounts Receivable')]") 
	private WebElement  accountsReceivable;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'New AR Payment')]")
	private WebElement  newARPayment;

	@FindBy(xpath = "//h2[contains(text(),'New AR Payment')]")
	public WebElement  newARPaymentLabel;

	@FindBy(xpath = "//input[@role='combobox']")
	public WebElement companyDropdown;

	@FindBy(xpath = "//div[contains(text(),'CiraManagement')]")
	public WebElement ciraManagement;

	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	public WebElement customerDropdown;

	@FindBy(xpath = "(//td[@aria-describedby='dx-col-1'])[2]")
	public WebElement customerValue;

	@FindBy(xpath = "//input[@role='spinbutton']")
	public WebElement paymentAmount;

	@FindBy(xpath = "//dx-text-box[@placeholder='(e.g. Check Number)']//input[@role='textbox']")
	public WebElement paymentDescription;

	@FindBy(xpath = "//textarea[@role='textbox']")
	public WebElement description;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "(//div[@class='dx-button-content'])[24]")
	public WebElement noButton;

	@FindBy(xpath = "//div[@class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable dx-popup-inherit-height']")
	public WebElement confirmationPopup;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;

	public String newARPaymentMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(corporateCiraBooks);
		clickElementJS(accountsReceivable);
		waitForInvisibility(loaderIcon);
		scrollToElement(newARPayment);
		clickElement(newARPayment);
		waitForInvisibility(loaderIcon);
		return newARPaymentLabel.getText();
	}

	public boolean createAR()
	{
		waitForInvisibility(loaderIcon);
		clickElement(companyDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(ciraManagement);

		waitForInvisibility(loaderIcon);
		clickElement(customerDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(customerValue);
		waitForInvisibility(loaderIcon);

		clickElement(paymentAmount);
		waitForInvisibility(loaderIcon);
		enterText(paymentAmount, "10");
		waitForInvisibility(loaderIcon);

		clickElement(paymentDescription);
		waitForInvisibility(loaderIcon);
		enterText(paymentDescription, "123");
		waitForInvisibility(loaderIcon);

		clickElement(description);
		waitForInvisibility(loaderIcon);
		enterText(description, "New AR Payment");
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		scrollToElement(saveButton);
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		if(isElementDisplayed(confirmationPopup))
		{
			waitForInvisibility(loaderIcon);		
			clickElement(noButton);
			waitForInvisibility(loaderIcon);				
			return true;
		}
		else
		{
			return false;
		}
	}
}
