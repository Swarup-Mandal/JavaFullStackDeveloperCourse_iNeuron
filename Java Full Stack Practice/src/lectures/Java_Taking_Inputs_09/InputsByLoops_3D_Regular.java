package lectures.Java_Taking_Inputs_09;

import java.util.Scanner;

public class InputsByLoops_3D_Regular {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][][] arr = new int[2][3][3]; //2colleges 3 classes 4 student each
		
		for (int i= 0 ; i<arr.length ; i++ ) {
			for (int j = 0; j < arr[i].length ; j++) {
				for(int k = 0 ; k < arr[i][j].length ; k++) {
				System.out.println("Enter Marks of College " +i + " Class "+j + " Student " +k +":");
				arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for (int i= 0 ; i<arr.length ; i++ ) {
			for (int j = 0; j < arr[i].length ; j++) {
				for(int k = 0 ; k < arr[i][j].length ; k++) {
//				System.out.println("Marks of College " +i + " Class "+j + " Student " +k +":");
				System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
