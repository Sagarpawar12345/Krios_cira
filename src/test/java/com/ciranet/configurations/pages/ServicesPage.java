package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class ServicesPage extends BasePage 
{
	public ServicesPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//span[text()=' Configurations ']")
	private WebElement configurations;

	@FindBy(xpath = "//span[text()=' Services ']")
	private WebElement services;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	private WebElement configurationDropDown;

	@FindBy(xpath = "//span[contains(text(),'Board Portal')]")
	private WebElement boardPortal;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	private WebElement contextDropDown;

	@FindBy(xpath = "//div[contains(text(),'Global')]")
	WebElement contextValue;
	
	@FindBy(xpath = "//span[normalize-space()='** Branding Configuration **']")
	WebElement brandingConfiguration;

	@FindBy(xpath = "//span[normalize-space()='Business Hours']")
	WebElement businessHour;

	@FindBy(xpath = "//span[normalize-space()='Calendar Configuration']")
	WebElement calendarConfiguration;

	@FindBy(xpath = "//span[contains(text(),'Mass Communication System Template Configuration')]")
	WebElement massCommunicationSystemTemplateConfiguration;

	@FindBy(xpath = "//span[normalize-space()='** Resident Portal **']")
	WebElement residentPortal;

	@FindBy(xpath = "//span[normalize-space()='Service Groups']")
	WebElement serviceGroup;

	@FindBy(xpath = "//span[normalize-space()='Service Roles']")
	WebElement serviceRole;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[contains(text(),'Services')]")
	WebElement servicesConfig;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Board Portal - Global')]")
	public WebElement boardApprovalLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Branding Configuration - Global')]")
	public WebElement brandingConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Business Hours - Global')]")
	public WebElement bussinessHourLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Calendar Configuration - Global')]")
	public WebElement calendarConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Mass Communication System Template Configuration - Global')]")
	public WebElement massCommunicationSysterConfigurationLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Resident Portal - Global')]")
	public WebElement residentPortalLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Groups - Global')]")
	public WebElement serviceGroupLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Roles - Global')]")
	public WebElement serviceRoleLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Services - Global')]")
	public WebElement servicesLabel;

	@FindBy(xpath = "//h2[contains(text(),'Services Configurations')]")
	public WebElement servicesConfigurationLabel;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	public String servicesConfiguration()
	{
		// Configuration
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		clickElementJS(configurations);

		// Services
		waitForInvisibility(loaderIcon);
		scrollToElement(services);
		clickElementJS(services);
		
		return servicesConfigurationLabel.getText();
	}

	public String boardPortal() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Board Portal
		clickElement(boardPortal);

		// Context
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return boardApprovalLabel.getText();
	}

	public String brandingConfiguration() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Branding Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(brandingConfiguration);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return brandingConfigurationLabel.getText();
	}

	public String bussinessHour() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// BusinessHour Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(businessHour);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return bussinessHourLabel.getText();
	}

	public String calendarConfiguration() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Calendar Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(calendarConfiguration);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return calendarConfigurationLabel.getText();
	}

	public String massCommunicationSystemTemplateConfiguration() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Mass Communication System Template Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(massCommunicationSystemTemplateConfiguration);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return massCommunicationSysterConfigurationLabel.getText();
	}

	public String residentPortal() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Resident Portal Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(residentPortal);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return residentPortalLabel.getText();
	}

	public String serviceGroup() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Service Group Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(serviceGroup);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return serviceGroupLabel.getText();
	}

	public String serviceRole() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Service Role Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(serviceRole);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return serviceRoleLabel.getText();
	}

	public String services() 
	{
		// Configuration Dropddown
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);

		// Service Configuration
		waitForInvisibility(loaderIcon);
		clickElementJS(servicesConfig);

		// Context Dropdown
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);

		// ContextValue
		waitForInvisibility(loaderIcon);
		clickElement(contextValue);

		return servicesLabel.getText();
	}
}
