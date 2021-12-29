package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//span[@class='grower CLOSE'])[2]")
	private WebElement dresses;
	
	@FindBy (xpath = "(//span[@class='grower CLOSE'])[1]")
	private WebElement tops;
	
	@FindBy (xpath="(//a[contains(text(),'shirts')])[3]")
	private WebElement tShirts;
	
	@FindBy (xpath = "(//a[contains(text(),'Blouses')])[2]")
	private WebElement blouses;
	
	@FindBy (xpath = "(//a[contains(text(),'Summer Dresses')])[3]")
	private WebElement summerDresses;
	
	
	@FindBy (xpath = "(//a[contains(@title,'Browse our differen')])[1]")
	private WebElement Eveningdresses;

	@FindBy (partialLinkText ="Casual Dresses")
	private WebElement casualdresses;

	public WebElement getBlouses() {
		return blouses;
	}

	public WebElement gettShirts() {
		return tShirts;
	}

	public WebElement getTops() {
		return tops;
	}
	public Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getSummerDresses() {
		return summerDresses;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningdresses() {
		return Eveningdresses;
	}
	public WebElement getCasualdresses() {
		return casualdresses;
	}
	

}
