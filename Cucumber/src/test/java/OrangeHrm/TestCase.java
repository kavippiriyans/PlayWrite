package OrangeHrm;

import Assert.DriverClass;
import Assert.Loginpageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCase 
{

	@Then("OrangeHrm Login Page is Displayed")
	public void orange_hrm_login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		DriverClass.WebDriver();
	   System.out.println("Enter the OrangeHrm Login pageUrl");
	}

	@Given("Username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Loginpageclass.usernamekeys("Admin");
	    System.out.println("Enter the valid Username");
	}

	@Then("Entered Username is displayed")
	public void entered_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("Password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Loginpageclass.passwordkeys("admin123");
	    System.out.println("Enter the Valid Password");
	}

	@Then("Entered Password is displayed in dot shape")
	public void entered_password_is_displayed_in_dot_shape() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		Loginpageclass.loginbuttonkeys();
	}

	@Then("OrangeHrm Homepage is displayed")
	public void orange_hrm_homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
