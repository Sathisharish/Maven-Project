package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//span[@class='grower CLOSE'])[2]")
	WebElement plus;
	
	@FindBy (xpath = "(//a[contains(@title,'Browse our differen')])[1]")
	WebElement Eveningdresses;

	public Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getEveningdresses() {
		return Eveningdresses;
	}
	
	

}
