package override;

import java.sql.SQLException;

public class Child1 extends Parent1 {

	
	public void m1(Number I) {
		System.out.println("Child class method");
	}
	
	
	public void m2(String s) {
		System.out.println("Child Class method- m2");
	}
	
	
	public static void methodHidingStatic() {
		System.out.println("Child class methodHidingStatic");
	}
	
	
	
	
	@Override
	public RuntimeException coVariantMethod() {
		// TODO Auto-generated method stub
		return new RuntimeException();
	}
	
	@Override
	public void exceptionMethod() throws RuntimeException {
		System.out.println("Child Class exceptionMethod");
	}
	@Override
	void draw(int a, float b){
		System.out.println("Square");
	}
}
