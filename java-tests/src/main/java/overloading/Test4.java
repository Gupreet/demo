package overloading;

public class Test4 {

	public void m1(int i, float f) {
		System.out.println("int -- float");
	}

	public void m1(float f, int i) {
		System.out.println("float -- int");
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1(10,10.5f);
		t.m1(10.5f,10);
		
		//t.m1(10,10);//CE : The method m1(int, float) is ambiguous for the type Test4
		//t.m1(10.5f, 10.5f);//CE : cannot find symbol || No scuch type of method
		
		
		
		
	}
}
