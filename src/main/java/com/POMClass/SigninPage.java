package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	public WebDriver driver;
	
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement psw;
	
	@FindBy (xpath="//i[@class='icon-lock left']")
	WebElement sigin;

	public SigninPage(WebDriver driver2) {
			this.driver= driver2;
			
			PageFactory.initElements(driver, this);
	
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPsw() {
		return psw;
	}

	public WebElement getSigin() {
		return sigin;
	}
	

}
