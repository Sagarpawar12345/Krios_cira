package com.ciranet.administration.tools.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class EmployeeManagementPage extends BasePage {
	public EmployeeManagementPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@title='Administration']")
	WebElement administrationMenu;

	@FindBy(xpath = "//div[@title='Tools']//div[@class='header-text']")
	WebElement toolsMenu;

	@FindBy(xpath = "//span[normalize-space()='Employee Management']") 
	WebElement employeeManagementMenu;

	@FindBy(xpath = "//h2[text()=' Employee Management ']")
	WebElement pageTitle;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	WebElement userStatusDropdown;

	@FindBy(xpath = "//div[contains(text(),'All')]")
	WebElement userStatusDropdownValue;
	
	@FindBy(xpath = "//div//span[contains(text(),'User Status:')]")
	WebElement userStatusLabel;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-refresh']")
	WebElement refreshButton;
	
	@FindBy(xpath = "//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines dx-state-hover']//span[contains(text(),'Olga Scott')]")
	WebElement managerColumn;

	@FindBy(xpath = "(//input[@aria-label='Filter cell'])[5]")
	WebElement managerSearch; 
	
	@FindBy(xpath = "//div[contains(text(),'Olga Scott, Client Services Manager')]")
	WebElement biographyDetails;
	
	@FindBy(xpath = "(//input[@aria-label='Filter cell'])[1]")
	WebElement nameColumnSearch;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeButton;

	@FindBy(xpath = "//span[normalize-space()='Action']")
	WebElement actionButton;

	@FindBy(xpath = "//div[@class='menu-text']")
	WebElement editMenu;

	@FindBy(xpath = "//div[@class='dx-switch-on']")
	WebElement overrideOnToggle;

	@FindBy(xpath = "//div[@class='dx-switch-off']")
	WebElement overrideOffToggle;

	@FindBy(xpath = "(//input[@role='textbox'])[12]")
	WebElement titleTextbox;

	@FindBy(xpath = "//dx-button[@title='Save']//div[@class='dx-button-content']")
	WebElement saveButton;
	
	@FindBy(xpath = "//div[contains(text(),'Edit Employee Akshay Yeole')]")
	WebElement employeeDetails;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	// method declaration
	public String employeeManagementMenu() {
		waitForInvisibility(loaderIcon);
		clickElementJS(administrationMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(toolsMenu);
		clickElementJS(toolsMenu);
		scrollToElement(employeeManagementMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(employeeManagementMenu);
		return pageTitle.getText();
	}

	public boolean toolBarFullScreen() {
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(normalScreenIcon)) {
			System.out.println("Normal Screen Menu button clicked");
			clickElementJS(normalScreenIcon);
			waitForInvisibility(loaderIcon);
			return true;
		} else {
			System.out.println("Normal Screen Menu button not clicked");
			return false;
		}
	}

	public String userStatus() {
		waitForInvisibility(loaderIcon);
		clickElementJS(userStatusDropdown);
		clickElementJS(userStatusDropdownValue);		
		clickElementJS(refreshButton);
		return userStatusLabel.getText();
	}

	public String biography() {
		waitForInvisibility(loaderIcon);
		clickElementJS(managerSearch);
		enterText(managerSearch, "Olga Scott");
		waitForInvisibility(loaderIcon);
		clickElementJS(managerColumn);
		waitForInvisibility(loaderIcon);
		String biography = biographyDetails.getText();
		clickElementJS(closeButton);
		waitForInvisibility(loaderIcon);
		managerSearch.clear();
		waitForInvisibility(loaderIcon);
		return biography;
	}

	public String editEmployee() {
		waitForInvisibility(loaderIcon);
		clickElementJS(nameColumnSearch);
		enterText(nameColumnSearch, "Akshay");
		waitForInvisibility(loaderIcon);

		clickElementJS(actionButton);
		clickElementJS(editMenu);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(overrideOffToggle);
		waitForInvisibility(loaderIcon);
		clickElementJS(overrideOnToggle);

		String employee = employeeDetails.getText();
		waitForInvisibility(loaderIcon);
		titleTextbox.clear();
		waitForInvisibility(loaderIcon);
		enterText(titleTextbox, "Developer");
		waitForInvisibility(loaderIcon);
		clickElementJS(saveButton);
		waitForInvisibility(loaderIcon);
		
		nameColumnSearch.clear();
		
		return employee;
	}
	
}
