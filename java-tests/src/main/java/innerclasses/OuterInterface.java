package innerclasses;

import innerclasses.OuterInterface.InnerInterface;

public interface OuterInterface {

	void m1();
	
	interface InnerInterface{
		
		
		
		void m2();
	}
}
class Test1 implements OuterInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Test2 implements OuterInterface.InnerInterface{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	
}