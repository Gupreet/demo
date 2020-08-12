package innerclasses;

import java.util.HashMap;
import java.util.Map;

public class MethodLocalInnerClass {

	int z=20;
	public void m1() {
		int v=19;
	class Inner{
		
			private void sum(int x, int y) {
				System.out.println(x + y + z+v);
			}
	}
	Inner i = new Inner();
	i.sum(0, 10);

	}
	
}
