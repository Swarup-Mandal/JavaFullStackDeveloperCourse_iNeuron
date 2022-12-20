package lectures.Assignments.Assignment2;

public class Fourth_Program {

		//Q-4> WAP to sort an array using Merge Sort Algorithm.
		
		    static void swap(int[] arr, int i, int j){
			   
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		  
		    
		    static int partition(int[] arr, int low, int high){
		        int pivot = arr[high];
		  
		        int i = (low - 1);
		  
		        for (int j = low; j <= high - 1; j++) {
		  
		            if (arr[j] < pivot) {
		                i++;
		                swap(arr, i, j);
		            }
		        }
		        
		        swap(arr, i + 1, high);
		        return (i + 1);
		    }
		
		    
		    static void mergeSort(int[] arr, int low, int high){
		        if (low < high) {

		            int pi = partition(arr, low, high);

		            mergeSort(arr, low, pi - 1);
		            mergeSort(arr, pi + 1, high);
		        }
		    }
		  
		    
		    static void printArray(int[] arr, int size)
		    {
		        for (int i = 0; i < size; i++)
		            System.out.print(arr[i] + " ");
		  
		        System.out.println();
		    }
		  
		 
    public static void main(String[] args){
		 int[] arr = { 1,3,7,2,6,5,9,8,66,76,45,30,43,36,88,99,106,66,0,56,-2,-23,-12 };
		 int n = arr.length;
		  
		 mergeSort(arr, 0, n - 1);
		 System.out.println("The Sorted array(by Merge Short): ");
		 printArray(arr, n);
    }

}


