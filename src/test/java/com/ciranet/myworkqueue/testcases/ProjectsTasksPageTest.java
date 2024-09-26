package com.ciranet.myworkqueue.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.constants.Constants;
import com.ciranet.myworkqueue.pages.ProjectsTasksPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.RequiresLogin;

@RequiresLogin
public class ProjectsTasksPageTest extends TestBase{
	
	// Create the ProjectsTasksPage object
	ProjectsTasksPage projectsTasksPage = createPage(ProjectsTasksPage.class);

	@Test(priority = 1, description = "Verify HomePage Title", groups = { Constants.SMOKE_TESTING })
	public void verifyProjectTaskPage() {
		LoggerManager.info("Verifying Project Task Page");
		projectsTasksPage = new ProjectsTasksPage(driver);
		projectsTasksPage.ProjectTaskPageLanding();
		TestBase.setExtentReportSettings("Verifying Project Task ", Constants.SMOKE_TESTING, "Project task", "Verifying Project Tack");
	}

	@Test(priority = 2, description = "Verify Help Button", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyHelpOfProjectTask() 
	{
		LoggerManager.info("Verifying Project Task Help");
		TestBase.setExtentReportSettings("Verifying Project Task  Help", Constants.FUNCTIONAL_TESTING, "Project task", "Verify Project Task Help");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.helpProjectTask(),"Help icon for Project Task is not seen");
	}

	@Test(priority = 3, description = "Verify tab Switching", groups ={Constants.FUNCTIONAL_TESTING }) 
	public void VerifySwitchtab() 
	{
		LoggerManager.info("Verifying Project Task Tab Switch");
		TestBase.setExtentReportSettings("Verifying Project Task Tab Switch", Constants.FUNCTIONAL_TESTING, "Project task", "Verify Tab switch");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.Switchtab(),"Switch Tab is not working");
	}

	@Test(priority = 4, description = "Verify Project Task Page Refresh Button click", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyRefreshButtonClick() 
	{
		LoggerManager.info("Verifying Project Task - Refresh button functionality");
		TestBase.setExtentReportSettings("Verifying Refresh Button Click", Constants.FUNCTIONAL_TESTING, "Clicking Refresh button", "Verify Refresh button");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.refreshButtonClick(),"Refresh button is not clicked");
	}

	@Test(priority = 5, description = "Verify Notification Settings Button", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyNotificationSetting() 
	{
		LoggerManager.info("Verifying Project Task Notification Settings");
		TestBase.setExtentReportSettings("Verifying Notification screen", Constants.FUNCTIONAL_TESTING, "Notification Screen", "Verify Notification Screen");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.NotificationSetting(),"Notification button is not clicked");
	}

	@Test(priority = 6, description = "Verify Toolbar - Full screen option click", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyToolbarFullScreenOption() 
	{
		LoggerManager.info("Verifying Project Task - Full screen");
		TestBase.setExtentReportSettings("Verifying Full Screen", Constants.FUNCTIONAL_TESTING, "Full Screen", "Verify Full Screen functionality");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.ToolBarFullScreen(), "Fullscreen is not seen");
	}

	
	@Test(priority = 7, description = "Verify Toolbar - Normal screen option click", groups = {Constants.FUNCTIONAL_TESTING })
	public void verifyToolbarNormalScreenOption() 
	{
		LoggerManager.info("Verifying Project Task - Normal screen click");
		TestBase.setExtentReportSettings("Verifying Normal Screen", Constants.FUNCTIONAL_TESTING, "Normal Screen", "Verify Normal screen");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.ToolBarNormalScreen(),"Normal icon is not seen");
	}

	@Test(priority = 8, description = "Verify Toolbar - Column Chooser icon click", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyColumnChooserOption() 
	{
		LoggerManager.info("Verifying Project Task - Column Chooser");
		TestBase.setExtentReportSettings("Verifying Column Chooser", Constants.FUNCTIONAL_TESTING, "Column Chooser", "Verify Column chooser");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.columnChooserClick(),"Column chooser is not seen");
	}

	@Test(priority = 9, description = "Verify Toolbar - Expand And Collapse", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyMenuExpandCollapseOption() 
	{	
		LoggerManager.info("Verifying Expand and Collapse");
		TestBase.setExtentReportSettings("Verifying Expand Collapse", Constants.FUNCTIONAL_TESTING, "Expand Collapse", "Verify Collapse");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.expandCollapseClick(),"Expand collapse not seen");
	}

	//Action Button in closed task disabled
	@Test(priority = 10, description = "Verify Action button Edit functionality", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyActionEditFunctionality() 
	{
		LoggerManager.info("Verifying Project Task Action Edit");
		TestBase.setExtentReportSettings("Verifying Action - Edit", Constants.FUNCTIONAL_TESTING, "Action Edit", "Verify Action Button");
		projectsTasksPage = new ProjectsTasksPage(driver);
		projectsTasksPage.verifyActionButton();
	}

	@Test(priority = 11, description = "Verify Add New Project Task Button", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyAddNewProjectTaskButtonClick() 
	{
		LoggerManager.info("Verifying Add new Project Task");
		TestBase.setExtentReportSettings("Verifying Add new Project Task", Constants.FUNCTIONAL_TESTING, "New Project task", "Verify Add new Project Task functionaity");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertEquals(projectsTasksPage.AddNewProjectTaskButtonClick(), "Add New Task"); 
	}

	@Test(priority = 12, description = "Verify Active Filter selection", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyActivefilterselection() 
	{
		LoggerManager.info("Verifying Active Filter");
		TestBase.setExtentReportSettings("Verifying Active Filter", Constants.FUNCTIONAL_TESTING, "Active Filter", "Verify Active Filter selection");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.Activefilterselection(),"Filter is not selected");
	}

	@Test(priority = 13, description = "Verify Closed Within Days Textbox", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyDaysTextbox() 
	{
		LoggerManager.info("Verifying Project Task Within Days");
		TestBase.setExtentReportSettings("Verifying Within Days Textbox", Constants.FUNCTIONAL_TESTING, "Days Text", "Verify Closed Within Days Testbox");
		projectsTasksPage = new ProjectsTasksPage(driver);
		assertTrue(projectsTasksPage.closedWithinDaysTextbox(),"Closed Within textbox is not seen");
	}

	@Test(priority = 14, description = "Verify user logout", groups = { Constants.FUNCTIONAL_TESTING })
	public void verifyuserlogout() 
	{
		LoggerManager.info("Verifying Logout functionality");
		TestBase.setExtentReportSettings("Verifying Logout ", Constants.FUNCTIONAL_TESTING, "Log out", "Verify Logout");
		projectsTasksPage = new ProjectsTasksPage(driver);
		projectsTasksPage.userlogout();
	}
}