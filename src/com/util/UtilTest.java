package com.util;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class UtilTest {
static	Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
	
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
			
			 reader =new Xls_Reader("C:\\myworkspace\\newproject1\\src\\com\\test1data\\Ebay.xlsx");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		for(int rownum=2;rownum<=reader.getRowCount("Ebay");rownum++) {
			
			String un =reader.getCellData("Ebay","Username", rownum);
			
			String pw=reader.getCellData("Ebay", "Password", rownum);
		
			Object[] ob={un,pw};
			
			myData.add(ob);
			
			
		}
		
		return myData;
		
		
		
		
		
	}
	
	

}
