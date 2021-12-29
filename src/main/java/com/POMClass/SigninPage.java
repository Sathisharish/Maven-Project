package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	public WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement psw;
	
	@FindBy (xpath="//i[@class='icon-lock left']")
	private WebElement sigin;

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
