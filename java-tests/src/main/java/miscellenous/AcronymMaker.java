package miscellenous;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class AcronymMaker {
	private static final List<String> STOP_WORDS = Arrays.asList("AND", "OR", "BY", "OF");
	
	public static String acronym(final String input) {
	return Arrays.stream(input.toUpperCase().split("\\s"))
				.filter(word-> !STOP_WORDS.contains(word))
				.map(w->String.valueOf(w.charAt(0)))
				.collect(joining(""));
	}
	
}
