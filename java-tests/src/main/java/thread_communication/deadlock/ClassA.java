package thread_communication.deadlock;

public class ClassA {

	public synchronized void d1(ClassB b) throws InterruptedException {
		System.out.println("Thread one start execution of ClassA d1");

		Thread.sleep(3000);

		System.out.println("Thread one trying to call B's last method");

	}

	public synchronized void last() {
		System.out.println("inside ClassA last Method");
	}
}
