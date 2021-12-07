package com.RunnerClass_MiniProject;

import java.awt.AWTException;
import java.io.IOException;

import javax.xml.crypto.dsig.SignedInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;
import com.POMClass.AddtoCart;
import com.POMClass.CheckOut;
import com.POMClass.ColorPick;
import com.POMClass.Confirm;
import com.POMClass.Dresses;
import com.POMClass.HomePage;
import com.POMClass.Message;
import com.POMClass.MyAccount;
import com.POMClass.OrderConfirmation;
import com.POMClass.Payment;
import com.POMClass.Shipping;
import com.POMClass.SigninPage;
import com.POMClass.Summary;
import com.POMsdp.PageObjectManager;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = launchDriver("chrome");

	public static PageObjectManager pom= new PageObjectManager(driver);

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		maximizeWindow();

		url("http://automationpractice.com/index.php");

		sleep(4000);
		click(pom.getInstanceHp().getSigin());

		sleep(4000);
		input(pom.getInstanceSp().getEmail(), "sathish4321@gmail.com");
		input(pom.getInstanceSp().getPsw(), "S@thish123");
		click(pom.getInstanceSp().getSigin());

		sleep(10000);
		action("lc", pom.getInstanceMa().getWomen());

		sleep(8000);
		js("click", pom.getInstanceD().getPlus());
		js("click", pom.getInstanceD().getEveningdresses());
	

		sleep(15000);
		js("click", pom.getInstanceCp().getColor());

		sleep(15000);

		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());

		click(pom.getInstanceAc().getSize());
		select("selecttext", pom.getInstanceAc().getSize(), "L");
		click(pom.getInstanceAc().getCart());

		sleep(5000);
		screenShot("add to cart base");

		sleep(4000);
		click(pom.getInstanceCo().getCheckout());

		sleep(8000);
		click(pom.getInstanceSu().getCheckout());

		sleep(8000);
		input(pom.getInstanceM().getMessage(), "Mini Project Second Half");
		click(pom.getInstanceM().getCheckout());

		sleep(8000);
		click(pom.getInstanceSg().getCheckbox());
		click(pom.getInstanceSg().getCheckout());

		sleep(8000);
		click(pom.getInstanceP().getPaymentmode());

		sleep(8000);
		click(pom.getInstanceOc().getConfirmation());

		sleep(8000);
		action("moveto", pom.getInstanceC().getOrder());

		for (int x2 = 0; x2 <= 8; x2++) {
			down();
		}

		sleep(5000);
		screenShot("order placed base");

		sleep(5000);
		quit("quit");

	}

}
