package miscellenous;

public class MergeArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,6};
		int [] arr2= {3,4,6,7};
		
		merge(arr1, arr2, arr1.length, arr2.length);
		
	}
	public static void merge(int [] arr1,int [] arr2,int m,int n) {
		int i=0, j=0, k=0;
		int[] nArr=new int[m+n];
		
		/*int [] arr1= {1,2,6,9};
		int [] arr2= {3,4,7,10};
		*/
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) 
				nArr[k++]=arr1[i++];
			else 
				nArr[k++]=arr2[j++];
		}
		while(i<m) 
			nArr[k++]=arr1[i++];
		while(j<n)
			nArr[k++]=arr2[j++];
		
		for (int l = 0; l < nArr.length; l++)
			System.out.println(nArr[l]);
		
	}
	
}
