package com.basic.automationscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new WebDriver();
	driver.get("http://www.google.com");
	}
}
