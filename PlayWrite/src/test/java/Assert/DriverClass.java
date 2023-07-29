package Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverClass 
{

    public static Page p;
	
public static void driver(String url)
{
	Playwright pw=Playwright.create();
	Browser b=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	p=b.newPage();
	p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
}
