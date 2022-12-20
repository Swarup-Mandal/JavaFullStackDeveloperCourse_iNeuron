package lectures.Assignments.Assignment4;

public class PrintDuplicatesInString_2 {

	public static void main(String[] args) {
		// Q> 2. WAP to print Duplicates characters from the String.
			
		    String s1 = "saaachhhinn";
			char[] carr = s1.toCharArray();
			
	        System.out.println("String is : "+s1);
	        System.out.println("Length : "+s1.length());
	        System.out.println("Duplicates are : ");
			int count = 0; 
			for (int i = 0 ; i < carr.length; i ++) {
				count = 1;
				for (int j = i+1 ; j<carr.length; j++) {
					if(carr[i] == carr[j] && carr[i] != ' ') {
						count++;
						carr[j] = 0;
					}
				}
				if (count > 1 && carr[i] != 0) {
					System.out.print(carr[i] + " ");
				}
			}
			

	}

}
