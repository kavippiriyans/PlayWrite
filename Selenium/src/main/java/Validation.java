import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;


public class Validation extends DriverClass
{
	public static void loginpageValidation(WebElement loginpage) throws Exception
	{
		if(!(loginpage.isDisplayed()))
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
		if(!(Actualusername.equals(Loginpage.usernameWebEle().getAttribute("value"))))
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
		if(!(Actualpassword.equals(Loginpage.PasswordWebEle().getAttribute("value"))))
		{
			throw new Exception("Entered password is not displyed");
		}
		else
		{
			System.out.println("Entered password is displayed");
		}

	}

	public static void HomepageValidation(WebElement homepage) throws Exception
	{
		if(!(homepage.isDisplayed()))
		{
			throw new Exception("Home page is not dispalyed");
		}
		else
		{
			System.out.println("Home page is displayed");
		}
	}

}
