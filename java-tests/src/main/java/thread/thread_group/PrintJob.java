package thread.thread_group;

public class PrintJob implements Runnable {

	String name;
	
	public PrintJob(String name) {
		this.name=name;
	}
	@Override
	public void run() {
     System.out.println(".....job started by "+Thread.currentThread().getName()+" for "+name);
     
     try {
    	 Thread.sleep(5000);
     }catch (InterruptedException e) { }
	  System.out.println(".....job completed by "+Thread.currentThread().getName());
	}

}
