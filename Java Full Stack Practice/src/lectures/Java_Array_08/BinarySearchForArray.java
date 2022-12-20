package lectures.Java_Array_08;

import java.util.Scanner;

public class BinarySearchForArray {

	public static void main(String[] args) {
		int[] bs = {10,20,30,40,50,60,70,80,90,};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entern the Key Element for Binary Search : ");
		int key = sc.nextInt();
		
		int low = 0 ;
		int high = bs.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(key == bs[mid]) {
				System.out.println("Key " +key+ " found at index : " + mid);
				break;
			}
			else if (key < bs[mid]) {
				high = mid-1;
				
			}
			else if (key > bs[mid]) {
				low = mid + 1;
			}
		}
		if (low > high) {
			System.out.println("Key not Found");
		}
		
	}

}
