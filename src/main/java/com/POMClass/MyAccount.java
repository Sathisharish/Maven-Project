package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy (xpath ="(//a[text()='T-shirts'])[2]" )
	private WebElement tShirt;
	
	@FindBy (xpath = "(//a[text()='Dresses'])[2]")
	private WebElement dresses;

	public MyAccount(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}


	public WebElement gettShirt() {
		return tShirt;
	}
	

	public WebElement getDresses() {
		return dresses;
	}

	
}
