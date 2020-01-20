package br.com.rsinet.hub_bdd.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Login_Page;
import br.com.rsinet.hub_bdd.pageFactory.Register_Page;
import br.com.rsinet.hub_bdd.pageObjectManager.PageObjectManager;
import br.com.rsinet.hub_bdd.util.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Register {
	WebDriver driver;
	Home_Page homePage;
	Login_Page loginPage;
	Register_Page registerPage;
	PageObjectManager PageObjectManager;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = DriverFactory.inicializaDriver();
		DriverFactory.abrirURL(driver);

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		PageObjectManager = new PageObjectManager(driver);
		homePage = PageObjectManager.getHomePage();
		homePage.my_Account();

	}

	@When("^user click on the button create new account$")
	public void user_click_on_the_button_create_new_account() throws Throwable {
		PageObjectManager = new PageObjectManager(driver);
		loginPage = PageObjectManager.getLoginPage();
		loginPage.create_Account(driver);

	}

	// Test Valid
	
	@When("^user correctly fill in all fields$")
	public void user_correctly_fill_in_all_fields() throws Throwable {
		PageObjectManager = new PageObjectManager(driver);
		registerPage = PageObjectManager.getRegisterPage();
		registerPage.RegisterValid();
		
	}

	@Then("^will be successfully registered$")
	public void will_be_successfully_registered() throws Throwable {
		System.out.println("usuario registrado");
		DriverFactory.fecharDriver(driver);
	}
	
	// test Invalid
	
	@When("^user incorrectly fill in all fields$")
	public void user_incorrectly_fill_in_all_fields() throws Throwable {
		PageObjectManager = new PageObjectManager(driver);
		registerPage = PageObjectManager.getRegisterPage();
		registerPage.RegisterFail();
		

	}

	@Then("^failed to register the user$")
	public void failed_to_register_the_user() throws Throwable {
		System.out.println("usuario nao registrado");
		DriverFactory.fecharDriver(driver);
	}
}
