package thread_communication;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
	ThreadB b= new ThreadB();
	b.start();
	
	System.out.println("Main going to wait");
	synchronized (b) {
		b.wait();			
	}
	
	System.out.println("Main got notification");
		
	System.out.println("Result: "+b.total);
	}
}
