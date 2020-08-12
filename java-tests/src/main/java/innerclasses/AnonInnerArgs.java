package innerclasses;

public class AnonInnerArgs {
public static void main(String[] args) {
	
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("cccc");
			
		}
	}).start();
	
}
}
