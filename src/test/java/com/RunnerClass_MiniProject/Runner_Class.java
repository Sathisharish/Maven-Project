package com.RunnerClass_MiniProject;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;

import com.POMsdp.PageObjectManager;
import com.PropertyFile.FileReaderManager;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = launchDriver("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	static Logger log = Logger.getLogger(Runner_Class.class);
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

	
	    
		PropertyConfigurator.configure("log4j.properties");

		maximizeWindow();
		String url = FileReaderManager.getFrm().getConfigurationReader().geturl();

		int length = url.length();
		System.out.println(length);

		url(url);
		log.info("browser launched");

		sleep(4000);
		click(pom.getInstanceHp().getSigin());

		sleep(4000);

		String userName = FileReaderManager.getFrm().getConfigurationReader().getUserName();
		System.out.println(userName);
		input(pom.getInstanceSp().getEmail(), userName);

		String pass = FileReaderManager.getFrm().getConfigurationReader().getPass();
		System.out.println(pass);
		input(pom.getInstanceSp().getPsw(), pass);
		click(pom.getInstanceSp().getSigin());
		log.info("Sign-in sucessfull");

		sleep(10000);
		action("lc", pom.getInstanceMa().getWomen());

		sleep(8000);
		js("click", pom.getInstanceD().getDresses());
		js("click", pom.getInstanceD().getEveningdresses());

		sleep(15000);
		js("click", pom.getInstanceCp().getColor2());

		sleep(15000);

		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());
		action("lc", pom.getInstanceAc().getQty());

		log.info("Quantity added");

		click(pom.getInstanceAc().getSize());
		select("selecttext", pom.getInstanceAc().getSize(), "L");
		click(pom.getInstanceAc().getCart());

		log.info("added to cart");

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

		log.info("order confirmed");

		sleep(8000);
		action("moveto", pom.getInstanceC().getOrder());

		for (int x2 = 0; x2 <= 8; x2++) {
			down();
		}

		sleep(5000);

		scroll("scrolldown");
		screenShot("order placed base");

		log.info("order placed");

		scroll("scrollup");

		js("click", pom.getInstanceSo().getLogout());

		sleep(5000);

		js("click", pom.getInstanceSp().getSigin());

		sleep(5000);

		// String userName2 =
		// FileReaderManager.getFrm().getConfigurationReader().getUserName();

		input(pom.getInstanceSp().getEmail(), userName);
		input(pom.getInstanceSp().getPsw(), pass);

		js("click", pom.getInstanceSp().getSigin());

		js("click", pom.getInstanceMa().gettShirt());

		sleep(5000);

		scroll("scrolldown");

		js("click", pom.getInstanceCp().getColor2());

		sleep(5000);
		Thread.sleep(5000);

		scroll("scrollDown");

		js("click", pom.getInstanceAc().getQty());
		js("click", pom.getInstanceAc().getQty());

		js("click", pom.getInstanceAc().getSize());
		select("selecttext", pom.getInstanceAc().getSize(), "L");

		js("click", pom.getInstanceAc().getCart());

		sleep(5000);
		Thread.sleep(5000);

		js("click", pom.getInstanceCo().getCheckout());

		sleep(5000);

		scroll("scrolldown");
		scroll("scrolldown");

		js("click", pom.getInstanceSu().getCheckout());

		sleep(5000);

		scroll("scrolldown");

		jsInput("t shirt ", pom.getInstanceM().getMessage());
		js("click", pom.getInstanceM().getCheckout());

		sleep(5000);

		scroll("scrolldown");

		js("click", pom.getInstanceSg().getCheckbox());
		js("click", pom.getInstanceSg().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceP().getPaymentmode());
		sleep(5000);
		scroll("scrolldown");

		js("click", pom.getInstanceOc().getConfirmation());
		sleep(5000);
		scroll("scrolldown");

		screenShot("tshirt");
		scroll("scrollup");

		js("click", pom.getInstanceSo().getLogout());
		sleep(5000);

		js("click", pom.getInstanceHp().getSigin());
		sleep(5000);
		jsInput(userName, pom.getInstanceSp().getEmail());
		jsInput(pass, pom.getInstanceSp().getPsw());
		js("click", pom.getInstanceSp().getSigin());
		sleep(5000);

		js("click", pom.getInstanceMa().getDresses());

		sleep(4000);

		js("click", pom.getInstanceD().getCasualdresses());
		sleep(5000);

		scroll("scrolldown");

		js("click", pom.getInstanceCp().getColor1());
		sleep(5000);
		scroll("scrolldown");

		js("click", pom.getInstanceAc().getQty());
		js("click", pom.getInstanceAc().getSize());
		select("selecttext", pom.getInstanceAc().getSize(), "M");

		js("click", pom.getInstanceAc().getCart());
		sleep(5000);

		js("click", pom.getInstanceCo().getCheckout());

		sleep(5000);

		scroll("scrolldown");
		scroll("scrolldown");

		js("click", pom.getInstanceSu().getCheckout());

		sleep(5000);

		scroll("scrolldown");

		jsInput("t shirt ", pom.getInstanceM().getMessage());
		js("click", pom.getInstanceM().getCheckout());

		sleep(5000);

		scroll("scrolldown");

		js("click", pom.getInstanceSg().getCheckbox());
		js("click", pom.getInstanceSg().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceP().getPaymentmode());
		sleep(5000);
		scroll("scrolldown");

		js("click", pom.getInstanceOc().getConfirmation());
		sleep(5000);
		scroll("scrolldown");

		screenShot("dresses");
		scroll("scrollup");

		js("click", pom.getInstanceSo().getLogout());
		sleep(5000);

		js("click", pom.getInstanceHp().getSigin());
		sleep(5000);

		jsInput(userName, pom.getInstanceSp().getEmail());
		jsInput(pass, pom.getInstanceSp().getPsw());
		js("click", pom.getInstanceSp().getSigin());

		sleep(5000);

		js("click", pom.getInstanceMa().getWomen());
		sleep(5000);

		js("click", pom.getInstanceD().getTops());
		js("click", pom.getInstanceD().gettShirts());

		sleep(5000);

		scroll("scrolldown");

		js("click", pom.getInstanceCp().getColor2());
		sleep(5000);

		js("click", pom.getInstanceAc().getQty());
		js("click", pom.getInstanceAc().getSize());
		select("selectindex", pom.getInstanceAc().getSize(), "1");
		scroll("scrolldown");
		js("click", pom.getInstanceAc().getCart());
		sleep(5000);

		js("click", pom.getInstanceCo().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceSu().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceM().getMessage());
		jsInput("womens tshirts ", pom.getInstanceM().getMessage());
		js("click", pom.getInstanceM().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceSg().getCheckbox());
		js("click", pom.getInstanceSg().getCheckout());
		sleep(5000);

		js("click", pom.getInstanceP().getPayByCheck());
		sleep(5000);

		scroll("scrolldown");
		screenShot("womens Tshirt");
		js("click", pom.getInstanceOc().getConfirmation());
		sleep(5000);

		js("click", pom.getInstanceSo().getLogout());
		sleep(5000);

		js("click", pom.getInstanceHp().getSigin());
		sleep(5000);

		jsInput(userName, pom.getInstanceSp().getEmail());
		jsInput(pass, pom.getInstanceSp().getPsw());
		js("click", pom.getInstanceSp().getSigin());
		sleep(5000);

		js("click", pom.getInstanceMa().getWomen());
		sleep(5000);

		js("click", pom.getInstanceD().getTops());
		js("click", pom.getInstanceD().getBlouses());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceCp().getColor2());
		sleep(5000);

		js("click", pom.getInstanceAc().getQty());
		js("click", pom.getInstanceAc().getSize());
		select("selectindex", pom.getInstanceAc().getSize(), "2");
		js("click", pom.getInstanceAc().getCart());
		sleep(5000);
		scroll("scroldown");
		js("click", pom.getInstanceCo().getCheckout());
		sleep(5000);

		scroll("scroldown");
		js("click", pom.getInstanceSu().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		jsInput("Blouses purchased", pom.getInstanceM().getMessage());
		js("click", pom.getInstanceM().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceSg().getCheckbox());
		js("click", pom.getInstanceSg().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceP().getPayByCheck());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceOc().getConfirmation());
		sleep(5000);

		scroll("scrolldown");
		screenShot("blouses");

		js("click", pom.getInstanceSo().getLogout());
		sleep(5000);
		
		js("click", pom.getInstanceHp().getSigin());
		sleep(5000);
		
		jsInput(userName, pom.getInstanceSp().getEmail());
		jsInput(pass, pom.getInstanceSp().getPsw());
		js("click", pom.getInstanceSp().getSigin());
		sleep(5000);
		
		js("click", pom.getInstanceMa().getWomen());
		sleep(5000);
		
		js("click", pom.getInstanceD().getDresses());
		js("click", pom.getInstanceD().getSummerDresses());
		sleep(5000);
		
		js("click", pom.getInstanceCp().getColor2());
		sleep(5000);
		
		js("click", pom.getInstanceAc().getQty());
		js("click", pom.getInstanceAc().getSize());
		select("selectindex", pom.getInstanceAc().getSize(), "0");
		js("click", pom.getInstanceAc().getCart());
		sleep(5000);
		scroll("scroldown");
		js("click", pom.getInstanceCo().getCheckout());
		sleep(5000);

		scroll("scroldown");
		js("click", pom.getInstanceSu().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		jsInput("Summer dresses purchased", pom.getInstanceM().getMessage());
		js("click", pom.getInstanceM().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceSg().getCheckbox());
		js("click", pom.getInstanceSg().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceP().getPayByCheck());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceOc().getConfirmation());
		sleep(5000);

		scroll("scrolldown");
		screenShot("Summer dresses");

		js("click", pom.getInstanceSo().getLogout());
		sleep(5000);
		

	}

	/*
	 * quit("quit");
	 */
}
