package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void LogInTest() {
		System.out.println("log in test");
		//int i=9/0;
	}
	@Test(dependsOnMethods="LogInTest")
	public void HomePageTest() {
		System.out.println("homepage test");
	}
	@Test(dependsOnMethods="LogInTest")
	public void SearchPageTest() {
		System.out.println("search page test");
	}
	@Test(dependsOnMethods="LogInTest")
	public void RegPageTest() {
		System.out.println("reg page test");
	}
}
