package lectures.Assignments.Assignment4;

import java.util.Scanner;

public class CountConsVowelsSpecChar_4 {

	public static void main(String[] args) {
		//Q> 4. WAP to count the number of consonants, vowels, special characters in a String.
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a word : ");
		String s1 = sc.nextLine();
		
		s1=s1.toLowerCase();
		
		int countVowels = 0, countCons = 0, countSpace = 0, countDigits = 0, countSymbols = 0;
		for (int i = 0; i<s1.length() ; i++) {
			char ch = s1.charAt(i);
			
			 // check if character is any of a, e, i, o, u
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countVowels++;	
			}
			
			// check if character is in between a to z
			else if (ch >= 'a' && ch <= 'z' ) {
				countCons++;
			}
			
			 // check if character is a white space
			else if (ch == ' ') {
				countSpace++;
			}
			
			// check if character is in between 0 to 9
			else if (ch >= '0' && ch <= '9') {
				countDigits++;
			}
			
			//check for Others Symbols like !@#$%^&*()_+
			else {
				countSymbols++;
			}
		}
		System.out.println("The Sentence is : "+s1);
		System.out.println("In this sentence : ");
		System.out.println("Total Vowels : "+countVowels);
		System.out.println("Total  Consonents : "+countCons);
		System.out.println("Total Digits : "+countDigits);
		System.out.println("Total Spaces : "+countSpace);
		System.out.println("Total Others Symbols : "+countSymbols);
		
		
		
		


	}

}
