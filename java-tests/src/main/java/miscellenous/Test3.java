package miscellenous;

public class Test3 {

	public static void main(String[] args) {
		
		String s="my my name is not so gud so";
		//char[] c = s.toCharArray();
		String[] c=s.split(" ");
		int count=1;
		
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
			if(c[i].equalsIgnoreCase((c[j]))) {
				count =count+1;
				c[j]="0";	
			}
			
				
			}
			
			if(!c[i].equals("0")) {
				System.out.println(c[i] +" : "+count);
				count=1;
			}
			
			
			
		}
		
		
		
		
	}

}
