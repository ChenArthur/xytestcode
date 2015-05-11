package com.urltest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class Murl2 {

	public static void main(String[] args) {
		try {
//			test();
			test2();
//			test3();
//			test4();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取URL指定的资源。
	 *
	 * @throws IOException
	 */
	public static void test4() throws IOException {
		URL url = new URL("http://lavasoft.blog.51cto.com/attachment/200811/200811271227767778082.jpg");
		// URL url = new URL("http://www.jeasyui.com/easyui/demo/treegrid/treegrid_data2.json");
		// 获得此 URL 的内容。
		Object obj = url.getContent();
		System.out.println(obj.getClass().getName());
	}

	/**
	 * 获取URL指定的资源
	 *
	 * @throws IOException
	 */
	public static void test3() throws IOException {
		URL url = new URL("http://www.jeasyui.com/easyui/demo/treegrid/treegrid_data2.json");
		// 返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
		URLConnection uc = url.openConnection();
		// 打开的连接读取的输入流。
		InputStream in = uc.getInputStream();
		int c;
		while ((c = in.read()) != -1)
			System.out.print(c);
		in.close();
	}

	/**
	 * 读取URL指定的网页内容
	 *
	 * @throws IOException
	 */
	public static void test2() throws IOException {
//		URL url = new URL("http://www.jeasyui.com/easyui/demo/treegrid/treegrid_data2.json");
//		URL url = new URL("http://suggest.taobao.com/sug?code=utf-8&q=商品关键字&callback=cb");
//		URL url = new URL("http://www.kuaidi100.com/query?type=快递公司代号&postid=快递单号");
		URL url = new URL("http://m.weather.com.cn/data/101010100.html");
		// 打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。
		Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream()));
		int c;
		while ((c = reader.read()) != -1) {
			System.out.print((char) c);
		}
		reader.close();
	}

	/**
	 * 获取URL的输入流，并输出
	 *
	 * @throws IOException
	 */
	public static void test() throws IOException {
		URL url = new URL("http://www.jeasyui.com/easyui/demo/treegrid/treegrid_data2.json");
		// 打开到此 URL 的连接并返回一个用于从该连接读入的 InputStream。
		InputStream in = url.openStream();
		int c;
		while ((c = in.read()) != -1)
			System.out.print(c);
		in.close();
	}
	
	 /*public static void main(String[] args) {

         String host = "www.java2s.com";
         String file = "/index.html";

         String[] schemes = {"http", "https", "ftp", "mailto", "telnet", "file", "ldap", "gopher",
                         "jdbc", "rmi", "jndi", "jar", "doc", "netdoc", "nfs", "verbatim", "finger", "daytime",
                         "systemresource"};

         for (int i = 0; i < schemes.length; i++) {
                 try {
                         URL u = new URL(schemes[i], host, file);
                         System.out.println(schemes[i] + " is supported\r\n");
                 } catch (Exception ex) {
                         System.out.println(schemes[i] + " is not supported\r\n");
                 }
         }
 }*/

}
