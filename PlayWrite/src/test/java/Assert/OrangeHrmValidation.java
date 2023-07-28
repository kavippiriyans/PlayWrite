package Assert;

import org.openqa.selenium.WebElement;

import com.microsoft.playwright.Locator;

public class OrangeHrmValidation extends DriverClass
{


	public static void loginpageValidation(Locator loginpage) throws Exception
	{
		if(!(loginpage.isVisible()))
		{
			throw new Exception("login page not displyed");
		}
		else
		{
			System.out.println("login page  is displayed");
		}

	}

	public static void EnteredUsernameValidation(String Actualusername ) throws Exception
	{
		if(!(Actualusername.equals(Loginpageclass.Username_xpath.getAttribute("value"))))
		{
			throw new Exception("Entered username is not displyed");
		}
		else
		{
			System.out.println("Entered username is displayed");
		}

	}

	public static void EnteredPasswordValidation(String Actualpassword ) throws Exception
	{
		if(!(Actualpassword.equals(Loginpageclass.Password_xpath.getAttribute("value"))))
		{
			throw new Exception("Entered password is not displyed");
		}
		else
		{
			System.out.println("Entered password is displayed");
		}

	}

	public static void HomepageValidation(Locator homepage) throws Exception
	{
		if(!(homepage.isVisible()))
		{
			throw new Exception("Home page is not dispalyed");
		}
		else
		{
			System.out.println("Home page is displayed");
		}
	}
	
	public static void IuserVpassValidation(Locator IuserVpass) throws Exception
	{
		if(!(IuserVpass.isVisible()))
		{
			throw new Exception("Invalid credentials is not dispalyed");
		}
		else
		{
			System.out.println("Invalid credentials is displayed");
		}
	}
}


