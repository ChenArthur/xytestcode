package com.testcode;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateTest {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date dt = new java.sql.Date(5);
		java.util.Date d = new java.util.Date();
		String s = df.format(d);
		java.util.Date ds = d;
		System.out.println(dt);
		System.out.println(df.format(dt));
		System.out.println();
		
		SimpleDateTest sdt = new SimpleDateTest();
		sdt.getCalendar();
	}
	
	public void getCalendar(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cd = Calendar.getInstance();
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH)+1;
		int day = cd.get(Calendar.DATE);
		int dd = year+month+day;
		Timestamp ts = new Timestamp(new Date().getTime());
		Time time = new Time(new Date().getTime());
		Date d = ts;
		System.out.println("Calendar：" + dd);
		System.out.println("Calendar：" + time);
		System.out.println("new Date().getTime()：" + new Date().getTime());
	}
}
