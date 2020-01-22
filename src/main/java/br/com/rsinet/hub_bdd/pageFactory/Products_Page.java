package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.util.Screenshot;

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
	public void search_Laptop() throws InterruptedException {
		lnk_Laptop.click();
		Thread.sleep(3000);
		Screenshot.captureScreenShot(driver);

	}
	
	public String title_Laptop() {
		return title_Product.getText();
	}
}
