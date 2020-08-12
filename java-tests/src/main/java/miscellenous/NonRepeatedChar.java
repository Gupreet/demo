package miscellenous;

public class NonRepeatedChar {

	
	public static void main(String[] args) {
		int [] arr = {9,2,4,2};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) { 
				if((i != j) && arr[i]==arr[j])
				break;
				
				
				if(j == arr.length-1)
					System.out.println(arr[i]);	
				
			}
			
			
		}
		
	}
}
