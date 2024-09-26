package com.ciranet.configurations.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ciranet.basepage.BasePage;

public class CommunityAccountingPage extends BasePage 
{
	public CommunityAccountingPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Configurations')]") 
	private WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Community Accounting')]")
	private WebElement communityAccounting;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	private WebElement configurationDropDown;
	
	@FindBy(xpath = "//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'AAP Cross Entity Bill')]")
	private WebElement aapCrossEntityBill;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAP Work Flow Auto Action')]")
	private WebElement aapWorkFlowAutoAction;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAP Work Flow CheckList')]")
	private WebElement aapWorkFlowCheckList;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Billing Types')]")
	private WebElement aarBillingTypes;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Builder Statements')]")
	private WebElement aarBuilderStatements;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Misc Invoice Types')]")
	private WebElement aarMiscInvoiceTypes;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Payment Application Order')]")
	private WebElement aarPaymentApplicationOrder;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Statements')]")
	private WebElement aarStatements;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'Collections Configuration')]")
	private WebElement collectionsConfiguration;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	private WebElement contextDropDown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextValue;

	@FindBy(xpath = "//div[@title='Expand All']")
	WebElement expandAllIcon;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAP Cross Entity Bill - 1920 E. Maryland Place Townhomes, Inc.')]")
	public WebElement aapCrossEntityBillLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAP Work Flow Auto Action - Global')]")
	public WebElement aapWorkFlowAutoActionLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAP Work Flow CheckList - Global')]")
	public WebElement aapWorkFlowCheckListLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAR Billing Types - Global')]")
	public WebElement aarBillingTypesLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAR Builder Statements - Global')]")
	public WebElement aarBuilderStatementsLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAR Misc Invoice Types - RealManage')]")
	public WebElement aarMiscInvoiceTypesLabel;
	
	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAR Payment Application Order - Global')]")
	public WebElement aarPaymentApplicationOrderLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'AAR Statements - RealManage')]")
	public WebElement aarStatementsLabel;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Collections Configuration - Global')]")
	public WebElement collectionsConfigurationLabel;
	
	@FindBy(xpath = "//h2[contains(text(),'Community Accounting Configurations')]")
	public WebElement communityAccountingLable;
	
	public String communityAccountingPage() 
	{
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		clickElementJS(configurations);
		clickElementJS(communityAccounting);
		waitForInvisibility(loaderIcon);
		
		return communityAccountingLable.getText();
	}
	
	public String aapCrossEntityBill() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapCrossEntityBill);

		waitForInvisibility(loaderIcon);
		System.out.println("AAP Cross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElement(expandAllIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aapCrossEntityBillLabel.getText();
	}

	public String aapWorkFlowAutoAction() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapWorkFlowAutoAction);

		waitForInvisibility(loaderIcon);
		System.out.println("AAP Work Flow Auto Action menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aapWorkFlowAutoActionLabel.getText();
	}

	public String aapWorkFlowCheckList() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapWorkFlowCheckList);

		waitForInvisibility(loaderIcon);
		System.out.println("AAP Work Flow CheckList menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aapWorkFlowCheckListLabel.getText();
	}

	public String aarBillingTypes() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarBillingTypes);

		waitForInvisibility(loaderIcon);
		System.out.println("AAR Billing Types menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aarBillingTypesLabel.getText();
	}
	
	public String aarBuilderStatements() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarBuilderStatements);

		waitForInvisibility(loaderIcon);
		System.out.println("AAR Builder Statements menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aarBuilderStatementsLabel.getText();
	}

	public String aarMiscInvoiceTypes() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarMiscInvoiceTypes);

		waitForInvisibility(loaderIcon);
		System.out.println("AAR Misc Invoice Types menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aarMiscInvoiceTypesLabel.getText();
	}

	public String aarPaymentApplicationOrder() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarPaymentApplicationOrder);

		waitForInvisibility(loaderIcon);
		System.out.println("AAR Payment Application Order menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aarPaymentApplicationOrderLabel.getText();
	}

	public String aarStatements() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarStatements);

		waitForInvisibility(loaderIcon);
		System.out.println("AAR Statements menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return aarStatementsLabel.getText();
	}

	public String collectionsConfiguration() 
	{
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(collectionsConfiguration);

		waitForInvisibility(loaderIcon);
		System.out.println("Collections Configuration menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
		return collectionsConfigurationLabel.getText();
	}

}