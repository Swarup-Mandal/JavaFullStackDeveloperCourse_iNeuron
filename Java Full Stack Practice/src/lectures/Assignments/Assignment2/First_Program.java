package lectures.Assignments.Assignment2;

import java.util.Scanner;


public class First_Program {

	public static void main(String[] args) {
		
		//Q-1> WAP to find the duplicates present in an array
				
		@SuppressWarnings("resource")
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter The Array Element : ");
		
		   //For Taking array inputs from user 
		int[] a = new int[6            ];
		for(int k=0; k<a.length; k++) {		
			a[k]=input.nextInt();
		}
		
		
		for(int i=0; i<a.length ;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.print(a[j] + " ");
					}
			}
			
		}
		
	}
}