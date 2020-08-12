package lambda;

public class Test {

	public static void main(String[] args) {
/*		InterfOne i =s ->  s.length();
		System.out.println(i.m1("gurpreet"));*/
		
		InterfOne i=(a,b) -> System.out.println(a+b);
		i.m1(10, 20);
	}
}
