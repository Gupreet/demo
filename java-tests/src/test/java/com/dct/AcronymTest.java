package com.dct;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AcronymTest {
	 
	AcronymMaker acronymMaker;
	
	@BeforeAll
	static void start() {
		System.out.println("inside @BeforeAll");
	}
	
	@BeforeEach
	void init() {
		System.out.println("inside @BeforeEach");
		acronymMaker = new AcronymMaker(); 
		
	}
	

	@Test
	public void multipleAcronym() throws Exception {
		System.out.println("inside @Test multipleAcronym()");
		Assertions.assertAll(
				() -> Assertions.assertEquals("IIMC", acronymMaker.acronym("India Is My Country")
		));
		  		  
	}
	

	
	
	@AfterEach
    void afterEach() {
        System.out.println("inside @AfterEach");
    }

    @AfterAll
    static void close() {
        System.out.println("inside @AfterAll");
    }
}
