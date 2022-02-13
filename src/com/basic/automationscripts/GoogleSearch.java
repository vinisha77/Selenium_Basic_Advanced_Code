package com.basic.automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("software");
		
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbtc']"));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbl1']//span[text()='software']"));
		
		
		System.out.println("total no of suggestions in search box:" + list.size());
		
		for(int i=0;i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("software skills")) {
				list.get(i).click();
				break;
			}
			
		}
	}

}
