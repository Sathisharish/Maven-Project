package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//span[text()='I confirm my order']" )
	WebElement confirmation;

	public OrderConfirmation(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmation() {
		return confirmation;
	}
	
	

}
