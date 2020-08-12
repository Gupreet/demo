package innerclasses;

public class AnonInner {

	
	public static void main(String[] args) {/*
		
		Thread t = new Thread() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
				
			}
			
		
			
		};
		
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Method");
		}
		throw new MyException();*/
		
		MyAbstract ma = new MyAbstract() {
			
			@Override
			void add(int num1, int num2) {
				// TODO Auto-generated method stub
				
			}
		};
		
	
	}
	
}
