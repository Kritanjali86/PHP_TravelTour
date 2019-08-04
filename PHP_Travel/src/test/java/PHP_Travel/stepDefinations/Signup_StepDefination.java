package PHP_Travel.stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Signup_StepDefination {
	
	@Given("^User access the URL$")
	public void user_access_the_URL() throws Throwable {
	    System.out.println("Test Case-1");
	}
	@And("^User Register SignUp to the account$")
	public void user_Register_SignUp_to_the_account() throws Throwable {
	    System.out.println("Test Case-2");
	}

	@And("^User login with new created signup Account$")
	public void user_login_with_new_created_signup_Account() throws Throwable {
		  System.out.println("Test Case-3");
	}



	@And("^User validate if the user has login to the account$")
	public void user_validate_if_the_user_has_login_to_the_account() throws Throwable {
		 System.out.println("Test Case-4");
	}

	@Then("^User Logout from the account$")
	public void user_Logout_from_the_account() throws Throwable {
		 System.out.println("Test Case-5");
	}

	
	
	

}
