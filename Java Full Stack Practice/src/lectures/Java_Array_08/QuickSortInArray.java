package lectures.Java_Array_08;

public class QuickSortInArray {
	  
	 public static int partition(int[] arr,int low, int high) {
		 int pivot = arr[high];
		 int i = low-1;
		
		 for(int j = low ; j < high; j++) {
			 if(arr[j] < pivot) {
				 i++;
				 //swap
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
		 } 
		 
		 //Swap with pivot
		 i++;
		 int temp = arr[i];
		 arr[i]=arr[high];
		 arr[high]=temp;
		
	     return i;
    }
	
	public static void quickSort(int[]arr,int low,int high) {
	
		 if (low < high) {
			 
			int pivotIndex = partition(arr,low,high);  //it gives actual the pivot index position
			
			quickSort(arr, low , pivotIndex-1);
			quickSort(arr, pivotIndex + 1 ,high);
			
		 }
		 
	}
	
	 public static void main(String[] args) {
			
			// Q-2> WAP to sort an array using Quick Sort Algorithm. low to high
			
			  int[] arr = {6,3,9,5,2,8};
			
			  int n = arr.length;
			  quickSort(arr, 0, n-1);
			  
			  System.out.println("The Shorted Array (Quick Sort) : ");
			//Printing The Array
			  for(int elem : arr) {
				
				System.out.print(elem + " ");
			  }
			
		 }
	

}