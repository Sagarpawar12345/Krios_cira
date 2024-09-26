package com.ciranet.myworkqueue.receivableslockbox.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

//Every line of code that runs in Java must be inside a class
public class StatementApprovalQueuePage extends BasePage
{
	public StatementApprovalQueuePage(WebDriver driver) 
	{	
		super(driver);
	}
	// Initializing the Page Objects
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'My Work Queue')]")
	private WebElement myWorkQueue;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Receivables Lockbox')]")
	private WebElement receivablesLockbox;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Statement Approvals')]")
	private WebElement statementApprovals;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt'])[2]")
	WebElement fullScreenIcon;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180'])[2]")
	WebElement normalScreenIcon;

	@FindBy(xpath="(//div[@class='dx-item dx-tab'])[1]")
	WebElement searchApproval;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[9]")
	WebElement dateTypeDropdown;

	@FindBy(xpath="//div[contains(text(),'Statement Date')]")
	WebElement dateTypeDropdownValue;

	@FindBy(xpath="(//input[@role='combobox'])[10]")
	WebElement beginDateDropdown;

	@FindBy(xpath="//div[@class='dx-button-content']//span[contains(text(),'Search')]")
	WebElement search;

	@FindBy(xpath="(//i[@ng-reflect-ng-class='fas fa-history'])[51]")
	WebElement logs;

	@FindBy(xpath="//dx-button[@title='Close']//span[@class='dx-button-text'][normalize-space()='Close']")
	WebElement logsClose;

	@FindBy(xpath="(//i[@ng-reflect-ng-class='far fa-file-pdf'])[52]")
	WebElement statementcolumn;

	@FindBy(xpath="//span[normalize-space()='Close']")
	WebElement errorClose;

	@FindBy(xpath="(//input[@class='dx-texteditor-input'])[23]")
	WebElement locationSearch;

	@FindBy(xpath="(//input[@class='dx-texteditor-input'])[34]")
	WebElement runIDValueClick;

	@FindBy(xpath="//div[@class='dx-datagrid-filter-panel-clear-filter']")
	WebElement clearButton;

	@FindBy(xpath="(//div[@class='dx-item dx-tab'])[2]")
	WebElement statementRuns;

	@FindBy(xpath="//span[normalize-space()='Statement Runs']")
	public WebElement statementRunsLabel;

	@FindBy(xpath = "//span[normalize-space()='Workspace']") 
	public WebElement workspaceLabel;

	@FindBy(xpath = "//h2[@class='page-header']") 
	public WebElement statementApprovalQueueLabel;

	@FindBy(xpath = "(//div[@role='presentation']//div[contains(text(),'Location')])[2]")
	public WebElement locationColumnLabel;

	@FindBy(xpath = "(//div[@role='presentation']//div[contains(text(),'Statement')])[2]")
	public WebElement statementColumnLabel;

	@FindBy(xpath = "(//div[@role='presentation']//div[contains(text(),'Run Id')])[2]")
	public WebElement runIDColumnLabel;

	@FindBy(xpath = "//span[contains(text(),'Date Type:')]") 
	public WebElement dateTypeLable;

	@FindBy(xpath = "//span[contains(text(),'Begin Date:')]") 
	public WebElement beginDateLable;

	@FindBy(xpath = "//div[@role='presentation']//div[contains(text(),'User')]")
	public WebElement logsColumnLabel;

	@FindBy(xpath = "//div[contains(text(),'Resource Not Found.')]")
	public WebElement errorMessage;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;

	// method declaration
	public String statementApprovalQueueMenu() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		waitForInvisibility(loaderIcon);
		scrollToElement(receivablesLockbox);
		clickElement(receivablesLockbox);
		waitForInvisibility(loaderIcon);
		clickElementJS(statementApprovals);
		waitForInvisibility(loaderIcon);
		return statementApprovalQueueLabel.getText();
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

	public String searchApprovalTabClick()
	{
		waitForInvisibility(loaderIcon);
		clickElement(searchApproval);
		return dateTypeLable.getText();
	}

	public String dateFields()
	{
		waitForInvisibility(loaderIcon);
		clickElement(dateTypeDropdown);
		clickElement(dateTypeDropdownValue);
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElement(beginDateDropdown);
		enterText(beginDateDropdown,"12/26/2022");
		waitForInvisibility(loaderIcon);

		waitForInvisibility(loaderIcon);
		clickElement(search);
		waitForInvisibility(loaderIcon);
		return beginDateLable.getText();
	}

	public String logsClick()
	{
		clickElement(logs);
		waitForInvisibility(loaderIcon);
		String columnHeaderLabel = logsColumnLabel.getText();
		clickElementJS(logsClose);
		return columnHeaderLabel;
	}

	public String statementColumnPDFClick()
	{
		waitForInvisibility(loaderIcon);
		clickElement(statementcolumn);
		waitForInvisibility(loaderIcon);
		String message = errorMessage.getText();
		clickElement(errorClose);
		return message;
	}

	public String locationColumnClick()
	{
		waitForInvisibility(loaderIcon);
		clickElement(locationSearch);
		enterText(locationSearch, "Illinois");
		return locationColumnLabel.getText();
	}

	public String runIDClick()
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(runIDValueClick);
		clickElement(runIDValueClick);
		waitForInvisibility(loaderIcon);
		enterText(runIDValueClick, "145854");
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		clickElementJS(clearButton);
		return runIDColumnLabel.getText();
	}

	public String statementRunsTabClick()
	{
		waitForInvisibility(loaderIcon);
		clickElement(statementRuns);
		waitForInvisibility(loaderIcon);
		return statementRunsLabel.getText();
	}
}