package java8.intraface;

public class InterfaceDefaultTest implements Left,Right {

	@Override
	public void m1() {
		Right.super.m1();
	}

	
	

}
