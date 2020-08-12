package miscellenous;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SteamMapExample {

//	public static void main(String[] args) {
		/*List<Integer> values=Arrays.asList(1,2,3,4,6,8,7);
		
		
		System.out.println(
				values.stream()
				      .filter(e -> e > 3)
				      .filter(e -> e % 2 == 0)
				      .map(e -> e * 2)
				      .findFirst()
				      .orElse(0));
		
		*/

//	}
	public static int totalValues(List<Integer> values, Predicate<Integer> selector) {
	    return values.stream()
	                //.filter(selector)
	                 .mapToInt(e -> e)
	                 .sum();
	  }
	  
	  public static void main(String[] args) {
	    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
	    
	    System.out.println(totalValues(values, e -> true));
	    System.out.println(totalValues(values, SteamMapExample :: isEven));
	    System.out.println(totalValues(values, SteamMapExample :: isOdd));
	    System.out.println(totalValues(values, e -> e > 3));
	  
	  }
	  
	  public static boolean isEven(int number) {
	    return number % 2 == 0;
	  }

	  public static boolean isOdd(int number) {
	    return number % 2 != 0;
	  }
	
	
}
