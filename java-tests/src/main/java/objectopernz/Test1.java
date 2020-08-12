package objectopernz;

public class Test1 {
public static void main(String[] args) {
	Student s1 = new Student("gurpreet", 101);
	Student s2 = new Student("gurpreet", 101);
	
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
}
}
