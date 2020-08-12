package miscellenous;

import java.util.HashMap;
import java.util.Iterator;

public class FailFastSafe {

	
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

	 Iterator<Integer> i=	map.keySet().iterator();
		
	 while (i.hasNext()) {
				System.out.println(map.get(i.next()));
				
				System.out.println(map.put(5, "E"));
	}
	}
}
