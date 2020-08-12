package com.dct.compcomp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
		m1.put("personid", "1");
		m1.put("name", "a");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("personid", "2");
		m2.put("name", "b");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("personid", "3");
		m3.put("name", "C");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("personid", "4");
		m4.put("name", "D");
		
		Map<String, String> m5 = new HashMap<>();
		m5.put("personid", "5");
		m5.put("name", "E");
		
				
				
		TreeSet<Map<String, String>> t = new TreeSet((var1, var2) -> {
			Map<String, String> m11=(Map)var1;
			Map<String, String> m21=(Map)var2;
			
			int p1=Integer.parseInt(m11.get("personid").toString());
			int p2=Integer.parseInt(m21.get("personid").toString());
			
			if(p1>p2) 
				return 1;
			if(p1<p2)
				return -1;
			else
		 		return 0;
		});
		
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(m4);
		t.add(m5);
		
		System.out.println(t);
		
		
	}

}
