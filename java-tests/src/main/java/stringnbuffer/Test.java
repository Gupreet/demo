package stringnbuffer;

public class Test {
public static void main(String[] args) {
	OwnMutable o1 = new OwnMutable(10);
	OwnMutable o2 = new OwnMutable(100);
	OwnMutable o3 = o1.modify(10);
	System.out.println(o1 ==  o2);
	System.out.println(o1 ==  o3);	
}
}
