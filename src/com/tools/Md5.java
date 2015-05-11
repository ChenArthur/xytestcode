package com.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Md5 {

	private final static String[] str = {"0","1","2","3","4","5","6","7","8","9",
		"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	public Md5(){
	}
	
	// 返回形式为数字跟字符串
	private static String byteToArrayString(byte bs){
		int iRet = bs;
		if(iRet < 0){
			iRet += 256;
		}
		int iD1 = iRet / 16;
		int iD2 = iRet % 16;
		return str[iD1] + str[iD2];
	}

	// 返回形式只为数字
	private static String byteToNumber(byte bs){
		int iRet = bs;
		if(iRet < 0){
			iRet += 256;
		}
		return String.valueOf(iRet);
	}
	
	// 转换字节数组为16进制字串
	private static String byteToString(byte[] str){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			sb.append(byteToArrayString(str[i]));
		}
		return sb.toString();
	}
	
	private static String GetMd5Code(String str){
		String result = null;
		try {
			result = new String(str);
			MessageDigest md = MessageDigest.getInstance("MD5");
			// md.digest() 该函数返回值为存放哈希值结果的byte数组
			result = byteToString(md.digest(str.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		Md5 getMd5 = new Md5();
		System.out.println(getMd5.GetMd5Code("00000001"));
	}

}
