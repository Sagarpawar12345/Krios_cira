package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ResponseTemplatesPage extends BasePage 
{
	public ResponseTemplatesPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='Configurations']")
	WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Response Templates')]")
	WebElement responseTemplate;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	WebElement contextDropDown;

	@FindBy(xpath = "//div[normalize-space()='RealManage']")
	WebElement contextValue;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	WebElement templateDropDown;

	@FindBy(xpath = "(//div[@class='config-tree-menu-item'])[1]")
	WebElement templateDropDownValue;

	@FindBy(xpath = "//div[@class='dx-item dx-box-item']//h2[contains(text(),'Response Templates Configurations')]")
	public WebElement labelResponseTemplateConfiguration;
	
	@FindBy(xpath = "//dx-toolbar[@class='dx-toolbar dx-widget dx-theme-border-color-as-background-color dx-visibility-change-handler dx-collection']//div[@class='dx-toolbar-items-container']")
	WebElement contextTemplateTitle;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public String verifyResponseTemplateMenu() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		waitForElementToBeClickable(configurations);
		clickElement(configurations);
		waitForInvisibility(loaderIcon);
		scrollToElement(responseTemplate);
		clickElement(responseTemplate);
		waitForInvisibility(loaderIcon);
		return labelResponseTemplateConfiguration.getText();

	}
	
	public boolean verifyResponseTemplateDropdownSelection() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		waitForElementToBeClickable(configurations);
		clickElement(configurations);
		waitForInvisibility(loaderIcon);
		scrollToElement(responseTemplate);
		clickElement(responseTemplate);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);
		waitForElementToBeClickable(contextDropDown);
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);
		waitForElementToBeClickable(contextValue);
		waitForInvisibility(loaderIcon);
		clickElement(templateDropDown);
		waitForElementToBeClickable(templateDropDown);
		waitForInvisibility(loaderIcon);
		clickElement(templateDropDownValue);
		waitForElementToBeClickable(templateDropDownValue);
		return isElementDisplayed(contextTemplateTitle);

	}


}