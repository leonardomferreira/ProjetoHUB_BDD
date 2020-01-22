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

	// Valid
	@When("^user click on the desired category$")
	public void user_click_on_the_desired_category() {
		homePage.laptops_Home();
	}
	// Invalid

	@When("^user click on View details$")
	public void user_click_on_View_details() throws Throwable {
		homePage.ver_Detalhes();
	}
	//valid
	@When("^user click on the magnifying glass$")
	public void user_click_on_the_magnifying_glass() throws Throwable {
		homePage.menu_Search();
	}
	@When("^user write the desired product$")
	public void user_write_the_desired_product() throws Throwable {
		homePage.auto_Complete("hp");
	}
	
	//invalid
	@When("^user searches for an invalid product$")
	public void user_searches_for_an_invalid_product() throws Throwable {
		homePage.auto_Complete("samsung");
	}


}