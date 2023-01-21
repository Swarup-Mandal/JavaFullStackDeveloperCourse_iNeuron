package lectures.Java_Interface_15;

/*Case 1:: If 2 interfaces contain a method with same signature and same return type in
*           the implementation class only one method implementation is enough.*/
	//eg::
	 interface Left{ public void methodOne();}
	 interface Right{public void methodOne();}
	 class Test implements Left,Right{
	     @Override
	     public void methodOne(){
	    	 System.out.println("Any one method have to implement");
	     }
	 }

/*Case2:: If 2 interfaces contain a method with same name but different arguments in the
 *        implementation class we have to provide implementation for both methods
 *         and these methods acts as a Overload methods.*/

		//eg::
		 interface ILeft{ public void methodOne();}
		 interface IRight{public void methodOne(int i);}
		 class TestImpl implements ILeft,IRight{
		     @Override
		     public void methodOne(){
		        System.out.println("This is for method 1 no parameter");
		     }
		     @Override
		     public void methodOne(int i){
		        System.out.println("This is for method 2 with parameter");
		     }
		 }
	 
/* case3:: If two interfaces contains a method with same signature but different
           return types then it is not possible to implement both interface simultaneously.*/
			//eg:: 
			 interface Leftt { public void methodOne(); }
			 interface Rightt{ public int methodOne(); }
//			 class Testt implements Leftt,Rightt{
//			     @Override
//			     public void methodOne(){
//			    	 System.out.println("It will give CE. bcz return type is different");
//			 
//			     }
//			     @Override
//			     public int methodOne(){
//			    	 System.out.println("It will give CE. also bcz return type is different");
//			
//			     }
//			 }
	 

			 
/* Variable naming conflicts:: Two variables can contain a variable with same name and there
                               may be a chance variable naming conflicts but we can resolve
				               variable naming conflicts by using interface names.
*/
				//example1:
				 interface Lefft{ 
					 int x=888;
				 }
				 interface Rigght{
					 int x=999;
				 }
			


public class Interface_Naming_Conflicts implements Lefft,Rigght{

	public static void main(String[] args) {
		System.out.println("Check all the case above of Interface_Naming_Conflicts");
		System.out.println(Lefft.x);
		System.out.println(Rigght.x);
	}

}
