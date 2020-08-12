package com.dct.compcomp;

public class Employee implements Comparable<Employee>  {
int id;
String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
@Override
public int compareTo(Employee o) {
/*	int id1= this.id;
	int id2 = o.id;
	
	if(id1<id2)
		return -1;
	else if(id1>id2)
		return 1;
	else 
		return 0;*/
	
	
	String  s1= this.name;
	String s2 = o.name;
	
	return s2.compareTo(s1);

	
}


}
