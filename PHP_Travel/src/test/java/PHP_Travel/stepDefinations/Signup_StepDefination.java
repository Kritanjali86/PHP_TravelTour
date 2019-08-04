package PHP_Travel.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PHP_Travel.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Signup_StepDefination {
	WebDriver driver;
	RegisterPage RR;
	
	@Given("^User access the URL$")
	public void user_access_the_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users/new/git/PHP_TravelTour/PHP_Travel/References/chromedriver.exe");
		this.driver = new ChromeDriver();
		//driver= new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.get("https://parabank.parasoft.com/parabank/index.htm");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String expectedTitle= "ParaBank | Welcome | Online Banking";
		boolean flag= false;
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)){
			flag=true;
		}
		Assert.assertTrue(flag, "Page not match");

		RR = new RegisterPage(driver);
		RR.Regis();
		
	}
	@And("^User Register SignUp to the account$")
	public void user_Register_SignUp_to_the_account() throws Throwable {
		
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
