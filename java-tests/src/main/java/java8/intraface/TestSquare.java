package java8.intraface;

public class TestSquare {
	
	public static void main(String[] args) {
		Square s=(int x)->x*x;
		System.out.println(s.calculate(12));
	}

}
