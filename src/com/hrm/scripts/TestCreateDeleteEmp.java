package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

import generics.Utility;

public class TestCreateDeleteEmp extends BaseTest{
  @Test (priority=4)
	public void testCreateDeleteEmp()throws InterruptedException
{
	  String fn=Utility.getExcelCellValue(INPUT_PATH, "Emp", 1,0);
	  String ln=Utility.getExcelCellValue(INPUT_PATH, "Emp", 1,1);
	//go to PIM->add employee
	DashboardPage dbPage=new DashboardPage(driver);
	dbPage.clickPim_Menu();
	dbPage.click_AddEmp_Menu();
	//enter FN,Ln &save
	AddEmpPage aePage =new AddEmpPage(driver);
	aePage.setFirstName(fn);
	aePage.setLastName(ln);
	aePage.clickSave();
	//compare first name
	PersonalDetailsPage pdPage=new PersonalDetailsPage(driver);
			pdPage.checkFirstName(fn);
			//get new emp id
	String eID=pdPage.getEmpID();
	//click emp list menu
	pdPage.clickEmpList_Menu();
	//select check box of new emp id
	EmpInfoPage eiPage=new EmpInfoPage(driver);
	eiPage.selectEmpCheckBox(eID);
	//click Delete
	eiPage.clickDelete();
	//click OK
	eiPage.clickOK();
	//verify deleted emp not Present
	eiPage.checkEmpIsDeleted(eID);
	
}
}
