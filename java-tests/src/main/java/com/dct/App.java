package com.dct;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	int arr[]= {10,15,3,7};
    	int k=10;
    	
    	for (int i = 0; i < arr.length; i++) {
			
    		for (int j = i+1; j < arr.length; j++) {
    			
    			if((arr[i]+arr[j]) == k) {
    				System.out.println(arr[i]+" :: "+arr[j]);
    				return;
    			}
			}
    		
    		
		}
    	
    	
    	
    }
}
