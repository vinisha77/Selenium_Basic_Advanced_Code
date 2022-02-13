package com.datadriventest;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		//to get the data from excel
		Xls_Reader reader=new Xls_Reader("C:/myworkspace/newproject1/src/com/testdata/EbayReg.xlsx");
		
		//to add the new sheet
		if(!reader.isSheetExist("homepage")) {
			reader.addSheet("homepage");
			
		}
		
		int colcount=reader.getColumnCount("EbayReg");
		System.out.println("total column present in the sheet:" + colcount);
		
		System.out.println(reader.getCellRowNum("EbayReg", "Username", "vaishali"));
			
	}

}
