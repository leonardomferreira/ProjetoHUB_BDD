package br.com.rsinet.hub_bdd.pageObjectManager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.pageFactory.Login_Page;
import br.com.rsinet.hub_bdd.pageFactory.Register_Page;

public class PageObjectManager {

	private Home_Page homePage;
	private Login_Page loginPage;
	private Register_Page registerPage;
	private WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public Home_Page getHomePage() {
		return (homePage == null) ? homePage = new Home_Page(driver) : homePage;
	}
	public Login_Page getLoginPage() {
		return (loginPage == null) ? loginPage = new Login_Page(driver) : loginPage;
	}
	public Register_Page getRegisterPage() {
		return (registerPage == null) ? registerPage = new Register_Page(driver) : registerPage;
	}
}
