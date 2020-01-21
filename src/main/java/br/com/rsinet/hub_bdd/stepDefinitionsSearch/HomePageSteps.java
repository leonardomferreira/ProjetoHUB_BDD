package br.com.rsinet.hub_bdd.stepDefinitionsSearch;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
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
	public void user_is_on_Home_Page()  {
		homePage.navigateTo_HomePage();

	}
	
	//Valid
	@When("^user click on the desired category$")
	public void user_click_on_the_desired_category()  {
		homePage.laptops_Home();
	}
	//Invalid
	
	@When("^user click on View details$")
	public void user_click_on_View_details() throws Throwable {
		homePage.ver_Detalhes();
	}
}
