package thread_communication.deadlock;

public class ClassB {

	public synchronized void d2(ClassA a) throws InterruptedException {
		System.out.println("Thread two start execution of ClassB d1");

		Thread.sleep(3000);

		System.out.println("Thread two trying to call A's last method");

	}

	public synchronized void last() {
		System.out.println("inside ClassB last Method");
	}
}
