package com.ciranet.cirabooks.accountspayable.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;
import java.util.ArrayList;

public class APExpenseDetailPage extends BasePage
{
	public APExpenseDetailPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//div[@class='dx-button-content'])[4]")
	WebElement communityIcon;
	
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textBox; 
	
	@FindBy(xpath = "(//span[contains(text(),'Amberwood')])[1]")
	WebElement amberwoodCommunity;
	
	@FindBy(xpath = "//i[@class='dx-icon fas fa-times']")
	WebElement crossMark;
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Community')]")
	WebElement navigationCommunity;
	
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'CiraBooks')]")
	WebElement navigationCiraBooks;
	
	@FindBy(xpath="//span[contains(text(),'Accounts Payable')]")
	WebElement navigationAccountsPayable; 
	
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'AP Expense Detail')]")
	WebElement apExpenseDetailMenu;
	
	@FindBy(xpath="//h2[contains(text(),'AP Expense Detail')]")
	WebElement apExpenseDetailLabel;

	@FindBy(xpath = "(//a[@class='cc-hyperlink dx-theme-accent-as-text-color'])[1]")
	WebElement amountColumn;
	
	@FindBy(xpath = "//span[contains(text(),'Bill Description:')]")
	WebElement billDescriptionLable;
	
	@FindBy(xpath = "//dx-button[@aria-label='Reclassify']")
	WebElement reclassifyButton;
	
	@FindBy(xpath = "//legend[contains(text(),'AAP Workflow Job Details')]")
	WebElement jobDetailsLabel;

	@FindBy(xpath = "(//dx-button[@aria-label='Close'])[2]")
	WebElement errorCloseButton;

	@FindBy(xpath = "//dx-button[@title='Settings']")
	WebElement settingButton;

	@FindBy(xpath = "//span[text()='Show Invoice On Right Pane']")
	WebElement rightPane;

	@FindBy(xpath = "//dx-button[@title='Settings']")
	WebElement settingButton1;

	@FindBy(xpath = "//span[text()='Show Invoice On Left Pane']")
	WebElement leftPane;

	@FindBy(xpath = "//div[text()='Internal Notes']")
	WebElement internalNotesIcon;

	@FindBy(xpath = "(//div[@class='dx-texteditor-container']//textarea[@class='dx-texteditor-input'])[2]")
	WebElement newNotesTextbox;

	@FindBy(xpath = "//dx-button[@aria-label='Save']")
	WebElement newNotesSave;

	@FindBy(xpath = "(//dx-button[@aria-label='Close'])[3]")
	WebElement newNotesClose;
	
	@FindBy(xpath = "//i[@title='Invoice History']")
	WebElement workflowHistoryIcon;

	@FindBy(xpath = "(//div[@class='dx-button-content']//span[contains (text(),'Close')])[3]")
	WebElement historyCloseButton;
	
	@FindBy(xpath="//dx-button[@text='Reclass']")
	WebElement reclassButton;

	@FindBy(xpath="//i[@class='dx-icon dx-icon-close']")
	WebElement apBillClose;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	public String apExpenseDetailMenu() 
	{	
		waitForInvisibility(loaderIcon);
		clickElement(communityIcon);
		clickElement(textBox);
		enterText(textBox, "Amberwood");
		textBox.sendKeys(Keys.ENTER);
		clickElement(amberwoodCommunity);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communityTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) communityTabs.get(1));

		clickElementJS(crossMark);
		waitForInvisibility(loaderIcon);
		
		clickElement(navigationCommunity);
		clickElement(navigationCiraBooks);
		waitForInvisibility(loaderIcon);
		clickElement(navigationAccountsPayable);
		waitForInvisibility(loaderIcon);
		clickElementJS(apExpenseDetailMenu);
		waitForInvisibility(loaderIcon);
			
		return apExpenseDetailLabel.getText();
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

	public String amountColumn() 
	{	
		waitForInvisibility(loaderIcon);
		clickElementJS(amountColumn);
		System.out.println("AP Bill popup gets open");
		
		return billDescriptionLable.getText();	
	}

	public String reclassifyButton() 
	{	
		waitForInvisibility(loaderIcon);
		clickElement(reclassifyButton);
		
		waitForInvisibility(loaderIcon);
		clickElement(errorCloseButton);
		
		String workflowLabel= jobDetailsLabel.getText();
		
		waitForInvisibility(loaderIcon);
		clickElement(settingButton);
		clickElement(rightPane);
		
		waitForInvisibility(loaderIcon);
		clickElement(settingButton);
		clickElement(leftPane);
		
		waitForInvisibility(loaderIcon);
		clickElement(internalNotesIcon);
		waitForInvisibility(loaderIcon);
		clickElement(newNotesTextbox);
		enterText(newNotesTextbox, "AP Expense Details");
		clickElement(newNotesSave);
		clickElement(newNotesClose);
		
		waitForInvisibility(loaderIcon);
		clickElement(workflowHistoryIcon);
		waitForInvisibility(loaderIcon);
		clickElement(historyCloseButton);
		
		waitForInvisibility(loaderIcon);
		clickElement(reclassButton);
		
		waitForInvisibility(loaderIcon);
		clickElement(apBillClose);
		return workflowLabel;
	}
}
