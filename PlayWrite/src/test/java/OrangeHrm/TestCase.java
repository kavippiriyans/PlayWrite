package OrangeHrm;

import Assert.DriverClass;
import Assert.Loginpageclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCase 
{
	@Given("Url: {string}")
	public void url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    DriverClass.WebDriver();
	    System.out.println("Enter the OrangHrmLogin Page Url ");
	}

	@Then("OrangeHrm Login Page is Displayed")
	public void orange_hrm_login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter the username");
	    Loginpageclass.usernamekeys(string);
	}

	@Then("Entered Username is displayed")
	public void entered_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("Password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Enter the password");
	   Loginpageclass.passwordkeys(string);
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

	@Then("Entered Username is dispalyed")
	public void entered_username_is_dispalyed() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("Error message is displayed like Invalid credentials")
	public void error_message_is_displayed_like_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
}
