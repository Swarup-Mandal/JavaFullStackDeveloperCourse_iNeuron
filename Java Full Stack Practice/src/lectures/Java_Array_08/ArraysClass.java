package lectures.Java_Array_08;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// Arrays class examples
		//ex:1
		int [] a = new int [4];
		for (int elem:a) 
		{
			System.out.print(elem);   //0,0,0,0
		}
		
		Arrays.fill(a, 5);
		System.out.println();
		
		for (int elem:a) 
		{
			System.out.print(elem);   //5,5,5,5
		}
		
		System.out.println();
		
		//ex:2
		int[] ar = {1,2,0,0,0,4,5};
		Arrays.fill(ar, 2, 5, 10);
		for (int elem:ar) 
		{
			System.out.print(elem + " ");   //1,2,10,10,10,4,5
		}
		
		System.out.println();
		
		//ex:3
		int[] arr = {30,20,50,80,60,14,5};
		Arrays.sort(arr);
		for (int elem:arr) 
		{
			System.out.print(elem + " ");   //5 14 20 30 50 60 80 
		}
		System.out.println();
		
		//i-ex:4
				int[] arr1 = {20,30,50,10,25,60};
				int res = Arrays.binarySearch(arr1,25 ); //if your array is unsorted or 
				System.out.println(res);                 //out of array which value you give to find it Follows a Formula
				                                         //**Formula => - (Index + 1)
				
			System.out.println();
	    //ii-ex:4
			    Arrays.sort(arr1); //now sorting previous array then
			    for (int elem:arr1) 
				{
					System.out.print(elem + " ");   //10 20 25 30 50 60
				}
			  System.out.println();
			    
				int res1 = Arrays.binarySearch(arr1,25); //it  gives 2 as out put
				System.out.println(res1);
				
              System.out.println();
			    
				int res2 = Arrays.binarySearch(arr1,15); //it  gives -2 as out put(negative)
				System.out.println(res2);
				
				
		

	}

}
