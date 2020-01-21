package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.pageFactory.Login_Page;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	
	WebDriver driver;
	TestContext testContext;
	Login_Page loginPage;
	

	public LoginPageSteps(TestContext context) {
		testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@When("^user click on the button create new account$")
	public void user_click_on_the_button_create_new_account() throws Throwable {
		
		loginPage.create_Account();

	}
}
