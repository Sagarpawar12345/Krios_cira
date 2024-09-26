package com.ciranet.community.information.pages;

import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
import org.openqa.selenium.interactions.Actions;

public class CommonLotsPage extends BasePage {
	public CommonLotsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox;

	@FindBy(xpath = "//a[@class='cc-hyperlink dx-theme-accent-as-text-color cc-hyperlink-hover']//span[normalize-space()='Amberwood']")
	WebElement amberwoodCommunity;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Information')]")
	WebElement navigationInformation;

	@FindBy(xpath = "//span[contains(text(),'Common Lots')]")
	WebElement navigationCommonLots;

	@FindBy(xpath = "//h2[text()=' Common Lots ']")
	WebElement pageTitle;

	@FindBy(xpath = "//div[@class='dx-item dx-tab']//div[contains(text(),'Common Lots')]")
	WebElement commonLotsTab;

	@FindBy(xpath = "//div[@class='dx-item dx-tab']//div[contains(text(),'PTA Received')]")
	WebElement ptaReceivedTab;

	@FindBy(xpath = "//div[@class='dx-item dx-tab']//div[contains(text(),'PTA Not Received')]")
	WebElement ptaNotReceivedTab;

	@FindBy(xpath = "//div[@class='dx-item dx-tab']//div[contains(text(),'Property Taxes Paid')]")
	WebElement propertyTaxesPaidTab;

	@FindBy(xpath = "//div[@class='button-content']")
	WebElement addNewCommonLotButton;

	@FindBy(xpath = "//div[contains(text(),'Add a New Common Lot')]")
	WebElement commonLotPopupTitle;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[9]")
	WebElement phaseDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[2]")
	WebElement phaseDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[10]")
	WebElement sectionDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[4]")
	WebElement sectionDropdownValue;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[32]")
	WebElement blockTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[33]")
	WebElement lotTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[34]")
	WebElement numberTextbox;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[11]")
	WebElement streetDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[12]")
	WebElement streetDropdownValue;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[36]")
	WebElement cityTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[38]")
	WebElement zipTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[39]")
	WebElement countyTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[40]")
	WebElement parcelTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[41]")
	WebElement improvedValueTextbox;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[42]")
	WebElement totalAcreageTextbox;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[13]")
	WebElement commonAreaTypeDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[36]")
	WebElement commonAreaTypeDropdownValue;

	@FindBy(xpath = "//textarea[@class='dx-texteditor-input']")
	WebElement lotDescriptionTextbox;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt'])[1]")
	WebElement fullScreenIcon;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180'])[1]")
	WebElement normalScreenIcon;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt'])[2]")
	WebElement fullScreenIconCategoryGrid;

	@FindBy(xpath = "(//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180'])[2]")
	WebElement normalScreenIconCategoryGrid;

	@FindBy(xpath = "(//div//span[contains(text(),'Action')])[1]")
	WebElement actionButton;

	@FindBy(xpath = "//div[contains(text(),'Edit/View')]")
	WebElement editViewMenu;

	@FindBy(xpath = "//div[contains(text(),'Edit a Common Lot')]")
	WebElement editCommonLotPopupTitle;

	@FindBy(xpath = "(//td[contains(text(),'Not Exempt')])[1]")
	WebElement ptaNotExemptMenu;

	@FindBy(xpath = "(//td[contains(text(),'Exemption Filed')])[1]")
	WebElement ptaExemptionFiledMenu;

	@FindBy(xpath = "(//td[contains(text(),'Association Not Responsible')])[1]")
	WebElement ptaAssociationNotResponsibleMenu;

	@FindBy(xpath = "//div[contains(text(),'Change Exempt Status')]")
	WebElement changeExemptStatusMenu;

	@FindBy(xpath = "//div[@class='menu-item-container']//div[contains(text(),'Not Exempt')]")
	WebElement notExemptMenu;

