package lectures.Java_Array_08;

import java.util.Scanner;


public class DuplicateInArray {

	public static void main(String[] args) {
		
		//Q-1> WAP to find the duplicates present in an array
				

		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter The Array Element : ");
		
		   //For Taking array inputs from user 
		int[] a = new int[6];
		for(int t=0; t<a.length; t++) {		
			a[t]=input.nextInt();
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