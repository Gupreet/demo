package thread_communication;

public class ThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {

		System.out.println("child thread starts Execution");
		for (int i = 0; i < 100; i++) {
			total += i;
		}
		System.out.println("child thread giving notification");
		synchronized (this) {
			this.notify();
		}

	}

}
