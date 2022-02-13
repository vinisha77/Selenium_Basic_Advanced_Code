package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.Facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println("before login title is:" + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("vaishaliganiger@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("ainapur143!");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
		Thread.sleep(3000);
		System.out.println("after login title is:" + driver.getTitle());

	}

}
