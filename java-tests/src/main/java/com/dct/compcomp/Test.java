package com.dct.compcomp;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	String a ="a";
	String b = new String("a");
	System.out.println(a==b);
	
	Set<String> s = new HashSet<>();
	s.add(a);
	s.add(b);
	System.out.println(s);

}
}
