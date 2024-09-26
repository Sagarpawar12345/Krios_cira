package com.ciranet.configurations.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class CommunityPage extends BasePage
{
    public CommunityPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
    WebElement configurationsMenu;

    @FindBy(xpath = "//span[normalize-space()='Community']")
    WebElement communityMenu;

    @FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
    WebElement configurationDropdown;

    @FindBy(xpath = "//span[normalize-space()='** Amenity **']")
    WebElement configurationValueAmenity;

    @FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
    WebElement contextDropdown;

    @FindBy(xpath="(//div[@class='dx-treelist-text-content'])[1]")
    WebElement contextDropdownValue;

    @FindBy(xpath = "//span[normalize-space()='Refresh']")
    WebElement refreshButton;

     @FindBy(xpath = "//span[normalize-space()='Save']")
    WebElement saveButton;

    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    WebElement cancelButton;

    @FindBy(xpath = "//span[normalize-space()='Board Approval']")
    WebElement configDropdownBoardApproval;

    @FindBy(xpath = "//span[normalize-space()='Collection Letter Fees']")
    WebElement configDropdownCollectionLetterFees;

    @FindBy(xpath = "//span[normalize-space()='Community Configuration']")
    WebElement configDropdownCommunityConfiguration;
        
    @FindBy(xpath = "//span[contains(text(),'** Fulfillment Job Special Pricing Configuration *')]")
    WebElement configDropdownFulfillmentJobSpecialPricingConfiguration;
    
    @FindBy(xpath = "//span[normalize-space()='Holidays']")
    WebElement configDropdownHolidays;
    
    @FindBy(xpath="//span[normalize-space()='Info']")
    WebElement configDropdownInfo;
    
    @FindBy(xpath="//span[normalize-space()='** Mass Communication Configuration **']")
    WebElement massCommunicationConfiguration;
    
    @FindBy(xpath="//span[normalize-space()='** Notes **']")
    WebElement configurationNotes;
    
    @FindBy(xpath="//span[normalize-space()='Owner Fees']")
    WebElement configurationOwnerFees;
    
    @FindBy(xpath="//span[normalize-space()='** Printing Provider **']")
    WebElement configurationPrintingProvider;
    
    @FindBy(xpath="//strong[normalize-space()='Notes - Global']")
    public WebElement labelNotes;
    
    @FindBy(xpath="//strong[normalize-space()='Owner Fees - RealManage']")
    public WebElement labelOwnerFees;
    
    @FindBy(xpath="//strong[normalize-space()='Printing Provider - Global']")
    public WebElement labelPrintingProvider;
    
    @FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;
    
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityConfigurationsheader;
	
	@FindBy(xpath="//strong[normalize-space()='Amenity - Global']")
	public WebElement labelAmenity;
	
	@FindBy(xpath="//strong[normalize-space()='Board Approval - Global']")
	public WebElement labelBoardApproval;
	
	@FindBy(xpath="//strong[normalize-space()='Collection Letter Fees - RealManage']")
	public WebElement labelCollectionLetterFees;
	
	@FindBy(xpath="//strong[contains(text(),'Community Configuration - 1920 E. Maryland Place T')]")
	public WebElement labelCommunityConfiguration;
	
	@FindBy(xpath="//strong[contains(text(),'Fulfillment Job Special Pricing Configuration - Gl')]")
	public WebElement labelFullfillmentJobSpecialPricingConfiguration;
	
	@FindBy(xpath="//strong[normalize-space()='Holidays - Global']")
	public WebElement labelHoliday;
	
	@FindBy(xpath="//strong[normalize-space()='Info - Global']")
	public WebElement labelInfo;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Mass Communication Configuration - RealManage')]")
	public WebElement labelMassConfigurationConfiguration;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approval Notifications']")
	public WebElement boardApprovalNotificationsTab;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approval Actions']")
	public WebElement boardApprovalActionsTab;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approvals']")
	public WebElement boardApprovalsTab;
	
	@FindBy(xpath = "//span[@class='dx-button-text'][normalize-space()='Action']")
	public WebElement actionButton;
	
    public void pressEscapeKey() throws AWTException 
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    
    private void communityConfigActions()
    {
        refreshButton.click();
        LoggerManager.debug("Performed Community Configurations actions");
    }
    
    public String navigateToConfigurationsPage() 
    {
    	waitForInvisibility(loaderIcon);	
		scrollToElement(configurationsMenu);
		clickElement(configurationsMenu);
		
        LoggerManager.debug("Clicked on Configurations");
        return configurationsMenu.getText();
    }
    
    public String navigateToCommunityConfigurations() 
    {
    	waitForInvisibility(loaderIcon);
    	
    	waitForInvisibility(loaderIcon);	
		scrollToElement(communityMenu);
		clickElement(communityMenu);
		waitForInvisibility(loaderIcon); 	
    	LoggerManager.debug("Navigated to Community Configurations page");
    	return communityConfigurationsheader.getText();
    }

    public void selectCommunityConfigDropdowns(String strDropdownValue) throws AWTException 
    {
    	waitForInvisibility(loaderIcon);
    	clickElement(configurationDropdown);
    	switch (strDropdownValue) 
    	{
        case "Amenity":
        	configurationValueAmenity.click();
            waitForInvisibility(loaderIcon);
            break;
        case "Board Approval":
        	configDropdownBoardApproval.click();
            waitForInvisibility(loaderIcon);
            break;          
        case "Collection Letter Fees":
        	configDropdownCollectionLetterFees.click();
            waitForInvisibility(loaderIcon);
            break;
            
        case "Community Configuration":
        	configDropdownCommunityConfiguration.click();
            waitForInvisibility(loaderIcon);
            break;           
        case "Fulfillment Job Special Pricing Configuration":
        	configDropdownFulfillmentJobSpecialPricingConfiguration.click();
            waitForInvisibility(loaderIcon);
            break;            
        case "Holidays":
        	configDropdownHolidays.click();
            waitForInvisibility(loaderIcon);
            break;            
         case "Info":
        	 configDropdownInfo.click();
            waitForInvisibility(loaderIcon);
            break;
         case "Mass Communication Configuration":
        	 massCommunicationConfiguration.click();
            waitForInvisibility(loaderIcon);
            break;
         case "Notes":
        	 configurationNotes.click();
            waitForInvisibility(loaderIcon);
            break;
         case "Owner Fees":
        	 configurationOwnerFees.click();
            waitForInvisibility(loaderIcon);
            break;
         case "Printing Provider":
        	 configurationPrintingProvider.click();
            waitForInvisibility(loaderIcon);
            break;
           default:
          
    	} 
    	LoggerManager.debug("Dropdown selection on Community Configurations page"); 
		
    	contextDropdown.click();  
    	waitForInvisibility(loaderIcon);
        contextDropdownValue.click();
        waitForInvisibility(loaderIcon);
        communityConfigActions();
        waitForInvisibility(loaderIcon);
        pressEscapeKey();
        
    }
}