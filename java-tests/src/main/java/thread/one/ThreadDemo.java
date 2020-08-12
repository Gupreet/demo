package thread.one;


class ThreadDemo{
	
	public static void main(String ar[]) throws InterruptedException {
		MyRunnable r = new MyRunnable();
	
    	r.emp=Thread.currentThread();
		
		
		Thread t1= new Thread(r);
		t1.start(); 
		//t1.join();
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread");
	}
		
	}
}
