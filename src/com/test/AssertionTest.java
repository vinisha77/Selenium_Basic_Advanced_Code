package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTest {
	
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
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google","title is not matched");
	}
	@Test
	public void googleLogoTest() {
		Boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(b);
		
		Assert.assertTrue(b);
		
	//Assert.assertEquals(b, true);
	}
	@Test
	public void mailTest() {
		Boolean b1 =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b1);
	//	Boolean expected = true;
		Assert.assertTrue(b1);
		
		
	//Assert.assertEquals(b1,expected );
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}

}
