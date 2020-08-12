package com.dct.book;

public class _ {
	public static void main(String[] args) {
		/*String a="nfdsesdfn";
		char c[]=a.toCharArray();
		boolean isP=false;
		int right = c.length-1;
		int left =0;
		for(left=0; left!=right; left++,right--) {
			isP=c[left]==c[right];
			if(!isP)
				break;		
		}
		if(!isP){
			System.out.println("Not");			
		}
		else {
			System.out.println("Yes");
		}*/		
	
	
	int valToFind=71;
	int arr[]= {2,12,14,25,37,45,52,62,71,82};
	findNumber(arr, valToFind);
	
	}
	
	private static void findNumber(int arr[], int valToFind) {
		int first = 0;
		int last = arr.length - 1;
		//int mid = (first + last) / 2;
		while (first <= last) {
			int mid = (first + last) / 2;
			
			if (valToFind > arr[mid]) {
				first = mid + 1;
			} else if (valToFind < arr[mid]) {
				last = mid - 1;
			} else {
				System.out.println("found at :" + mid);
				break;
			}

			

		}
		

	}
}


