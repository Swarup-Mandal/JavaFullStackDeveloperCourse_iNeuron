package lectures.Java_String_10;

import java.util.Arrays;

public class String_Programming_2 {

	public static void main(String[] args) {
	// WAP of PALINDRAM in String ex: Check NITIN
		String s = "NITIN";
		String s1 = "";
		for (int i = s.length()-1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("This is a Palindram");
		}
		else {
			System.out.println("This is not a Palindram");
		}
		System.out.println();
		
	// WAP of ANAGRAM in String ex:- Care and racE
		String s2 = "Care";
		String s3 = "racE";
		
		s2 =s2.replace(" " , ""); //removing Space
		s3 =s3.replace(" " , "");
		
		s2 =s2.toLowerCase();  //converting to lower case
		s3 =s3.toLowerCase();
		
		char[] ch = s2.toCharArray();
		char[] ch1 = s3.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch,ch1)) {
			System.out.println("This is a Anagram");
		}
		else {
			System.out.println("This is not a Anagram");
		}
		System.out.println();

	//WAP for PANAGRAM Checking
		String s4 = "The Quick Brown Fox jumps Over The Lazy Dog ";
		
		s4 = s4.replace(" ", "");
		
		s4 = s4.toUpperCase();
		
		char[] chrr = s4.toCharArray() ;
		
		boolean flag = false;
		int[] arr = new int[26];
		for(int i = 0; i < chrr.length ; i++) {
			int index = chrr[i] - 65; //T(84)  => 84-65 = 19 is the exact position of T
			arr[index]++; //here, arr[19] = index value by difaul 0. the by arr[19]++ => 0 --> 1++ -->2++
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				System.out.println("This is not a PANGRAM");
				flag = true;
			}
		}
		if(flag==false) {
			System.out.println("This is PANGRAM");
		}
		
	}

}
