package innerclasses;

class Outer  { 
	// Simple nested inner class 
	class Inner{ 
		public void show() { 
			System.out.println("In a nested class method"); 
		} 
	}
	
	public void m1() {
		new Inner().show();
	}
	}  

