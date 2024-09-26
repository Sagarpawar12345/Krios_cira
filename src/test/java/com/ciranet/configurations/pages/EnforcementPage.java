package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class EnforcementPage extends BasePage {
	
		public EnforcementPage(WebDriver driver) 
	{
		super(driver);
	}
    
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
	WebElement configurations;
	
	@FindBy(xpath="//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement context;
	
	@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextvalue;
	
	@FindBy(xpath="//div[@title='Expand All']")
	WebElement expandAllIcon;
	
	@FindBy(xpath="//div[@class='tree-item-template']//span[contains(text(),'Enforcement')]")
	WebElement enforcementMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Categories')]")
	WebElement architecturalCategoriesMenu; 
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Forms and Guides')]")
	WebElement architecturalFormsandGuidesMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Category / SubCategory Configuration ')]")
	WebElement violationCategorySubCategoryConfigurationMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Escalation Configuration')]")
	WebElement violationEscalationConfigurationMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Notification Templates ')]")
	WebElement violationNotificationTemplatesMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Restriction Definition')]")
	WebElement violationRestrictionDefinitionMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Architectural Categories - Global')]")
	public WebElement labelArchitecturalCategory;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Architectural Forms and Guides - Global')]")
	public WebElement labelArchitecturalFormsandGuide;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Category / SubCategory Configuration - Global')]")
	public WebElement labelViolationCategorySubCategoryConfiguration;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Escalation Configuration - Global')]")
    public WebElement labelViolationEscalationConfiguration;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Notification Templates - Global')]")
	public WebElement labelViolationNotificationTemplates;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Violation Restriction Definition - 1920 E. Maryland Place Townhomes, Inc.')]")
    public WebElement labelViolationRestrictionDefination;	
	
	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
	
	public String architecturalCategories() {
		waitForInvisibility(loaderIcon);	
		scrollToElement(configurations);
		clickElement(configurations);
		waitForInvisibility(loaderIcon);
		clickElementJS(enforcementMenu);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalCategoriesMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelArchitecturalCategory.getText();
		
	}
	
	public String architecturalFormsandGuides() {		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalFormsandGuidesMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		return labelArchitecturalFormsandGuide.getText();
	
		
	}
	
	public String violationCategorySubCategoryConfiguration(){
		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(violationCategorySubCategoryConfigurationMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelViolationCategorySubCategoryConfiguration.getText();
	}
	
	public String violationEscalationConfiguration() {		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(violationEscalationConfigurationMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		return labelViolationEscalationConfiguration.getText();
	}
	
	public String violationNotificationTemplates() {
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(violationNotificationTemplatesMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextvalue);
		waitForInvisibility(loaderIcon);
		return labelViolationNotificationTemplates.getText();
	
		
	}
	
	public String violationRestrictionDefinition() {
		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(violationRestrictionDefinitionMenu);
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(context);
		clickElement(context);
		waitForInvisibility(loaderIcon);
		clickElementJS(expandAllIcon);
		waitForInvisibility(loaderIcon);
		clickElement(contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		return labelViolationRestrictionDefination.getText();
	}
	

}
