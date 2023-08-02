package Extent_Report;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BasePage.basepage;
import BasePage.page2;

public class Test1 extends BaseTest
{
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		basepage.et=er.createTest("Test1");
	}

	public void AfterClass()
	{
		
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(Method m)
	{
		basepage.ets=basepage.et.createNode(m.getName());
	}
	
	@Test
	public void Test1()
	{
		basepage.ets.info("Good Morning");
		page2.EnterUsername();
		basepage.ets.info("Kavippiriyan");
		


	}
	@Test
	public void Test2()
	{
		basepage.ets.info("Hi");
		page2.EnterUsername();
		basepage.ets.info("How Are You");
		


	}


}
