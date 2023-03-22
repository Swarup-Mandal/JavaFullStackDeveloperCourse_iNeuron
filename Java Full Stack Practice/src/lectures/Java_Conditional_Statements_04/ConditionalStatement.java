package lectures.Java_Conditional_Statements_04;

/*if block
========
  To select some statements for execution based on condition,we use if block

syntax::
   if(boolean){
	  //statement-1
   }
      statement-2

workflow
=======
  boolean condition true means statement-1 will be executed otherwise statement-2 will be 
  executed.*/
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		if(a>b) {                          //condition 1
			System.out.println(a+b);
		}
		else if (a==b) {                   //condition 2
			System.out.println(a-b);
		}
		else {
			System.out.println("A is lesser");
		}
		
		// eg#1
//		int x=0;
//		   if(x){
//			System.out.println(x);
//		   }
//		   output:Compile time error
		
		// eg#2
		   int x=0;
		   if(x==0){
			System.out.println(x);
		   }
		   //output:: 0
	   // eg#3
		   boolean res=false;
		   if(res){
			System.out.println(res);
		   }
		  // output:: nothing will be printed
		   
		// eg#4
		   boolean res1=false;
		   if(res1=true){
			System.out.println(res1);
		   }
		   //output:: true


	}

}
