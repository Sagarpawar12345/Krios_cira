package com.ciranet.basepage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

public abstract class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	// Page elements
	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	WebElement hamburgerMenu;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	protected WebDriverWait getWait() {
		if (wait == null) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		}
		return wait;
	}

	// Wait for an element to be visible
	protected void waitForElementToBeVisible(WebElement element) {
		wait = getWait();
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Wait for an element to be invisible
	protected void waitForInvisibility(WebElement element) {
		wait = getWait();
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// Wait for an element to be clickable
	protected void waitForElementToBeClickable(WebElement element) {
		wait = getWait();
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// Wait for a list of elements to be visible
	protected void waitForElementsToBeVisible(List<WebElement> elements) {
		wait = getWait();
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	// Click on an element
	protected void clickElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	// Enter text into an input field
	protected void enterText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		element.clear();
		element.sendKeys(text);
	}

	// Get text from an element
	protected String getElementText(WebElement element) {
		waitForElementToBeVisible(element);
		return element.getText();
	}

	// Check if an element is displayed
	protected boolean isElementDisplayed(WebElement element) {
		try {
			waitForElementToBeVisible(element);
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	// Check if an element is enabled
	protected boolean isElementEnabled(WebElement element) {
		waitForElementToBeVisible(element);
		return element.isEnabled();
	}

	// Scroll to an element using JavaScript
	protected void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Scroll to an element using JavaScript
	protected void clickElementJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// Select a value from a dropdown
	protected void selectDropdownByValue(WebElement element, String value) {
		waitForElementToBeClickable(element);
		new Select(element).selectByValue(value);
	}

	// Select a value from a dropdown by visible text
	protected void selectDropdownByVisibleText(WebElement element, String visibleText) {
		waitForElementToBeClickable(element);
		new Select(element).selectByVisibleText(visibleText);
	}

	// Get the current page URL
	protected String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}

	// Get the page title
	protected String getPageTitle() {
		return driver.getTitle();
	}

	// Navigate to a URL
	protected void navigateToURL(String url) {
		driver.navigate().to(url);
	}

	// Refresh the page
	protected void refreshPage() {
		driver.navigate().refresh();
	}

	// Switch to a new window or tab
	protected void switchToWindow(String windowHandle) {
		driver.switchTo().window(windowHandle);
	}

	// Close the current window
	protected void closeCurrentWindow() {
		driver.close();
	}

	// Accept an alert
	protected void acceptAlert() {
		wait = getWait();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

	// Dismiss an alert
	protected void dismissAlert() {
		wait = getWait();
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
	}

	// Get alert text
	protected String getAlertText() {
		wait = getWait();
		return wait.until(ExpectedConditions.alertIsPresent()).getText();
	}

	protected void waitForUrlToBe(WebDriver driver, String url) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe(url));
	}

	protected void switchToNewTabAndVerifyURL(WebElement link) {
		String originalTab = driver.getWindowHandle();
		clickElement(link);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		String actualURL = driver.getCurrentUrl();
		System.out.println("Current URL : " + actualURL);

		driver.close();
		driver.switchTo().window(originalTab);
	}

	protected boolean isElementVisible(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException | StaleElementReferenceException | ElementNotInteractableException e) {
			return false; // Return false if element is not found or not displayed
		}
	}

	// Method to click on hamburgerMenu
	public void hamburgerMenu() {
		clickElement(hamburgerMenu);
	}

	// Common method to check the menu is available otherwise Skip that test
	protected void checkElementAvailability(By locator, String elementDescription) {
		try {
			WebElement element = driver.findElement(locator);
			if (!element.isDisplayed()) {
				throw new SkipException(elementDescription + " is not available. Skipping the test.");
			}
		} catch (NoSuchElementException e) {
			throw new SkipException(elementDescription + " element not found. Skipping the test.");
		}
	}
}
