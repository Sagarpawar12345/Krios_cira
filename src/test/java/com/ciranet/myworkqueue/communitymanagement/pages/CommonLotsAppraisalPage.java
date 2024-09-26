package com.ciranet.myworkqueue.communitymanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;


public class CommonLotsAppraisalPage extends BasePage {

	public CommonLotsAppraisalPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-excel']")
	WebElement excel;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-csv']")
	WebElement csv;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'My Work Queue ')]")
	WebElement myWorkQueue;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),' Community Management ')]")
	WebElement communityManagementLabel;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),' Common Lots Appraisal ')]")
	WebElement commonLotsApprisal;

	@FindBy(xpath="//h2[contains(text(),'Common Lots Appraisal')]")
	public WebElement llbCommonLotsApprisal;

	@FindBy(xpath="//div[contains(text(),'Column Chooser')]")
	public WebElement llbColumnChooser;


	// method declaration
	public String commonLotsAppraisalPage() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		clickElementJS(communityManagementLabel);
		clickElementJS(commonLotsApprisal);
		waitForInvisibility(loaderIcon);
		return llbCommonLotsApprisal.getText();
	}

	public boolean toolBarFullScreen()
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		waitForInvisibility(loaderIcon);
		if (isElementDisplayed(normalScreenIcon)) {
			clickElementJS(normalScreenIcon);
			waitForInvisibility(loaderIcon);
			return true;
		} else {
			return false;
		}
	}
	public String columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(columnChooser);
		waitForInvisibility(loaderIcon);
		String colchooserTitle = llbColumnChooser.getText();
		waitForElementToBeClickable(closeColChooser);
		clickElement(closeColChooser);
		waitForInvisibility(loaderIcon);
		return colchooserTitle;
	}

	public boolean excelClick() 
	{
		if(isElementEnabled(excel)){
			waitForInvisibility(loaderIcon);		
			clickElement(excel);
			waitForInvisibility(loaderIcon);				
			return true;

		}
		else {
			return false;
		}
	}
	public boolean csvClick() 
	{
		if(isElementEnabled(csv)){
			waitForInvisibility(loaderIcon);		
			clickElement(csv);
			waitForInvisibility(loaderIcon);				
			return true;

		}
		else {
			return false;
		}


	}



}
