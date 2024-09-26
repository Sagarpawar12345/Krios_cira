package com.ciranet.forgotpassword.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;

public class ForgotPasswordPage extends BasePage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//dx-button[@aria-label='Forgot Password']//div[@class='dx-button-content']")
	WebElement buttonForgotPassword;
	
	public boolean verifyForgotPasswordButtonClick() {
		isElementEnabled(buttonForgotPassword);
		clickElement(buttonForgotPassword);
		String forgotPasswordURL = driver.getCurrentUrl();
		waitForUrlToBe(driver, forgotPasswordURL);
		return true;
	}

}
