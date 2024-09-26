package com.ciranet.community.information.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class CommunityAssetsPage extends BasePage {

	public CommunityAssetsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='dx-button-content']//i[@class='dx-icon fas fa-map-marker-alt']")
	WebElement communitySearchIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement searchCommunityTextBox;

	@FindBy(xpath = "//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	WebElement searchIcon;

	@FindBy(xpath = "(//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover']//span[contains(text(),' Amberwood')])[1]")
	WebElement community;

	@FindBy(xpath = "//h4[@class='popup-title-text']")
	WebElement communityAlert;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement communityAlertCloseIcon;	
	
	@FindBy(xpath="//div[@class='header-text']//span[normalize-space()='Information']")
	WebElement informationMenu;

	@FindBy(xpath = "//span[normalize-space()='Community Assets']")
	WebElement communityAssets;
	
	@FindBy(xpath="//h2[@class='page-header']")
	WebElement pageTitle;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath="(//div[@class='dx-template-wrapper dx-button-content'])[10]")
	WebElement addNewAssetButton;
	
	@FindBy(xpath="//div[contains(text(),'Add/Edit Asset')]")
	WebElement popupTitle;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-container']//div[@class='dx-dropdowneditor-icon'])[4]")
	WebElement assetGroupDropDown;
	
	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	WebElement assetGroupDropDownValue;
	
	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[14]")
	WebElement assetNumberTextBox;
	
	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[15]")
	WebElement nameTextBox;
	
	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[16]")
	WebElement costTextBoxTextBox;
	
	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[17]")
	WebElement replacementCostTextBox;
	
	@FindBy(xpath="(//input[@role='spinbutton'])[6]")
	WebElement estLifeRemainingTextBox;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[6]")
	WebElement estLifeAsOfDropDown;
	
	@FindBy(xpath="(//div[@class ='dx-item dx-list-item'])[15]")
	WebElement estLifeAsOfDropDownValue;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath="//div[@class='dx-group-panel-item dx-datagrid-action dx-datagrid-drag-action']")
	WebElement groupDrag;
	
	@FindBy(xpath="//div[normalize-space()='Asset #']")
	WebElement groupDrop;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//span[@class='dx-button-text'][normalize-space()='Action'])[1]")
	WebElement actionButton;
	
	@FindBy(xpath="//div[contains(text(),'Edit/View')]")
	WebElement editViewMenu;
	
	@FindBy(xpath="//textarea[@role='textbox']")
	WebElement descriptionTextBox;
	
	@FindBy(xpath="//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;
	
	@FindBy(xpath="//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandAll;
	
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteMenu;
	
	@FindBy(xpath="//div[@aria-label='No']//div[@class='dx-button-content']")
	WebElement noConfirmationPopup;
	
	@FindBy(xpath="//div[contains(text(),'Confirmation')]")
	WebElement confirmationPopup;
	
	@FindBy(xpath="//tbody/tr[2]/td[11]/div[1]")
	WebElement uploadAssetImageLink;
	
	@FindBy(xpath="//div[contains(text(),'Upload Asset Images')]")
	WebElement uploadAssetImagepopupTitle;
	
	@FindBy(xpath="//div[contains(text(),'Actions')]")
	WebElement uploadAssetActionButton;
	
	@FindBy(xpath="//div[contains(text(),'Add Image')]")
	WebElement addAssetImage;
	
	@FindBy(xpath="//span[normalize-space()='Browse']")
	WebElement browseButton;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveAssetImage;
	
	@FindBy(xpath="//i[@class='dx-icon dx-icon-close']")
	WebElement closeUploadAsset;
	
	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburger;


	public String communityAssetsPage() {

		waitForInvisibility(loaderIcon);
		clickElement(communitySearchIcon);	
		clickElement(searchCommunityTextBox);	
		searchCommunityTextBox.sendKeys("Amberwood");	
		clickElement(searchIcon);	
		clickElement(community);	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));
	
		if (isElementDisplayed(communityAlert)) {
			clickElement(communityAlertCloseIcon);

		}
	
		waitForInvisibility(loaderIcon);
		scrollToElement(informationMenu);
		waitForInvisibility(loaderIcon);
		clickElement(informationMenu);
		waitForInvisibility(loaderIcon);
		scrollToElement(communityAssets);
		waitForInvisibility(loaderIcon);
		clickElement(communityAssets);
		waitForInvisibility(loaderIcon);
		return pageTitle.getText();

	}
	
	public String addNewAsset() {
		waitForInvisibility(loaderIcon);
		clickElement(addNewAssetButton);
		String addPopupTitle=popupTitle.getText();
		waitForInvisibility(loaderIcon);
		clickElement(assetGroupDropDown);
		clickElementJS(assetGroupDropDownValue);
		
		waitForInvisibility(loaderIcon);
		clickElementJS(assetNumberTextBox);
		assetNumberTextBox.sendKeys("Pool7777");
		
		waitForInvisibility(loaderIcon);
		clickElement(nameTextBox);
		nameTextBox.sendKeys("Pool Assets");
		
		clickElement(costTextBoxTextBox);
		costTextBoxTextBox.sendKeys("100");
		
		clickElement(replacementCostTextBox);
		replacementCostTextBox.sendKeys("30");
		
		scrollToElement(estLifeRemainingTextBox);
		clickElement(estLifeRemainingTextBox);
		estLifeRemainingTextBox.sendKeys("1");
		
		waitForInvisibility(loaderIcon);
		clickElementJS(estLifeAsOfDropDown);
		clickElementJS(estLifeAsOfDropDownValue);
		waitForInvisibility(loaderIcon);
		
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		return addPopupTitle; 
	}

	public String editAsset()
	{	
		waitForInvisibility(loaderIcon);
		clickElement(resetLayout);
		waitForInvisibility(loaderIcon);
		clickElement(expandAll);
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		clickElementJS(editViewMenu);
		waitForInvisibility(loaderIcon);
		String editPopupTitle=popupTitle.getText();
		clickElement(descriptionTextBox);
		descriptionTextBox.clear();
		descriptionTextBox.sendKeys("Edit Description");
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		return editPopupTitle;
		}
	
	public String deleteAsset() {
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		clickElementJS(deleteMenu);
		String popupConfirmation = confirmationPopup.getText();
		waitForInvisibility(loaderIcon);
		clickElement(noConfirmationPopup);
		waitForInvisibility(loaderIcon);
		return popupConfirmation;
	}
	
	public String uploadAssetImage() throws AWTException
{       
		waitForInvisibility(loaderIcon);
		clickElement(hamburger);
		waitForInvisibility(loaderIcon);
		clickElement(uploadAssetImageLink);
		String assetImage = uploadAssetImagepopupTitle.getText();
		waitForInvisibility(loaderIcon);
		Actions actions = new Actions(driver);
		actions.moveToElement(uploadAssetActionButton).perform();
		clickElement(addAssetImage);
		waitForInvisibility(loaderIcon);
		clickElement(browseButton);
		Robot robot = new Robot();
		StringSelection s = new StringSelection(System.getProperty("user.dir") +"\\src\\test\\java\\com\\ciranet\\testdata\\communityAssets.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		// pressing ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		waitForInvisibility(loaderIcon);
		
		robot.keyPress(KeyEvent.VK_V);
		waitForInvisibility(loaderIcon);
		
		// releasing ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		waitForInvisibility(loaderIcon);
		
		robot.keyRelease(KeyEvent.VK_V);
		waitForInvisibility(loaderIcon);
		
		// pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		waitForInvisibility(loaderIcon);

		// releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		waitForInvisibility(loaderIcon);
		
		clickElement(saveAssetImage);
		waitForInvisibility(loaderIcon);
		clickElement(closeUploadAsset);
		return assetImage; 
}
	}
