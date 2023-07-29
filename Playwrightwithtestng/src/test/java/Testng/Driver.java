package Testng;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Driver 
{

	    public static Page p;
	
	public static void driver(String url)
	{
		Playwright pw=Playwright.create();
		Browser b=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		p=b.newPage();
		p.navigate(url);
	}
}
