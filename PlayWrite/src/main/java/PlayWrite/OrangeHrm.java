package PlayWrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OrangeHrm {

	public static void main(String[] args) 
	{
		Playwright pw=Playwright.create();
		Browser b=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pe=b.newPage();
		
		pe.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Locator lr=pe.locator("//input[@name='username']");
		//lr.click();
		String Loginpageurl=pe.url();
		System.out.println(Loginpageurl);
		String Loginpagetitle=pe.title();
		System.out.println(Loginpagetitle);
		lr.type("Admin");
		Locator pass=pe.locator("//input[@type=\"password\"]");
		pass.type("admin123");
		Locator login=pe.locator("//button[@type=\"submit\"]");
		login.click();
		String Homepagetitle=pe.title();
		System.out.println(Homepagetitle); 
		
		pe.close();
		pw.close();
	}

}
