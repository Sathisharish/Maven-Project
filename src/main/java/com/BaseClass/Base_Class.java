package com.BaseClass;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver launchDriver(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (type.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\iedriver.exe");

			driver = new InternetExplorerDriver();

		} else if (type.equalsIgnoreCase("opera")) {

			System.setProperty("webdriver.opera.driver.", System.getProperty("user.dir") + "\\driver\\operadriver.exe");

			driver = new OperaDriver();

		} else if (type.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver.", System.getProperty("user.dir") + "\\driver\\edgedriver.exe");

			driver = new EdgeDriver();

		}

		return driver;

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void url(String url) {

		driver.get(url);

	}

	public static void impWait(int secondstime) {

		driver.manage().timeouts().implicitlyWait(secondstime, TimeUnit.SECONDS);

	}

	public static void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void input(WebElement element, String input) {

		element.sendKeys(input);

	}

	public static void action(String type,WebElement element) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("lc")) {
			ac.moveToElement(element).click().perform();
		}else if (type.equalsIgnoreCase("moveto")) {
			ac.moveToElement(element).perform();
		}else if (type.equalsIgnoreCase("rc")) {
			ac.moveToElement(element).contextClick().perform();
		}else if (type.equalsIgnoreCase("doubleclick")) {
			ac.moveToElement(element).doubleClick().perform();
		}else if (type.equalsIgnoreCase("dragdrop")) {
			ac.dragAndDrop(element, element).perform();			
		}
		

	}


	public static void jsclick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void select(String type ,WebElement element, String text) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selecttext")) {
			s.selectByVisibleText(text);
		}else if (type.equalsIgnoreCase("selectvalue")) {
			s.selectByValue(text);			
		}else if (type.equalsIgnoreCase("selectindex")) {
			int a = Integer.parseInt(text);
			s.selectByIndex(a);
		}else if (type.equalsIgnoreCase("deselecttext")) {
			s.deselectByVisibleText(text);
		}else if (type.equalsIgnoreCase("deselectvalue")) {
			s.deselectByValue(text);
		}else if (type.equalsIgnoreCase("deselectindex")) {
			int a = Integer.parseInt(text);
			s.deselectByIndex(a);
		}else if (type.equalsIgnoreCase("deselectall")) {
			s.deselectAll();
		}else if (type.equalsIgnoreCase("checkmultiple")) {
			boolean a = s.isMultiple();
			if (a==true) {
				System.out.println("Multiple dropdown");
			}else System.out.println("Single dropdown");
		}else if (type.equalsIgnoreCase("firstselect")) {
			WebElement a = s.getFirstSelectedOption();
			System.out.println("First selected option is "+a);
		}else if (type.equalsIgnoreCase("allselectedoption")) {
			List<WebElement> a = s.getAllSelectedOptions();
		}
		
	}

	public static void screenShot(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\heman\\eclipse-workspace\\RunnerClass_MiniProject\\ScreenShot\\Mini project\\"+location+".png");
		FileHandler.copy(save, path);

	}

	public static void down() throws AWTException {

		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

}
