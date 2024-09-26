package com.ciranet.myworkqueue.disclosureprocessing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class CommunityBlocksPage extends BasePage
{
	public CommunityBlocksPage(WebDriver driver) 
	{
		super(driver);
	}
	   
	// xpath For column Chooser
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'My Work Queue')]")
	private WebElement myWorkQueue;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Disclosure Processing')]")
	private WebElement  disclosureProcessing;
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Community Blocks')]")
	private WebElement communityBlocks;
	
	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	private WebElement close;
	
	//xpath for fullscreen option
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	WebElement communityColumn;

	//xapth for ExportToExcel
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-excel']")
	WebElement exportExcel;

	//xpath for Expandandcollapse	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	public WebElement iSquare;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	public WebElement iSquarePlus;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement reset;

	//xpath for Switching tabs
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content']//span[@class='dx-tab-text'])[2]")
	public WebElement expired;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content']//span[@class='dx-tab-text'])[1]")
	public WebElement active;
	
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content']//span[contains(text(),'Active')])")
	public WebElement activeLabel;
	
	//xpath for Add Block
	@FindBy(xpath = "//span[normalize-space()='Add Block']")
	private WebElement addBlockButton;
		
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[11]")
	private WebElement dropdown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	private WebElement dropdownValue;

	@FindBy(xpath = "(//div[@class='dx-field-item-content dx-field-item-content-location-bottom']//input[@class='dx-texteditor-input'])[8]")
	private WebElement inputText;

	@FindBy(xpath = "//div[@class='dx-field-item-content dx-field-item-content-location-bottom']//textarea[@class='dx-texteditor-input']")
	private WebElement blockText;

	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon']")
	private WebElement cancel;
	
	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//div[contains(text(),'Add Community Block')]")
	public WebElement addBlocksLabel;

	//xpath for Edit Option
	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon']//div[@class='dx-button-content'])[2]")
	public WebElement editButton;
	
	@FindBy(xpath = "//span[contains(text(),'Block Text:')]")
	public WebElement editPopupLabel;

	@FindBy(xpath = "//div[@class='dx-datagrid-filter-panel-clear-filter']")
	public WebElement clearButton;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	WebElement collapseIcon;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	WebElement expandIcon;
	
	@FindBy(xpath = "(//div[@class='dx-texteditor-input-container']//input[@class='dx-texteditor-input'])[5]")
	WebElement communityFilter;
	
	@FindBy(xpath = "//div[contains(text(),'Column Chooser')]")
	public WebElement columnChooserLabel;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath = "//h2[contains(text(),'SOA Community Blocks Config')]")
	public WebElement communityBlocksLabel;
	
	@FindBy(xpath = "(//div[contains(text(),'Community')])[1]")
	public WebElement communityHeader;

	public String communityBlocksMenu()
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myWorkQueue);
		clickElementJS(disclosureProcessing);
		waitForInvisibility(loaderIcon);
		clickElementJS(communityBlocks);
		waitForInvisibility(loaderIcon);
		return communityBlocksLabel.getText();
	}

	public String columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(columnChooser);
		String colchooserTitle = columnChooserLabel.getText();
		waitForElementToBeClickable(close);
		clickElement(close);
		waitForInvisibility(loaderIcon);
		return colchooserTitle;
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

	public boolean exportToExcel()
	{
		if(isElementEnabled(exportExcel))
		{
			waitForInvisibility(loaderIcon);		
			clickElement(exportExcel);
			waitForInvisibility(loaderIcon);				
			return true;
		}
		else 
		{
			return false;
		}

	}

	public String switchingTabs() {
		
		waitForInvisibility(loaderIcon);
		clickElementJS(expired);
		waitForInvisibility(loaderIcon);		
		clickElementJS(active);
		return activeLabel.getText();
	}
	
	public String addBlock()

	{
		waitForInvisibility(loaderIcon);
		clickElement(addBlockButton);
		waitForInvisibility(loaderIcon);
		String addPopupTitle = addBlocksLabel.getText();
		clickElementJS(dropdown);
		waitForInvisibility(loaderIcon);
		clickElement(dropdownValue);
		waitForInvisibility(loaderIcon);
		clickElement(inputText);		
		enterText(inputText, "New Community Added");
		waitForInvisibility(loaderIcon);
		enterText(blockText, "Testing Purpose");
		waitForInvisibility(loaderIcon);
		scrollToElement(cancel);
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		return addPopupTitle;
	}

	public String activeEditButton()
	{
		waitForInvisibility(loaderIcon);
		clickElement(editButton);
		waitForInvisibility(loaderIcon);
		String blockTextLabel = editPopupLabel.getText();
		scrollToElement(cancel);
		clickElement(saveButton);
		return blockTextLabel;
	}

	public String expiredEditButton()
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(expired);
		waitForInvisibility(loaderIcon);
		clickElement(editButton);
		waitForInvisibility(loaderIcon);
		String blockTextLabel = editPopupLabel.getText();
		scrollToElement(saveButton);
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		clickElement(active);
		waitForInvisibility(loaderIcon);
		return blockTextLabel;
	}
	
	public String communityFilter()
	{
		waitForInvisibility(loaderIcon);
		clickElement(communityFilter);
		enterText(communityFilter, "Keys");
		clickElement(clearButton);
		waitForInvisibility(loaderIcon);
		return communityHeader.getText();
	}
}




