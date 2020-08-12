package one;

public class QuickSortExample2 {

	public static void main(String[] args) {
    	int[] array ={6,5,8,3,10,15,12,16};
    	quickQort(0, array.length-1, array);
    	
    	for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
    	
	}
	
	public static void quickQort(int l,int h, int arr[]) {
		if(l<h)
		{
		 
		 int j=partition(l, h, arr);

		 quickQort(l, j, arr);
		 
		 quickQort(j+1, h, arr);
		 
		 
		}
		
	}
	
    public static int partition(int l,int h,int[] arr)
	{
    	
      int middle = l + (h - l) / 2;
      int pivot = arr[middle];
         
      /*int pivot = arr[l];*/
	  int i=l, j=h;	
	   
	  while(i<j)
	  {	
	  
	  do
	  i++;
	  while(arr[i]<pivot);
	  
	  do
      j--;
      while(arr[j]>pivot);
	  
	  if(i<j)
	  swap(arr, i, j);
	  
	  }
	  
	  swap(arr, l, j);
		
		   
	  return j;
	}
    
    
    public static void swap (int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    
}
