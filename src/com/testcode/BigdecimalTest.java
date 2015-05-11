package com.testcode;

import java.math.BigDecimal;

public class BigdecimalTest {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("3.00").setScale(3,BigDecimal.ROUND_HALF_DOWN);
		
		BigDecimal b = new BigDecimal(3);
		
		BigDecimal c = new BigDecimal(3.00);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
	}

}
