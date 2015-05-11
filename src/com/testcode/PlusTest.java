package com.testcode;

import java.math.BigDecimal;

public class PlusTest {

	public static void main(String[] args) {
		Object obj = new Object();
		obj = "423.78";
		double d1 = 120.00;
		double d2 = 190.98;
		double d = d1+d2;
		System.out.println(d);
		//自动装箱拆箱
		d = d + (Double)obj;
		System.out.println(d);
		//装箱
		Double dd = new Double((double) obj);
		System.out.println(dd+d1);
		//插箱
		double dl = dd.doubleValue();
		System.out.println(dl+d1);
		String str = "3.70";
		String str1 = "34.70";
		
		BigDecimal be = new BigDecimal(str);
		BigDecimal be1 = new BigDecimal(str1);
//		be+be1;
	}
}
