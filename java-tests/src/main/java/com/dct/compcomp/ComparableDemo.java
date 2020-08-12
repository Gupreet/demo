package com.dct.compcomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
	Employee  e1= new Employee(1, "aurpreet");
	Employee  e2= new Employee(2, "rajat");
	Employee  e3= new Employee(3, "kishn");
	Employee  e4= new Employee(4, "baibhav");
	Employee  e5= new Employee(5, "mohit");
	
	
	/*TreeSet<Employee> t = new TreeSet<>();
	
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	*/
	
	List<Employee> l = new ArrayList<Employee>();
	l.add(e2);
	l.add(e1);
	l.add(e3);
	l.add(e4);
	l.add(e5);
		
	System.out.println(l);
	
	Collections.sort(l);
	System.out.println(l);
	
	
	
	
	}

}
