package com.basic.automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

	ChromeOptions option= new ChromeOptions();
	option.addArguments("window-size=1400,800");
	option.addArguments("headless");
	
	
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.println("before login page title is:" + driver.getTitle());
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vaishaliganiger@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ainapur143!");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		System.out.println("after login page title is:" + driver.getTitle());
		
		
	}

}
