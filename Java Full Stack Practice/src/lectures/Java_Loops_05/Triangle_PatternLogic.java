package lectures.Java_Loops_05;

public class Triangle_PatternLogic {
	public static void main(String[] args) {
		
//		******     //for p1 filler  
//		*****       
//		****        
//		***         
//		**          
//		*  
		
//		int n = 12;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j<=(n-1)/2 || i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
//	     *******    //p3 filler
//	      ******
//	       *****
//	        ****
//	         ***
//	          **
//	           * 
		
//		int n = 12;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(j-i>=(n-1)/2 || i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		 // same Pattern little diff
//		int n = 12;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(j-i>=0 || i==0 && j>=(n-1)/2 || j==(n-1) && i<=(n-1)/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
//		*           //formula p2 filler
//		**          
//		***         
//		****        
//		*****       
//		******      
//		*******  
		
//		int n = 12;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i-j>=(n-1)/2              //you can also change i-j>=(n-1)/2 to i-j>=0 to fill the upper spacy area
//				   || j==0 && i>=(n-1)/2 
//				   || i==(n-1) && j<=(n-1)/2) {  
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		   *         // P4 filler
//        **
//       ***
//      ****
//     *****
//    ******
//   *******
		
		
//		int n = 12;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j>=(n-1)+(n-1)/2              //you can also change i+j>=(n-1)/(n-1)2 to i+j>=(n-1) to fill the upper spacy area
//				   || j==(n-1) && i>=(n-1)/2 
//				   || i==(n-1) && j>=(n-1)/2) {  
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
//		****** ******   
//		*****   *****
//		****     ****
//		***       ***
//		**         **
//		*           *
		
		
//		int n = 18;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j<=(n-1)/2 || j-i>=(n-1)/2
//		           || i==0  || j==0 && i<=(n-1)/2 
//		           || j==(n-1) && i<=(n-1)/2) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}

		
//		***********
//		***** *****     
//		****   ****
//		***     ***
//		**       **
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
//		***********

		
//		int n = 11;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j<=(n-1)/2 || j-i>=(n-1)/2 || i-j>=(n-1)/2 ||i+j>=(n-1)+(n-1)/2
//		           || i==0  || j==0  
//		           || j==(n-1) || i==(n-1))
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
//	      *     
//	     ***    
//	    *****   
//	   *******  
//	  ********* 
//	 ***********
//	  ********* 
//	   *******  
//	    *****   
//	     ***    
//	      *     
		
//		int n = 11;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j>=(n-1)/2 && i<= (n-1)/2  && j<= (n-1)/2
//						|| j-i<=(n-1)/2 && i<=(n-1)/2 && j>=(n-1)/2 
//						|| i-j<=(n-1)/2 && i>=(n-1)/2 && j<=(n-1)/2 
//						||i+j<=(n-1)+(n-1)/2 && i>(n-1)/2 && j>(n-1)/2)
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}

	
		
//	      *     
//	     ***    
//	    *****   
//	   *******  
//	  ********* 
//	 ***********
		
//		int n = 11;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i+j>=(n-1)/2 && i<=(n-1)/2 && j<=(n-1)/2 || j-i<=(n-1)/2 &&i<=(n-1)/2 && j>=(n-1)/2)
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
        
//      ***********
//       ********* 
//        *******  
//         *****   
//          ***    
//           * 
//		
		
//		int n = 11;
//		for (int i=0; i<n;i++) {
//			for (int j=0; j<n;j++) {
//				if(i-j<=(n-1)/2 && i>=(n-1)/2 && j<=(n-1)/2 
//						|| i+j <= (n-1) + (n-1)/2 && i>(n-1)/2 && j>(n-1)/2
//						||i==(n-1)/2)
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
//	     *     
//	    **     
//	   ***     
//	  ****     
//	 *****     
//	******     
//	 *****     
//	  ****     
//	   ***     
//	    **     
//	     *
		
		int n = 11;
		for (int i=0; i<n;i++) {
			for (int j=0; j<n;j++) {
				if(i+j>=(n-1)/2  && i<=(n-1)/2 && j<= (n-1)/2
						|| i-j <= (n-1)/2 && i>=(n-1)/2 && j<=(n-1)/2 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		

		
		
	}

}
