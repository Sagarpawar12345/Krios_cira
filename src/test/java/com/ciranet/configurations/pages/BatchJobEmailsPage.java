package com.ciranet.configurations.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class BatchJobEmailsPage extends BasePage{

    // Initializing the Page Objects
    public BatchJobEmailsPage(WebDriver driver) {
        super(driver);
    }

    // Page elements
    @FindBy(xpath = "//span[normalize-space()='Configurations']")
    private WebElement configurationsMenu;
    
    @FindBy(css = "div[title='Batch Job Emails Configurations'] span[class='cc-qa-release-menu']")
    WebElement batchJobEmailsMenu;

    @FindBy(xpath  = "//h2[@class='page-header']")
    public WebElement batchJobEmailsTitle;

    @FindBy(xpath = "//span[normalize-space()='Enforcement']")
    private WebElement enforcementMenu;

    @FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
    private WebElement configurationDropdown;

    @FindBy(xpath = "//span[normalize-space()='ACH & Fee Notification Email']")
    private WebElement configurationValueACHFeeNotification;

    @FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
    private WebElement contextDropdown;

    @FindBy(xpath = "//div[normalize-space()='RealManage']")
    private WebElement contextDropdownValue;

    @FindBy(xpath = "//span[normalize-space()='Refresh']")
    private WebElement refreshButton;

    @FindBy(xpath = "//span[normalize-space()='Preview']")
    private WebElement previewButton;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//span[normalize-space()='ACH Notification Email']")
    private WebElement configDropdownACHNotification;

    @FindBy(xpath = "//span[normalize-space()='Annual Budget Preparation Kickoff']")
    private WebElement configDropdownAnnualBudgetPrep;

    @FindBy(xpath = "//span[normalize-space()='Annual Budget Submission to CAM']")
    private WebElement configDropdownAnnualBudgetSubToCam;

    @FindBy(xpath = "//span[normalize-space()='Annual Budget Submission to Client']")
    private WebElement configDropdownAnnualBudgetSubToCluent;

    @FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;
    
    // Method to press Escape key
    public void pressEscapeKey() throws AWTException 
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    private void batchJobEmailsActions()
    {
        refreshButton.click();
        previewButton.click();
        LoggerManager.debug("Performed Batch Job Emails actions");
    }
    
    
    public String navigateToConfigurationsPage() 
    {
    	waitForInvisibility(loaderIcon);
    	
    	scrollToElement(configurationsMenu);
    	
    	waitForElementToBeClickable(configurationsMenu);
    	
    	clickElementJS(configurationsMenu);
    	waitForInvisibility(loaderIcon);
    	
        LoggerManager.debug("Clicked on Configurations");
        return configurationsMenu.getText();
    }
    
    public boolean isMenuVisible() {
        return isElementVisible(By.cssSelector("div[title='Configurations'] span"));  // Check if menu element is visible
    }
    
    public String navigateToBatchJobEmails() 
    {
    	
    	waitForInvisibility(loaderIcon);
    	scrollToElement(batchJobEmailsMenu);
    
    	clickElementJS(batchJobEmailsMenu);
    	waitForInvisibility(loaderIcon);
        LoggerManager.debug("Navigated to Batch Job Emails page");
        return batchJobEmailsTitle.getText();
    }

    public String selectBatchJobEmailConfigDropdowns(String strDropdownValue) 
    {
    	waitForInvisibility(loaderIcon);
    	clickElement(configurationDropdown);
    	switch (strDropdownValue) {
        case "ACH & Fee Notification Email":
        	configurationValueACHFeeNotification.click();
            waitForInvisibility(loaderIcon);
            break;
        case "ACH Notification Email":
            configDropdownACHNotification.click();
            waitForInvisibility(loaderIcon);
            break;
        case "Annual Budget Preparation Kickoff" : 
        	clickElement(configDropdownAnnualBudgetPrep);
        	break;
        case "Annual Budget Submission to CAM":
        	clickElement(configDropdownAnnualBudgetSubToCam);
        	break;
        case "Annual Budget Submission to Client":
        	clickElement(configDropdownAnnualBudgetSubToCluent);
        	break;
        default:
            // Code block if no case matches
    	} 
    	LoggerManager.debug("Dropdown selection on Batch Job Emails page"); 
		
    	contextDropdown.click();
        
        contextDropdownValue.click();
        waitForInvisibility(loaderIcon);
        batchJobEmailsActions();
        waitForInvisibility(loaderIcon);
        return strDropdownValue;
    }
}