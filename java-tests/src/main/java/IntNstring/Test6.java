package IntNstring;

public class Test6 {
public static void main(String[] args) {
	String s1 = new String("xyz");
	String s2 = s1.concat("abc");
	String s3 = s2.intern();
	
	System.out.println(s2==s3);
	
	String s4 = "xyzabc";
	
	System.out.println(s3==s4);
	
	
}
}
