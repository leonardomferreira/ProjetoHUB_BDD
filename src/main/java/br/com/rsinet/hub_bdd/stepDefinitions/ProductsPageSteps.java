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
	
	@When("^user click on the desired product$")
	public void user_click_on_the_desired_products() throws Throwable {
		Wait.untilJqueryIsDone(driver);
		productsPage.search_Laptop();
//		Screenshot.captureScreenShot(driver);
	}

	@Then("^successfully researched product$")
	public void successfully_researched_product() throws Throwable {
		System.out.println("produto pesquisado");
	}
	//Invalid
	@Then("^invalid product text$")
	public void invalid_product_text() throws Throwable {
		String LaptopHomeInvalido = homePage.laptop_Home();
		System.out.println(LaptopHomeInvalido);
		String LaptopInvalido = productsPage.title_Laptop();
		System.out.println(LaptopInvalido);
		assertEquals(LaptopHomeInvalido.equals(LaptopInvalido), false);
	}
	//valid
	@When("^user click on product$")
	public void user_click_on_product() throws Throwable {
		productsPage.search_Roar();
	}
	@Then("^success when looking for the product$")
	public void success_when_looking_for_the_product() throws Throwable {
		String TitleRoarValid = productsPage.txt_Roar();
		
		assertEquals(TitleRoarValid, "HP ROAR MINI WIRELESS SPEAKER");
	}
	//invalid
	@Then("^Fail when looking for the product$")
	public void fail_when_looking_for_the_product() throws Throwable {
		String sNoResult = productsPage.title_NoResultFor();
		assertEquals(true, sNoResult.contains("No results for"));
		
	}
}
