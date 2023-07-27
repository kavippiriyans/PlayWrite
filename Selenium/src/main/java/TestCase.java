

public class TestCase 
{

	public static void TC_01_ValidUser_ValidPass() throws Exception
	{
		DriverClass.WebDriver();
		Loginpage.usernamekeys("Admin");
		Validation.EnteredUsernameValidation("Admin");
		Loginpage.passwordkeys("admin123");	
		Validation.EnteredPasswordValidation("admin123");
		Loginpage.loginbuttonkeys();
		Validation.HomepageValidation(Loginpage.HomepageWebEle());
		DriverClass.quit();
	}
	
	public static void TC_02_InvalidUser_ValidPass() throws Exception
	{
		DriverClass.WebDriver();
		Loginpage.usernamekeys("Admi");
		Validation.EnteredUsernameValidation("Admi");
		Loginpage.passwordkeys("admin123");	
		Validation.EnteredPasswordValidation("admin123");
		Loginpage.loginbuttonkeys();
		Validation.IuserVpassValidation(Loginpage.IuserVpassWebEle());
		DriverClass.quit();
	}
}
