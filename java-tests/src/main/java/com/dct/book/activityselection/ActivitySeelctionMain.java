package com.dct.book.activityselection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActivitySeelctionMain {
public static void main(String[] args) {
	
	ArrayList<Activity> activityList = new ArrayList<Activity>();
	activityList.add(new Activity("A1", 0, 6));
	activityList.add(new Activity("A2", 3, 4));
	activityList.add(new Activity("A3", 1, 2));
	activityList.add(new Activity("A4", 5, 8));
	activityList.add(new Activity("A5", 5, 7));
	activityList.add(new Activity("A6", 8, 9));
	
	System.out.println(" ****** USER GIVEN INPUT ****** ");
	activityList.forEach(System.out::println);
	
	System.out.println();
	System.out.println(" ****** AFTER SORTING ****** ");
	List<Activity> activitySortedList=
	activityList.stream()
	            .sorted((o1,o2)-> {
	            	return o1.getFinishTime()-o2.getFinishTime();
	            })
	            .collect(Collectors.toList());
	            //.forEach(System.out::println);
	
	activitySortedList.forEach(System.out :: println);
	
	System.out.println();
	System.out.println(" ****** FINAL RESULT ****** ");
	Activity previousActivity = activitySortedList.get(0);
	for (int i = 1; i < activitySortedList.size() ; i++) {
		Activity activity = activitySortedList.get(i);
		//if job's start time is greater than equal previous job's finish time then print job
		if (activity.getStartTime() >= previousActivity.getFinishTime()) {
			System.out.println(activity);
			previousActivity = activity;
		}
	}
	
	
	
}
}
