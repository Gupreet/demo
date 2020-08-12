package thread_communication.deadlock;

public class Test extends Thread {

	ClassA a = new ClassA();
	ClassB b = new ClassB();

	private void m1() throws InterruptedException {
		this.start();
		a.d1(b);
	}

	@Override
	public void run() {
		try {
			b.d2(a);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		t.m1();
	}

}
