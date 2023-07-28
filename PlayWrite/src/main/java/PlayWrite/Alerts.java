package PlayWrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 	
	{
		Playwright pw=Playwright.create();
		Browser BW=pw.chromium().launch(new BrowserType .LaunchOptions().setHeadless(false));
		Page p=BW.newPage();
		
		p.navigate("https://letcode.in/alert");
		
		p.onDialog(dialog->{
			System.out.println(dialog.message());
			
			dialog.accept();
		});
		
		Locator alert=p.locator("id=accept");
		
		alert.click();
		
		

	}

}
