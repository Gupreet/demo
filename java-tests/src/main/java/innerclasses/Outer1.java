package innerclasses;

public class Outer1 {
 
int x =10;
	// Simple nested inner class 
		class Inner {
			int x =100;
			public void show() {
				int x =1000;
				System.out.println(x+"----"+this.x+"----"+Outer1.this.x); 
			} 
		}
		
		public void m1() {
			new Inner().show();
		}
		}  



