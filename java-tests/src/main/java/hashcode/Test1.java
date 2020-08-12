package hashcode;

public class Test1 {

	int i;
	
	public Test1(int i) {
	this.i=i;
	}
	
	@Override
	public int hashCode() {
	 return i;
	}
}
