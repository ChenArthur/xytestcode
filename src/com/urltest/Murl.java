package com.urltest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Murl {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.jeasyui.com/easyui/demo/treegrid/treegrid_data2.json");
			HttpURLConnection urlConnection = (HttpURLConnection) url.getContent();
			urlConnection.setRequestMethod("post");
			
			urlConnection.connect();
			System.out.println("Connection Response From Test Servlet!!");
			InputStream in = urlConnection.getInputStream();
			
			String responseStr = new Murl().ConvertToString(in);
			System.out.println(responseStr);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 public static String ConvertToString(InputStream inputStream){  
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);  
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
	        StringBuilder result = new StringBuilder();  
	        String line = null;  
	        try {  
	            while((line = bufferedReader.readLine()) != null){  
	                result.append(line + "\n");  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            try{  
	                inputStreamReader.close();  
	                inputStream.close();  
	                bufferedReader.close();  
	            }catch(IOException e){  
	                e.printStackTrace();  
	            }  
	        }  
	        return result.toString();  
	    }  
	  
	  
	    public static String ConvertToString(FileInputStream inputStream){  
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);  
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
	        StringBuilder result = new StringBuilder();  
	        String line = null;  
	        try {  
	            while((line = bufferedReader.readLine()) != null){  
	                result.append(line + "\n");  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            try{  
	                inputStreamReader.close();  
	                inputStream.close();  
	                bufferedReader.close();  
	            }catch(IOException e){  
	                e.printStackTrace();  
	            }  
	        }  
	        return result.toString();  
	    }  

}
