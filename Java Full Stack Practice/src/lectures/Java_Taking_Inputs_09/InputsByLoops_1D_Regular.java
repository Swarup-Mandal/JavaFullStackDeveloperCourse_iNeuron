package lectures.Java_Taking_Inputs_09;
import java.util.*;

public class InputsByLoops_1D_Regular {

	public static void main(String[] args) {
		
		// Taking marks from user and store it in array and Want to display n student's marks
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of Student: ");
		int size = scan.nextInt();	
		
		int [] arr = new int[size];  //crating 5 1d array  //array Index Out of bound for [5]
		
//		arr[0] = scan.nextInt();  //we don't do this apply loops here to take input 
//		arr[1] = scan.nextInt();
//		arr[2] = scan.nextInt();
//		arr[3] = scan.nextInt();
//		arr[4] = scan.nextInt();
		
//		for (int i = 0 ; i < 5 ; i++) {    //Taking input by loop
//			System.out.println("Please Enter 5 Student Marks : " + i);
//			arr[i]  = scan.nextInt();
//		}
//		
//		for (int i = 0 ;  i < 5 ; i++) {   //Displaing taking input by loop also
//			System.out.println("Marks of student : " +i);
//			System.out.println(arr[i] + " ");
//			
//		}
		
		for (int i = 0 ; i < arr.length ; i++) {    //Taking input by loop
			System.out.println("Please Enter 5 Student Marks : " + i);
			arr[i]  = scan.nextInt();
		}
		
		for (int i = 0 ;  i < arr.length ; i++) {   //Displaing taking input by loop also
			System.out.println("Marks of student : " +i);
			System.out.println(arr[i] + " ");
			
		}

		
		

	}

}
