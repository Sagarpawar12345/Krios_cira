package com.ciranet.loginpage.pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='login-portal-header']")
	private WebElement lblManagementBoardPortal;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	private WebElement txtPassword;

	@FindBy(xpath = "//dx-button[@aria-label='Log in']//div[@class='dx-button-content']")
	private WebElement btnSignIn;

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgInvalidCredentials;

	@FindBy(xpath = "//div[@class='dx-overlay dx-widget dx-visibility-change-handler dx-toast']")
	private WebElement msgTxtLoginError;

	@FindBy(xpath = "//i[contains(@class,'dx-icon fas fa-eye')]")
	private WebElement showEyeIconPassword;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-eye-slash']")
	private WebElement hideEyeIconPassword;

	@FindBy(xpath = "(//input[@role='textbox'])[2]")
	private WebElement getPassword;

	@FindBy(xpath = "//dx-button[@aria-label='Forgot Password']//div[@class='dx-button-content']")
	private WebElement btnForgotPassword;

	@FindBy(xpath = "//a[@class='choose-portal-hyperlink']")
	private WebElement linkChooseDiffPortal;

	@FindBy(xpath = "//input[@role='textbox']")
	private WebElement txtUserNameOnFP;

	@FindBy(xpath = "//div[@id='rc-anchor-container']")
	private WebElement captchaContainer;

	@FindBy(xpath = "//div[@class='reset-button-content']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//dx-button[@aria-label='Back to Login']//div[@class='dx-button-content']")
	private WebElement btnBackToLogin;

	// This method check the Valid userName and Valid password
	public boolean verifyLogin(String userName, String password) {
		LoggerManager.info("======== into verifyLogin() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));
			
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyLogin() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			LoggerManager.info("======== End verifyLogin() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// This method is used to verify Visibility of Login Page Components
	public boolean visibilityOfLoginPageComponents() {
		try {
			waitForElementToBeVisible(txtUsername);
			LoggerManager.info("============  Verifying Visibility Of Login Page Components ============");

			boolean allComponentsVisible = lblManagementBoardPortal.isDisplayed() && txtUsername.isDisplayed()
					&& txtPassword.isDisplayed() && btnSignIn.isDisplayed() && btnForgotPassword.isDisplayed()
					&& linkChooseDiffPortal.isDisplayed();

			if (allComponentsVisible) {
				LoggerManager.info("============  Login Page verified ============");
				return true;
			} else {
				LoggerManager.info("============  Login Page verification failed ============");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// This method is used - KeyPress event after Password is entered
	public boolean verifyLoginWithEnterKeyPress(String userName, String password) {
		LoggerManager.info("======== into verifyLoginEnterKeyPress() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			txtPassword.sendKeys(Keys.ENTER);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in verifyLoginEnterKeyPress() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			LoggerManager.info("======== End verifyLoginEnterKeyPress() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// Method is used for checking Browser's Back
	public boolean clickBrowserBack(String userName, String password) {
		LoggerManager.info("======== into clickBrowserBackTest() ========");
		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);
			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in clickBrowserBackTest() +++++++++ " + e.getMessage());
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");

			driver.navigate().back();
			LoggerManager.info("======== End clickBrowserBackTest() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// This method retrieves the border color of a WebElement using JavaScript
	public String getUsernameBorderColor() {
		clickElement(btnSignIn);

		String script = "return window.getComputedStyle(arguments[0]).getPropertyValue('border-color');";

		return (String) ((JavascriptExecutor) driver).executeScript(script,
				driver.findElement(By.xpath("//input[@type='text']")));
	}

	// Method checks invalid Login
	public boolean invalidLogin(String username, String password) {
		LoggerManager.info("======== Into invalidLogin() ========");
		try {
			enterText(txtUsername, username);
			LoggerManager.info("======== Username: " + username + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			if (btnSignIn.isEnabled()) {
				clickElement(btnSignIn);
			} else {
				LoggerManager.debug("======== Button is disabled ========");
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}

		if (!driver.getCurrentUrl().endsWith("/home") && msgInvalidCredentials.isDisplayed()) {
			LoggerManager.info("======== invalidLogin() Fail ========");
			return false;
		} else {
			LoggerManager.info("======== invalidLogin() Pass ========");
			return true;
		}
	}

	// Method checks Visibility of Components of Forgot password page
	public boolean visibilityOfForgotPasswordPageComponents() {
		try {
			clickElement(btnForgotPassword);

			waitForElementToBeVisible(txtUserNameOnFP);

			LoggerManager.info("============ Verifying Visibility Of Forgot Password Page Components ============");

			boolean allComponentsVisible = txtUserNameOnFP.isDisplayed() &&
			// captchaContainer.isDisplayed() &&
					btnSubmit.isDisplayed() && btnBackToLogin.isDisplayed();

			if (allComponentsVisible) {
				LoggerManager.info("============ Forgot Password Page verified ============");
				return true;
			} else {
				LoggerManager.info("============ Forgot Password Page verification failed ============");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verifyShowPassword(String username, String password) {
		LoggerManager.info("======== View Password() ========");
		try {
			enterText(txtUsername, username);
			LoggerManager.info("======== Username: " + username + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(showEyeIconPassword);

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}

		if (isElementDisplayed(getPassword)) {
			clickElement(hideEyeIconPassword);
			return true;
		} else {
			LoggerManager.debug("======== Button is disabled ========");
			return false;
		}
	}

	public String verifyDifferentPortalLink() {
		LoggerManager.info("======== Verify Different Link() ========");
		try {
			if (isElementDisplayed(linkChooseDiffPortal)) {
				clickElement(linkChooseDiffPortal);

			} else {
				LoggerManager.debug("======== Link is not displayed ========");
			}

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in invalidLogin() +++++++++ " + e.getMessage());
		}
		return getCurrentPageURL();

	}

	public String verifyForgotPasswordPage() {
		LoggerManager.info("======== Verify Forgot PAssword Link() ========");
		try {
			if (isElementDisplayed(btnForgotPassword)) {
				clickElement(btnForgotPassword);
				waitForElementToBeVisible(btnBackToLogin);
			} else {
				LoggerManager.debug("========Forgot Password Link is not displayed ========");
			}

		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception in Forgotpassword() +++++++++ " + e.getMessage());
		}
		return getCurrentPageURL();
	}

	// Method checks the Simultaneous login on Same browser
	public boolean verifySimultaneousLoginOnSameBrowser(String userName, String password) {
		LoggerManager.info("======== into verifySimultaneousLoginOnSameBrowser() ========");

		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);

			waitForInvisibility(driver.findElement(By.xpath("dx-loadindicator-icon")));
		} catch (Exception e) {
			LoggerManager
					.error("+++++++++ Exception in verifySimultaneousLoginOnSameBrowser() +++++++++ " + e.getMessage());
			return false;
		}

		if (driver.getCurrentUrl().endsWith("home")) {
			LoggerManager.info("======== Login Success ========");
			LoggerManager.info("======== End verifySimultaneousLoginOnSameBrowser() ========");
			return true;
		} else {
			LoggerManager.debug("======== Login Unsuccessful ========");
			return false;
		}
	}

	// Method is used to check the application of Different Browsers
	public boolean verifyLoginDiffUsersOnDifferentBrowsers(String userName, String password) {
		LoggerManager.info("======== into verifyLoginDiffUsersOnDifferentBrowsers() ========");

		try {
			enterText(txtUsername, userName);
			LoggerManager.info("======== Username: " + userName + " ========");

			enterText(txtPassword, password);
			LoggerManager.info("======== Password: " + password + " ========");

			clickElement(btnSignIn);

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		} catch (Exception e) {
			LoggerManager.error(
					"+++++++++ Exception in verifyLoginDiffUsersOnDifferentBrowsers() +++++++++ " + e.getMessage());
			return false;
		}

		// Different browser code
		FirefoxDriver ffDriver = new FirefoxDriver();
		String applicationURL = EnvironmentConfig.environmentSetup().get("APPLICATIONURL");

		try {
			ffDriver.get(applicationURL);
			ffDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			LoggerManager.debug("------- Page load timeout is set to: 40");

			ffDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			LoggerManager.debug("------- Implicit Wait time is set to: 15");

			enterText(txtUsername, userName);
			enterText(txtPassword, password);

			clickElement(btnSignIn);

			String expectedUrl = EnvironmentConfig.environmentSetup().get("ApplicationURL") + "/home";
			waitForUrlToBe(driver, expectedUrl);

			String actualUrl = ffDriver.getCurrentUrl();

			if (expectedUrl.equals(actualUrl)) {
				LoggerManager.info("======== Login on different browser Success ========");
				LoggerManager.info("======== End verifyLoginDiffUsersOnDifferentBrowsers() ========");
				assertEquals(expectedUrl, actualUrl);

				ffDriver.quit();
				return true;
			} else {
				LoggerManager.debug("======== verifyLoginDiffUsersOnDifferentBrowsers Unsuccessful ========");
				ffDriver.quit();
				return false;
			}
		} catch (Exception e) {
			LoggerManager.error("+++++++++ Exception during different browser operations +++++++++ " + e.getMessage());
			ffDriver.quit();
			return false;
		}
	}

	public boolean userLogout() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			// Wait for user panel to be visible
			WebElement userPanel = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cc-user-panel-name']")));


			// Click on the user panel
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", userPanel);

			// Wait for logout button to be visible and click on it
			WebElement logoutButton = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Logout')]")));
			logoutButton.click();

			LoggerManager.info("======== Logout successful ========");
			return true;

		} catch (TimeoutException | ElementNotInteractableException e) {
			LoggerManager.error("+++++++++ Exception in userLogout() +++++++++ " + e.getMessage());
			return false;
		}
	}

}
