package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

import generics.Utility;

public class LeaveListPage extends HomePage {

	public LeaveListPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(css=".toggle")
	private WebElement LeaveListBar;
	
	@FindBy(xpath="//div[text()='Hide Options']")
	private WebElement hideOptionsToolTip;
	
	public void moveToLeaveListBar()
	{
		Utility.moveToElement(driver, LeaveListBar);
	}
	public void checkHideOptionsIsDispalyed(){
		checkElementIsPresent(hideOptionsToolTip);
		log.info("Hide Options tool tip is displayed");
	}
	}
