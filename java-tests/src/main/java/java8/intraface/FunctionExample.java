package java8.intraface;

import java.util.function.Function;

public class FunctionExample {

	
public static void main(String[] args) {
	String arr[] ={"abn  d","s  ds sd","wec df"};
	Function<String, String> f=s->s.replaceAll(" ","");
	Function<String, Integer> f1=s->(s.length()-s.replaceAll(" ", "").length());
	
	for (String s : arr) 	
		System.out.println(f.apply(s)+"    "+f1.apply(s));
	
	
		
		
	

}	
	
}
