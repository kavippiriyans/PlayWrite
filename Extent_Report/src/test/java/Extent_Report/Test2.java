package Extent_Report;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import BasePage.basepage;
import BasePage.page2;

public class Test2 extends BaseTest
{
	ExtentTest et;
	ExtentTest ets;
	
	public void BeforeClass()
	{
		basepage.et=er.createTest("Test2 ");
	}

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

	
	