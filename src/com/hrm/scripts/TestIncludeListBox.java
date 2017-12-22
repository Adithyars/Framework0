package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class TestIncludeListBox extends BaseTest
{
@Test(priority=5,invocationCount =0)
public void testIncludeListBox(){
	//click on PIM menu
	DashboardPage dbPage=new DashboardPage(driver);
	dbPage.clickPim_Menu();
	//check include LB has no Duplicate
	EmpInfoPage eiPage=new EmpInfoPage(driver);
	eiPage.checkIncludeListBoxHasNoDuplicate();
	//check include LB is Sorted
	eiPage.checkIncludeListBoxIsSorted();
}

}
