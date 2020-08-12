package thread.thread_group;

public class MyThread extends Thread {
	
	public MyThread(ThreadGroup g, String name) {
		super(g,name);
	}
	
	@Override
	public void run() {
		try {
		
		Thread.sleep(5000);
		}catch (InterruptedException e) {}
	}

}
