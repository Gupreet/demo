package hashcode;

public class Test3 {

	int i;
	public Test3(int i) {
		this.i=i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
	
	@Override
	public int hashCode() {
		return i;
	}
}
