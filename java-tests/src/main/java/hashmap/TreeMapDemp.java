package hashmap;

import java.util.TreeMap;

import com.dct.compcomp.Employee;

public class TreeMapDemp {

public static void main(String[] args) {

Temp t = new Temp();

Employee e1= new Employee(1, "a");
Employee e2= new Employee(2, "b");

TreeMap tMap=new TreeMap<>();
tMap.put(e1,1);
tMap.put(e2,2);

System.out.println(tMap);



	
}

}
