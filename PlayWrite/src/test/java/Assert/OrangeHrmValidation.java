//package Assert;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//import org.openqa.selenium.WebElement;
//
//
//import com.microsoft.playwright.Locator;
//
//
//
//public class OrangeHrmValidation extends DriverClass
//{
//
//	public void openpage()
//	{
//		DriverClass.driver("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		String acturl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		assertEquals(acturl, DriverClass.p.url(), "Incorrect url");
//		System.out.println("Testcase1 pass");
//	}
//	
//	
//	public void valid_credential()
//	{
//		Loginpageclass.usernamekeys("Admin");
//		String actemail="Admin";
//		assertEquals(actemail, Loginpageclass.username().inputValue(), "Invalid mail id");
//		Loginpageclass.passwordkeys("admin123");
//		String actpass="admin123";
//		assertEquals(actpass, Loginpageclass.Pass().inputValue(), "Invalid pass");
//		Loginpageclass.loginbuttonkeys();;
//		assertTrue(Loginpageclass.Homepage().isVisible(), "Dashboard page open");
//	}
//	
//	public void Invalid_credential()
//	{
//		Loginpageclass.NullUser_ValidPass("Admi");
//		String actemail="Admi";
//		assertEquals(actemail, Loginpageclass.username(), "Invalid mail id");
//		Loginpageclass.passwordkeys("admin123");
//		String actpass="admin123";
//		assertEquals(actpass, Loginpageclass.Pass().inputValue(), "Invalid pass");
//		Loginpageclass.loginbuttonkeys();
//		assertTrue(Loginpageclass.IuserVpass().isVisible(), "Errormsg is Display");
//	}
//}
//

