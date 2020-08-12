package java8.intraface;

import java.util.function.Predicate;

public class PredicateExample {

	
	public static void main(String[] args) {
		int arr[] = {4,3,23,21,45,54};
		
		Predicate<Integer> p = i->i%2==0;
		Predicate<Integer> isGreaterThann10 = i -> i>10;
		
		for (int j = 0; j < arr.length; j++) {
			
			//System.out.println("IS EVEN For "+arr[j] +"::"+ p.test(arr[j]));
			//System.out.println("IS isGreaterThann10 For "+arr[j] +"::"+ isGreaterThann10.test(arr[j]));
			
			//System.out.println("IS NOT isGreaterThann10 For "+arr[j] +"::"+ isGreaterThann10.negate().test(arr[j]));
			
			//IS isGreaterThann10 and even 
			if(isGreaterThann10.and(p.negate()).test(arr[j])) {
				System.out.println(arr[j]);
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
}
