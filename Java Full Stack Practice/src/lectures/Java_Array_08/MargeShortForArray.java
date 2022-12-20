package lectures.Java_Array_08;

public class MargeShortForArray {
	
	//Q-4> WAP to sort an array using Merge Sort Algorithm.
	public static void conqure (int arr[], int si, int mid, int ei) {
		int[] marged = new int [ei-si+1]; //creating a new marged array with new memory  
		
		int indx1 = si;  //tracking first array which will marged
		int indx2 = mid+1; //tracking second array indexes which will marged
		int x = 0; //marged array's index tracking with x
		
		while(indx1 <= mid && indx2 <= ei) {  // when,we are compairing 2 sub array
			if(arr[indx1] <= arr[indx2]) {  //here, indx 1 is small and indx2 is big ,compairing index 1 and index 2 elements
				marged[x++] = arr[indx1++];
			}
			else {
				marged[x++] = arr[indx2++]; //else here, indx2 is small and indx1 is big
			}
		}
		
		while(indx1 <= mid) {  //if only, any 1 sub array completed, left only one sub array to sort, any one will false in this loop or below while loop
			marged[x++] = arr[indx1++];
		}
		
		while(indx2 <= ei) {    //if only, any 1 sub array completed, left only one sub array to sort
			marged[x++] = arr[indx2++];
		}
		
		for (int i = 0, j =si;i<marged.length; i++ , j++) {  //now, we have to copy our marged array  into our Original array.
				arr[j] = marged[i];	
		}
	}
	
	public static void divide(int arr[], int si, int ei) {
		
		if (si >= ei) {   //when single index reached or array dividing part totally end
			return;
		}
		
		int mid = si + (ei-si)/2; // (si+ei)/2  // finding middile point of array
		
		divide (arr, si , mid);  //2nd time divide method call  ,it will continuously run  until getting single element separately
		divide (arr, mid+1, ei); //3rd time divide method call, it will continuously run  until getting single element separately
		
		conqure (arr, si, mid, ei); //4th method call (conqure 1)
		
	}
	
	public static void main(String[] args) {
		int [] arr = {38,27,43,3,9,82,10};   //my Array
		int n = arr.length; 
		
		divide (arr, 0,n-1);  //1st method call (divide 1)
		
		// original Array Printing
		
		for (int i = 0; i <n ; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}
}
		
//		    static void swap(int[] arr, int i, int j){
//			   
//		        int temp = arr[i];
//		        arr[i] = arr[j];
//		        arr[j] = temp;
//		    }
//		  
//		    
//		    static int partition(int[] arr, int low, int high){  //2nd method strt here
//		        int pivot = arr[high];
//		  
//		        int i = (low - 1);
//		  
//		        for (int j = low; j <= high - 1; j++) {
//		  
//		            if (arr[j] < pivot) {
//		                i++;
//		                swap(arr, i, j);
//		            }
//		        }
//		        
//		        swap(arr, i + 1, high);
//		        return (i + 1);
//		    }
//		
//		    
//		    static void mergeSort(int[] arr, int low, int high){ //1st method call by main method
//		        if (low < high) {
//
//		          int pi = partition(arr, low, high); //2nd another method call store partition value in --> pi
//
//		            mergeSort(arr, low, pi - 1);
//		            mergeSort(arr, pi + 1, high);
//		        }
//		    }
//		  
//		    
//		    static void printArray(int[] arr, int size)
//		    {
//		        for (int i = 0; i < size; i++)
//		            System.out.print(arr[i] + " ");
//		  
//		        System.out.println();
//		    }
//		  
//		 
//    public static void main(String[] args){
//		 int[] arr = { 1,3,7,2,6,5,9,8,66,76,45,30,43,36,88,99,106,66,0,56,-2,-23,-12 };   //my array
//		 int n = arr.length;
//		  
//		 mergeSort(arr, 0, n - 1); //Start --> final marege sort method call 
//		 System.out.println("The Sorted array(by Merge Short): ");
//		 printArray(arr, n);
//    }

// }


