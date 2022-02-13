package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","d:/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr189169");
		driver.findElement(By.name("password")).sendKeys("putYdyt");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.name("btnReset")).click();
		
		
	}

}
