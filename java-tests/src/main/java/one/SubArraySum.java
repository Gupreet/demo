package one;

/*

Given an unsorted array of integers, find a subarray which adds to a given number. If there are more than one subarrays with the sum as the given number, print any of them.

We have discussed a solution that do not handles negative integers here. In this post, negative integers are also handled.

A simple solution is to consider all subarrays one by one and check if the sum of every subarray is equal to the given sum or not. The complexity of this solution would be O(n^2).

An efficient way is to use a map. The idea is to maintain the sum of elements encountered so far in a variable (say curr_sum).
Let the given number is the sum. Now for each element, we check if curr_sum – sum exists in the map or not. If we found it in the map that means,
we have a subarray present with the given sum, else we insert curr_sum into the map and proceed to the next element.
If all elements of the array are processed and we didn’t find any subarray with the given sum, then subarray doesn’t exist.
*/
import java.util.HashMap;

public class SubArraySum {

 

	public static void subArraySum(int[] arr, int n, int sum) { 
		//cur_sum to keep track of cummulative sum till that point 
		int cur_sum = 0; 
		int start = 0; 
		int end = -1; 
		HashMap<Integer, Integer> hashMap = new HashMap<>(); 

		for (int i = 0; i < n; i++) { 
			cur_sum = cur_sum + arr[i]; 
			//check whether cur_sum - sum = 0, if 0 it means 
			//the sub array is starting from index 0- so stop 
			if (cur_sum - sum == 0) { 
				start = 0; 
				end = i; 
				break; 
			} 
			//if hashMap already has the value, means we already 
			// have subarray with the sum - so stop 
			if (hashMap.containsKey(cur_sum - sum)) { 
				start = hashMap.get(cur_sum - sum) + 1; 
				end = i; 
				break; 
			} 
			//if value is not present then add to hashmap 
			hashMap.put(cur_sum, i); 

		} 
		// if end is -1 : means we have reached end without the sum 
		if (end == -1) { 
			System.out.println("No subarray with given sum exists"); 
		} else { 
			System.out.println("Sum found between indexes "
							+ start + " to " + end); 
		} 

	} 

	// Driver code 
	public static void main(String[] args) { 
		int[] arr = {10, 2, 2, 20, 10}; 
		int n = arr.length; 
		int sum = 22; 
		subArraySum(arr, n, sum); 

	} 
} 
