package override;

public class Test2 {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.m1();
		
		Child2 c = new  Child2();
		c.m1();
		
		Parent2 p1 = new Child2();
		p1.m1();//Early binding
		
    	System.out.println(p1.x);//late binding    	
    	p1.m2(0);//this not overriding, this is overloading concept--late binding
		
    	
	}
}
