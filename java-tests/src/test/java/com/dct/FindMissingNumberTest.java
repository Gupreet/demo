package com.dct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.dct.series.FindMissingNumber;

public class FindMissingNumberTest {

	
	@Test
	public void missingNumberTest() {
		int[] arr= {1,2,4,5,6};
		Assertions.assertEquals(3, FindMissingNumber.findMissingNumber(arr));
	}
}
