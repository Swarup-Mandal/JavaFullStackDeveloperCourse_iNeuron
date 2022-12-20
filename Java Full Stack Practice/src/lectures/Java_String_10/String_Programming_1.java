package lectures.Java_String_10;

public class String_Programming_1 {

	public static void main(String[] args) {
	// WAP to Copy One String Element to another String
		String s1 = "iNeuron";
		String s2 = "";
		for ( int i = 0 ; i < s1.length(); i++) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("First String : " +s1);
		System.out.println("Copy of first String is : "+s2);
		System.out.println();
		
	//WAP to covert LowerCase to UpperCase and UpperCase to LowerCase
		//Normal Concept
		char ch = 'a';
		System.out.println("small : "+ch);//a(97) => 97 - 32 =65(A )
		ch = (char)('a' - 32);
		System.out.println("To Uppercase : "+ch); //it gives A
		
		//lowerCase to UpperCase
		String s3 = "ineuron";
		String s4 = "";
		for ( int i = 0 ; i < s3.length(); i++) {
			s4 = s4 + (char) (s3.charAt(i)-32); //Explicit type casting
		}
		System.out.println("LowerCase String : " +s3);
		System.out.println("LowerCase to UpperCase String is : "+s4);
		
		//UpperCase to LowerCase
		String s5 = "";
		for ( int i = 0 ; i < s4.length(); i++) {
			s5 = s5 + (char) (s4.charAt(i)+32); //Explicit type casting
		}
		System.out.println("UpperCase String : " +s4);
		System.out.println("UpperCase to LowerCase String is : "+s5);
		System.out.println();
		
	//WAP to Convert InEUrOn to iNeuRoN
		String s6 = "InEU@rOn";
		String s7 = "";
		for ( int i = 0 ; i < s6.length(); i++) {
			if(s6.charAt(i) >= 'a' && s6.charAt(i) <= 'z') {
			s7 = s7 + (char) (s6.charAt(i)-32); //for LowerCase
			}
			else if (s6.charAt(i) >= 'A' && s6.charAt(i) <= 'Z'){
				s7 = s7 + (char) (s6.charAt(i)+32);
			}
		}
		System.out.println("String : " +s6);
		System.out.println("Coverted String is : "+s7);
		System.out.println();
		
	//WAP to Reverse a>iNeuron => norueNi, b> ineuron java => avaj morueni, 
		                                                 //c> iNeuron Java = Java iNeuron
		//a>iNeuron => norueNi
		String t = "iNeuron";
		String t1 = "";
		for ( int i = t.length()-1 ; i >= 0; i--) {
			t1 = t1 + t.charAt(i); //Explicit type casting
		}
		System.out.println("a) Original String : " +t);
		System.out.println("Reversed String is : "+t1);
		
		//b1> ineuron java => avaj morueni
		String t2 = "ineuron java"; //You can do Same as above 
		String t3 = "";
		for ( int i = t2.length()-1 ; i >= 0; i--) {
			t3 = t3 + t2.charAt(i); //Explicit type casting
		}
		System.out.println("b1) Original String : " +t);
		System.out.println("Reversed String is : "+t1);
		         //OR
		
		//b2> ineuron java => avaj morueni
		String t4 = "ineuron java"; //You can do split this and store into charrArray
		String t5 = "";             //(By For-Each Loop)You can do split this and store into charrArray
		String[] sarr = t4.split(" ");
		for (String elem : sarr) {
			for(int i = elem.length()-1 ; i >= 0; i--) {
				t5 = t5 + elem.charAt(i); //Explicit type casting
			}
			t5 = t5 + " ";
		}
		System.out.println("b2) Original String : " +t4);
		System.out.println("Reversed String is by (for-each loop) : "+t5);
		
		//b3> ineuron java => avaj morueni
		String t6 = "ineuron java"; //(By Nested For Loop)You can do split this and store into charrArray
		String t7 = "";             //For-each loop can't start from sar[1]
		String[] sar = t6.split(" ");
		for (int i = sar.length-1 ; i >= 0; i--) {
			for(int j = sar[i].length()-1 ; j >= 0; j--) {
				t7 = t7 + sar[i].charAt(j); //Explicit type casting
			}
			t7 = t7 + " ";
		}
		System.out.println("b2) Original String : " +t6);
		System.out.println("Reversed String is (by normal nested for loop) : "+t7);
		
		
		//c> iNeuron java => java iNeuron
		String t8 = "iNeuron java"; //(By Nested For Loop)You can do split this and store into charrArray
		String t9 = "";             //For-each loop can't start from ar[1]
		String[]  ar= t8.split(" ");
		for (int i = ar.length-1  ; i >= 0; i--) {
			for(int j = 0 ; j < ar[i].length(); j++) {
				t9 = t9 + ar[i].charAt(j); //Explicit type casting
			}
			t9 = t9 + " ";
		}
		System.out.println("b2) Original String : " +t8);
		System.out.println("Reversed String is (by normal nested for loop) : "+t9);
	}

}
