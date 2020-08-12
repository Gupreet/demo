package staticcontrolflow;

public class Base {
	static int i = 100;
	static {
		m1();
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Main method");
	}

	public static void m1() {
		System.out.println(j);
	}

	static {
		System.out.println("second static block");
	}
	static int j = 200;

}
