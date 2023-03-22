package lectures.Java_Loops_05;

public class D1_D2_Pattern_Logic {

	public static void main(String[] args) {
		
		//Pattern X
		
		int n = 13;
		
		for(int i=0;i<n;i++) 
		{
           for(int j=0; j<n;j++) 
           {
            	if(i==j || i+j==(n-1)) 
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
