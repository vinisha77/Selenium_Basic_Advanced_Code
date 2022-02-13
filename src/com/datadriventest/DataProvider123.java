package com.datadriventest;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.UtilTest;

public class DataProvider123 {
	
	WebDriver driver;
@BeforeMethod
public void setUp() {
	//DataDriven Framework approach using TestNG @DataProvider annotation
	
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.ebay.com/signin/");
	
}

@DataProvider
public Iterator<Object[]> getTestData() {
	

	ArrayList<Object[]> testData=UtilTest.getDataFromExcel();
	return testData.iterator();
	
}

@Test(dataProvider="getTestData")
public void EbayRegPage(String un,String pw) {
	
	
	driver.findElement(By.xpath("//input[@id='userid']")).clear();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
	
	driver.findElement(By.xpath("//input[@id='pass']")).clear();
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
	
}

@AfterMethod
public void tearDown() {
	driver.close();
	
}
	
}
	
	
	
	

