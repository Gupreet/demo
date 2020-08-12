package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		

		
		//ArrayList<Temp> wM= new  ArrayList<Temp>();
	/*	WeakHashMap<Temp, String> wM= new  WeakHashMap<Temp, String>();
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		
		//wM.add(t1);
	   wM.put(t1, "a");
		t2 = t1;
		
		System.out.println(wM);
		t1=null;

		System.gc();
		
		Thread.sleep(5000);
		System.out.println(wM );
				*/
	
		//WeakHashMap<Temp, String> wM= new  WeakHashMap<Temp, String>();
		HashMap<Temp, String> wM= new  HashMap<Temp, String>();
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		
		wM.put(t1, "t1");
	
		
		
		System.out.println(wM);
		t1=null;

		System.gc();
		
		Thread.sleep(5000);
		System.out.println(wM );
				
		
	}
	
}
