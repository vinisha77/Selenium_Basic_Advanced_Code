package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=5)
	public void Sum() {
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("sum is:" + c);
		
	}

}
