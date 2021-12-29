package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	// HardAssert : If the assert is failed it will stop the execution and throw
	// assertion error
	// and if it is passed it will execute the test
	// if the assertion error occur in previous method then next method will be
	// executed

	@Test
	private void assertMethods() {
		String a = "Sathish";
		int b = 10;
		int c = 10;
		String d = "Sathish";
		String e = null;

		Assert.assertEquals(a, d);

		System.out.println("String");

		Assert.assertEquals(b, c);

		System.out.println("integer");

		Assert.assertNotEquals(a, b);

		System.out.println("not equal");

		Assert.assertNull(e);

		System.out.println("null will occur");

		Assert.assertNotNull(a);

		System.out.println("not null execeuted");

		Assert.assertSame(a, d);
		System.out.println("Assert same ");

		Assert.assertNotSame(a, d);
		System.out.println("Assert not same");

	}

	@Test(priority = 1)
	private void sample() {

		System.out.println("123456");
		
		//throw new AssertionError();
	}

}
