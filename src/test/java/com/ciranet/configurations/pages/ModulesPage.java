package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ModulesPage extends BasePage{

	
	public ModulesPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
	WebElement configurations;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Modules')]")
	WebElement modulesMenu;

	@FindBy(xpath="//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Customer Defined Info')]")
	WebElement customerDefinedInfo;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement context;

	@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextvalue;

	@FindBy(xpath="//div[@title='Expand All']")
	WebElement expandAllIcon;


	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Egnyte Configuration')]")
	WebElement egnyteConfiguration;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Help')]")
	WebElement help;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Recommendations and Assumptions')]")
	WebElement recomendationsandAssumptions;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Supplemental Information')]")
	WebElement supplimentalInformation;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Transition Document')]")
	WebElement transitionDocument;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Transition Task Templates')]")
	WebElement transitionTaskTemplates;

	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Work Order Work Areas')]")
	WebElement workOrderWorkArea;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;


	@FindBy(xpath="//strong[normalize-space()='Customer Defined Info - RealManage']")
	public WebElement labelCustomerDefinedInfo;
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Egnyte Configuration - Global')]")
	public WebElement labelEgnyteConfiguration;
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Help - Global')]")
	public WebElement labelHelp;
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Recommendations and Assumptions - Global')]")
	public WebElement labelRecommendationandAssumption;
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Supplemental Information - Global')]")
	public WebElement labelSuplimentalInformation;
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Transition Document - Global')]")
	public WebElement labelTransitionDocuments;
	@FindBy(xpath="//div[@class='dx-toolbar-center']//strong[contains(text(),'Work Order Work Areas - 1920 E. Maryland Place Townhomes, Inc.')]")
	public WebElement labelWorkAreaWorkOrder;
	@FindBy(xpath="//h2[@class='page-header']")
	public WebElement labelModuleConfiguration;
	@FindBy(xpath="//div[contains(text(),'Tasks')]")
	public WebElement labelTransitionTaskTemplate;
	public String configurationsModules() {

		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		clickElement(configurations);
		waitForInvisibility(loaderIcon);
		scrollToElement(modulesMenu);
		clickElement(modulesMenu);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);		
		waitForElementToBeClickable(customerDefinedInfo);
		clickElement(customerDefinedInfo);
		waitForElementToBeClickable(context);
		clickElement(context);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelCustomerDefinedInfo.getText();
	}

	public String egnyteConfiguration() {			
		waitForInvisibility(loaderIcon);				
		clickElement(configurationDropdown);			
		clickElementJS(egnyteConfiguration);
		clickElement(context);
		waitForInvisibility(loaderIcon);			
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);			
		return labelEgnyteConfiguration.getText();
	}

	public String help() {				
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);				
		clickElementJS(help);					
		clickElement(context);
		waitForInvisibility(loaderIcon);				
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);				
		return labelHelp.getText();
	}

	public String recommendationsandAssumptions() {

		waitForInvisibility(loaderIcon);				
		clickElement(configurationDropdown);
		clickElementJS(recomendationsandAssumptions);				
		clickElement(context);
		waitForInvisibility(loaderIcon);					
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);					
		return labelRecommendationandAssumption.getText();
	}

	public String supplimentalInformation() {				 
		waitForInvisibility(loaderIcon);					
		clickElement(configurationDropdown);					
		clickElementJS(supplimentalInformation);
		clickElement(context);
		waitForInvisibility(loaderIcon);				
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);				
		return labelSuplimentalInformation.getText();
	}

	public String transitionDocuments() {				
		waitForInvisibility(loaderIcon);					
		clickElement(configurationDropdown);
		clickElementJS(transitionDocument);				
		clickElement(context);
		waitForInvisibility(loaderIcon);				
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);				
		return labelTransitionDocuments.getText();
	}
	public String transitionTaskTemplates() {			  
		waitForInvisibility(loaderIcon);				
		clickElement(configurationDropdown);				
		clickElementJS(transitionTaskTemplates);
		return labelTransitionTaskTemplate.getText();
	}
	public String workOrderWorkArea() {				  
		waitForInvisibility(loaderIcon);					
		clickElement(configurationDropdown);					
		clickElementJS(workOrderWorkArea);
		clickElement(context);
		waitForInvisibility(loaderIcon);					
		clickElementJS(expandAllIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);					
		return labelWorkAreaWorkOrder.getText();
	}

}
