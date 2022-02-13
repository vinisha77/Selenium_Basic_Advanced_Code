package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","d:/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr189169");
		driver.findElement(By.name("password")).sendKeys("putYdyt");
		driver.findElement(By.name("btnLogin")).click();
		/*driver.findElement(By.name("btnReset")).click();*/
		Thread.sleep(1000);
		String aTitle=driver.getTitle();
		String eTitle="Guru99 Bank Manager HomePage";

		if(aTitle.equals(eTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
		
		
	}

}
