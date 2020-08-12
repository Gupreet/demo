package com.dct.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL4 {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		
		
		Iterator<String> i= l.iterator();
		l.add("D");
		System.out.println(l);
		
		while(i.hasNext()) {
			
			System.out.println(i.next().toString());
		}
		
  	}

}
