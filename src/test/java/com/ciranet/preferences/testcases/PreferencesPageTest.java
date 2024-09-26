package com.ciranet.preferences.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.preferences.pages.PreferencesPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class PreferencesPageTest extends TestBase {
	// Create the PreferencesPage object
	PreferencesPage preferencesPage = createPage(PreferencesPage.class);
	
	@Test(priority = 0, description = "Verify Preferences", groups = { Constants.SMOKE_TESTING }, alwaysRun = true)
	public void clickPreferences() {
		LoggerManager.info("Verifying Preferences");
		TestBase.setExtentReportSettings("Preferences Menu", Constants.SMOKE_TESTING, "Verify Preferences Popup",
				"Verifying Preferences");
		preferencesPage = new PreferencesPage(driver);
		assertTrue(preferencesPage.verifyPreferencesMenuVisibility(), "Preferences menu is not seen");
	}
	
	@Test(priority = 1, description = "Verify Main Navigation Dropdown", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void clickMainNavigaionBehaviourDropdownValue() {

		LoggerManager.info("Verifying Preferences Main Navigation Behaviour Dropdown");
		TestBase.setExtentReportSettings("Manin Navigation Behaviour", Constants.FUNCTIONAL_TESTING,
				"Verify Main Navigation Behaviour dropdown", "Verifying Main Navigation Behaviour dropdown");
		preferencesPage = new PreferencesPage(driver);
		assertTrue(preferencesPage.verifyMainNavigationBehaviourOpenInSameWindowValue(), "Main Navigation is not set");
	}

	@Test(priority = 2, description = "Verify Main Navigation Dropdown - Open in New Window", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void clickOpenInSameWindowDropdownValue() {
		LoggerManager.info("Verifying Preferences Main Navigation Behaviour Dropdown");
		TestBase.setExtentReportSettings("Main Navigation Behaviour", Constants.FUNCTIONAL_TESTING,
				"Verify in Same Window dropdown value", "Verifying Open in New dropdown value");
		preferencesPage = new PreferencesPage(driver);
		assertTrue(preferencesPage.verifyMainNavigationBehaviourOpenInNewWindowValue(),
				"Dropdown value is not selected");
	}

	@Test(priority = 3, description = "Verify Theme Dropdown with Teal Light", groups = {
			Constants.FUNCTIONAL_TESTING }, alwaysRun = true)
	public void clickThemeDropdown() {
		LoggerManager.info("Verifying Theme Dropdown selection with Teal Light");
		TestBase.setExtentReportSettings("Theme Dropdown Selection with Teal Light", Constants.FUNCTIONAL_TESTING,
				"Verify Theme dropdown with Teal Light", "Verifying Theme dropdown selection with Teal Light");
		preferencesPage = new PreferencesPage(driver);
		assertTrue(preferencesPage.verifyThemeDropdownSelection(), "Theme value is not selected");
	}
}
