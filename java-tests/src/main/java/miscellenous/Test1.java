package miscellenous;

public class Test1 {

	void testMethod(Car c) {
		c.name="changed name";
		
	}
	
	public static void main(String[] args) {
	Car c = new Car();
	c.model="2000";
	c.name="car name";
	
	new Test1().testMethod(c);
	System.out.println(c);
	
      } 
}
