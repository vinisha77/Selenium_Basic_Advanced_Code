package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myclass {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is incorrect");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	//	driver.quit();
	
	}

}