package miscellenous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;


public class Test2 {
public static void main(String[] args) {
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	Integer i3 = new Integer(10);
	
   HashMap<Integer, String> m= new HashMap<>();
	//IdentityHashMap<Integer, String> m= new IdentityHashMap<>();
	m.put(i1, "One");
	m.put(i2, "Two");
	m.put(i3, "Three");
	
	System.out.println(m);
	
	HashSet<Integer> s= new HashSet<>();
	s.add(i1);
	s.add(i2);
	s.add(i3);
	System.out.println(s);
	
	ArrayList<Integer> l = new ArrayList<>();
	l.add(i1);
	l.add(i2);
	l.add(i3);
	System.out.println(l);
	
	
	
	
}
}
