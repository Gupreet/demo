package hashmap;
import java.util.*;
public class IdentityHashMapDemo {

public static void main(String[] args) {
	
	
	Map iMap= new HashMap<>();
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	iMap.put(i1, 10);
	iMap.put(i2, 100);
	
	System.out.println(iMap);
	
	
	
	
}

}
