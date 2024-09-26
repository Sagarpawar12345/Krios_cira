package com.ciranet.community.information.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.community.information.pages.CommunityAssetsPage;
import com.ciranet.constants.Constants;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;
@RequiresLogin
public class CommunityAssetsPageTest extends TestBase {
	// Create the CommunityAssetsPage object
	CommunityAssetsPage communityAssetsPage = createPage(CommunityAssetsPage.class);
	@Test(priority = 0, description = "Verify Community Assets", groups = {Constants.SMOKE_TESTING},alwaysRun=true)
	public void verifyCommunityAssetsPage() 
	{

		LoggerManager.info("Verifying Community Assets Page Title");
		TestBase.setExtentReportSettings("Community Assets Page Title Test", Constants.SMOKE_TESTING, "Verify Community Assets Page Title", "Verifying Community Assets Page Title");
		communityAssetsPage = new CommunityAssetsPage(driver);
		assertEquals(communityAssetsPage.communityAssetsPage(), "Assets");

	} 

	@Test(priority = 1, description = "Verify Community Assets", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyAddNewAsset() 
	{

		LoggerManager.info("Verifying Add Assets ");
		TestBase.setExtentReportSettings("Add Assets ", Constants.FUNCTIONAL_TESTING, "Verify Add Assets ", "Verifying Add Assets ");
		communityAssetsPage = new CommunityAssetsPage(driver);
		assertEquals(communityAssetsPage.addNewAsset(), "Add/Edit Asset");

	} 
    
	@Test(priority = 2, description = "Verify Community Assets", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyEditAsset() 
	{

		LoggerManager.info("Verifying Edit Assets ");
		TestBase.setExtentReportSettings("Edit Assets", Constants.FUNCTIONAL_TESTING, "Verify Community Edit Assets", "Verifying Edit Assets");
		communityAssetsPage = new CommunityAssetsPage(driver);
		assertEquals(communityAssetsPage.editAsset(), "Add/Edit Asset");

	} 

	@Test(priority = 3, description = "Verify Community Assets", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyDeleteAsset() 
	{

		LoggerManager.info("Verifying Delete Assets");
		TestBase.setExtentReportSettings("Delete Assets ", Constants.FUNCTIONAL_TESTING, "Verify Delete Assets", "Verifying Delete Assets");
		communityAssetsPage = new CommunityAssetsPage(driver);
		assertEquals(communityAssetsPage.deleteAsset(), "Confirmation");

	} 
  
	@Test(priority = 4, description = "Verify Community Assets", groups = {Constants.FUNCTIONAL_TESTING},alwaysRun=true)
	public void verifyUploadAssetImage() throws AWTException 
	{

		LoggerManager.info("Verifying Upload Assets");
		TestBase.setExtentReportSettings("Upload Assets ", Constants.FUNCTIONAL_TESTING, "Verify Upload Assets", "Verifying Upload Assets");
		communityAssetsPage = new CommunityAssetsPage(driver);
		assertEquals(communityAssetsPage.uploadAssetImage(), "Upload Asset Images");
	} 

}
