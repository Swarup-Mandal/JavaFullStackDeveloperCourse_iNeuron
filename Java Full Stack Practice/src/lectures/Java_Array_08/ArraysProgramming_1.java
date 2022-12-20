package lectures.Java_Array_08;

import java.util.Arrays;

public class ArraysProgramming_1 {

	public static void main(String[] args) {
		//Reversing Array by only for loop 
		 System.out.println();
		 int[] brr = {10,20,30,40};
		 for (int i = brr.length-1 ; i>=0 ; i--) {
			 System.out.print(brr[i] + " ");
		 }
		 
       //Write a program to get every alternative value of an array
		 System.out.println();
		 int[] brr1 = {10,20,30,40,50,60,70,80,90,99,100};
		 for (int i = 0; i<=brr1.length ; i++) {
			 System.out.print(brr1[i] + " ");
			 i++;
			 //i++;
		 }
		 
		 System.out.println();
		 
	//getClass(); getName(); hashcode();				 
		 int[] ar = new int [5]; //(1D Array) don't have to creat a separate class for int[]. internally java use a class which is preasent in java we as adeveloper can't use it directly
		 System.out.println(ar.hashCode());
		 System.out.println(ar.getClass().getName()); //Output -> [I (name of the 1d array)
		 
		 float[] ar2 = new float [4]; //(1D Array)
		 System.out.println(ar2.hashCode());
		 System.out.println(ar2.getClass().getName()); //Output -> [F (name of the 1d array)
		 
		 char[] ar3 = new char [4]; //(1D Array)
		 System.out.println(ar3.hashCode());
		 System.out.println(ar3.getClass().getName()); //Output -> [C (name of the 1d array)
		 
		 double[] ar4 = new double [4]; //(1D Array)
		 System.out.println(ar4.hashCode());
		 System.out.println(ar4.getClass().getName()); //Output -> [F (name of the 1d array)
		 
		 
		 int[][] ar1 = new int [5][];   //2D array
		 System.out.println(ar1.getClass().getName()); //Output - > [[I (name of 2d ARRAY)
		 
	//	 Demo[] d = new Demo[5];  /C.E -> creat Demo class first 
		 
	//Arrays class and its staic method example
		 
		 //Array.sort();
		 int b[] = {30,70,40,50,10,60,20,80,100,90};
		 System.out.println("Before Sort : " + Arrays.toString(b));
		 Arrays.sort(b);
		 System.out.println( "After  Sort : " + Arrays.toString(b));
		 
		//Array.fill(a,5);
		 int b1[] = new int[5];
		      // for (int i = 0; i< b1.length ; i++ ) {  //By normal for loop
			  //       b1[i] = 4;
		      // }
		      //System.out.println( "After  filling all indexes with value 4 : " + Arrays.toString(b1));
		      
		      Arrays.fill(b1,7); //By Arrays.fill();
		      System.out.println(Arrays.toString(b1));
		      
		      
		      
    // P.Q> WAP to get sum of all the element of the array
		      int[] c = {10,20,30,40};
		      int sum = 0;
		      for (int i = 0; i<c.length ; i ++) {
		    	  sum = sum +c[i];
		    	  //sum+= c[i];
		      }
		      System.out.println("The Sum is : "+ sum);
		      
    // P.Q> WAP to get sum of all the element of the array
		      int[] d = {25,30,40,70,10};
		      int max = d[0];
		      for (int i = 0; i<d.length ; i ++) {
		    	  if (d[i] > max) {
		    		  max = d[i];
		    	  }
		      }
		      System.out.println("The Max value is : "+ max);
		      
		      int min = d[0];
		      for (int i = 0 ; i<d.length; i++) {
		    	  if(d[i] < min) {
		    		  min = d[i];
		    	  }
		    	  
		      }
		      System.out.println("The Min value is : "+min);
		
    // P.Q> WAP to copy one array element to another array
		      
		      int[] arr1 = new int[]{25,30,40,70,10}; //initializing array 
		      int[] arr2 = new int[arr1.length]; //creat another array(arr2) with size of arr1
		      for (int i = 0; i<arr1.length ; i ++) { //Copying all element of one array into another
		    		  arr2[i] = arr1[i];
		      }
		    
	         //Displaying elements of array arr1     
             System.out.println("Elements of original array: "); 
             
             for (int i = 0; i < arr1.length; i++) {     
                  System.out.print(arr1[i] + " ");    
             }     
        
             System.out.println();    
        
            //Displaying elements of array arr2     
              System.out.println("Elements of new array: ");    
              for (int i = 0; i < arr2.length; i++) {     
                   System.out.print(arr2[i] + " ");    
              }     
		 
		 
              
	}

}
