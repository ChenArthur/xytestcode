package com.tools;

import java.security.MessageDigest;

public class Md5Util {
	 /*** 
     * MD5加密 生成32位md5码
     * @param 待加密字符串
     * @return 返回32位md5码
     */
	public static String md5Encode(String inStr) throws Exception{
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		
		byte[] byteArray = inStr.getBytes("UTF-8");
		byte[] md5Bytes = md5.digest();
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = md5Bytes[i] & 0xff;
			if(val < 16){
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	/**
     * 测试主函数
     * @param args
     * @throws Exception
     */
	public static void main(String[] args) throws Exception {
		String ss = "123456";
		System.out.println("之前："+ss);
		System.out.println("之后："+md5Encode(ss));
	}
}
