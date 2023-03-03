package lectures.Java_TypesOfVariables_02;
/***3> local variables
=================
Variables which are created by the programmer to meet the temporary requriements is called
"local varaibles".
Variables which are a part of method signature,method body those variables are called as
"Local variables".
Memory for those variables will be given on the stack memory,jvm will not initialise any
value for those variables,compulsorily the user should initialise the value befor use.
*/

public class LocalVariable_03 {

	public static void main(String[] args) {
		//normal initialization of loacal variable
		
		int y;
		System.out.println("Local Variable y is not using no problem");
		//System.out.println("y value is : " + y);  //CE :The local variable y may not have been initialized
		y = 70;
		System.out.println("y value is : " + y);
		
		//When we make local variable as final
		final int k;
		System.out.println("No problem k is not using");
		//System.out.println("k value is : " + k); //CE: The local variable k may not have been initialized
		k = 90 ;
		System.out.println("k value is : " + k);
		
		// Local Variable :: memory would be in Stack Area
		//e.g >#1
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
		//e.g >#2
		   int d;
	       //System.out.println(d); //no default value will be give by jvm you have to initialization other wise C.E.
		
		   //e.g >#3
			int i=0;   //declaration and initialization done for i
			System.out.print("J's value : ");
			int g = 0;
			for(int j=0;j<3;j++)
			{
			  i=i+j;   //i=1+2(j[2]) ==> i=3
			  System.out.print(" " +j); //valid j = 0 1 2
			  g = j;
			 // h = j; //Declaration not done for h 
			}
			int h = 0; //we have to declare befor loop to access in the loop not after loop end
			System.out.println();
			System.out.println(g);
			System.out.println("I's Value : ");
			System.out.println(i);//valid
			//System.out.println(j);//CE: 'j' scope end out side for loop. in outside j variable not declared
			
			
			//e.g >#4
//			try{
//				int l=Integer.parseInt("ten");
//			}
//			catch(NullPointerException e){
//				System.out.println(l);//CE: 'i' not declared. i's scope ended inside try catch
//			}
			
			//e.g >#5
			 int p = 5;
			 int q = 10;
			 switch(q) {
			 case 30:
				 p *= 4;// p = p*4, p =30 * 4 =120, p= 120
			 case 10:
			     p *= 2;//p = p*2 = 5*2 = 10, p = 10
			  //break; 
			 case 20:
			     p *= 3;//p = p*3 , p=10*3 = 30, p = 30
		
			 }
			 System.out.println(p);//30 ==> because of case 20:, bcz we did not use break statement.

			


	}

}
