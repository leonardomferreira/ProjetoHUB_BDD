package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
	WebDriver driver;
	TestContext testContext;
	Home_Page homePage;
	
	
	 public HomePageSteps(TestContext context) {
		 
	 testContext = context;
	 homePage = testContext.getPageObjectManager().getHomePage();
	 }
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		homePage.navigateTo_HomePage();	

	}
	

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {
		homePage.my_Account();

	}

}