package lectures.Assignments.Assignment1;

public class IneuronPattern {

	public static void main(String[] args) {
//		For Question No: 1 (INEURON pattern)
		
//    *********  *       *  *********  *       *  ********    *******   *       *
//	    *      **      *  *          *       *  *       *  *       *  **      *
//	    *      * *     *  *          *       *  *       *  *       *  * *     *
//	    *      *  *    *  *          *       *  *       *  *       *  *  *    *
//	    *      *   *   *  *********  *       *  ********   *       *  *   *   *
//	    *      *    *  *  *          *       *  *    *     *       *  *    *  *
//	    *      *     * *  *          *       *  *     *    *       *  *     * *
//	    *      *      **  *          *       *  *      *   *       *  *      **
//	*********  *       *  *********   *******   *       *   *******   *       *

		
		int n = 9;
		
	// I pattern
		
	    for(int i=0;i<n;i++) {
	    	
			 for(int j=0; j<n ; j++) {
				
				if( i==0 ||  j==(n-1)/2 || i ==(n-1))   
				{
				   System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}		
			  }
			 
	   // For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
			 
			// N pattern
				
				for(int j=0; j<n ; j++) {
					
					if( j==0  || i==j || j==(n-1))   
					{
					   System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}		
				}
				
		 // For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
            // E pattern
  				
  				for(int j=0; j<n ; j++) {
  					
  					if( j==0  || i==0 || i==(n-1) || i==(n-1)/2)   
  					{
  					   System.out.print("*");
  					}
  					else 
  					{
  						System.out.print(" ");
  					}		
  				}
  				
  		// For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
  				
		        // U pattern
	  			for(int j=0; j<n ; j++) {
	  				
	  				if( j==0 && i<(n-1) || i==(n-1) && j>0 && j<(n-1) || j==(n-1) && i<(n-1))   
	  				{
	  				   System.out.print("*");
	  				}
	  				else 
	  				{
	  					System.out.print(" ");
	  				}		
	  			}
	  			
	  		// For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
	  			
	  		//R pattern
	  			for(int j=0; j<n ; j++) {
	  				
	  				if( j==0 || i==0 && j>0 && j<(n-1) 
	  				   || j==(n-1) && i>0 && i<(n-1)/2
	  				   || i==(n-1)/2 && j>0 && j<(n-1)
	  				   ||i==j && i>(n-1)/2)
	  				{
	  				   System.out.print("*");
	  				}
	  				else 
	  				{
	  					System.out.print(" ");
	  				}		
	  			}
	  			
	  		// For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
  				
            // O pattern
  				
  				for(int j=0; j<n ; j++) {
  					
  					if( j==0 && i>0 && i<(n-1) || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 && i<(n-1) || i==(n-1) && j>0 &&j<(n-1) )   
  					{
  					   System.out.print("*");
  					}
  					else 
  					{
  						System.out.print(" ");
  					}		
  				}
  				
  			// For Space
		        for(int j=0;j<n/4;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
  				
             // N pattern
				
				for(int j=0; j<n ; j++) {
					
					if( j==0  || i==j || j==(n-1))   
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
