package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.util.Constant;
import br.com.rsinet.hub_bdd.util.DataExcel;
import br.com.rsinet.hub_bdd.util.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	WebDriver driver;
	TestContext testContext;
	Home_Page homePage;
	WebDriverManager manager;

	public HomePageSteps(TestContext context) throws Exception {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();
		ExcelUtils.setExcelFile(Constant.Path_TestData, "Busca");

	}

	@Given("^Usuario esteja na pagina inicial$")
	public void usuario_esteja_na_pagina_inicial() {
		Reporter.addStepLog("Navegando para a pagina inicial");
		homePage.navigateTo_HomePage();

	}
	
	
	@When("^Usuario navegar para a pagina de Login$")
	public void usuario_navegar_para_a_pagina_de_Login() throws Throwable {
		Reporter.addStepLog("Navegando para a pagina de Login");
		homePage.my_Account();

	}

	// Pesquisa por clique valida
	@When("^Clicar na categoria desejada$")
	public void clicar_na_categoria_desejada() throws Throwable {
		Reporter.addStepLog("Clicando na categoria");
		homePage.laptops_Home();
	}
	
	// Pesquisa pro clique invalida
	@When("^Usuario clicar para ver detalhes do laptop$")
	public void usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {
		Reporter.addStepLog("Clicando no ver detalhes");
		homePage.ver_Detalhes();
	}

	@When("^Usuario clicar na lupa$")
	public void usuario_clicar_na_lupa() throws Throwable {
		Reporter.addStepLog("Clicando na lupa");
		homePage.menu_Search();
	}

	// Pesquisa por texto valida
	@When("^Usuario pesquisar pelo produto desejado$")
	public void usuario_pesquisar_pelo_produto_desejado() throws Throwable {
		Reporter.addStepLog("Usuario pesquisa pelo produto desejado");
		homePage.auto_Complete(DataExcel.nomeValidLaptop());
	}

	// Pesquisa por texto invalida
	@When("^Usuario pesquisar pelo produto invalido$")
	public void usuario_pesquisar_pelo_produto_invalido() throws Throwable {
		Reporter.addStepLog("Usuario pesquisa pelo produto invalido");
		homePage.auto_Complete(DataExcel.nomeInvalidLaptop());
	}

}