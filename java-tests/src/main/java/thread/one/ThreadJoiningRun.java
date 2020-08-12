package thread.one;

public class ThreadJoiningRun {

	public static void main (String[] args) 
	{ 

		// creating two threads 
		ThreadJoining t1 = new ThreadJoining(); 
		t1.setName("t1");
		
		ThreadJoining t2 = new ThreadJoining(); 
		t2.setName("t2");
		
		ThreadJoining t3 = new ThreadJoining(); 
		t3.setName("t3");
		
		// thread t1 starts 
		t1.start();
		

		// starts second thread after when 
		// first thread t1 has died. 
		try
		{ 
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName()); 
			t1.join(); 
		} 

		catch(Exception ex) 
		{ 
			System.out.println("Exception has " + 
								"been caught" + ex); 
		} 

		// t2 starts 
		t2.start(); 

		// starts t3 after when thread t2 has died. 
		try
		{ 
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName()); 
			t2.join(); 
		} 

		catch(Exception ex) 
		{ 
			System.out.println("Exception has been" + 
									" caught" + ex); 
		} 

		t3.start(); 
	} 
}