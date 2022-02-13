package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
		public void setUp() {
			System.out.println("BF:--set up system properties for chrome");
	}
	@BeforeTest
		public void launchBrowser() {
			System.out.println("BT:--launch the browser");
	}
	@BeforeClass
		public void login() {
			System.out.println("BC:--log in method");
	}
	@BeforeMethod
		public void enterURL() {
			System.out.println("BM:--enter the url");
	}
	@Test
		public void googleTitleTest() {
			System.out.println("google title test");
	}
	@Test
		public void searchTest() {
			System.out.println("search test");
	}
	@AfterMethod
		public void logOut() {
			System.out.println("AM:--log out from the application");
	}
	@AfterClass
		public void closeBrowser() {
			System.out.println("AC:--close the browser");
		
	}
	@AfterTest
		public void deleteAllCookies() {
			System.out.println("AT:--deleteAllCookies");
	}
	//@AfterSuite
	//	public void generateReport() {
	//		System.out.println("AS:--generate the report");
	//}
	
	
}
