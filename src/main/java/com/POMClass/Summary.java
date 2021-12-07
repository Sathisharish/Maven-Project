package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver driver;
	
	@FindBy (xpath="//span[text()='Proceed to checkout']")
	WebElement checkout;

	public Summary(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	

}
