package override;

public class Test1 {
public static void main(String[] args) {
	Parent1 p = new Parent1();
	//p.m1(1);
	
	Child1 c = new Child1();
	//c.m1();
	
	Parent1 p1 = new Child1();
	p1.m1(1);

	Child1 c2 = (Child1)p1;
	//c2.m2("a");
	
	p1.methodHidingStatic();
}
}
