package Testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends Driver 
{
	@BeforeMethod
	public void openpage()
	{
		Driver.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
		String acturl="https://tutorialsninja.com/demo/index.php?route=account/login";
		assertEquals(acturl, Driver.p.url(), "Incorrect url");
		System.out.println("Testcase1 pass");
	}
	
	@Test
	public void valid_credential()
	{
		Login.enteremail("kavippiriyan2001@gmail.com");
		String actemail="kavippiriyan2001@gmail.com";
		assertEquals(actemail, Login.email().inputValue(), "Invalid mail id");
		Login.enterpass("kavi@123");
		String actpass="kavi@123";
		assertEquals(actpass, Login.pass().inputValue(), "Invalid pass");
		Login.clicklog();
		assertTrue(Login.Homepage().isVisible(), "Dashboard page open");
	}
	@Test
	public void Invalid_credential()
	{
		Login.enteremail("kavippiriyan2001");
		String actemail="kavippiriyan2001";
		assertEquals(actemail, Login.email().inputValue(), "Invalid mail id");
		Login.enterpass("kavi");
		String actpass="kavi";
		assertEquals(actpass, Login.pass().inputValue(), "Invalid pass");
		Login.clicklog();
		assertTrue(Login.Errormsg().isVisible(), "Errormsg is Display");
	}

}
