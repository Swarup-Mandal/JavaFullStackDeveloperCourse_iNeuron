package lectures.Java_Loops_05;

public class BasicLoops_PatternLogic {

	public static void main(String[] args) {
		
		// Basic structure to print 5 time '*'
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
        
        //Printing '*' 5 times using Loops------->
		
		    //for Loop
		
//        for (int i=0; i < 5; i++) {
//        	System.out.println("*");
//        }
		
            //while Loop
		
//        int n = 5;
//        int i = 0;
//        while(i < n) {
//        	System.out.println("*");
//        	i++;
//        }
		
		   //do-while Loop
		  
//		   int n = 5;
//		   int i = 0;
//		   do {
//				System.out.print("*");
//	        	i++;
//		   }while(i<n);
//		
		//Nested Loops---------->
		
		   ///Nested For Loops
		
		// Q> Print 5 Star in on line and print 4 row on next line with same 5 star pattern
		
//		int n = 5;
//		for(int j=0;j<n;j++) 
//		{
//            for(int i=0; i<n;i++) {
//        	    System.out.print("*");
//            }
//            System.out.println();
//		}
		
		
		// print ---> *****
//		              *   *     
//	                  *   *
//		              *   *
//		              *****    
//		int n = 5;
//		for(int i=0;i<n;i++)   //outer loops
//		{
//            for(int j=0; j<n;j++)   //inner loops
//            {
//            	if(i == 0 || i == 4 || j == 0 || j == 4) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		
	   //Q> print H Pattern ----> 
//		                *   *
//		                *   *
//		                *****
//		                *   *
//		                *   *
//		int n = 5;
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 || j==(n-1) || i==(n-1)/2)
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
//        
		
		// for + pattern
		
//	    int n = 5;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(i==(n-1)/2||j==(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
//		                 
//		                 *
//		                 *
	// for pattern     *********
//		                 * 
//		                 *
//		                 *
//                       *
//                       *
//	    int n = 10;
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==(n/4) || i==(n/4) )
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}

		
       // for E pattern
		
//	    int n = 5;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(i==0 || i==(n-1)/2|| j==0 || i==(n-1)) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		
         // for A pattern
//	    int n = 10;
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 && i>0 || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 || i==(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
          // B (half) pattern
//     	int n = 11;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0  || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 ||j==(n-1)/2 && i>(n-1)/2 && i<(n-1) 
//            	   ||i==(n-1)/2 && j<(n-1)/2 ||i==(n-1) && j<(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		
        // I pattern
//   	int n = 11;
//		for(int i=0;i<n;i++) 
//		{
//         for(int j=0; j<n;j++) 
//         {
//          	if(i==0  || j==(n-1)/2 || i==(n-1)) 
//          	{
//      	        System.out.print("*");
//              }
//          	else 
//          	{
//          		System.out.print(" ");
//          	}
//          }
//          System.out.println();
//		}
		
        // o pattern
//   	int n = 8;
//		
//		for(int i=0;i<n;i++) 
//		{
//         for(int j=0; j<n;j++) 
//         {
//          	if(i==n/4 && j>n/4 && j<3*n/4 || j==n/4 && i>n/4 && i<3*n/4 
//          			|| i==3*n/4 && j>n/4 && j<3*n/4 || j==3*n/4 && i>n/4 && i<3*n/4  ) 
//          	{
//      	        System.out.print("*");
//              }
//          	else 
//          	{
//          		System.out.print(" ");
//          	}
//          }
//          System.out.println();
//		}
		
		
		// G pattern
		
//     	int n = 11;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 && i>0 && i<(n-1) 
//            	    || i==0 && j>0 && j<(n-1)/2 
//            	    || j==(n-1)/2 && i>0 && i<= n/4 || i==(n-1) && j>0 && j<=n/4 
//            	    ||j==n/4 && i>= (n-1)/2 || i==(n-1)/2 && j>= n/4 && j<=(n-1)/2 
//            		|| j==(n-1)/2 && i>=(n-1)/2 )
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		// Pattern H----->
		
//     	int n = 11;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 || j==(n-1)/2 || i==(n-1)/2  && j<=(n-1)/2)
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
            
		
        // P pattern
		
//     	int n = 11;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		
	//Print A B C in one line ()
		
//            // for A pattern
//		
//	    int n = 10;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 && i>0 || i==0 && j>0 && j<(n-1) || j==(n-1) && i>0 || i==(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//           }
//           
//           
//           //For Space add a for(j) loop and print only space
//           
//           for (int j=0; j<n/2;j++) {
//        	   System.out.print(" ");
//           }
//           
//		
//          // B (half) pattern
//		
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0  || i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 ||j==(n-1)/2 && i>(n-1)/2 && i<(n-1) 
//            	   ||i==(n-1)/2 && j<(n-1)/2 ||i==(n-1) && j<(n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            
//           //C pattern
//           
//           for(int j=0; j<n;j++) 
//           {
//            	if(j==0 && i>0 && i<(n-1)|| i==0 && j>0  ||i==(n-1) && j>0) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//           
//           System.out.println();
//           
//		}

		
           // X pattern
		
//     	int n = 11;
//		
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(i==j || i+j==(n-1) || i==0 ||j==0||i==(n-1)||j==(n-1)) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}

		//For <> pattern Dimond
		
//	     int n = 13;
//		for(int i=0;i<n;i++) 
//		{
//           for(int j=0; j<n;j++) 
//           {
//            	if(i+j==(n-1)/2  || i-j==(n-1)/2||j-i==(n-1)/2 ||i+j==n-1 + (n-1)/2) 
//            	{
//        	        System.out.print("*");
//                }
//            	else 
//            	{
//            		System.out.print(" ");
//            	}
//            }
//            System.out.println();
//		}
		
		//For small Q pattern
		
	    int n = 12;
		for(int i=0;i<n;i++) 
		{
           for(int j=0; j<n;j++) 
           {
            	if( i==n/4 && j>n/4 && j<(3*n/4) || i==3*n/4 && j>n/4 && j<(3*n/4)
            			||j==n/4 && i>n/4 && i<(3*n/4) || j==3*n/4 && i>n/4 && i<(3*n/4) || i==j && j>(n-1)/2) 
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
		
		
		
		
		
		
		
		
//        
//        
		
		
	}

}
