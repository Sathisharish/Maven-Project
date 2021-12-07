package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorPick {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@class='color_pick'])[2]")
	WebElement color;

	public ColorPick(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getColor() {
		return color;
	}

}
