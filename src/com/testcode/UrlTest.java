package com.testcode;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
//		joinUrl("http://xx.com/a2/", "/b2/");
		joinUrl("http://www.baidu.com/a2/", "/b2/");
	}

	public static String joinUrl(String curl, String file) {
		URL url = null;
		String q = "";
		try {
			url = new URL(new URL(curl), file);
			q = url.toExternalForm();
		} catch (MalformedURLException e) {
			e.getStackTrace();
			e.getMessage();
			e.printStackTrace();
		}
		url = null;
		if (q.indexOf("#") != -1)
			q = q.replaceAll("^(.+?)#.*?$", "$1");
		return q;
	}

	public static String getDomain(String curl) {
		URL url = null;
		String q = "";
		try {
			url = new URL(curl);
			q = url.getHost();
		} catch (MalformedURLException e) {
			e.getStackTrace();
			e.getMessage();
			e.printStackTrace();
		}
		url = null;
		return q;
	}
}
