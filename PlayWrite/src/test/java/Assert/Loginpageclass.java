package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.microsoft.playwright.Locator;

public class Loginpageclass extends DriverClass
{

	static String loginpage_xpath="//h5[text()='Login']";
	static String Username_xpath="//input[@name='username']";
	static String Password_xpath="//input[@name='password']";
	static String Loginbutton_xpath="//button[text()=' Login ']";
	static String Homepage="//img[@alt='client brand banner']";
	static String IuserVpass_xpath="//p[text()='Invalid credentials']";
	static String NullUserVPass_xpath="//span[text()='Required']";
	

	
	public static Locator username()
	{
	  return p.locator(Username_xpath);
	   
	}
	
	public static Locator Pass()
	{
	  return p.locator(Password_xpath);
	   
	}
	
	public static Locator log()
	{
	  return p.locator(Loginbutton_xpath);
	   
	}
	
	public static Locator Homepage()
	{
	  return p.locator(Homepage);
	   
	}
	public static Locator IuserVpass()
	{
	  return p.locator(IuserVpass_xpath);
	   
	}
	public static Locator NullUserVPass()
	{
	  return p.locator(NullUserVPass_xpath);
	   
	}
	
	public static void usernamekeys(String username)
	{
		username().click();
		username().type(username);
	}
	
	public static void passwordkeys(String password)
	{
		Pass().click();
		Pass().type(password);
	}
	
	public static void loginbuttonkeys()
	{
		log().click();
	}
	
	public static void InvalidUser_Validpass(String Username)
	{
		IuserVpass().click();
		IuserVpass().type(Username);
	}
	
	public static void NullUser_ValidPass(String Username)
	{
		NullUserVPass().click();
		NullUserVPass().type(NullUserVPass_xpath);
	}
}
