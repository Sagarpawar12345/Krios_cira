package com.ciranet.preferences.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class PreferencesPage extends BasePage{
	// Initializing the Page Objects:
	public PreferencesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="(//div[contains(@class,'dx-dropdowneditor-icon')])[3]")
	WebElement themeWD;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[5]")
	WebElement behaviourWD;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[7]")
	WebElement behaviourDropdown;

	@FindBy(xpath = "//span[normalize-space()='Preferences']")
	WebElement preferencesMenu;


	@FindBy(xpath="//dx-select-box[@valueexpr='name']//input[@role='combobox']")
	WebElement selectedTheme;

	@FindBy(xpath ="(//div[contains(@class,'dx-texteditor-container')])[33]")
	WebElement docFileLinkDropdown;


	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[33]")
	WebElement documentFileLinks;

	@FindBy(xpath ="(//div[contains(@class,'dx-texteditor-container')])[35]")
	WebElement scrollModeDropdown;

	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[35]")
	WebElement scrollMode;

	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[36]")
	WebElement scrollType;


	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[37]")
	WebElement autoshowTopMenu;

	@FindBy(xpath = "//div[@class='cc-user-panel-name']")
	WebElement userPanel;

	@FindBy(xpath="//div//span[contains(text(),'Apply')]")
	WebElement applyButton;

	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content'][contains(.,'Logout')]")
	WebElement logoutLink;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	@FindBy(xpath = "//div[@role='toolbar']//div[@class='dx-toolbar-items-container']")
	WebElement preferencesPopup;

	@FindBy(xpath = "//div[contains(text(),'Open in new window')]")
	WebElement openInNewWindowValue;

	@FindBy(xpath="//div[contains(text(),'Open in same window')]")
	WebElement openInSameWindowValue;

	@FindBy(xpath="//div[contains(text(),'Teal Light Background')]")
	WebElement tealLightColor;

	@FindBy(xpath = "//div[contains(text(),'Blue Dark Background')]")
	WebElement blueDarkColor;

	public void verifyPreferencesMenuAvailibility() {
		checkElementAvailability(By.xpath("//span[normalize-space()='Preferences']"), "Preferences");
	}
	
	private void selectPreferencesMenu() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(userPanel);
		waitForElementToBeClickable(userPanel);
		clickElementJS(userPanel);
		clickElement(preferencesMenu);
	}

	public boolean verifyPreferencesMenuVisibility() {
		LoggerManager.info("============  Clicking on Preferences menu ============");
		selectPreferencesMenu();

		String preferencesPopUp = driver.getWindowHandle();
		switchToWindow(preferencesPopUp);

		if (getElementText(preferencesPopup)!= null) {
			System.out.println("Popup title is " + getElementText(preferencesPopup));
			return true;
		}
		else
			return false;
	}

	public boolean verifyMainNavigationBehaviourOpenInSameWindowValue() {
		LoggerManager.info("============  Clicking on Preferences menu and set Behaviour Dropdown value ============");
		selectPreferencesMenu();

		String preferencesPopUp = driver.getWindowHandle();
		switchToWindow(preferencesPopUp);

		clickElement(behaviourWD); //behaviourDropdown

		if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in same window"))
		{ 
			clickElementJS(openInNewWindowValue);
			waitForElementToBeClickable(applyButton);
			clickElementJS(applyButton);
			return true;
		} 
		else if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in new window"))
		{ 
			clickElementJS(openInSameWindowValue);
			waitForElementToBeClickable(applyButton);
			clickElementJS(applyButton);
			return true;
		}
		else 
			System.out.println("Dropdown is not clicked");
		return false;
	}

	public boolean verifyMainNavigationBehaviourOpenInNewWindowValue() {
		selectPreferencesMenu();
		waitForInvisibility(loaderIcon);
		String preferencesPopUp = driver.getWindowHandle();
		switchToWindow(preferencesPopUp);

		waitForElementToBeClickable(behaviourWD);

		clickElementJS(behaviourDropdown);

		if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in new window"))
		{ 
			clickElementJS(openInSameWindowValue);
			waitForElementToBeClickable(applyButton);
			clickElementJS(applyButton);
			return true;
		}
		else if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in same window"))
		{ 
			clickElementJS(openInNewWindowValue);
			waitForElementToBeClickable(applyButton);
			clickElementJS(applyButton);
			return true;
		}  
		else
			return false;
	}

	public boolean verifyThemeDropdownSelection() {
		selectPreferencesMenu();

		String preferencesPopUp = driver.getWindowHandle();
		switchToWindow(preferencesPopUp);

		waitForElementToBeClickable(themeWD);

		clickElementJS(themeWD);
		String themesColor = selectedTheme.getAttribute("value");

		switch (themesColor) {
		case "Blue Light Background":
			clickElement(tealLightColor);
			break;
		case "Teal Light Background":
			clickElement(blueDarkColor);
			break;
		default:
		}

		waitForElementToBeClickable(applyButton);
		clickElementJS(applyButton);		
		return true;
	}
}
