package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.microsoft.playwright.Locator;

public class Loginpageclass extends DriverClass
{

	static Locator loginpage_xpath=p.locator("//h5[text()='Login']");
	static Locator Username_xpath=p.locator("//input[@name='username']");
	static Locator Password_xpath=p.locator("//input[@name='password']");
	static Locator Loginbutton_xpath=p.locator("//button[text()=' Login ']");
	static Locator Homepage=p.locator("//img[@alt='client brand banner']");
	static Locator IuserVpass_xpath=p.locator("//p[text()='Invalid credentials']");
	static Locator NullUserVPass_xpath=p.locator("//span[text()='Required']");
	
//	public static WebElement loginpageWebEle()
//	{
//		WebElement loginpage=d.findElement(loginpage_xpath);
//		return loginpage;
//	}
//	
//	public static WebElement usernameWebEle()
//	{
//		WebElement username=d.findElement(Username_xpath);
//		return username;
//	}
//	
//	public static WebElement PasswordWebEle()
//	{
//		WebElement password=d.findElement(Password_xpath);
//		return password;
//	}
//	
//	public static WebElement loginbuttonWebEle()
//	{
//		WebElement loginbutton=d.findElement(Loginbutton_xpath);
//		return loginbutton;
//	}
//	
//	public static WebElement IuserVpassWebEle()
//	{
//		WebElement IuserVpass=d.findElement(IuserVpass_xpath);
//		return IuserVpass;
//	}
	
//	public static WebElement HomepageWebEle()
//	{
//		WebElement homepage=d.findElement(Homepage);
//		return homepage;
//	}
	
//	public static WebElement NullUserVPassWebEle()
//	{
//		WebElement NullUserVPass=d.findElement(NullUserVPass_xpath);
//		return NullUserVPass;
//	}
//	
	public static void usernamekeys(String username)
	{
		Username_xpath.click();
		Username_xpath.type(username);
	}
	
	public static void passwordkeys(String password)
	{
		Password_xpath.click();
		Password_xpath.type(password);
	}
	
	public static void loginbuttonkeys()
	{
		Loginbutton_xpath.click();
	}
	
}
