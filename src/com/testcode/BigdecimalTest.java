package com.testcode;

import java.math.BigDecimal;

public class BigdecimalTest {
	private Double weekHours;
	private Double toHours;
	private Double totalHours;
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("3.00").setScale(3,BigDecimal.ROUND_HALF_DOWN);
		
		BigDecimal b = new BigDecimal(3);
		
		BigDecimal c = new BigDecimal(3.00);
		
		int k = 0;
		System.out.println("k:"+ ++k + k++ + ++k + k++ +k);
		
		/*System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));*/
		
		BigdecimalTest bt = new BigdecimalTest();
		bt.weekHours = 2.5;
		bt.toHours = 3.8;
		bt.totalHours = 5.5;
		
		System.out.println(bt.weekHours*bt.toHours-bt.totalHours);
		
		
	}
	public Double getWeekHours() {
		return weekHours;
	}
	public void setWeekHours(Double weekHours) {
		this.weekHours = weekHours;
	}
	public Double getToHours() {
		return toHours;
	}
	public void setToHours(Double toHours) {
		this.toHours = toHours;
	}
	public Double getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(Double totalHours) {
		this.totalHours = totalHours;
	}

}
