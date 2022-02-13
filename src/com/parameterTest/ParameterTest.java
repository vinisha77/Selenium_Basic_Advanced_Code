package com.parameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;

	@Test
	@Parameters({"browser","url","emailid"})
	
	public void Login(String browser,String url,String emailid) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
}
