package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterisedTest {

	public static void main(String[] args) {
		
		
		//webdriver code:
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com/signin/");
			//Data driven approach(Parameterization)---used to create data driven framework
//data driven means driving the test data from excel files
	
			
			//get test data from excel file
		Xls_Reader reader=new Xls_Reader("C:/myworkspace/newproject1/src/com/testdata/EbayReg.xlsx");
		
		int rowCount=reader.getRowCount("EbayReg");
		
		//to add the column
		reader.addColumn("EbayReg","status");
		//parameterization is always done by for loop
		for(int rownum=2;rownum<=rowCount;rownum++) {
			System.out.println("******");
			
			String un=reader.getCellData("EbayReg","Username",rownum);
			
			System.out.println(un);
			
			String pw=reader.getCellData("EbayReg", "Password", rownum);
			System.out.println(pw);
			
			driver.findElement(By.xpath("//input[@id='userid']")).clear();
				driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
				
				driver.findElement(By.xpath("//input[@id='pass']")).clear();
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
				
				reader.setCellData("EbayReg","status", rownum,"pass");//write the data in to cell
				
			
		}
		

	}

}
