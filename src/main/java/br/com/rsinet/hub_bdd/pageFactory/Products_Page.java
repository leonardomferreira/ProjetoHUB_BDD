package br.com.rsinet.hub_bdd.pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
 * Elementos da pagina de produtos
 */

public class Products_Page {
	WebDriver driver;

	
	public Products_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using = "HP Chromebook 14 G1(ENERGY STAR)")
	private WebElement lnk_Laptop;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement title_Product;
	
	@FindBy(how = How.LINK_TEXT, using = "HP Roar Mini Wireless Speaker")
	private WebElement lnk_Roar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement title_NoResult;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")
	private WebElement Title_Roar;
		
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_Cart;
	
	@FindBy(how = How.ID, using = "mainImg")
	private WebElement Img_Laptop;
	
	@FindBy(how = How.ID, using = "mainImg")
	private WebElement Img_Roar;
	
	public String title_Roar() {
		return Title_Roar.getText();
	}
	public String title_NoResultFor() {
		return title_NoResult.getText();
		
	}
	public void search_Roar() {
		lnk_Roar.click();
	}
	public String txt_Roar() {
		return lnk_Roar.getText().toUpperCase();

	}
	public void search_Laptop() throws InterruptedException, IOException {
		lnk_Laptop.click();
	}
	
	public String title_Laptop() {
		return title_Product.getText();
	}
	public void safe_Card() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btn_Cart));
	}
	public void Img_Laptop() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Img_Laptop));
	}
	public void Img_Roar() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Img_Roar));
	}
}
