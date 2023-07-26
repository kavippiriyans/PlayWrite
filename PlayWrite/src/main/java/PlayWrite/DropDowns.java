package PlayWrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DropDowns {

	public static void main(String[] args) 
	{
		Playwright pw=Playwright.create();
		Browser bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pe=bw.newPage();
		pe.navigate("https://letcode.in/dropdowns");
		
		Locator dropdown=pe.locator("//select[@id=\"fruits\"]");
		
		dropdown.selectOption("1");
		
		
		
		

	}

}
