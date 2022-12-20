package lectures.Java_Array_08;

import java.util.Arrays;

public class Array_Example_3D_RJ {

	public static void main(String[] args) {
		//Syntax Type 1 (X)
				int[][][] ar = {{ {1,2,3}, {4,7,8}} , {{8,8,9} , {4,7,8} }}; //Taking marks of 2 colleges 2 classes 3 student each
				int[][][] ar1 = {{ {1,2}, {4,7,8}} , {{8,8,9} , {4,7,8,5} }};//Taking marks of 2 colleges 2 classes 2,3 & 3,4  student respectively class wise
				//You Can also Create Regular and Jagged array
				System.out.println(Arrays.deepToString(ar));
				System.out.println(Arrays.deepToString(ar1));
				
			//Syntax Type 2
				
			//3D Array Regular Array(Means Have same value on indexes [3][2][2] or [3][3][4],  [4][3][4]  )
				
				int [][][] brr = new int [3][2][3]; //3 colleges 2 classes 3 student each
				brr [0][0][0] = 3;
				brr [0][0][1] = 4;
				brr [0][0][2] = 5;
				brr [0][1][0] = 6;
				brr [0][1][1] = 3;
				brr [0][1][2] = 4;
				
				
				brr [1][0][0] = 4;
				brr [1][0][1] = 3;
				brr [1][0][2] = 9;
				brr [1][1][0] = 7;
				brr [1][1][1] = 4;
				brr [1][1][2] = 8;
				
				brr [2][0][0] = 6;
				brr [2][0][1] = 4;
				brr [2][0][2] = 5;
				brr [2][1][0] = 6;
				brr [2][1][1] = 3;
				brr [2][1][2] = 8;
				
				System.out.println(Arrays.deepToString(brr));  //To print 2D or 3d or 4d array as indexes.
				//Array.toString() not work here. it gives only addresses of the arrays
				
				                                                  //          (2,3,2)    ((2,3) , (3,4,20 , (3,2))       
			//3D Array Jagged Array(Means Have irregular value on indexes [3]   []                 []   
				
				int [][][] arr = new int [3][][];  //leave Blank the Row Part.(if you have deferent rows on diff. diff. coloum indexes.)
				
				//Declaration
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
				
				
				
				//Initialization
				arr [0][0][0] = 4; //done for arr [0][0][4,5]
				arr [0][0][1] = 5;
				
				arr [0][1][0] = 5;  //done for arr[0][1][5,7,3]
				arr [0][1][1] = 7;
				arr [0][1][2] = 3;
				
				
				
				arr [1][0][0] = 4; //done for arr [1][0][4,6]
				arr [1][0][1] = 6;
				
				arr [1][1][0] = 7; //done for arr [1][1][7,5]
				arr [1][1][1] = 5;
				
				arr [1][2][0] = 5;  //done for arr[1][2][5,7,3]
				arr [1][2][1] = 7;
				arr [1][2][2] = 3;
				
				
				
				arr [2][0][0] = 4; //done for arr [2][0][4,6,3]
				arr [2][0][1] = 6;
				arr [2][0][2] = 3;
				
				arr [2][1][0] = 7; //done for arr [2][1][7,5]
				arr [2][1][1] = 5;
				
				System.out.println(Arrays.deepToString(arr));  //To print 2D or 3d or 4d array as indexes.
				//Array.toString() not work here. it gives only addresses of the arrays
				
           
	}

}
