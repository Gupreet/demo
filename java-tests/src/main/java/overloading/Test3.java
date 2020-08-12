package overloading;

public class Test3 {
	public void m1(String s) {
		System.out.println("String method");
	}
	
	public void m1(StringBuffer sb) {
		System.out.println("object method");
	}

		
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		t.m1("A");
		
		//t.m1(null);//there will be ambiguity among String and String Buffer
		
	}
}
