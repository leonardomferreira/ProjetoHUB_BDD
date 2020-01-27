package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

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
	
	@When("^Usuario clicar no botao criar nova conta$")
	public void usuario_clicar_no_botao_criar_nova_conta() throws Throwable {
		Reporter.addStepLog("Navegando para a pagina de registro");
		loginPage.create_Account();

	}
}
