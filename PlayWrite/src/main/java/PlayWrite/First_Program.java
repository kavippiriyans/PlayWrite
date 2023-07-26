package PlayWrite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_Program {

	public static void main(String[] args) 
	{
		Playwright pl=Playwright.create();
		Browser b= pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg=b.newPage();
		pg.navigate("https://www.amazon.com");
		String title=pg.title();
		System.out.println("the title is"+title);
		String url=pg.url();
		System.out.println("url is"+url);
		b.close();
		pl.close();

	}

}
