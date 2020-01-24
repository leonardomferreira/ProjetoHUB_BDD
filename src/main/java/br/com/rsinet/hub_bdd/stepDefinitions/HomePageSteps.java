package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

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

	@Given("^Usuario esteja na página inicial$")
	public void usuario_esteja_na_página_inicial() throws Throwable {
		homePage.navigateTo_HomePage();

	}
	
	
	@When("^Usuario navegar para a pagina de Login$")
	public void usuario_navegar_para_a_pagina_de_Login() throws Throwable {
		homePage.my_Account();

	}

	// Pesquisa por clique valida
	@When("^Clicar na categoria desejada$")
	public void clicar_na_categoria_desejada() throws Throwable {
		homePage.laptops_Home();
	}
	
	// Pesquisa pro clique invalida
	@When("^Usuario clicar para ver detalhes do laptop$")
	public void usuario_clicar_para_ver_detalhes_do_laptop() throws Throwable {
		homePage.ver_Detalhes();
	}

	@When("^Usuario clicar na lupa$")
	public void usuario_clicar_na_lupa() throws Throwable {
		homePage.menu_Search();
	}

	// Pesquisa por texto valida
	@When("^Usuario pesquisar pelo produto desejado$")
	public void usuario_pesquisar_pelo_produto_desejado() throws Throwable {
		homePage.auto_Complete(DataExcel.nomeValidLaptop());
	}

	// Pesquisa por texto invalida
	@When("^Usuario pesquisar pelo produto invalido$")
	public void usuario_pesquisar_pelo_produto_invalido() throws Throwable {
		homePage.auto_Complete(DataExcel.nomeInvalidLaptop());
	}

}