package BasePage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class basepage 
{
	private static ExtentSparkReporter esp;
	public static ExtentTest et;
	public static ExtentReports erp;
	public static ExtentTest ets;
	
	public static void LaunchExtentReports()
	{
		esp=new ExtentSparkReporter("ExtentReports.html");
		erp=new ExtentReports();
		erp.attachReporter(esp);
	}

}
