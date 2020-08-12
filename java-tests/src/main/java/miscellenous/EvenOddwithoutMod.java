package miscellenous;

public class EvenOddwithoutMod {

	
	public static void main(String[] args) {
		
		
		int i=103;
		
		boolean b= true;
		for (int j = 0; j < i; j++) 
			b=!b;
			
		
		if(b)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
		
	}
	
}
