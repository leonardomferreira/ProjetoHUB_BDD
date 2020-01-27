package br.com.rsinet.hub_bdd.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

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
	WebDriverManager manager; 
	
	public RegisterPageSteps(TestContext context) {
		 
		 testContext = context;
		 registerPage = testContext.getPageObjectManager().getRegisterPage();
		 manager = testContext.getWebDriverManager();
		 driver = manager.getDriver();
		 }
	
	//valid
	@When("^Usuario peencher os campos com dados validos$")
	public void usuario_peencher_os_campos_com_dados_validos() throws Throwable {
		Reporter.addStepLog("Preenchendo os campos");
		registerPage.RegisterValid();
		assertEquals("https://www.advantageonlineshopping.com/#/", driver.getCurrentUrl());

	}
	
	@Then("^Usuario sera registrado com sucesso$")
	public void usuario_sera_registrado_com_sucesso() throws Throwable {
		System.out.println("usuario registrado");
	}
	
	//Invalid
	@When("^Usuario peencher os campos com dados invalidos$")
	public void usuario_peencher_os_campos_com_dados_invalidos() throws Throwable {
		Reporter.addStepLog("Preenchendo os campos");
		registerPage.RegisterFail();
		assertEquals("https://www.advantageonlineshopping.com/#/register", driver.getCurrentUrl());

		

	}
	@Then("^Usuario nao sera registrado$")
	public void usuario_nao_sera_registrado() throws Throwable {
		System.out.println("usuario nao registrado");
	}

}
