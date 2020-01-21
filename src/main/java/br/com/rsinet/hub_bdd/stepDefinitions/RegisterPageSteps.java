package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.PageObjectManager;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Login_Page;
import br.com.rsinet.hub_bdd.pageFactory.Register_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
  
	
	WebDriver driver;
	TestContext testContext;
	Register_Page registerPage;
	PageObjectManager pageObjectManager;
	WebDriverManager managers; 

	
	public RegisterPageSteps(TestContext context) {
		 
		 testContext = context;
		 registerPage = testContext.getPageObjectManager().getRegisterPage();
		 managers = testContext.getWebDriverManager();
		 }
	
	//valid
	@When("^user correctly fill in all fields$")
	public void user_correctly_fill_in_all_fields() throws Throwable {
		registerPage.RegisterValid();
		
	}
	
	@Then("^will be successfully registered$")
	public void will_be_successfully_registered() throws Throwable {
		System.out.println("usuario registrado");
		managers.closeDriver();
	}
	
	//Invalid
	@When("^user incorrectly fill in all fields$")
	public void user_incorrectly_fill_in_all_fields() throws Throwable {
		registerPage.RegisterFail();
		

	}
	@Then("^failed to register the user$")
	public void failed_to_register_the_user() throws Throwable {
		System.out.println("usuario nao registrado");
		managers.closeDriver();
	}

}
