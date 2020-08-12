package com.dct.algorithimics;

import java.util.Random;

public class QuickSelect {

	private int[] nums;
	
	
	public QuickSelect(int[] nums) {
		super();
		this.nums = nums;
	}

	public int select(int k) {
		return select(0,nums.length-1,k-1);
	}
	private int select(int firstIndex,int lasIndex,int k) {
		
	  int pivot=partition(firstIndex,lasIndex);
	  
	  if(pivot>k)
		  return select(firstIndex, pivot-1, k);
	  else if(pivot < k)
		  return select(pivot+1, lasIndex,k);
	  
	  return nums[k];
	
	}
	
    private int partition(int firstIndex, int lasIndex) {
		int pivot= new Random().nextInt(lasIndex-firstIndex+1)+firstIndex;
		swap(lasIndex, pivot);
		
		for (int i = firstIndex; i <lasIndex; ++i) {
			if (nums[i]>nums[lasIndex]) {
				swap(i, firstIndex);
				firstIndex++;
			}
			
		}
		swap(firstIndex, lasIndex);
	
    return firstIndex; 
    }

	private void swap(int i,int j) {
    	int temp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=temp;
    }
}
