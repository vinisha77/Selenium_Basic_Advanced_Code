package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

		public static void main(String[] agrs) {
			
Xls_Reader reader=new Xls_Reader("C:/myworkspace/newproject1/src/com/testdata/EbayReg.xlsx");
			
			String un=reader.getCellData("EbayReg","Username",2);
			
			System.out.println(un);
			
			String pw=reader.getCellData("EbayReg", "Password", 2);
			System.out.println(pw);
			
			
			
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com/signin/");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
			
		
		}

}