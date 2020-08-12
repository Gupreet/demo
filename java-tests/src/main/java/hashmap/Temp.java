package hashmap;

public class Temp {

	@Override
	public String toString() {
			return "temp";
	}
	
	@Override
	protected void finalize() throws Throwable {
	System.out.println("calling finalize method");
		super.finalize();
	}
	
}
