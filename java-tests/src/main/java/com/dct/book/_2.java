package com.dct.book;

public class _2 {

	public static void main(String[] args) {
	int [] arr = {0,1,0,1,0,1,0,1};
	int r=arr.length-1;
	int l=0;
	/*for (int l = 0; l < r; l++,r--) {
		
		if(arr[l] == 1)
			
	}*/
	
	while(l<r) {
		
		if(arr[l] == 0) 
			l++;
		else if(arr[r] == 1)
			r--;
		else {
			/*int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;*/
		}
		
		
		
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
		
	}
}
