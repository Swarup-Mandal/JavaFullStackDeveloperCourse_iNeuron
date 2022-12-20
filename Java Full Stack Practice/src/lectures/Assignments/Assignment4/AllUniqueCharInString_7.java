package lectures.Assignments.Assignment4;

import java.util.*;

public class AllUniqueCharInString_7 {
	
	public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+is_Unique_str(str));
	}		

}
