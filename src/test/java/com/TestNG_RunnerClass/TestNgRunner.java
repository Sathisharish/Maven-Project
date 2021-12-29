package com.TestNG_RunnerClass;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.Base_Class;
import com.POMsdp.PageObjectManager;
import com.PropertyFile.FileReaderManager;

public class TestNgRunner extends Base_Class {

	public static WebDriver driver;

	public static PageObjectManager pom;
	static Logger log = Logger.getLogger(TestNgRunner.class);

	@BeforeMethod
	private void signIn() throws InterruptedException, IOException {

		sleep(10000);
		// jsInput("click", pom.getInstanceHp().getSigin());
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
	}

	@BeforeClass
	private void urlLaunch() throws IOException {

		String url = FileReaderManager.getFrm().getConfigurationReader().geturl();

		int length = url.length();
		System.out.println(length);

		url(url);
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser launched");
		pom = new PageObjectManager(driver);

	}

	@BeforeTest
	@Parameters({"browser"})
	private WebDriver browserLaunch(String browser) {
		driver = launchDriver(browser);
		maximizeWindow();
		return driver;
	}

	@Test(priority = -1,groups = "dresses")
	private void women() throws IOException, AWTException, InterruptedException {
		sleep(10000);
		action("lc", pom.getInstanceMa().getWomen());

		sleep(7000);
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
	}

	@Test(priority = 3,timeOut = 80510,groups = "dresses")
	private void dresses() throws InterruptedException, IOException {
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
	}

	@Ignore
	@Test(priority = 5,groups = "Tops")
	private void tShirt() throws InterruptedException, IOException {
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
	}

	@Test(priority = 2,dependsOnMethods = "blouses")
	private void womenTshirt() throws InterruptedException, IOException {
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
		scroll("scrolldown");
		js("click", pom.getInstanceAc().getCart());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceCo().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceSu().getCheckout());
		sleep(5000);

		scroll("scrolldown");
		js("click", pom.getInstanceM().getMessage());
		jsInput("womens tshirts ", pom.getInstanceM().getMessage());
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

		screenShot("womens Tshirt");
	}

	@Test(priority = 7, invocationCount = 2,groups = "Tops")
	private void blouses() throws InterruptedException, IOException {
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
	}

	@Test(priority = 0,enabled = false,groups = "dresses")
	private void summerDresses() throws IOException, InterruptedException {
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
	}

	@AfterMethod
	private void signOut() {
		scroll("scrollup");

		js("click", pom.getInstanceSo().getLogout());
	}

	@AfterClass
	private void logOutValidate() {

		String driverGet = driverGet("url");
		if (driverGet.equalsIgnoreCase("My Store")) {
			System.out.println("Validated sucessfully");
		}

	}

	@AfterTest
	private void browserClose() {
		quit("quit");
	}

}
