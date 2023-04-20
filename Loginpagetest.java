package stepDefination;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.LoginPage;

public class Loginpagetest {
	LoginPage obj = new LoginPage();
	WebDriver driver;
	
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    obj.launchApplication();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	    obj.enterUserName("atishdaswadkar@gmail.com");
	    obj.enterPassword("Atish@9898");
	}

	@When("click on sigin button")
	public void click_on_sigin_button() {
	   obj.clickButton();
	}

	@Then("user should be able to logged in")
	public void user_should_be_able_to_logged_in()  {
		
	}

	

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		 obj.enterUserName("atishdaswadkar@gmail.com");
		    obj.enterPassword("Atish@9998");
	}

	@Then("user should not be able to logged in")
	public void user_should_not_be_able_to_logged_in() {
	    
	}

}