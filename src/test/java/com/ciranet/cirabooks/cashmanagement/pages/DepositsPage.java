package com.ciranet.cirabooks.cashmanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class DepositsPage extends BasePage 
{
	public DepositsPage(WebDriver driver) 
	{
		super(driver);
	}

	// xpath For column Chooser
	@FindBy(xpath = "(//div[@class='header-text']//span[contains(text(),'CiraBooks')])[1]")
	private WebElement ciraBooks;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Cash Management')]")
	private WebElement cashManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Deposits')]")
	private WebElement deposits;

	@FindBy(xpath = "//div[@title='Column Chooser']//div[@class='dx-button-content']")
	private WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	private WebElement close;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	private WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	private WebElement normalScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-excel']")
	private WebElement exportExcel;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	WebElement communityDropdown;

	@FindBy(xpath = "(//div//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	private WebElement communityDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[12]")
	private WebElement addDepositButton;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[8]")
	private WebElement bankDropdown;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[14]")
	private WebElement searchBankDropdown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[5]")
	private WebElement searchBankValue;

	@FindBy(xpath = "(//input[@role='textbox'])[17]")
	private WebElement description;

	@FindBy(xpath = "(//td[@aria-label='Select row'])[1]")
	private WebElement checkbox;

	@FindBy(xpath = "//dx-button[@title='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[1]")
	private WebElement actionButton;

	@FindBy(xpath = "//div[@class='menu-text']")
	private WebElement viewmenu;

	@FindBy(xpath = "(//span[contains(text(),'Workspace')])[2]")
	public WebElement workspaceLabel;

	@FindBy(xpath = "//h2[contains(text(),'Deposits')]")
	public WebElement depositLabel;

	@FindBy(xpath = "//div[contains(text(),'Column Chooser')]")
	public WebElement columnChooserLabel;

	@FindBy(xpath = "//div[@role='presentation']//div[contains(text(),'Receive Date')]")
	public WebElement viewPopupColHeader;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[contains(text(),'Close')]")
	WebElement viewClose;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[contains(text(),'Add New Deposit')]")
	public WebElement addDepositLable;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public String depositsMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(ciraBooks);
		waitForInvisibility(loaderIcon);
		clickElementJS(cashManagement);
		waitForInvisibility(loaderIcon);
		clickElementJS(deposits);
		waitForInvisibility(loaderIcon);
		return depositLabel.getText();
	}

	public String addDeposits() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(communityDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(communityDropdownValue);
		waitForInvisibility(loaderIcon);

		waitForElementToBeClickable(addDepositButton);
		clickElement(addDepositButton);
		String addPopupTitle = addDepositLable.getText();
		waitForInvisibility(loaderIcon);
		clickElement(bankDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(searchBankDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(searchBankValue);
		waitForInvisibility(loaderIcon);

		clickElement(description);
		enterText(description, "Deposits-Test");
		waitForInvisibility(loaderIcon);

		clickElementJS(checkbox);
		waitForInvisibility(loaderIcon);

		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		return addPopupTitle;
	}

	public String columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(columnChooser);
		String colchooserTitle = columnChooserLabel.getText();
		waitForElementToBeClickable(close);
		clickElement(close);
		waitForInvisibility(loaderIcon);
		return colchooserTitle;
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

	public boolean verifyExportToExcel() 
	{
		if(isElementEnabled(exportExcel))
		{
			waitForInvisibility(loaderIcon);		
			clickElement(exportExcel);
			waitForInvisibility(loaderIcon);				
			return true;
		}
		else 
		{
			return false;
		}
	}

	public String viewMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(viewmenu);
		waitForInvisibility(loaderIcon);
		String viewPopupColumn = viewPopupColHeader.getText();
		clickElementJS(viewClose);
		waitForInvisibility(loaderIcon);
		return viewPopupColumn;
	}
}
