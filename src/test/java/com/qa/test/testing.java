package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.*;


public class testing {

	@Test(retryAnalyzer = com.analyzer.retryanalyzer.class)
	public void tone() {
		
		String a="a";
		String b="b";
		Assert.assertEquals(a,b);
	}
	
	@Test(retryAnalyzer = com.analyzer.retryanalyzer.class)
	public void ttwo() {
		
		String a="a";
		String b="a";
		Assert.assertEquals(a,b);
	}
	
	@Test
	public void tthree() {
		String a="a";
		String b = "b";
		Assert.assertEquals(a,b);
	}
}
