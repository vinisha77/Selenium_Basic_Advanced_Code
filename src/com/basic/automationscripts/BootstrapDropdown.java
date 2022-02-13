package com.basic.automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println("no of list is:" + list.size());
		for(int i=0;i<=list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("jQuery"))
			{
				list.get(i).click();
				break;
			}
			
			
		}
		
		

	}

}
