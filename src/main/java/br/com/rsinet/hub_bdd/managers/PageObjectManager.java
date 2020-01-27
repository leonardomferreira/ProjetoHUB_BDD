package br.com.rsinet.hub_bdd.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Login_Page;
import br.com.rsinet.hub_bdd.pageFactory.Products_Page;
import br.com.rsinet.hub_bdd.pageFactory.Register_Page;


/*
 * Criador do objeto da pagina
 */

public class PageObjectManager {

	private Home_Page homePage;
	private Login_Page loginPage;
	private Register_Page registerPage;
	private Products_Page productsPage;
	private WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/*
	 * Cria o objeto da classe de pagina apenas se o objeto for nulo
	 */
	
	public Home_Page getHomePage() {
		return (homePage == null) ? homePage = new Home_Page(driver) : homePage;
	}
	public Login_Page getLoginPage() {
		return (loginPage == null) ? loginPage = new Login_Page(driver) : loginPage;
	}
	public Register_Page getRegisterPage() {
		return (registerPage == null) ? registerPage = new Register_Page(driver) : registerPage;
	}
	public Products_Page getProductsPage() {
		return (productsPage == null) ? productsPage = new Products_Page(driver) : productsPage;
	}
}
