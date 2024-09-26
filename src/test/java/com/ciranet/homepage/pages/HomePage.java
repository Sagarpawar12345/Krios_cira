package com.ciranet.homepage.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;


public class HomePage extends BasePage{

	protected WebDriver driver;

	public Boolean blnLogin = false;

	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;
	
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolbarMenu;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitysearchBox;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitysearchButton;
	
	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;
	
	@FindBy(xpath = "//dx-button[@title='Owner Search']")
	public WebElement ownerIcon;
	
	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	public WebElement ownersearchBox;
	
	@FindBy(xpath = "//div[@class='dx-scrollable-content']//table[@class='dx-datagrid-table dx-datagrid-table-fixed']//tr//td[7]//div//app-hyperlink-creator")
	public WebElement ownerLink;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement ownersearchButton;
	
	@FindBy(xpath= "//div[@class='dx-loadindicator-icon']")
	private WebElement eleLoadIcon;
	
	public void loadIcon() {
		LoggerManager.info("============  Clicking on Owner Search ============");
		WebDriverWait waitLoader = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitLoader.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}
	
	
	public boolean searchOwner(String ownerSearchKeyword){
		LoggerManager.info("============  Clicking on Owner Search ============");

        if (!ownersearchBox.isDisplayed()) {
            clickElement(toolbarMenu);
        }
        
        waitForElementToBeVisible(ownersearchBox);
        clickElement(ownersearchBox);
        
        waitForInvisibility(eleLoadIcon);
        
        
        ownersearchBox.sendKeys(ownerSearchKeyword);
        clickElement(ownersearchButton);

        waitForInvisibility(eleLoadIcon);
        waitForElementToBeVisible(ownerLink);
        waitForInvisibility(eleLoadIcon);
        switchToNewTabAndVerifyURL(ownerLink);
        return true;
	}
	
	public boolean searchCommunity(String communitySearchKeyword) {
        LoggerManager.info("============  Clicking on Community Search ============");

        waitForElementToBeVisible(communityIcon);
        clickElement(communityIcon);
        waitForElementToBeVisible(communitysearchBox);
        clickElement(communitysearchBox);
        communitysearchBox.sendKeys(communitySearchKeyword);
        clickElement(communitysearchButton);

        waitForElementToBeVisible(amberwoodLink);
        switchToNewTabAndVerifyURL(amberwoodLink);
        return true;
	}	
}