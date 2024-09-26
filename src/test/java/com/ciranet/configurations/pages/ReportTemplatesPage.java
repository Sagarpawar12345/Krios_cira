package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ReportTemplatesPage extends BasePage {
	public ReportTemplatesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//app-security-info[@securityindicator='LOCK']")
	WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Report Templates')]")
	WebElement reportTemplate;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	WebElement configurationDropDown;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[contains(text(),'Letter Templates')]")
	WebElement letterTemplate;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[normalize-space()='Builder Statement Cover Letter']")
	WebElement letterheadValue;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[contains(text(),'Letterhead Template')]")
	WebElement letterHeadTemplate;

	@FindBy(xpath = "//div[@class='config-tree-menu-item']//span[normalize-space()='Page Footer']")
	WebElement letterHeadTemplatevalue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement contextDropDown;

	@FindBy(xpath = "(//div[@class='dx-treelist-content']//td[@Class='dx-treelist-cell-expandable'])[1]")
	WebElement contextValue;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),' Letter Templates / Builder Statement Cover Letter - Global ')]")
	public WebElement labelLetterTemplate;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),' Letterhead Template / Page Footer - Global ')]")
	public WebElement labelLetterHeadTemplate;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public String letterTemplate() {
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		clickElementJS(configurations);
		waitForInvisibility(loaderIcon);
		scrollToElement(reportTemplate);
		clickElementJS(reportTemplate);
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(letterTemplate);
		waitForInvisibility(loaderIcon);
		clickElementJS(letterheadValue);
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		waitForInvisibility(loaderIcon);
		return labelLetterTemplate.getText();

	}

	public String letterHeadTemplate() {
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(letterHeadTemplate);
		waitForInvisibility(loaderIcon);
		clickElementJS(letterHeadTemplatevalue);
		waitForInvisibility(loaderIcon);
		clickElement(contextDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		waitForInvisibility(loaderIcon);
		return labelLetterHeadTemplate.getText();

	}

}
