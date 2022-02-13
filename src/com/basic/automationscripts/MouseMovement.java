package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath
				("//a[@id='highlight-addons']//parent::li[@class='hide-mobile']"))).perform();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText("SpiceMax")).click();
		
		driver.navigate().back();
		
		action.moveToElement(driver.findElement(By.xpath("//span[@class='burger-bread']"))).perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-list-addons\"]/li[1]/a"))).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("FAQ")).click();
		
		
		

	}

}