	@FindBy(xpath = "//div[@class='menu-item-container']//div[contains(text(),'Exemption Filed')]")
	WebElement exemptionFiledMenu;

	@FindBy(xpath = "//div[@class='menu-item-container']//div[contains(text(),'Association Not Responsible')]")
	WebElement associationNotResponsibleMenu;

	@FindBy(xpath = "//div[contains(text(),'Activate')]")
	WebElement activateMenu;

	@FindBy(xpath = "//div[contains(text(),'Deactivate')]")
	WebElement deactivateMenu;

	@FindBy(xpath = "(//td[@role='gridcell']//i[@title='Notes'])[1]")
	WebElement notesIcon;

	@FindBy(xpath = "//div[@class='textarea-container']//span[normalize-space()='New Notes']")
	WebElement newNotesLabel;

	@FindBy(xpath = "(//textarea[@role='textbox'])[2]")
	WebElement newNotesTextbox;

	@FindBy(xpath = "//div[contains(text(),'Category')]")
	WebElement categoryColumnText;

	@FindBy(xpath = "//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines dx-selection']")
	WebElement tableRowSelect;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	WebElement yearDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[4]")
	WebElement yearDropdownValue;

	@FindBy(xpath = "//div[@class='dx-datagrid-group-closed']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[contains(text(),'Appraiser')]")
	WebElement appraiserColumnText;

	@FindBy(xpath = "//div[contains(text(),'Street Number')]")
	WebElement streetNumberColumnText;

