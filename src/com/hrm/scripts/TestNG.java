package com.hrm.scripts;

	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class TestNG {
	@Test (invocationCount =0)
	public void testDemoA()
	{
		Reporter.log("hi...", true);
	}
	}


