package lectures.Assignments.Assignment4;

public class RemoveDupicatesFromString_1 {

	public static void main(String[] args) {
		// Q> 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
		
	//Approch 1----------------------->By indexOf();
		
		String s1 = "saaachhinnnn";
		String s2="";
		
		for (int i = 0 ; i<s1.length(); i++) {
			  char ch = s1.charAt(i);
			  if(s2.indexOf(ch) == -1) {
				  s2 = s2 + ch;
			  }
	    }
		System.out.println("(Approch-1)Old String is : "+ s1);
		System.out.println("New String without Duplicate is : " +s2);
		System.out.println();
		
	//Approch 2----------------------->By Converting Charecter Array
		
		char[] carr = s1.toCharArray();
		String s3="";
		for (int i = 0 ; i < carr.length; i ++) {
			
			boolean flag = false;
			for (int j = i+1 ; j<carr.length; j++) {
				if(carr[i] == carr[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				s3 = s3 + carr[i];
			}
		}
		System.out.println("(Approch-2)Old String is : "+ s1);
		System.out.println("New String without Duplicate is : " +s3);
		
		
		
	}

}
