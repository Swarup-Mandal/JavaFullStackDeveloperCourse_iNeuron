package lectures.Java_TypesOfVariables_02;

public class LocalVariable {

	public static void main(String[] args) {
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
			for(int j=0;j<3;j++)
			{
			  i=i+j;   //i=1+2(j[2]) ==> i=3
			  System.out.print(j); //valid j = 0 1 2
			}
			System.out.println();
			System.out.print("I's Value : ");
			System.out.println(i);//valid
			//System.out.println(j);//CE: 'j' variable not declared
			
			
			//e.g >#4
//			try{
//				int l=Integer.parseInt("ten");
//			}
//			catch(NullPointerException e){
//				System.out.println(l);//CE: 'i' not declared
//			}
			
			//e.g >#5
			int x;
			System.out.println("hello");//hello
			
			
			//e.g >#6
			int p = 5;
			 int q = 10;
			 switch(q) {
			 case 10:
			 p *= 2;//p = p*2 = 5*2 = 10, a = 10
			  //break; 
			 case 20:
			 p *= 3;//p = p*3 , p=10*3 = 30, a = 30
			 case 30:
			 p *= 4;// p = p*4, p =30 * 4 =120, a= 120
			 }
			 System.out.println(p);//120

			


	}

}
