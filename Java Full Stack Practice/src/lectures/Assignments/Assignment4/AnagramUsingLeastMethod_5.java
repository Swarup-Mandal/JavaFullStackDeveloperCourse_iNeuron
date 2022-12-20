package lectures.Assignments.Assignment4;

import java.util.Arrays;

public class AnagramUsingLeastMethod_5 {

	public static void main(String[] args) {
		//Q> 5. WAP to implement Anagram Checking least inbuilt methods being used.

		String s1 = "A gentle Man";
		String s2 = "Elegant Man";
		
	    //replacing all the spaces with no space
		String s3 = "";
		String s4 = "";
	     for(int i=0;i<s1.length();i++){
	         if(s1.charAt(i)==' ')
	         {
	                 continue;
	         }else{
	             s3 = s3 + s1.charAt(i);
	         }
	     }
	     
	     for(int i=0;i<s2.length();i++){
	         if(s2.charAt(i)==' ')
	         {
	                 continue;
	         }else{
	             s4 = s4 + s2.charAt(i);
	         }
	     }
	    
		
	   //making all in lowerCase both
	     String s5 = "";
		 String s6 = "";
		 for (int i = 0 ; i < s3.length(); i++ ) {
				if(s3.charAt(i) >= 97 && s3.charAt(i)<=122) {  // you can give a and z also 
					s5= s5  + s3.charAt(i);
				}
				else if(s3.charAt(i) >= 'A' && s3.charAt(i)<= 'Z')
				{
					s5= s5 + (char) (s3.charAt(i)+32);//String concatination happend here for value of i(0) =>s2 =  "" + S
				}
		 }
		 for (int i = 0 ; i < s4.length(); i++ ) {
				if(s4.charAt(i) >= 97 && s4.charAt(i)<=122) {  // you can give a and z also 
					s6= s6  + s4.charAt(i);
				}
				else if(s4.charAt(i) >= 'A' && s4.charAt(i)<= 'Z')
				{
					s6= s6 + (char) (s4.charAt(i)+32);//String concatination happend here for value of i(0) =>s2 =  "" + S
				}
		 }
		
		char[] chh = s5.toCharArray();  //putting in an char type Array. .toCharArray()  is used for cnovert String to char type array
		char[] chh1 = s6.toCharArray();
		
		//sorting array
		for (char i = 0; i < chh.length ; i++) {
			for (char j = 1; j < chh.length-i ; j++) {
				if (chh[j] < chh[j-1]) {
					char tempVar = chh[j];
					chh[j] = chh[j-1];
					chh[j-1] = tempVar;
				}
			}
		}
		for (char i = 0; i < chh1.length ; i++) {
			for (char j = 1; j < chh1.length-i ; j++) {
				if (chh1[j] < chh1[j-1]) {
					char tempVar = chh1[j];
					chh1[j] = chh1[j-1];
					chh1[j-1] = tempVar;
				}
			}
		}
		
		//equals array
		if(Arrays.equals(chh, chh1)) {  
			System.out.println("It is a Anagram");	
		}
		else {
			System.out.println("It is not a Anagram");
		}
		
		System.out.println();

	}

}
