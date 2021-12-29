package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	// softAssert : If the SoftAssert is failed or passed it will execute the test
	// and will not throw any assertion error

	@Test
	private void assertMethods() {
		String a = "Sathish";
		int b = 10;
		int c = 100;
		String d = "sathish";
		String e = null;

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(a, d);

		System.out.println("String");

		soft.assertEquals(b, c);

		System.out.println("integer");

		soft.assertNotEquals(a, b);

		System.out.println("not equal");

		soft.assertNull(e);

		System.out.println("null will occur");

		soft.assertNotNull(a);

		System.out.println("not null execeuted");

		soft.assertSame(a, d);
		System.out.println("Assert same ");

		soft.assertNotSame(a, e);
		System.out.println("Assert not same");

	}

}
