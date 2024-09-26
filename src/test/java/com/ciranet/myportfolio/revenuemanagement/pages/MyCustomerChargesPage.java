package com.ciranet.myportfolio.revenuemanagement.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
//Every line of code that runs in Java must be inside a class
public class MyCustomerChargesPage extends BasePage 
{
	public MyCustomerChargesPage(WebDriver driver)
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Portfolio')]")
	private WebElement myPortFolio;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Revenue Management')]")
	private WebElement revenueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Customer Charges')]")
	private WebElement myCustomerCharges;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	WebElement entityDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[1]")
	WebElement entityDropdownValue;

	@FindBy(xpath = "//span[text()='Create New Charge']")
	WebElement createNewChargeButton;

	@FindBy(xpath = "//div[text()='Add Customer Charge']")
	WebElement addChargePopupTitle;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[17]")
	WebElement customerDropdown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement customerDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[21]")
	WebElement productDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[5]")
	WebElement productDropdownValue;

	@FindBy(xpath = "(//input[@role='combobox'])[11]")
	WebElement transactionDate;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[21]")
	WebElement quantity; 
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Save']")
	WebElement saveButton; 
	
	@FindBy(xpath = "//div[contains(text(),'Add Customer Charge')]") 
	public WebElement addCustomerChargeLabel;  
	
	@FindBy(xpath = "//div[contains(text(),'Edit Customer Charge')]") 
	public WebElement editCustomerChargeLabel;  
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement myCustomerChargeLabel;  
 
	@FindBy(xpath = "//span[contains(text(),'Entity:')]")
	public WebElement entityLabel; 
	
	@FindBy(xpath = "//div[contains(text(),'Confirmation')]")
	public WebElement confirmationTitle;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[1]")
	WebElement actionButton;

	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	WebElement editMenu;
	
	@FindBy(xpath = "//div[contains(text(),'Delete')]")
	WebElement deleteMenu;
	
	@FindBy(xpath = "//div[@aria-label='Yes']//div[@class='dx-button-content']")
	WebElement yesOption;
	
	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	WebElement fromDate;
	
	@FindBy(xpath = "//dx-button[@title='Refresh']//div[@class='dx-button-content']")
	WebElement refreshButton;
	
	// method declaration
	public String myCustomerChargesMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myPortFolio);
		waitForInvisibility(loaderIcon);
		scrollToElement(revenueManagement);
		clickElementJS(revenueManagement);
		waitForInvisibility(loaderIcon);
		scrollToElement(myCustomerCharges);
		clickElementJS(myCustomerCharges);
		waitForInvisibility(loaderIcon);
		return myCustomerChargeLabel.getText();
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

	public String entity() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(entityDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(entityDropdownValue);
		waitForInvisibility(loaderIcon);
		clickElementJS(fromDate);
		waitForInvisibility(loaderIcon);
		enterText(fromDate, "01/05/2021");
		waitForInvisibility(loaderIcon);
		clickElement(refreshButton);
		waitForInvisibility(loaderIcon);
		return entityLabel.getText();
	}

	public String addNewCharge() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(createNewChargeButton);
		waitForInvisibility(loaderIcon);
		clickElement(customerDropdown);
		waitForInvisibility(loaderIcon);
		clickElementJS(customerDropdownValue);
		String addPopupTitle= addCustomerChargeLabel.getText();
		clickElement(productDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(productDropdownValue);
		waitForInvisibility(loaderIcon);
		enterText(transactionDate, "06/24/2024");
		waitForInvisibility(loaderIcon);
		clickElement(quantity);
		enterText(quantity, "10");
		waitForInvisibility(loaderIcon);
		scrollToElement(description);
		clickElement(description);
		enterText(description, "Add New Customer Charge");
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);		
		return addPopupTitle;
	}
	
	public String editCharge() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editMenu);
		waitForInvisibility(loaderIcon);
		String editPopupTitle= editCustomerChargeLabel.getText();
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		return editPopupTitle;
	}
	
	public String deleteCharge()
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(deleteMenu);
		waitForInvisibility(loaderIcon);
		String confirmTitle= confirmationTitle.getText();
		clickElement(yesOption);
		waitForInvisibility(loaderIcon);
		return confirmTitle;
	}
}
