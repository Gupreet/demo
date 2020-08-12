package overloading;

public class Test5 {

	public void m1(int x) {
	System.out.println("General Method");
	}
	public void m1(int... x) {
		System.out.println("Var-Arg Method");
	}
	
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.m1();
		t.m1(10,20);
		t.m1(10);
	}
	
	
}
