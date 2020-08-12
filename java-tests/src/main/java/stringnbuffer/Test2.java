package stringnbuffer;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 ="abc";
		String s4 ="abc";
		
		System.out.println("String :");
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
		System.out.println("");
		System.out.println(s1==s2);System.out.println("");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println("");
		System.out.println("StringBuffer :");
		
		StringBuffer sb1 = new StringBuffer("sb");
		StringBuffer sb2 = new StringBuffer("sb");
		System.out.println(sb1.equals(sb2));System.out.println("");
		System.out.println(sb1==sb2);System.out.println("");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
	}
}
