package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorPick {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@class='color_pick'])[1]")
	private WebElement color1;
	
	

	@FindBy(xpath = "(//a[@class='color_pick'])[2]")
	private WebElement color2;
	
	public ColorPick(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getColor1() {
		return color1;
	}

	public WebElement getColor2() {
		return color2;
	}

}
