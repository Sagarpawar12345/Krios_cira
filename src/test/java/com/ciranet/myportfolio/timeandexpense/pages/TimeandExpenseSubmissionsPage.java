package com.ciranet.myportfolio.timeandexpense.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

//Every line of code that runs in Java must be inside a class
public class TimeandExpenseSubmissionsPage extends BasePage 
{
	public TimeandExpenseSubmissionsPage(WebDriver driver)
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Portfolio')]")
	WebElement myPortFolioMenu;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Time & Expense')]")
	WebElement timeandExpenseMeu;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Time & Expense Submission' )]")
	WebElement timeandExpenseSubmissionsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	WebElement timeandExpenseSubmissionsLabel; 

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	WebElement entityDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[1]")
	WebElement entityDropdownValue;

	@FindBy(xpath = "//span[contains(text(),'Entity:')]")
	WebElement entityLabel; 
	
	@FindBy(xpath = "(//div[@class='dx-datagrid-group-closed'])[1]")
	WebElement expensesClosed;
	
	@FindBy(xpath = "//div[@class='dx-datagrid-group-opened']")
	WebElement expensesOpened;
	
	@FindBy(xpath = "//div[contains(text(),'Mileage Expenses')]")
	WebElement mileageExpensesLabel; 
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains(text(),'Action')])[5]")
	WebElement actionButton; 
	
	@FindBy(xpath = "//div[@class='menu-text'][normalize-space()='Approve']")
	WebElement approveMenu;
	
	@FindBy(xpath = "(//div[contains(text(),'Verified By')])[1]")
	WebElement verifiedByLabel;
	
	@FindBy(xpath = "//div[@class='menu-text'][normalize-space()='Deny']")
	WebElement denyMenu;
	
	@FindBy(xpath = "//div[contains(text(),'Deny Reason')]")
	WebElement denyReasonLabel;
	
	@FindBy(xpath = "//textarea[@role='textbox']")
	WebElement denyReasonTextBox;
	
	@FindBy(xpath = "//span[normalize-space()='Confirm Deny']")
	WebElement confirmDenyButton;
	
	@FindBy(xpath = "(//a[@class='cc-hyperlink dx-theme-accent-as-text-color'])[5]")
	WebElement submittedByCell;
	
	@FindBy(xpath = "//h5[text()=' Experience Summary ']")
	WebElement experienceSummaryLabel;
	
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeIcon;
	
	// method declaration
	public String timeandExpenseSubmissionsMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(myPortFolioMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(timeandExpenseMeu);
		clickElementJS(timeandExpenseMeu);
		waitForInvisibility(loaderIcon);
		scrollToElement(timeandExpenseSubmissionsMenu);
		clickElementJS(timeandExpenseSubmissionsMenu);
		waitForInvisibility(loaderIcon);
		return timeandExpenseSubmissionsLabel.getText();
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
		return entityLabel.getText();
	}
	
	public String mileageExpense() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(expensesClosed);
		String mileageLabel = mileageExpensesLabel.getText();
		clickElement(expensesOpened);
		return mileageLabel;
	}
	
	public String approveMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		clickElement(approveMenu);
		return verifiedByLabel.getText();
	}
	
	public String denyMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		clickElement(denyMenu);
		String denyPopupLabel = denyReasonLabel.getText();
		enterText(denyReasonTextBox, "Expense deny for testing purpose");
		clickElement(confirmDenyButton);
		return denyPopupLabel;
	}
	
	public String submittedByColumn()
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(submittedByCell);
		clickElementJS(submittedByCell);
		String summary = experienceSummaryLabel.getText();
		clickElement(closeIcon);
		return summary;
	}
}
