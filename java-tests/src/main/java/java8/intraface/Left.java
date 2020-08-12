package java8.intraface;

public interface Left {
default void m1() {
	System.out.println("Left default implementation");
}

}
