package lectures.Assignments.Assignment1;

public class YourName {

	public static void main(String[] args) {
		
		// Type your Name
		
	       int n = 9;
	        
			//For All pattern
			for(int i=0; i<n; i++ ) {
	     
					// S pattern
				for(int j=0; j<n ; j++) {
					if( (j==0 && i>0 && i <(n-1)/2) ||
						(i==0 && j>0 && j<=(n-1))  ||
						(i == (n-1)/2 && j>0 && j<(n-1))  ||
						(j==(n-1) && i >(n-1)/2 && i<n-1) ||
						(i==(n-1) && j<(n-1)))   
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
				
				// W pattern
		  			for(int j=0; j<n ; j++) {
		  				
		  				if( j==0 || i+j == (n-1) && j <=(n-1)/2 || i==j && j >=(n-1)/2 || j==(n-1))
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
				
	            // A pattern
			
				for(int j=0; j<n ; j++) {
					
					if( j==0 && i>0 || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 ||i ==(n-1)/2)   
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

	     
	        // P pattern
	  			for(int j=0; j<n ; j++) {
	  				
	  				if( j==0 || i==0 && j>0 && j<(n-1) 
	  	  				   || j==(n-1) && i>0 && i<(n-1)/2
	  	  				   || i==(n-1)/2 && j>0 && j<(n-1))   
	  				{
	  				   System.out.print("*");
	  				}
	  				else 
	 				{
	  					System.out.print(" ");
	  				}		
	  			}
	  			
	  		// For Space
		        for(int j=0;j<n;j++) {
		        	
		        	System.out.print(" ");
		        	
		        }
	  			
	  			
	  		// M pattern
	  			for(int j=0; j<n ; j++) {
	  				
	  				if( j==0 || i==j && j<=(n-1)/2 ||i+j == (n-1) && i <=(n-1)/2 || j==(n-1))
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
	  			
		     // A pattern
				
					for(int j=0; j<n ; j++) {
						
						if( j==0 && i>0 || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 ||i ==(n-1)/2)   
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
	  				
	               // D pattern
	  				
	  				for(int j=0; j<n ; j++) {
	  					
	  					if( j==0  || i==0 && j<(n-1) || j==(n-1) && i>0 && i<(n-1) || i==(n-1) && j<(n-1) )   
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
	  				
			     // A pattern
					
					for(int j=0; j<n ; j++) {
						
						if( j==0 && i>0 || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 ||i ==(n-1)/2)   
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
	  				
	  				
	  			// L pattern
	  	  			
	  				for(int j=0; j<n ; j++) {
	  					
	  					if( j==0  || i==n-1)   
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
