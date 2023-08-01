package Extent_Report;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BasePage.basepage;

public class BaseTest 
{

	
	static ExtentReports er;

	@BeforeSuite
	public void BClass()
	{
		basepage.LaunchExtentReports();
		er=basepage.erp;

	}
	
	@AfterSuite
	public void AClass()
	{
		er.flush();	
	}
	
}
