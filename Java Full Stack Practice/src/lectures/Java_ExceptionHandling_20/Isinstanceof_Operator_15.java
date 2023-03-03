package lectures.Java_ExceptionHandling_20;

import java.util.ArrayList;

public class Isinstanceof_Operator_15 {

	public static void main(String[] args) {
		/*instanceof
		=========
		1. We can use the instanceof operator to check whether the given an object is
		particular type or not.
		r instanceof X
		r => reference
		X => class/interfaceName
		eg:*/
		 
//		ArrayList al =new ArrayList();//inbuilt object where we can keep any type of other objects
//		  al.add(new Student());//0th position
//		  al.add(new Cricketer());//1st position
//		  al.add(new Customer());//2nd position
//		  Object o=al.get(0); // l is an arraylist object
//		  if(o instanceof Student) {
//		     Student s=(Student)o ;
//		     //perform student specific operation
//		  }
//		  else if(o instanceof Customer) {
//		     Customer c=(Customer)o;
//		     //perform Customer specific operations
//		 }
		  
		//eg#2.
		Thread t = new Thread( );
		   System.out.println(t instanceof Thread);//true
		   System.out.println(t instanceof Object);//true
		   System.out.println(t instanceof Runnable); //true
		
//		   Ex :
//		public class Thread extends Object implements Runnable {
//		}
		
	 /* 2.=> To use instanceof operator compulsory there should be some relation between
		  argument types (either child to parent Or parent to child Or same type) Otherwise we will
		  get compile time error saying inconvertible types.
		  */
		//eg:
		   
//		   String s= new String("sachin");
//		      System.out.println(s instanceof Thread);//CE
//		   Thread t=new Thread( );
//		      System.out.println(t instanceof String);//CE
		
	  /*3.=> Whenever we are checking the parent object is child type or not by using
		instanceof operator that we get false.*/
		
		   Object o=new Object( );
		     System.out.println(o instanceof String ); //false
		   Object o1=new String("ashok");
		     System.out.println(o instanceof String); //true
		     
	/*
	 * 4.=> For any class or interface X null instanceof X is always returns false
	*/
		System.out.println(null instanceof MultiCatchBlock_13); //false
		
		
//	Q> 
//	   public class Test {
//		   public static void main(String[] args) {
//		       Object t = new Thread();
//		        System.out.println(t instanceof Object);//true
//		        System.out.println(t instanceof Thread);//true
//		        System.out.println(t instanceof Runnable);//true
//		        System.out.println(t instanceof String);//false
//		        System.out.println(null instanceof Object);//false
//		   }
//		}

	}

}
