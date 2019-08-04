package PHP_Travel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath= "/html/body/div[1]/div[3]/div[1]/div/p[2]/a")
	WebElement registrationButton;
	
	
	public RegisterPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Regis(){	
		registrationButton.click();
	}
}
