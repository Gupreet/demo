package override;

public class Parent2 {

	public Parent2(int x) {
		
	}
	public Parent2() {
		// TODO Auto-generated constructor stub
	}
	public int x = 10;
	public void m1() {
		System.out.println("Parent method");
	}
	
	public void m2(int... x) {
		System.out.println("Parent overloaded method");
	}

}
