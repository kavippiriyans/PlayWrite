package OrangeHrm;

import Assert.DriverClass;
import Assert.Loginpageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCase 
{
	@Given("Url: {string}")
	public void url(String string) {
		DriverClass.driver(string);
	}

	@Then("OrangeHrm Login Page is Displayed")
	public void orange_hrm_login_page_is_displayed() {
	    System.out.println("Enter OrnageHrm loginpage url");
	}

	@Given("Username {string}")
	public void username(String string) {
		Loginpageclass.usernamekeys(string);
	}

	@Then("Entered Username is displayed")
	public void entered_username_is_displayed() {
	    System.out.println("Enter the username");
	}

	@Given("Password {string}")
	public void password(String string) {
		Loginpageclass.passwordkeys(string);
	}

	@Then("Entered Password is displayed in dot shape")
	public void entered_password_is_displayed_in_dot_shape() {
	   System.out.println("Enter the password");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		Loginpageclass.loginbuttonkeys();
	}

	@Then("OrangeHrm Homepage is displayed")
	public void orange_hrm_homepage_is_displayed() {
	  
	}

	@Then("Entered Username is dispalyed")
	public void entered_username_is_dispalyed() {
	   
	}

	@Then("Error message is displayed like Invalid credentials")
	public void error_message_is_displayed_like_invalid_credentials() {
	   
	}

	@Then("Error message is displayed like Username Required")
	public void error_message_is_displayed_like_username_required() {
	  
	}


}

