package lectures.Java_Array_08;

import java.util.Scanner;

public class LinearSearchForArray {

	public static void main(String[] args) {
		//Array Initialization
		int[] ar = {10,50,30,40,20,70};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key Element you want to search : ");
		int keyElement = sc.nextInt() ;
		
		// Linear Search
		boolean  flag = false; //to creat a "key not found concept"
		for (int i = 0; i < ar.length ; i++) {
			if (keyElement == ar[i]) {
				System.out.println("Key " + keyElement + " found in Index : " + i);
				flag = true;
				break;
			}
		  //else {System.out.println("Key not Found");} //We can't add else{} inside a loop -> It will also run and print the else statement
		}
		//System.out.println("Key not Found"); //it will also print "Key not Found" for all the cases(true & false)
		if (flag == false) {
			System.out.println("Key not Found");
		}

	}

}
