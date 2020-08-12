package override;


public class Parent1 {
	
protected void m1(Number I) {
System.out.println("Parent Class method");
}

/*protected void m2(String s) {
	System.out.println("Parent Class method- m2");
}*/

public static void methodHidingStatic() {
	System.out.println("Parent Class methodHidingStatic");
}


public Exception coVariantMethod() {
	
	return new Exception();
}

public void exceptionMethod() throws Exception{	
	System.out.println("Parent Class exceptionMethod");
}

	void draw(int a, float b) {
		System.out.println("Circle");
	}
}