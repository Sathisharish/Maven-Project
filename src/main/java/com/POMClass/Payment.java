package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	
	@FindBy (xpath="//a[@title='Pay by bank wire']")
	WebElement paymentmode;
	
	@FindBy (xpath = "//a[@title='Pay by check.']")
	private WebElement payByCheck;

	public WebElement getPayByCheck() {
		return payByCheck;
	}

	public Payment(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getPaymentmode() {
		return paymentmode;
	}
	
	

}
