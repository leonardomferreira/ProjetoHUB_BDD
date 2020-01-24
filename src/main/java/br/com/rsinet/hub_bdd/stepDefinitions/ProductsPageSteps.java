package br.com.rsinet.hub_bdd.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Products_Page;
import br.com.rsinet.hub_bdd.util.Screenshot;
import br.com.rsinet.hub_bdd.util.Wait;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsPageSteps {
	WebDriver driver;
	TestContext testContext;
	Products_Page productsPage;
	Home_Page homePage;
	WebDriverManager manager;
	
	public ProductsPageSteps(TestContext context) {
		 
		 testContext = context;
		 productsPage = testContext.getPageObjectManager().getProductsPage();
		 homePage = testContext.getPageObjectManager().getHomePage();
		 manager = testContext.getWebDriverManager();
		 driver = manager.getDriver();
				 
		 }
	
	@When("^Clicar no notebook escolhido$")
	public void clicar_no_notebook_escolhido() throws Throwable {
		Wait.untilJqueryIsDone(driver);
		productsPage.search_Laptop();
		productsPage.safe_Card();

	}

	@Then("^A pagina do notebook escolhido será exibida$")
	public void a_pagina_do_notebook_escolhido_será_exibida() throws Throwable {
		System.out.println("produto pesquisado");
	}
	//Invalid
	@Then("^Será exibida a página de outro laptop$")
	public void será_exibida_a_página_de_outro_laptop() throws Throwable {
		String LaptopHomeInvalido = homePage.laptop_Home();
		String LaptopInvalido = productsPage.title_Laptop();
		assertEquals(LaptopHomeInvalido.equals(LaptopInvalido), false);
		
		productsPage.Img_Laptop();
		
	}
	//valid
	@When("^Usuario clicar no produto$")
	public void usuario_clicar_no_produto() throws Throwable {
		productsPage.search_Roar();
	}
	@Then("^O produto desejado sera exibido$")
	public void o_produto_desejado_sera_exibido() throws Throwable {
		String TitleRoarValid = productsPage.txt_Roar();
		productsPage.Img_Roar();
		
		assertEquals(TitleRoarValid, "HP ROAR MINI WIRELESS SPEAKER");
	}
	//invalid
	@Then("^Nunhum resultado sera exibido$")
	public void nunhum_resultado_sera_exibido() throws Throwable {
		String sNoResult = productsPage.title_NoResultFor();
		assertEquals(true, sNoResult.contains("No results for"));
	}
}
