package lectures.Java_Array_08;

public class ForEachLoop {

	public static void main(String[] args) {
		//1D For-each Loop
		 int[] arr = {10,20,30,40};
		   for (int elem : arr) {
			   System.out.print(elem+ " ");
		   }
		   
		System.out.println();
		System.out.println();
		
		 //2D For-each Loop
			int[][] a = {{10,20},{30,40,50},{60,70,80,90}};
			   for (int ar[] : a) {
				   for (int elem: ar) {
					   System.out.print(elem+ " ");
				   }
				   System.out.println();
			   }
			   System.out.println();
			   
		//3D For-each Loop
		    int[][][] a1 = {{{10,20},{30,40,50}},{{60,70,80,90}, {24,45}}};
				 for (int ar[][] : a1) {
					 for (int ar1[] : ar) {
					     for (int elem: ar1) {
						   System.out.print(elem+ " ");
					     }
					     System.out.println();
					 }
				 }
				 
				 
			//Reversing Array by only for loop  by For-each it's not possible
				 System.out.println();
				 int[] brr = {10,20,30,40};
				 for (int i = brr.length-1 ; i>=0 ; i--) {
					 System.out.print(brr[i] + " ");
				 }
				 
		    //Write a program to get every alternative value of an array by For-each it's not possible
				 System.out.println();
				 int[] brr1 = {10,20,30,40,50,60,70,80,90,99,100};
				 for (int i = 0; i<=brr1.length ; i++) {
					 System.out.print(brr1[i] + " ");
					 i++;
					 //i++;
				 }

	}

}
