package thread.one;

public class MyRunnable implements Runnable {

	Thread emp;
	
	@Override
	public void run() {
		try {
			emp.join();
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread" + emp.getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}

