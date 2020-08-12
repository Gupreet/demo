package override;

public class Child2 extends Parent2 {

	public Child2() {
	}
	public int x =1000;
	
	@Override
	public void m1() {
		System.out.println("Child method");
	}
	
	public void m2(int x) {
		System.out.println("Parent overloaded method");
	}
	
}
