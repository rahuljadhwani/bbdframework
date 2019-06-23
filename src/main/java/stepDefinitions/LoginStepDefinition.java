package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.pages.PageLogin;

public class LoginStepDefinition {

	@Given("^Navigate to OrangeHRM demo page$")
	public void navigate_to_OrangeHRM_demo_page() throws Throwable {
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		PageLogin pgl = new PageLogin(driver);
		
		pgl.doLogin("Admin", "Admin123");
		
		driver.close();
		

	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {

	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {

	}

}
