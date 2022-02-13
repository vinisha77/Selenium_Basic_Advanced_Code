package com.basic.automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++) {
			String text=alllinks.get(i).getText();
			System.out.println(text);
		}
		

	}

}
