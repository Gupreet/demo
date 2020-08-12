package com.dct.series;

public class MajorityElement {

	
	public static void main(String[] args) {
		int[] arr={4, 4, 2, 4, 3, 5, 4};
		
		System.out.println(findMajorityElement(arr));
	}	
	
	public static int findMajorityElement(int[] arr) {
		int maxCount = 0;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		if (maxCount > arr.length / 2)
			return arr[index];

		return -1;
	}
}
