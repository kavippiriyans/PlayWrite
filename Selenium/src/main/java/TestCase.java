

public class TestCase 
{

	public static void beforemethod() throws Exception
	{
		DriverClass.WebDriver();
		Loginpage.usernamekeys("Admin");
		Validation.EnteredUsernameValidation("Admin");

		Loginpage.passwordkeys("admin123");	
		Validation.EnteredPasswordValidation("admin123");

		Loginpage.loginbuttonkeys();
		


	}
}
