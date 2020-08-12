package com.dct.concurrent;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 implements Runnable {
	 static ConcurrentHashMap m = new ConcurrentHashMap<>();
	//static HashMap m = new HashMap<>();
	//static Hashtable<Integer, String> m = new Hashtable();
	public static void main(String[] args) throws InterruptedException {
		m.put(101, "A");
		m.put(102, "B");

		Test1 t1 = new Test1();
		Thread th1 = new Thread(t1);
		th1.start();
		Set s = m.keySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println("main thread is iterating and current entry is " + m.get((Integer) i.next()));
			Thread.sleep(3000);
		}
		
		/*Enumeration e =m.keys();
		while(e.hasMoreElements()) {
			System.out.println("main thread is iterating and current entry is " + m.get(e.nextElement()));
			Thread.sleep(3000);
		}*/

	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		}

		System.out.println("child thread updating");
		m.put(103, "c");
		m.put(104, "D");

	}
}
