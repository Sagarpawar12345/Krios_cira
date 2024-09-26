package com.ciranet.community.information.pages;

import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class CommunityNotesPage extends BasePage {
	public CommunityNotesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox;

	@FindBy(xpath = "//span[contains(text(),'Herff Ranch')]")
	WebElement herffRanchCommunity;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Information')]")
	WebElement navigationInformation;

	@FindBy(xpath = "//span[contains(text(),'Community Notes')]")
	WebElement navigationCommunityNotes;

	@FindBy(xpath = "//h2[text()=' Community Notes ']")
	WebElement pageTitle;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//div[contains(text(),'Add a Note')]")
	WebElement newNoteLabel;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[10]")
	WebElement addNewNoteButton;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[7]")
	WebElement categoryDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[1]")
	WebElement categoryValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[8]")
	WebElement subCategoryDropdown;

	@FindBy(xpath = "(//div[@class='dx-item-content dx-list-item-content'])[16]")
	WebElement subCategoryValue;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[14]")
	WebElement subjectTextEditor;
	
	@FindBy(xpath = "//button[@title='Horizontal line']")
	WebElement horizontalLineIcon;
	
	@FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
	WebElement notesTextEditor;

	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[11]")
	WebElement importNoteTemplateButton;

	@FindBy(xpath = "//div[contains(text(),'Import Notes From Template')]")
	WebElement importNoteTemplateLabel;

	@FindBy(xpath = "(//span[@class='dx-checkbox-icon'])[2]")
	WebElement checkbox;

	@FindBy(xpath = "//span[text()='Import']")
	WebElement importButton;

	@FindBy(xpath = "(//div[@aria-label='Action'])[1]")
	WebElement actionButton;

	@FindBy(xpath = "//div[text()=' Edit ']")
	WebElement editMenu;

	@FindBy(xpath = "//div[@class='dx-button-content']//span[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//div[contains(text(),'Edit Note')]")
	WebElement editNoteLabel;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	// method declaration
	public String communityNotesMenu() {
		waitForInvisibility(loaderIcon);
		clickElement(communityIcon);
		clickElement(textBox);
		enterText(textBox, "Herff Ranch");
		textBox.sendKeys(Keys.ENTER);
		clickElement(herffRanchCommunity);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));

		clickElementJS(crossMark);
		waitForInvisibility(loaderIcon);

		clickElement(navigationInformation);
		waitForInvisibility(loaderIcon);
		scrollToElement(navigationCommunityNotes);
		clickElementJS(navigationCommunityNotes);
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

	public String addNote() {

		waitForInvisibility(loaderIcon);
		clickElement(addNewNoteButton);
		String addTitle = newNoteLabel.getText();
		waitForInvisibility(loaderIcon);
		clickElement(categoryDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(categoryValue);
		waitForInvisibility(loaderIcon);
		clickElement(subCategoryDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(subCategoryValue);
		waitForInvisibility(loaderIcon);
		clickElement(subjectTextEditor);
		enterText(subjectTextEditor, "Subject for testing porpose");
		waitForInvisibility(loaderIcon);
		clickElement(horizontalLineIcon);
		waitForInvisibility(loaderIcon);
		clickElement(saveButton);
		return addTitle;
	}

	public String importNoteTemplate() {
		
		waitForInvisibility(loaderIcon);
		clickElement(importNoteTemplateButton);
		String notesTemplateTitle = importNoteTemplateLabel.getText();
		waitForInvisibility(loaderIcon);
		clickElement(checkbox);
		waitForInvisibility(loaderIcon);
		clickElement(importButton);
		return notesTemplateTitle;
	}

	public String actionButton() {

		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editMenu);
		String editTitle = editNoteLabel.getText();
		clickElement(saveButton);
		return editTitle;
	}

}
