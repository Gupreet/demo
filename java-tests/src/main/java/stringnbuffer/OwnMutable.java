package stringnbuffer;

/*
OwnMutable o1 = new OwnMutable(10);
OwnMutable o2 = new OwnMutable(100);
OwnMutable o3 = o1.modify(10);
System.out.println(o1 ==  o2); false
System.out.println(o1 ==  o3); true
*/
final public class OwnMutable {
	
	private int i;

	public OwnMutable(int i) {
		super();
		this.i = i;
	}

	public OwnMutable modify(int i) {
		if(this.i == i)
			return this;
		else
			return new OwnMutable(i);
	}
	
}
