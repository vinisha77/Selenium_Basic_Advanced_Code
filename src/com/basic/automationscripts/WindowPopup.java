package com.basic.automationscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
		
		String parentwindowid=it.next();
		
		System.out.println("parent window id is:" +  parentwindowid );
		
		String childwindowid =it.next();
		
		System.out.println("child window id is:" + childwindowid  );
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(3000);
		 
		 System.out.println("child window popup title is:"+ driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(parentwindowid);
		 Thread.sleep(3000);
		 
		 System.out.println("parent window title is:" + driver.getTitle());
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		

	}

}
