package com.dct.algorithimics;

public class Searching {

	public static void main(String[] args) {

		int unsortedArray[]= {1,67,23,90,12,32,65};
		//System.out.println("linear search result :"+linearSearch(unsortedArray, 23));
		
		int sortedArray[]= {9,12,23,34,45,56,67,68,89,90};
		System.out.println("binary search result :"+binarySearch(sortedArray, 0, sortedArray.length-1, 34));
		
	}

	private static int linearSearch(int arr[], int key) {
		
		for (int i = 0; i < arr.length; i++)
			if(key == arr[i])
				return i;

		return -1;
	}

	private static int binarySearch(int sortedArray[],int startIndex, int endIndex, int key) {
		if(startIndex>endIndex)return -1;

		int middleIndex = (startIndex+endIndex)/2;
		
		if (key == sortedArray[middleIndex])
		return middleIndex;
		
		else if(key< sortedArray[middleIndex] )
		return binarySearch(sortedArray, startIndex, middleIndex-1, key);
		
		else 
		return binarySearch(sortedArray, middleIndex+1, endIndex, key);
		
		
	}

}
