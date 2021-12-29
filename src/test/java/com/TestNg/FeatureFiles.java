package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FeatureFiles {
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("getUrl");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("LogIn");
	}
	
	@Test(priority = -5,invocationCount = 2)
	private void refresh() {
		System.out.println("refresh");
	}
	
	@Test(priority = 1)
	private void women() {
		System.out.println("Women");
	}
	@Test(priority = 1)
	private void tShirts() {
		System.out.println("T-Shirts");
	}

	@Test(priority = 2 , enabled = false)
	private void dresses() {
		System.out.println("Dresses");
	}

	@AfterMethod
	private void logout() {
		System.out.println("LogOut");
	}
	
	@AfterClass
	private void verifyHomePage() {
		System.out.println("Verify Home Page");
	}
	@AfterTest
	private void close() {
		System.out.println("close");
	}
	@AfterSuite
	private void cookies() {
		System.out.println("Delete All Cookies");
	}
	
	
	
	
	
	
	
	
}
