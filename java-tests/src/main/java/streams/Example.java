package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import objectopernz.Student;

public class Example {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1); l.add(31); l.add(14); l.add(16); l.add(17); l.add(18); l.add(19);
		System.out.println("UnsortedList :: "+l);
		/*List<Integer> l1 = new ArrayList<Integer>();
		for (int i : l) {
		if(i%2 == 0) l1.add(i);
		}
		System.out.println(l1);
		*/
		
		/*List<Integer> l1=l.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println("List One  :"+ l1);	
		
		List<Integer> l2=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("List Two  :"+l2);	*/
		
		
	/*	List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("a", 1));
		studentList.add(new Student("e", 5));
		studentList.add(new Student("b", 2));
		studentList.add(new Student("d", 4));
		studentList.add(new Student("c", 3));
		
		System.out.println(studentList);
		
		
		List<Student> pList =studentList.stream().filter(s->s.getRollno()%2==0).collect(Collectors.toList());*/
		
		
	
/*		List<Student> fList=studentList.stream().map(s->{
			s.setRollno(s.getRollno()+10);
			return s;
		}).collect(Collectors.toList());
		System.out.println(fList);*/			
				
		List<Integer> sortedList=l.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		
		//System.out.println(" sorted List :: "+sortedList);
		//System.out.println("Max :"+l.stream().max((i1,i2)->i1.compareTo(i2)).get());
		/*
		for(Integer g : l.stream().toArray(Integer[] ::new)) {
			System.out.println(g);
		}
		*/
		
		
		
		
		
		
		
		
		
		
	}
	
}