	@FindBy(xpath = "//div[contains(text(),'Tax Year')]")
	WebElement taxYearColumnText;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	// method declaration
	public String commonLotsMenu() {
		waitForInvisibility(loaderIcon);
		clickElementJS(communityIcon);
		clickElementJS(textBox);
		enterText(textBox, "Amberwood");
		textBox.sendKeys(Keys.ENTER);
		clickElementJS(amberwoodCommunity);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));

		clickElementJS(crossMark);
		waitForInvisibility(loaderIcon);
		clickElement(navigationInformation);
		waitForInvisibility(loaderIcon);
		scrollToElement(navigationCommonLots);
		clickElementJS(navigationCommonLots);
		waitForInvisibility(loaderIcon);
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

	public String commonLotActions() {
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);

		// View/Edit menu
		waitForInvisibility(loaderIcon);
		clickElementJS(actionButton);
		clickElement(editViewMenu);

		String editPopupTitle = editCommonLotPopupTitle.getText();

		waitForInvisibility(loaderIcon);
		scrollToElement(lotDescriptionTextbox);
		clickElementJS(lotDescriptionTextbox);
		enterText(lotDescriptionTextbox, "Edit Common lot description for testing");
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);

		// Change Exempt Status Menu
		// Not Exempt Menu
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);

		Actions actions = new Actions(driver);
		actions.moveToElement(changeExemptStatusMenu).perform();
		clickElementJS(notExemptMenu);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(ptaNotExemptMenu)) {
			System.out.println("Exempt status change");
		} else if (isElementDisplayed(ptaExemptionFiledMenu)) {
			System.out.println("Exempt status change");
		} else {
			System.out.println("Exempt status change");
		}
		waitForInvisibility(loaderIcon);

		// Exemption Filed Menu
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);

		actions.moveToElement(changeExemptStatusMenu).perform();
		clickElementJS(exemptionFiledMenu);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(ptaNotExemptMenu)) {
			System.out.println("Exempt status change");
		} else if (isElementDisplayed(ptaExemptionFiledMenu)) {
			System.out.println("Exempt status change");
		} else {
			System.out.println("Exempt status change");
		}
		waitForInvisibility(loaderIcon);

		// Association Not Responsible Menu
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);
		actions.moveToElement(changeExemptStatusMenu).perform();
		clickElementJS(associationNotResponsibleMenu);
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(ptaNotExemptMenu)) {
			System.out.println("Exempt status change");
		} else if (isElementDisplayed(ptaExemptionFiledMenu)) {
			System.out.println("Exempt status change");
		} else {
			System.out.println("Exempt status change");
		}
		waitForInvisibility(loaderIcon);

		// Activate/Deactivate Menu
		clickElementJS(actionButton);
		if (isElementDisplayed(activateMenu)) {
			clickElementJS(activateMenu);

		} else {
			clickElementJS(deactivateMenu);
		}

		waitForInvisibility(loaderIcon);
		return editPopupTitle;
	}

	public String notes() {
		waitForInvisibility(loaderIcon);
		clickElement(notesIcon);
		String notesLabel = newNotesLabel.getText();
		clickElement(newNotesTextbox);
		enterText(newNotesTextbox, "Common lots notes for testing");
		clickElement(saveButton);

		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(tableRowSelect);

		clickElement(tableRowSelect);
		clickElementJS(normalScreenIcon);
		return notesLabel;
	}

	public String categoryGrid() {
		clickElementJS(fullScreenIconCategoryGrid);
		String categoryLabel = categoryColumnText.getText();
		waitForInvisibility(loaderIcon);
		clickElementJS(normalScreenIconCategoryGrid);
		return categoryLabel;
	}
	
	//PTA Received tab
	public String ptaReceivedTab() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ptaReceivedTab);
		String appraiserLabel = appraiserColumnText.getText();
		clickElement(yearDropdown);
		clickElement(yearDropdownValue);
		clickElement(expandIcon);
		clickElement(notesIcon);
		enterText(newNotesTextbox, "Notes for PTA Received tab");
		clickElement(saveButton);
		waitForInvisibility(loaderIcon);
		return appraiserLabel;
	}
	
	//PTA Not Received tab
	public String ptaNotReceivedTab() {
		waitForInvisibility(loaderIcon);
		clickElementJS(ptaNotReceivedTab);
		String streetNumberLabel = streetNumberColumnText.getText();
		clickElement(yearDropdown);
		clickElement(yearDropdownValue);
		return streetNumberLabel;
	}
	
	//Property Taxes Paid tab
	public String propertyTaxesPaidTab() {
		waitForInvisibility(loaderIcon);
		clickElementJS(propertyTaxesPaidTab);
		String taxYearLabel = taxYearColumnText.getText();
		clickElement(expandIcon);
		return taxYearLabel;
	}
	
	//Common Lots tab
	public String addCommonLot() {

		waitForInvisibility(loaderIcon);
		clickElement(commonLotsTab);
		waitForInvisibility(loaderIcon);
		clickElementJS(addNewCommonLotButton);

		String addPopupTitle = commonLotPopupTitle.getText();

		clickElement(phaseDropdown);
		clickElement(phaseDropdownValue);
		clickElement(sectionDropdown);
		clickElement(sectionDropdownValue);
		clickElement(blockTextbox);
		enterText(blockTextbox, "Test Block");

		clickElement(lotTextbox);
		enterText(lotTextbox, "Test Lot");
		clickElement(numberTextbox);
		enterText(numberTextbox, "9800000001");
		clickElement(streetDropdown);
		clickElement(streetDropdownValue);

		clickElement(cityTextbox);
		enterText(cityTextbox, "San Diego");
		clickElement(zipTextbox);
		enterText(zipTextbox, "92109");

		clickElement(countyTextbox);
		enterText(countyTextbox, "San Diego");
		clickElement(parcelTextbox);
		enterText(parcelTextbox, "Test Parcel");

		clickElement(improvedValueTextbox);
		enterText(improvedValueTextbox, "112233445566");
		clickElement(totalAcreageTextbox);

		enterText(totalAcreageTextbox, "22334455");
		clickElement(commonAreaTypeDropdown);
		clickElement(commonAreaTypeDropdownValue);
		clickElement(lotDescriptionTextbox);
		enterText(lotDescriptionTextbox, "Common lot description for testing");
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);

		return addPopupTitle;
	}
}
