package innerclasses;



public class AnonInnerInterface {

	public static void main(String[] args) {
	
Runnable r = new Runnable() {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("child thread");
			
		}
		
	}
};
		
Thread t = new  Thread(r);
t.setPriority(10);
t.start();

		
for (int i = 0; i <100; i++) {
	
	System.out.println("main thread");
}
Thread.currentThread().setPriority(1);
		
	}
}
