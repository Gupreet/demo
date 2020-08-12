package com.dct.book;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _3 {

	
	public static void main(String[] args) {
		
		String s="sdddff";
		//String[] arr=s.split("\\s");
		char arr[]= s.toCharArray();
		
		int count=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
			if(String.valueOf(arr[i]).equals(String.valueOf(arr[j]))) {
				arr[j]=0;
				count++;
			}
			
		
				
			}	
			/*if(!String.valueOf(arr[i]).equals("0") && !String.valueOf(arr[i]).isEmpty())*/
			if(!String.valueOf(arr[i]).equals(" ")) {
			String s1=	String.valueOf(arr[i]).toString().replace("\\s","0").toString();
				
				System.out.println(s1+" :: "+count);
			}
			count=1;
		}
		
		
		
		
		
		
	}
}
