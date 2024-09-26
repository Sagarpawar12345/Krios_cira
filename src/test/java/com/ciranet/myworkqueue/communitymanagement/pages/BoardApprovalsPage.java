package com.ciranet.myworkqueue.communitymanagement.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class BoardApprovalsPage extends BasePage
{
	// Initializing the Page Objects:
	public BoardApprovalsPage(WebDriver driver) 
	{
		super(driver);
	}

	// Initializing the Page Objects
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementMenu;

	@FindBy(xpath = "//span[@class='cc-qa-release-menu']")
	WebElement boardApprovalsMenu;

	@FindBy(xpath="//h2[@class='page-header']")
	WebElement lblboardApprovals;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Collapse All']")
	WebElement collapseIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Expand All']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;	
	
	@FindBy(xpath = "//div[contains(text(),'Column Chooser')]")
	WebElement colChooserLabel;

	@FindBy(xpath = "//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Jobs']")
	WebElement closedjobs;

	@FindBy(xpath = "//span[normalize-space()='Active Jobs']")
	WebElement activejobs;

	@FindBy(xpath = "//dx-button[@title='Community Search']")
	WebElement communityIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement toolbarMenu;

	@FindBy(xpath="(//div[@class='dx-item-content dx-menu-item-content'])[23]")
	WebElement resetLayout;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-close']")
	WebElement columnIcon;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[text()='Closed']")
	WebElement closedTab;

	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[1]")
	WebElement openTab;

	// method declaration
	public String verifyBoardApprovalsMenu()
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(myWorkQueueMenu);
		clickElement(myWorkQueueMenu);
		waitForInvisibility(loaderIcon);

		clickElementJS(communityManagementMenu);
		waitForInvisibility(loaderIcon);

		scrollToElement(boardApprovalsMenu);
		clickElement(boardApprovalsMenu);
		waitForInvisibility(loaderIcon);

		return lblboardApprovals.getText();
	}

	public boolean toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(fullScreenIcon);
		clickElement(fullScreenIcon);
		waitForInvisibility(loaderIcon);

		//if statement to specify a block of Java code to be executed if a condition is true
		if (normalScreenIcon.isDisplayed()) 
		{
			System.out.println("FullScreen Menu button clicked");
			waitForInvisibility(loaderIcon);
			return true;

		}
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("FullScreen Menu button not clicked");
			return false;
		}
	}

	public boolean toolBarNormalScreen() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(normalScreenIcon);
		clickElementJS(normalScreenIcon);
		waitForInvisibility(loaderIcon);

		if (fullScreenIcon.isDisplayed()) 
		{
			System.out.println("NormalScreen Menu button clicked");
			waitForInvisibility(loaderIcon);
			return true;
		} 
		else 
		{
			System.out.println("NormalScreen Menu button not clicked");
			return false;
		}
	}

	public boolean expandOptionClick() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(expandIcon);
		clickElementJS(expandIcon);
		waitForInvisibility(loaderIcon);

		//statement which prints the argument passed to it
		System.out.println("Clicked on Expand icon");

		if(isElementDisplayed(collapseIcon))
		{
			System.out.println("Expand icon is working");
			waitForInvisibility(loaderIcon);
			return true;
		}
		else 
		{
			System.out.println("Expand icon is not working");
			return false;
		}
	}

	public boolean switchTab() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(closedTab);
		clickElementJS(closedTab);
		waitForInvisibility(loaderIcon);

		System.out.println("Switched to Close Tab");
		waitForInvisibility(loaderIcon);
		clickElementJS(openTab);
		waitForInvisibility(loaderIcon);

		//statement which prints the argument passed to it
		System.out.println("Switched to Open Tab");

		if(isElementDisplayed(openTab)) 
		{
			System.out.println("Clicked on openTab icon");
			return true;
		}
		else 
		{
			System.out.println("Clicked on openTab is not seen");
			return false;
		}
	}

	public String columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(columnChooser);
		clickElementJS(columnChooser);
		waitForInvisibility(loaderIcon);
		String colChooserTitle =colChooserLabel.getText();
		clickElement(closeColChooser);

		//statement which prints the argument passed to it
		System.out.println("Column Chooser closed");
		return colChooserTitle;
	}
}
