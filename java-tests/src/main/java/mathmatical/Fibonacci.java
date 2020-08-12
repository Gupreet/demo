package mathmatical;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100, t1 = 0, t2 = 1;
        
      
       
        System.out.println(naiveFibonacci(5));
        
       /* System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");
            
            int sum = t1 + t2;
            
            
            t1 = t2;
       
            
            t2 = sum;
        }
    */
    }
    
    
    public static int naiveFibonacci(int n) {
        
    	if(n<=1) return n;
    	
    	return naiveFibonacci(n-1) + naiveFibonacci(n-2);
    }
    
 }