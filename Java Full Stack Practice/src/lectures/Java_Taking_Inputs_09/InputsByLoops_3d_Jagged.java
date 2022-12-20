package lectures.Java_Taking_Inputs_09;

import java.util.Scanner;

public class InputsByLoops_3d_Jagged {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][][] arr = new int[3][][]; //2 colleges don,t know classes don't know student each
		arr [0]=new int[2][];
		arr [1]=new int[3][];
		arr [2]=new int[2][];
		
		arr [0] [0]=new int[2];
		arr [0] [1]=new int[3];
		
		arr [1] [0]=new int[2];
		arr [1] [1]=new int[2];
		arr [1] [2]=new int[3];
		
		arr [2] [0]=new int[3];
		arr [2] [1]=new int[2];
		
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
