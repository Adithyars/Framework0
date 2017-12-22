package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LeaveListPage;

public class TestLeaveListToolTip extends BaseTest{
	@Test(priority=8)
	public void testLeaveListToolTip()throws InterruptedException{
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickLeaveMenu();
		LeaveListPage llPage=new LeaveListPage(driver);
		llPage.moveToLeaveListBar();
		llPage.checkHideOptionsIsDispalyed();
//		llPage.LeaveListBar();
//		Thread.sleep(2000);
//		llPage.moveToAdmin();//moving away from leave  list(to admin menu)
//		llPage.moveToLeaveListBar();
//		llPage.checkExpandForOptionsIsDisplayed();
//		Thread.sleep(2000);
	}
	

}
