package lectures.Java_Taking_Inputs_09;

import java.util.Scanner;

public class InputsbyLoops_2D_Jagged {

	public static void main(String[] args) {
		int [][] arr = new int[3][]; //3 classes don't know student each
		
		arr[0] = new int [3];  //jagged array diclaration
		arr[1] = new int [2];
		arr[2] = new int [4];
		
		Scanner scan = new Scanner(System.in);
		for (int i= 0 ; i<arr.length ; i++ ) {
			for (int j = 0; j < arr[i].length ; j++) {
				System.out.println("Enter Marks of Class " +i + " student "+j + " :");
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		for (int i= 0 ; i<arr.length ; i++ ) {
			for (int j = 0; j < arr[i].length ; j++) {
				System.out.println("Marks of Class " +i + " student "+j + " :");
				System.out.println(arr[i][j]);
				
			}
			
		}
		
		

	}

}
