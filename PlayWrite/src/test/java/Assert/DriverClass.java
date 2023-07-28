package Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverClass 
{

	
	static Playwright pw=Playwright.create();
	static Browser bw=pw.chromium().launch(new LaunchOptions().setHeadless(false));
	static Page p=bw.newPage();
	
	public static void WebDriver()
	{
		p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
    public static void quit()
    {
    	p.close();
    }
}
