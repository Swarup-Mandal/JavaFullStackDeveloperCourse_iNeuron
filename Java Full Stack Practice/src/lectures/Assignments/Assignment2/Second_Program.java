package lectures.Assignments.Assignment2;

public class Second_Program {

	  public static void main(String[] args) {
		
		// Q-2> WAP to sort an array using Quick Sort Algorithm. low to high
		
		  int[] a = {17,8,20,16,7,19,6,10,14,13};
		
		  int n = a.length;
		  Second_Program sp = new Second_Program();
		  sp.quickSort(a, 0, n-1);
		  System.out.println("The Shorted Array (Quick Sort) : ");
		
		  for(int elem : a) {
			
			System.out.print(elem + " ");
		  }
		
	 }
	
	  
	 int partition(int[] a,int low, int high) {
		 int pivot = a[(low+high)/2];
		
		 while(low<=high) {
			
			  while(a[low]<pivot) {
				low++;
			  }
			  while(a[high]>pivot) {
				high--;		
			  }
			
			  if(low<=high) {
				int temp = a[low];
				a[low]=a[high];
				a[high]=temp;
			
			    low++;
			    high--;
			 }
		} 
		 
	    return low;
    }
	
	void quickSort(int[]arr,int low,int high) {
		 int z = partition(arr,low,high);
		 if(low < z-1) {
			quickSort(arr,low,z-1);
		 }
		 if(z < high) {
			quickSort(arr,z,high);
		 }
	}
	

}