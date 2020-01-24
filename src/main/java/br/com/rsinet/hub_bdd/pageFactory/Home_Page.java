package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.managers.FileReaderManager;



/*
 * Elementos da pagina inicial 
 */

public class Home_Page {
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span")
	private WebElement btn_Login;
	
	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement lnk_MyAccount;
	
	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lnk_MenuSearch;
	
	@FindBy(how = How.ID, using ="autoComplete")
	private WebElement txt_Search;
	
	@FindBy(how = How.ID, using ="laptopsTxt")
	private WebElement lnk_Laptops_Home;
	
	@FindBy(how = How.ID, using = "details_10")
	private WebElement lnk_Detalhes;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"popular_items\"]/div/div[2]/p")
	private WebElement txt_Notebook_Home;
	
	public String laptop_Home() {
		return txt_Notebook_Home.getText();
	}
	
	public void ver_Detalhes() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", lnk_Detalhes);
	}
			
	public void menu_User() {
		btn_Login.click();
	}
	public void my_Account() {
		lnk_MyAccount.click();
	}
	public void menu_Search() {
		lnk_MenuSearch.click();
	}
	public void auto_Complete(String complete) {
		txt_Search.sendKeys(complete);
		txt_Search.sendKeys(Keys.ENTER);
	}
	public void laptops_Home() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", lnk_Laptops_Home);
		
	}
	public void navigateTo_HomePage() {
		
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		
	}
}

