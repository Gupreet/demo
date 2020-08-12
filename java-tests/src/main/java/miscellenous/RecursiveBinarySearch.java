package miscellenous;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int [] a = {3,7,11,25,67,99};
		
		System.out.println(rBinarySearch(a, 0, a.length-1, 11));
		
		
	}
	
	static int rBinarySearch(int [] arr, int l, int h, int key){
		
		if(l==h) {
			if(arr[l] == key)
			return l;
			else
			return -1;
		}
		else {
			int middle=l+h/2;
			if(key == arr[middle])
			return middle;
			else if(key>arr[middle])
				l=middle+1;
			else
				h=middle-1;
			
			rBinarySearch(arr,l,h,key);
			
		}
		
		
		
		return -1;
	}
	
	
	
}
