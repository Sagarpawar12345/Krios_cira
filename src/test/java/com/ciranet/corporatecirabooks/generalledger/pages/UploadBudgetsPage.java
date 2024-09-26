package com.ciranet.corporatecirabooks.generalledger.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;


//Every line of code that runs in Java must be inside a class
public class UploadBudgetsPage extends BasePage
{

	// Initializing the Page Objects:
	public UploadBudgetsPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Corporate CiraBooks')]")
	WebElement corporateCiraBooksMenu;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'General Ledger')]") 
	WebElement  generalLedgerMenu;
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Upload Budgets')]")
	WebElement  uploadBudgetsMenu;
	
	@FindBy(xpath = "//input[@role='combobox']")
	WebElement managementDropdown;

	@FindBy(xpath = "//div[contains(text(),'RealManage')]")
	WebElement realManage;

	@FindBy(xpath = "//span[normalize-space()='Get Template']")
	WebElement getTemplateButton;

	@FindBy(name = "budgetName")
	WebElement budgetNameTextbox;

	@FindBy(xpath = "//div[@class='dx-switch-off']")
	WebElement isPrimaryToggleButton;

	@FindBy(xpath = "//span[normalize-space()='Browse']")
	WebElement browseButton;

	@FindBy(xpath = "//span[normalize-space()='Upload']")
	WebElement uploadButton;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath = "//h2[@class='page-header flex-center-aligned-row']")
	WebElement lblUploadBudgets;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement alertMessage;
	
	// method declaration
	public String uploadBudgetsMenu() {
		waitForInvisibility(loaderIcon);
		clickElementJS(corporateCiraBooksMenu);
		System.out.println("Corporate Cirabooks menu is clicked");
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("General Ledger menu is clicked"); 
		clickElementJS(uploadBudgetsMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Upload Budgets Menu is clicked and page loaded successfully");
		return lblUploadBudgets.getText();
	}

	public boolean verifyUploadBudgetsPage() throws AWTException
	{

		waitForInvisibility(loaderIcon);
		clickElement(managementDropdown);

		Robot robot = new Robot(); // Robot class throws AWT Exception

		// statement which prints the argument passed to it
		System.out.println("Management Company dropdown is clicked");

		clickElement(realManage);

		// statement which prints the argument passed to it
		System.out.println("RealManage dropdown is clicked");
		clickElement(getTemplateButton);
		
		waitForInvisibility(loaderIcon);
		// statement which prints the argument passed to it
		System.out.println("Get Template button is clicked");

		// This will press Escape key on keyboard.
		robot.keyPress(KeyEvent.VK_ESCAPE);

		// This will press Escape key on keyboard.
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		enterText(budgetNameTextbox, "Test Budget Name");

		clickElement(isPrimaryToggleButton);		
		clickElement(browseButton);
		StringSelection s = new StringSelection(System.getProperty("user.dir") +
				"\\src\\test\\java\\com\\ciranet\\testdata\\uploadBudgetsTemplate.xlsx");
		
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

		// statement which prints the argument passed to it
		clickElement(uploadButton);
		
		// statement which prints the argument passed to it
		System.out.println("Upload button clicked");
		waitForInvisibility(loaderIcon);

		if (isElementDisplayed(alertMessage)) {
			System.out.println(alertMessage.getText());
			waitForInvisibility(loaderIcon);
			return true;
		}
		else {
			return false;
		}
	}
}