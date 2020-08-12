package knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class KnapSackMain {

	public static void main(String[] args) {
		
		int [] value = {6,2,1,8,3,5};
		int [] weight = {6,10,3,5,1,3};
		
		
		List<FractionalKnapsackItem> items=new ArrayList<FractionalKnapsackItem>();
		
		for (int i = 0; i < weight.length; i++) {
			items.add(new FractionalKnapsackItem(i+1, value[i], weight[i]));
		}
		
		items=items.stream()
		           .sorted((i1, i2) -> i2.getRatio() < i1.getRatio() ?-1 : 0)
		           .collect(Collectors.toList());
		
		
		System.out.println("**************\nAFTER  SORTING\n**************");
		items.stream()
		     .forEach(System.out::println);
		
		int capacity =14;
		double knapsackVal=0;
		for(FractionalKnapsackItem item : items) {
		if(item.getWeight()<=capacity) {
			capacity=capacity-item.getWeight();
			knapsackVal=knapsackVal+item.getValue();
		}
		else {
			knapsackVal=knapsackVal+capacity*item.getRatio();
	    	break;	
		}
		
		
			
			
		}
		
		System.out.println(knapsackVal);
		
		
		
		
	}
	
	

}
