package PlayWrite;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowMaximize {

	public static void main(String[] args) 
	{
		Dimension Screensize=Toolkit.getDefaultToolkit().getScreenSize();
		int height=(int)Screensize.getHeight();
		int width=(int)Screensize.getWidth();
		System.out.println("Width is = "+width);
		System.out.println("Height is = "+height);
		
		
		Playwright pw=Playwright.create();
		Browser Bw=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
		BrowserContext context=Bw.newContext(new Browser.NewContextOptions().setViewportSize(width,height));
		
		Page p=context.newPage();	
		p.navigate("https://www.amazon.in/gcx/Gifts-for-women/gfhz/events/?_encoding=UTF8&categoryId=gifts-for-women-in&content-id=amzn1.sym.a6b0571b-ab17-468a-bbab-7344e2761136&pd_rd_r=6237f37c-9a98-4151-ab70-ee9c5cf674dc&pd_rd_w=4qhoO&pd_rd_wg=hDnQt&pf_rd_p=a6b0571b-ab17-468a-bbab-7344e2761136&pf_rd_r=5D4FMT1PP5VQ0SVJD9K1&ref_=pd_gw_unk&scrollState=eyJpdGVtSW5kZXgiOjAsInNjcm9sbE9mZnNldCI6NTA2LjEwOTM3NX0%3D&sectionManagerState=eyJzZWN0aW9uVHlwZUVuZEluZGV4Ijp7ImFtYWJvdCI6MH19");

	}

}
