package lectures.Java_Operators_03_02;

/**instanceof
==========
 This operator is used to check whether reference is of particular type or not.
 if it is of same type/parent type then it returns true, otherwise it returns false.

	Syntax:: r instanceof X
               r=> reference
               X=> class/Interface
       Note:: relation from r to X should compulsorily exists otherwise CompileTimeError.
*/
/*
 * eg:: Whenever we are checking parent object is of child type or not it would result in false 
 * 
 * 1. Object obj= new Object(); 
 * System.out.println(obj instanceof String);//false
 * 
 * 2. Object obj=new String(); 
 * System.out.println(obj instanceof String);//true
 * 
 * Note: for any class/interface X null instanceof X is always false 
 * 3. System.out.println(null instanceof Runnable); //false
 */
public class Instanceof_Operator {

	public static void main(String[] args) {
		Thread t= new Thread();
	     System.out.println( t instanceof Thread);//true
	     System.out.println( t instanceof Object);//true
	     System.out.println( t instanceof Runnable);//true
	     //System.out.println( t instanceof String); //compiletime error

	//eg::
		String s=new String("sachin");
	     System.out.println(s instanceof String);//true
	     System.out.println(s instanceof Object);//true
	     //System.out.println(s instanceof Thread);//compile time error
	     
	     //eg:: Whenever we are checking parent object is of child type or not it would result in false
	    // 1. 
	     Object obj= new Object();
	        System.out.println(obj instanceof String);//false

	     //2.
	     Object obj1=new StringBuffer();
	        System.out.println(obj1 instanceof String);//true
	  
	//Note: for any class/interface X null instanceof X is always false
	     //3. 
	        System.out.println(null instanceof Runnable); //false


	}

}
