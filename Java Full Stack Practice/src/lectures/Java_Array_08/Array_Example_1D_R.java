package lectures.Java_Array_08;

import java.util.Arrays;

public class Array_Example_1D_R {

	public static void main(String[] args) {
		//Syntax type 1
		int[] arr = {1,2,3,4,5,6}; //Array Initialization & Declaration    //only integer type array
		float[] ar = {3.5f, 54.3f, 45.78f, 43.0f };   //only floting type array
		System.out.println(arr);    //if we print directly this it gives  => [I@3fee733d
		System.out.println(ar);    //if we print directly this it gives  =>  [F@5acf9800
		
		//so we have to use Arrays.toString to get output as Array {output => [1, 2, 3, 4, 5, 6]
		System.out.println(Arrays.toString(arr));
		
		//Syntax type 2
		int [] brr = new int [5];  //take marks of 5 student os a class
		brr [0] = 3;   //Array Initialization happening
		brr [1] = 4;
		brr [2] = 7;
		brr [3] = 10;
		brr [4] = 30;
		
		System.out.println(brr[0]);  
		System.out.println(brr[1]);
		System.out.println(brr[2]);
		System.out.println(brr[3]);
		System.out.println(brr[4]);
		
		System.out.println("brr = [" + brr[0] +", " + brr[1] +", " + brr[2] +", "+ brr[3] +", " +brr[4] +"]");
		System.out.println(Arrays.toString(brr));
	}

}
