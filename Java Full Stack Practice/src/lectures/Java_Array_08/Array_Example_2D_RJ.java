package lectures.Java_Array_08;

import java.util.Arrays;

public class Array_Example_2D_RJ {

	public static void main(String[] args) {
		
	//Syntax Type 1 (X)
		int[][] ar = { {1,2}, {4,7,8} , {8,8,9,7} }; //Taking marks of 3 classes 2,3,4,student respectivly classwise
		//You Can also Create Regular and Jagged array
		System.out.println(Arrays.deepToString(ar));
		
	//Syntax Type 2
		
	//2D Array Regular Array(Means Have same value on indexes [3][2] or [3][3] [4][3]  )
		
		int [][] brr = new int [3][2];
		brr [0][0] = 3;
		brr [0][1] = 4;
		
		brr [1][0] = 7;
		brr [1][1] = 10;
		
		brr [2][0] = 7;
		brr [2][1] = 10;
		
		System.out.println(Arrays.deepToString(brr));  //To print 2D or 3d or 4d array as indexes.
		//Array.toString() not work here. it gives only addresses of the arrays
		
		
	//2D Array Jagged Array(Means Have irregular value on indexes [3][] or [3][] [4][]  )
		
		int [][] arr = new int [3][];  //leave Blank the Row Part.(if you have deferent rows on diff. diff. coloum indexes.)
		
		//Declaration
		arr [0] = new int[3];
		arr [1] =new int[2];
		arr [2] = new int[4];
		
		//Initialization
		arr [0][0] = 4;   //done for arr[0][0,1,2]
		arr [0][1] = 10;
		arr [0][2] = 6;
		
		arr [1][0] = 7;   //done for arr[1][0,1,]
		arr [1][1] = 11;
		
		
		arr [2][0] = 4;   //done for arr[2][0,1,2,3]
		arr [2][1] = 10;
		arr [2][2] = 8;
		arr [2][3] = 6;
		
		System.out.println(Arrays.deepToString(arr));  //To print 2D or 3d or 4d array as indexes.
		//Array.toString() not work here. it gives only addresses of the arrays
		
	}

}
