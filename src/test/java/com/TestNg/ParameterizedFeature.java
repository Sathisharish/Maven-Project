package com.TestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedFeature {
	
	@Test
	@Parameters({"userName","password"})
	private void login(@Optional("sathish Kumar")  String userName,
			@Optional("s@thish123") String password) {
		
		System.out.println("user Name is "+userName);
		
		System.out.println("Password is "+password);
		
		System.out.println("log-in");

	}
	@Test
	@Parameters({"userName"})
	private void message(@Optional("sathish Kumar") String message) {
		
		System.out.println("Item is "+message);
		
		System.out.println("log-out");

	}
	
}
