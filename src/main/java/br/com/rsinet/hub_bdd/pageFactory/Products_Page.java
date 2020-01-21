package br.com.rsinet.hub_bdd.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	

	public void search_Laptop() {
		lnk_Laptop.click();
	}
	
	public String title_Laptop() {
		return title_Product.getText();
	}
}
