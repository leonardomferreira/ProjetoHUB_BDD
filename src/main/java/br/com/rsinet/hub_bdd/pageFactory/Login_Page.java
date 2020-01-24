package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

/*
 * Elementos da pagina de login
 */

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username")
	private WebElement txtbx_UserName;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement txtbx_Password;
	
	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement btn_Login;
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btn_CreateAccount;
	
	public void username(String name) {
		txtbx_UserName.sendKeys(name);
	}
	public void password(String password) {
		txtbx_Password.sendKeys(password);
	}
	public void login() {
		btn_Login.click();
	}
	public void create_Account() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(btn_CreateAccount));
//	
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//	    executor.executeScript("arguments[0].click();", btn_CreateAccount); 
	    
	    btn_CreateAccount.sendKeys(Keys.ENTER);
	}
}
