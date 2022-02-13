package com.basic.automationscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new WebDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");

		//driver.findElement(By.xpath("//*[@id=\'u_0_j\']")).sendKeys("vaishu");
		//driver.findElement(By.xpath("//*[@id=\'u_0_l\']")).sendKeys("ganiger");
		
		//driver.findElement(By.id("u_0_j")).sendKeys("vaishu");
		//driver.findElement(By.id("u_0_l")).sendKeys("ganiger");
	
		driver.findElement(By.name("firstname")).sendKeys("vinshu");
		driver.findElement(By.name("lastname")).sendKeys("ganiger");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9972097514");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("vaishu123");
		
	//	WebElement listbox = driver.findElement(By.id("day"));
	//	Select select= new Select(listbox);
	//	select.selectByValue("28");
		
		Select select= new Select(driver.findElement(By.id("day")));
		select.selectByValue("28");
		
		Select select1= new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Jun");
		
		Select select2= new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1990");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	//	driver.navigate().refresh();
		
		//driver.navigate().back();
		
		driver.manage().window().maximize();
		
		
		
		
		
		
		
	}

}
