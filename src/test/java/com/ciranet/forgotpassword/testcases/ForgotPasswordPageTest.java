package com.ciranet.forgotpassword.testcases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import com.ciranet.constants.Constants;
import com.ciranet.forgotpassword.pages.ForgotPasswordPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;

public class ForgotPasswordPageTest extends TestBase{
	ForgotPasswordPage forgotPasswordPage = createPage(ForgotPasswordPage.class);

	@Test(priority = 0, description = "Verify Forgot Password", groups = {Constants.SMOKE_TESTING}, alwaysRun = true)
	
	public void clickPreferences()
	{
		LoggerManager.info("Verifying Forgot Password");
		TestBase.setExtentReportSettings("Forgot Password Functionality", Constants.SMOKE_TESTING, "Verify Forgot Password", "Verifying Forgot PAssword");
		forgotPasswordPage = new ForgotPasswordPage(driver);
		assertTrue(forgotPasswordPage.verifyForgotPasswordButtonClick(), "Forgot Password menu "); 
	}
	

}
