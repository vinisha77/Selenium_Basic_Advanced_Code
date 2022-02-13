package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
	@Test(timeOut=2)
	public void InfiniteLoop() {
	int i=1;
		while(i==1) {
			System.out.println(i);
		}	
}
		
		
	@Test(expectedExceptions=NumberFormatException.class)
	public void Test() {
		String s="100A";
		Integer.parseInt(s);
		
	}
	}


