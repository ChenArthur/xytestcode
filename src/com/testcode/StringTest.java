package com.testcode;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "增城市广东省广州市增城区";
		String st = "增城市";
		String sy = "011";
		String sr = "111";
		String tr = "000";
		/*if(str.indexOf(st)>0){
			System.out.println("str=0:进来了："+st);
		} else {
			System.out.println("str=1："+str);
		}*/
//		str = str.split("城区");
		if(str.indexOf("城区")>0)
		str = str.substring(0,str.length()-2);
		System.out.println(str);
		
	}
}
