package com.basic.automationscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class HandleWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		String before_xpath_comname="//*[@id=\'customers\']/tbody/tr[";
		String after_xpath_comname="]/td[1]";
		
		String before_xpath_contact="//*[@id=\"customers\"]/tbody/tr[";
		String after_xpath_contact="]/td[2]";
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("total no of rows="+ (rows.size()-1));
		int count=rows.size();
		
		Xls_Reader reader=new Xls_Reader("C:\\myworkspace\\newproject1\\src\\com\\test1data\\Ebay.xlsx");
		if(!reader.isSheetExist("TableData12")){
		reader.addSheet("TableData12");
		reader.addColumn("TableData12", "Company");
		reader.addColumn("TableData12", "Contacts");
		
		
		}
			for(int i=2;i<=7;i++) {
				String actual_xpath_company=before_xpath_comname+i+after_xpath_comname;
				String compName=driver.findElement(By.xpath(actual_xpath_company)).getText();
				System.out.println(compName);
			
				reader.setCellData("TableData12","Company", i, compName );
			
				String actual_xpath_contact=before_xpath_contact+i+after_xpath_contact;
				String contact=driver.findElement(By.xpath(actual_xpath_contact)).getText();
				System.out.println(contact);
			
			reader.setCellData("TableData12", "Contacts", i, contact);
			
			
			
		}
		
		
	}

}
