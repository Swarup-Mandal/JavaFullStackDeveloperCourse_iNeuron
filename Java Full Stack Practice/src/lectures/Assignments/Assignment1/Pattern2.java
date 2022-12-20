package lectures.Assignments.Assignment1;

public class Pattern2 {

	public static void main(String[] args) {
		// For Question No: 3 (pattern)
		
//		*******************
//		********* *********
//		********   ********
//		*******     *******
//		******       ******
//		*****         *****
//		****           ****
//		***             ***
//		**               **
//		*                 *
//		*                 *
//		*                 *
//		*                 *
//		*                 *
//		*                 *
//		*******************

		
		int n = 19;
		
		for(int i = 0 ; i<n ; i++) {
			
			for(int j = 0; j<n ; j++) {
				
				if(i==0 || j==0 || j==(n-1) || i==(n-1)   //i==(3*n/26)
					|| i+j<=(n-1)/2 
					|| j-i>=(n-1)/2 )
				{
				System.out.print("*");
			    }
			    else 
			    {
				System.out.print(" ");
			    }
			}
			
			System.out.println();
		}
		
		
	}
}



	
