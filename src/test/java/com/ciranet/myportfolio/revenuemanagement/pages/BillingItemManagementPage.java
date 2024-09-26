package com.ciranet.myportfolio.revenuemanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class BillingItemManagementPage extends BasePage 
{
		public BillingItemManagementPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'My Portfolio')]")
	private WebElement myPortFolio;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Revenue Management')]")
	private WebElement revenueManagement;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),' Billing Item Management ')]")
	private WebElement  billingItemManagement ;

	@FindBy(xpath="dx-loadindicator-icon")
	public WebElement loaderIcon;
	
	@FindBy(xpath="//h2[contains(text(), 'Billing Item Management')]")
	public WebElement labelBillingItemManagement;
	
	public String billingItemManagementMenu()
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(myPortFolio);
		System.out.println("My PortFolio Label is clicked");
		waitForInvisibility(loaderIcon);
		scrollToElement(revenueManagement);
		clickElement(revenueManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("Revenue Management Label is clicked");
		scrollToElement(billingItemManagement);
		clickElementJS(billingItemManagement);
		waitForInvisibility(loaderIcon);
		System.out.println("Billing Item Management is clicked and page loaded successfully");		
		return labelBillingItemManagement.getText();
	}
}
