package com.dct.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL3 {

	public static void main(String[] args) {
	CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	//	ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		System.out.println(l);
		
		
		Iterator<String> i= l.iterator();
		
		while(i.hasNext()) {
			if(i.next().toString().equals("D")) {
			l.remove("D");	
				//i.remove();
			}
			
		}
		
		System.out.println(l);
		
	}
}
