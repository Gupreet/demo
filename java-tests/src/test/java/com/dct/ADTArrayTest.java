package com.dct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dct.ds.ArrayADT;

public class ADTArrayTest {

	ArrayADT arrayADT;
	
	@BeforeEach
	void init() {
		arrayADT = new ArrayADT(12);
	}
	
	//@Test
	void checkCapacity() {
		assertEquals(12, arrayADT.length());
	}
	
	//@Test
	void checkSize() {
		arrayADT.add(12);
		arrayADT.add(14);
		arrayADT.add(16);
		arrayADT.add(17);
		arrayADT.add(21);
		arrayADT.add(22);
		System.out.println("Before :");
		arrayADT.display();
		arrayADT.reverse();
		System.out.println("After :");
		arrayADT.display();
		
		assertEquals(6, arrayADT.size());
	}
	
	//@Test
	void testSum() {
		arrayADT.add(12);
		arrayADT.add(14);
		arrayADT.add(16);
		
		Assertions.assertAll(
				()->assertEquals(42, arrayADT.sumWithStream()),
				()->assertEquals(arrayADT.sum(),arrayADT.sumWithStream()));
	}
	
	//@Test
	void testMax() {
		arrayADT.add(12);
		arrayADT.add(18);
		arrayADT.add(16);
		assertEquals(18, arrayADT.max());
		
	}

	//@Test
	void testSearch() {
		arrayADT.add(12);
		arrayADT.add(14);
		arrayADT.add(16);
		arrayADT.add(17);
		arrayADT.add(21);
		arrayADT.add(22);
		arrayADT.display();
		System.out.println(arrayADT.search(21));
		assertEquals(4, arrayADT.search(21));
		
	}
	
	@Test
	void testMissingElement() {
		int[] arr= {1,3,6,7,8,9,12,15,18,23};
		int [] hash=new int[10];
		int total=21;
		
		for (int i = 0,j=arr.length-1; i<j;) {
		if(arr[i]+arr[j] == total) { 
			System.out.println("pairs are :"+arr[i]+" :: "+arr[j]);
			
			i++;
			j--;
		}
		else if(arr[j] > (total -arr[i])) j--;
		else if(arr[i] < (total -arr[j])) i++;
			
		
		
			
			
		}
		
			
		
		assertTrue(true);
	}
	
	
	
	
	
}
