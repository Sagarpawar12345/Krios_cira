package com.ciranet.configurations.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class ClosingPortalPage extends BasePage
{
	public ClosingPortalPage(WebDriver driver) 
	{
		super(driver);
	}

	// Page elements
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
	WebElement configurationsMenu;

	@FindBy(xpath = "//span[normalize-space()='Closing Portal']")
	private WebElement closingPortalMenu;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
	private WebElement configurationDropdown;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement closingPortalHeader;

	@FindBy(xpath = "//span[normalize-space()='** Account Inquiry Fulfillment **']")
	private WebElement configurationValueAccountInquiryFulfillment;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
	private WebElement contextDropdown;

	@FindBy(xpath = "//div[normalize-space()='RealManage']")
	private WebElement contextDropdownValue;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	private WebElement refreshButton;

	@FindBy(xpath = "//span[normalize-space()='** CiraConnect Fee **']")
	private WebElement configDropdownCiraConnectFee;

	@FindBy(xpath = "//span[normalize-space()='Closing Portal Delivery Tiers']")
	private WebElement configDropdownClosingPortalDeliveryTiers;

	@FindBy(xpath = "//span[normalize-space()='** Portal Configuration Fees & Charges **']")
	private WebElement configDropdownPortalConfigurationFeesCharges;

	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	@FindBy(xpath = "//span[normalize-space()='New tier']")
	private WebElement newtierButton;

	@FindBy(xpath = "//div[@title='Save']//div[@class='dx-button-content']")
	private WebElement saveButton;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	private WebElement cancelButton;
	
	// Method to press Escape key
	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	private void closingPortalActions() 
	{
		refreshButton.click();
		LoggerManager.debug("Performed closing Portal actions");
	}

	public String navigateToConfigurationsPage() 
	{
		waitForInvisibility(loaderIcon);	
		scrollToElement(configurationsMenu);
		clickElementJS(configurationsMenu);
		return configurationsMenu.getText();
	}

	public String navigateToclosingPortal() 
	{
		waitForInvisibility(loaderIcon);	
		scrollToElement(closingPortalMenu);
		clickElement(closingPortalMenu);
		waitForInvisibility(loaderIcon);
		return closingPortalHeader.getText();
	}

	public String selectclosingPortalConfigDropdowns(String strDropdownValue) 
	{
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		switch (strDropdownValue) {
		case "Account Inquiry Fulfillment":
			configurationValueAccountInquiryFulfillment.click();
			waitForInvisibility(loaderIcon);
			break;
		case "CiraConnect Fee":
			configDropdownCiraConnectFee.click();
			waitForInvisibility(loaderIcon);
			break;
		case "Closing Portal Delivery Tiers" : 
			clickElement(configDropdownClosingPortalDeliveryTiers);
			break;
		case "Portal Configuration Fees & Charges":
			clickElement(configDropdownPortalConfigurationFeesCharges);
			break;
		default:
			// Code block if no case matches
		} 
		LoggerManager.debug("Dropdown selection on Closing Portal page"); 
		contextDropdown.click();
		contextDropdownValue.click();
		waitForInvisibility(loaderIcon);
		closingPortalActions();
		waitForInvisibility(loaderIcon);
		
		return strDropdownValue;
	}

	public String newtierbutton(String strDropdownValue) 
	{
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropdown);
		switch (strDropdownValue) 
		{
		case "Closing Portal Delivery Tiers" : 
			clickElement(configDropdownClosingPortalDeliveryTiers);
			break;
		default:
			// Code block if no case matches
		} 
		contextDropdown.click();
		contextDropdownValue.click();
		waitForInvisibility(loaderIcon);
		closingPortalActions();
		waitForInvisibility(loaderIcon);

		//click on New Tier button
		newtierButton.click();
		waitForInvisibility(loaderIcon);
		cancelButton.click();
		return strDropdownValue;
	}
}