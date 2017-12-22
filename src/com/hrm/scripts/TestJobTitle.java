package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddJobTitlePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.JobTitlesPage;

public class TestJobTitle extends BaseTest
{
	@Test(priority=6)
	public void testJobTitle()
	{
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickAdminModule();
		dbPage.moveToJob();
		dbPage.clickJobTitleMenu();
		JobTitlesPage jtPage=new JobTitlesPage(driver);
		jtPage.clickAdd();
		AddJobTitlePage ajtPage=new AddJobTitlePage(driver);
		ajtPage.setJobTitle("manager");
		ajtPage.clickSave();
		jtPage.checkJobTitlesPresent("manager");
		jtPage.selectJobTitleCheckBox("manager");
		jtPage.clickDelete();
		jtPage.clickOK();
		jtPage.checkJobTitlesNotPresent("manager");
	
		}
	
}
