package com.TestNg;

import org.testng.annotations.Test;

public class GroupingFeature {
	
	@Test(groups = "SocialMedia",timeOut = 10000)
	private void whatsapp() throws InterruptedException {
		System.out.println("Whatsapp");
		Thread.sleep(8000);
	}
	@Test (groups = "SocialMedia")
	private void facebook() {
		System.out.println("facebook");
		
	}
	@Test(groups = "Music")
	private void spotify() {
		System.out.println("spotify");
	}
	@Test(groups = "Music")
	private void wynkmusic() {
		System.out.println("wynk music");
		
	}
	@Test (groups = "Games")
	private void pubg() {
		System.out.println("pubg");
		
	}
	@Test(groups = "Games",timeOut = 3000)
	private void candycrush() throws InterruptedException {
		System.out.println("candyCrush");
		Thread.sleep(4000);
		System.out.println("111");
	}
	
	@Test(priority = -1,expectedExceptions =  Error.class)
	private void exception() {
		System.out.println("sss");
		String s = null;
		System.out.println(s.length());
	}

}
