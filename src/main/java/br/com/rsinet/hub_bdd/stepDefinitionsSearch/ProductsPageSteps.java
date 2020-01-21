package br.com.rsinet.hub_bdd.stepDefinitionsSearch;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Products_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsPageSteps {
	WebDriver driver;
	TestContext testContext;
	Products_Page productsPage;
	Home_Page homePage;
	
	public ProductsPageSteps(TestContext context) {
		 
		 testContext = context;
		 productsPage = testContext.getPageObjectManager().getProductsPage();
		 homePage = testContext.getPageObjectManager().getHomePage();

		 }
	
	@When("^user click on the desired product$")
	public void user_click_on_the_desired_products() throws Throwable {
		productsPage.search_Laptop();
	}

	@Then("^successfully researched product$")
	public void successfully_researched_product() throws Throwable {
		System.out.println("produto pesquisado");
	}
	//Invalid
	@Then("^invalid product text$")
	public void invalid_product_text() throws Throwable {
		
		String LaptopInvalido = productsPage.title_Laptop();
		assertEquals(homePage.laptop_Home().equals(LaptopInvalido), false);
	}
}
