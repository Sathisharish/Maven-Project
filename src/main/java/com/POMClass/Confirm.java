package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	
	public WebDriver driver;
	
	@FindBy (xpath="//h1[text()='Order confirmation']")
	WebElement order;

	public Confirm(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrder() {
		return order;
	}
	
	

}
