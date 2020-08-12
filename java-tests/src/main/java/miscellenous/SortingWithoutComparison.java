package miscellenous;

public class SortingWithoutComparison {



	static void sortArr(int arr[], int n, int min, int max) 
	{ 
		// Count of elements in given range 
		int m = max - min + 1; 

		// Count frequencies of all elements 
		int[] c = new int[m]; 
		for (int i = 0; i < n; i++) 
		{ 
			c[arr[i] - min]++; 
		} 

		// Traverse through range. For every 
		// element, print it its count times. 
		for (int i = 0; i < m; i++) 
		{ 
			for (int j = 0; j < c[i]; j++) 
			{ 
				System.out.print((i + min) + " "); 
			} 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int arr[] = {10, 10, 1, 4, 4, 100, 0}; 
		int min = 0, max = 100; 
		int n = arr.length; 
		sortArr(arr, n, min, max); 
	} 
} 

