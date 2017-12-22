package com.hrm.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;

public class Login extends BaseTest
{
@BeforeClass
public void noAutoLogin()
{
	loginlogoutRequired=true;
}
@Test
public void loginapp()
{
	log.info("landing page is login page");
}
}
