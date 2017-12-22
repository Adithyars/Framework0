package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;



public class TestSearchButton extends BaseTest {
	@Test (priority=2)
	public void testSearchButton(){
		//click on PIM menu
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPim_Menu();
		//verify search Button is present
		EmpInfoPage eiPage=new EmpInfoPage(driver);
		//check include LB has no dub
		eiPage.checkSearchButtonIsPresent();
	
	}

}
