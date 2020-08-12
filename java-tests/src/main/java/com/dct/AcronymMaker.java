package com.dct;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

public class AcronymMaker {

	private static final List<String> STOP_WORDS = Arrays.asList("AND", "OR", "BY", "OF");
	
	public String acronym(final String input) {
		
	if(input.isEmpty()) throw new RuntimeException("Input is Empty");
	
	return Arrays.stream(input.toUpperCase().split("\\s"))
				.filter(word-> !STOP_WORDS.contains(word))
				.map(w->String.valueOf(w.charAt(0)))
				.collect(joining(""));
	}
	
	
}
