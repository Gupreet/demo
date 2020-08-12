package overloading;

public class Test2 {
	public void m1(String s) {
		System.out.println("String method");
	}
	
	public void m1(Object o) {
		System.out.println("object method");
	}

		
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m1(new Object());
		t.m1("A");
		
		t.m1(null);//compile will always give the priority on child type argument as compare to parent type argument.
		
	}
}
