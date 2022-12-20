package lectures.Assignments.Assignment4;

import java.util.Arrays;

public class MaximumOccurenceInAString_8 {
	
	//Method to find Maximum Occurring Character
	   static char maxOccurringChar(String str) {
	      char ans = str.charAt(0);
	      int i, curr_freq = 0, max_freq = 0;
	      for (i = 1; i < str.length(); i++) {
	         if (str.charAt(i) == str.charAt(i - 1)) {
	            curr_freq++;
	         } 
	         else {
	            if (max_freq < curr_freq) {
	               max_freq = curr_freq;
	               ans = str.charAt(i - 1);
	            }
	            curr_freq = 0;
	         }
	      }
	      if (max_freq < curr_freq) {
	         max_freq = curr_freq;
	         ans = str.charAt(i - 1);
	      }
	      return ans;
	   }

	   public static void main(String[] args) {
	      String str = "ineurooon";
	      //convert to character array
	      char charArr[] = str.toCharArray();
	      //sort the character array
	      Arrays.sort(charArr);
	      //sorted character array converted back to string
	      str = new String(charArr);
	      System.out.println("Maximum Occurring Character is " + maxOccurringChar(str));
	   }
	
}
