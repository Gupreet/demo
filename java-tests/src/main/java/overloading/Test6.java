package overloading;

public class Test6 {

	public void m1(Animal a) {
	System.out.println("Animal Method");
	}
	public void m1(Monkey m) {
    System.out.println("Monkey Method");		
	}
	
	public static void main(String[] args) {
		Test6 t= new Test6();
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		Animal a1 = new Monkey();
		t.m1(a1);
		
		
	}
}
