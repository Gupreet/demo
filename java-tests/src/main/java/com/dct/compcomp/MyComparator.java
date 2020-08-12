package com.dct.compcomp;

import java.util.Comparator;
import java.util.Map;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1,Object obj2) {
		
		Map m1=(Map)obj1;
		Map m2=(Map)obj2;
		
		int p1=Integer.parseInt(m1.get("personid").toString());
		int p2=Integer.parseInt(m2.get("personid").toString());
		
		if(p1>p2) 
			return 1;
		if(p1<p2)
			return -1;
		else
     		return 0;
	}

	
}
