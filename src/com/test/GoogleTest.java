package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test(priority=2,groups="Title")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3,groups="LogoTest")
	public void googleLogoTest() {
		Boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=1,groups="MailTest")
	public void mailTest() {
		Boolean b1 =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b1);
	}
	@Test(priority=5,groups="Test")
	public void test1() {
		System.out.println("method test 1");
	}
	@Test(priority=4,groups="Test")
	public void test2() {
		System.out.println("method test 2");
	}
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("method test 3");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
