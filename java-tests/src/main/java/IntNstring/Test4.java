package IntNstring;



public class Test4 {

	
	public static void m1(int... x) {
	System.out.println("Var arg method");	
	}
	public static void m1(long l) {
	System.out.println("Widening");	
	}
	public static void main(String[] args) {
		int x=10;
		m1(x);
	}
	
	
}
