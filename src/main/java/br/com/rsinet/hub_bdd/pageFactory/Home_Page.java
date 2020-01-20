package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver driver) {
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
	}
}

