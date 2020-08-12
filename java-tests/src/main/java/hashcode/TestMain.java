package hashcode;

public class TestMain {

	public static void main(String[] args) {
		Test t = new Test(10);
		System.out.println(t +"---" +t.toString()+"---"+t.hashCode()) ;
		
		Test1 t1 = new Test1(10);
		System.out.println(t1 +"---" +t1.toString()+"---"+t1.hashCode()) ;
		

		Test3 t3 = new Test3(10);
		System.out.println(t3 +"---" +t3.toString()+"---"+t3.hashCode()) ;
	}
}
