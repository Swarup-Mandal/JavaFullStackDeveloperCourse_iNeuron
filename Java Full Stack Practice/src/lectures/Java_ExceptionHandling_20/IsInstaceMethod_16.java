package lectures.Java_ExceptionHandling_20;

/*  isInstance()
     ==========
*/
public class IsInstaceMethod_16 {

	public static void main(String[] args) {
		
		/*Difference between instanceof and isInstance( ) :
		 * 
		instanceof
		=========
		instanceof an operator which can be used to check whether the given object is
		particular type or not We know at the type
		at beginning it is available.*/
		//eg: 
		String s = new String("sachin");
		   System.out.println(s instanceof Object );//true
		   //If we know the type at the beginning only.
		   
		/*
		 * isInstance( ) ------->
		isInstance( ) is a method , present in class Class , we can use isInstance() method
		to checked whether the given object is
		particular type or not We don't know at the type at beginning it is available
		Dynamically at Runtime.*/
		//eg:
//		   class Test {
//		    public static void main(String[] args) {
//		      Test t = new Test( ) ;
//		      System.out.println(Class.forName(args[0]).isInstance(t));
		          ////arg[0] --- We don't know the type at beginning
//		    }
//		   }
		   
//		Output - > 
//		java Test Test //true
//		java Test String //false
//		java Test Object //true

	}

}
