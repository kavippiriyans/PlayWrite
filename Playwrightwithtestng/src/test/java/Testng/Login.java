package Testng;

import com.microsoft.playwright.Locator;

public class Login extends Driver{

	static final String email="//input[@name='email']";
	static final String pass="//input[@name='password']";
	static final String log="//input[@type='submit']";
	static final String Errormsg="//*[text()='Warning: No match for E-Mail Address and/or Password.']";
	static final String Homepage="//*[text()='Qafox.com']";
	
	public static Locator email()
	{
		return p.locator(email);
	}
	public static Locator pass()
	{
		return p.locator(pass);
	}	
	public static Locator log()
	{
		return p.locator(log);
	}
	public static Locator Errormsg()
	{
		return p.locator(Errormsg);
	}
	public static Locator Homepage()
	{
		return p.locator(Homepage);
	}
	
	public static void enteremail(String email)
	{
		email().click();
		email().type(email);
	}
	public static void enterpass(String pass)
	{
		pass().click();
		pass().type(pass);
	}
	
	public static void clicklog()
	{
		log().click();
		
	}
	
	
	
	
	
	
	
	
}
