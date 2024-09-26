package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ProcessTrackerPage extends BasePage {
	public ProcessTrackerPage(WebDriver driver) 
	{
		super(driver);
	}


	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),' Configurations ')]")
	WebElement configurations;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Process Tracker')]")
	WebElement processTrackerLabel;

	@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[2]")
	WebElement configurationDropdown;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Community Auto Close & Report Generation')]")
	WebElement communityAutoCloseReportGeneration;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Financial Package Configuration')]")
	WebElement financialPackageConfiguration;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Process Tracker Configuration')]")
	WebElement processTrackerConfiguration;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement context;

	@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextvalue;

	@FindBy(xpath="//div[@class='dx-item-content dx-toolbar-item-content']//span[contains(text(),'Yes')]")
	WebElement confirmationNo;

	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Community Auto Close & Report Generation - Global')]")
	public WebElement labelCommunityAutoCloseReportGeneration;

	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Financial Package Configuration - Global')]")
	public WebElement labelFinancialPackageConfiguration;

	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Process Tracker Configuration - Global')]")
	public WebElement labelProcessTrackerConfiguration;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;




	public String communityAutoCloseReportGeneration() {
		waitForInvisibility(loaderIcon);
		clickElementJS(configurations);
		waitForInvisibility(loaderIcon);
		clickElementJS(processTrackerLabel);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(communityAutoCloseReportGeneration);
		waitForInvisibility(loaderIcon);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		return labelCommunityAutoCloseReportGeneration.getText();


	}

	public String financialPackageConfiguration() {
		waitForInvisibility(loaderIcon);
		clickElementJS(configurations);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);	
		clickElementJS(financialPackageConfiguration);
		waitForInvisibility(loaderIcon);
		clickElementJS(confirmationNo);
		waitForInvisibility(loaderIcon);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelFinancialPackageConfiguration.getText();


	}
	public String processTrackerConfiguration() {
		waitForInvisibility(loaderIcon);
		clickElementJS(configurations);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(processTrackerConfiguration);
		waitForInvisibility(loaderIcon);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelProcessTrackerConfiguration.getText();


	}




}
