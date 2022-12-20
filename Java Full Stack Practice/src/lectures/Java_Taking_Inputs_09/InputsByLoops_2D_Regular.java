package lectures.Java_Taking_Inputs_09;
import java.util.*;

public class InputsByLoops_2D_Regular {

	public static void main(String[] args) {
		int [][] arr = new int[3][4]; //3 classes 4 student each
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
