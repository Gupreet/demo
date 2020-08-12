package com.dct.ds;

import java.util.Arrays;

public class ArrayADT {
	 int[] elementData;
	 private int size;
	 private static final int DEFAULT_CAPACITY = 10;
	 
	 
	 public ArrayADT() {
		this.elementData= new int[DEFAULT_CAPACITY];
	 }
	 
	 public ArrayADT(int intialCapacity) {
	 
		 if(intialCapacity <= 0 || intialCapacity>100)
			 throw new IllegalArgumentException("Illegal Capacity :"+intialCapacity);
		 else 
			 this.elementData= new int[intialCapacity];	 
		 
	 }
	 
	 public int size() {
		 return this.size;
	 }
	 
	 public int length() {
		 return this.elementData.length;
	 }
	 
	 public void add(int element) {
		 if(this.size<this.elementData.length) 
			 this.elementData[size++]=element;
		 
	 }
	 
	 public void add(int element,int index) {
		 
		 if(index<0 || index>this.size) 
			 throw new ArrayIndexOutOfBoundsException(outOfBoundsMsg(index));
		 else {
			 for(int i=this.size; i>index; i--) 
				 this.elementData[i]=this.elementData[i-1];
			 
			 this.elementData[index]=element;
			 this.size++;
			 
		 }
		 
		 
	 }
	public void reverse() {
		for (int i = 0,j=this.size-1; i<j; i++,j--) 
				swap(i, j);
			
		
	} 
	public void display() {
		 for (int i = 0; i < size; i++) 
			System.out.println(this.elementData[i]);	
	}
	
	public int search(int key) {
		int i=0;
		int j=this.size-1;
		int mid;
		
		while(i<=j) {
			mid=i+j;
			mid=mid/2;
					
			if(key == this.elementData[mid]) 
		    	return mid;	
			else if(key<this.elementData[mid]) 
				j=mid-1;
			else 
				i=mid+1;
		}
		
		
		return -1;
	}
	
	public int sum() {
		int sum=0;
		for (int i = 0; i <= size-1; i++) {
			sum += this.elementData[i];
		}
		return sum;
	}
	public int sumWithStream() {
		return Arrays.stream(this.elementData).sum();
	}
	
	public int max() {
		int max=0;
		for (int i = 0; i <= size-1; i++) {
			
			if(this.elementData[i]>max) 
				max=this.elementData[i];
			
		}
		return max;
	}
	
	 
	private String outOfBoundsMsg(int index) {
	        return "Index: "+index+", Size: "+this.size;
	}
	 
	private void swap(int i,int j) {
		int temp=this.elementData[i];
		this.elementData[i]=this.elementData[j];
		this.elementData[j]=temp;
	}
	 
	 
	
	

}
