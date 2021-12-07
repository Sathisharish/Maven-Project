package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	public WebDriver driver;
	
	@FindBy (xpath="//i[@class='icon-plus']")
	WebElement qty;
	
	@FindBy (xpath="//select[@class='form-control attribute_select no-print']")
	WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement cart;
	
	
	public AddtoCart(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}
	
	

}
