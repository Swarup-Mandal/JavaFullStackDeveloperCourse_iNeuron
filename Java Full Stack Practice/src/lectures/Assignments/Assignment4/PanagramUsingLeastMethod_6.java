package lectures.Assignments.Assignment4;

public class PanagramUsingLeastMethod_6 {

	public static void main(String[] args) {
        String s5 = "The Quick Brown Fox Jumps Over The Lazy Dog";
		
		s5 = s5.replace(" ", "");
		
		s5 = s5.toUpperCase();
		
		char[] ch = s5.toCharArray();
		
		int[] ar = new int[26];//for 26 letter in english we creat a empty array of length 26.and array gives all the index default value of 0
		
		boolean flag = false;
		for (int i=0; i<ch.length; i++) {
			int index = ch[i] - 65; // T=84 ascii value, 84-65 = 19, the place of T should be in 19 index 
		    ar[index]++; //it go to arr[19] the do a ++ means => previous default value was 0++ --> 1
		}
		for (int i = 0 ; i < ar.length; i++) {
			if (ar[i] == 0) {
				System.out.println("This is not a Panagram");
				flag = true;
				break;
			}
//			else {
//				System.out.println("This is not Panagram"); //you cant create a else statement inside a loop,use flag
//			}
		}
		if(flag == false) {
			System.out.println("This is a Panagram");
		}
		 

	}

}
