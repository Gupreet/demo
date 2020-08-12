package overloading;

public class Test {

	public void m1(int i) {
		System.out.println("int method"+i);
	}
	public void m1(float f) {
		System.out.println("float method");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(10); //int argument
		t.m1(10f); //float 
		t.m1('B'); //char as argument compiler promote char to int
		t.m1(10l);
		//t.m1(10.5);//double cannot be promoted
		
	}
}
