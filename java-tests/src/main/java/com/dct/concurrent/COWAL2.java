package com.dct.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAL2 extends Thread {

//	static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	static ArrayList<String> l = new ArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("Child Thread is updating....");
		l.add("C");

	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		
		COWAL2 cAl=new COWAL2();
		cAl.start();
		
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println("Main Thread is iterating over String :"+i.next().toString());
			Thread.sleep(3000);
		}
		System.out.println(l);
		
	}
}
