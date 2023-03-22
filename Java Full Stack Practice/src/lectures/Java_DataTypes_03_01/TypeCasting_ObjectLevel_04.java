package lectures.Java_DataTypes_03_01;

/**loose coupling
==============
=> Parent class reference can hold child class objects,but by using that reference we can't call
    child specific methods.
=> We can use interface reference also to hold implementation class object.

it is known as loose coupling.*/

/*
 * TypeCasting syntax:: 
 * A b= (C) d; 
 * A=> class/interface 
 * b=> name of reference variable 
 * C=> class/interface 
 * d=> name of reference variable/object
 */

class Parent{
	public void methodOne(){
		System.out.println("A");
	}
}
public class TypeCasting_ObjectLevel_04 extends Parent {

	public static void main(String[] args) throws Exception {
		//eg#1. loose coupling(Parent Child Class).
		Object pp = new String("String01");
		System.out.println(pp.hashCode());
		System.out.println(pp.toString());
		System.out.println(pp.getClass());
		//System.out.println(pp.toUpperCase());  // The method toUpperCase() is undefined for the type Object
		System.out.println(((String)pp).toUpperCase()); //TypeCasting Done here
		
		//eg#2. loose coupling(between Interface and Implementation class).
		Runnable r=new Thread();//valid
		r.run(); //calling interface run()
		((Thread) r).sleep(3000); //for Thread class method we have to TypeCasting
		System.out.println("end");
		
		/**A> CompileTimeChecking
		===================
		 1. The type of "d" and "C" must have some relationship[either child to parent,parent to child 
		    or same type] otherwise we will get compile time error saying "Incompatible Types".*/

		//Example 1::
		      Object o =new String("sachin");
		      //StringBuffer sb=(StringBuffer)o; //no problem in compile time but run time exception will occure

		//Example 2::
		      String s=new String("bhaskhar");
		     // StringBuffer sb=(StringBuffer)s;//CE: incompatible type


		/**2. "C" must be either same (or) derived type of "A" otherwise we will get compile time error
		    saying incompatible types*/

		//Example 1::
		      Object o1 =new String("sachin");
		     // StringBuffer sb1=(StringBuffer)o1; //valid //no problem in compile time but run time exception will occure

		//Example 2::
		      Object o2 =new String("sachin");
		      //StringBuffer sb2=(String)o2; //invalid

		/***B> RunTimechecking
		   =>The underlying object type of "d" must be either same (or) derived type of "C" otherwise
		     we will get runtime exception saying "ClassCastException".*/

		//Example#1.
		      Object o3 =new String("sachin");
		      //StringBuffer sb3=(StringBuffer)o3; ////no problem in compile time but run time exception will occure

		/*Ouput::-> Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be           cast to class java.lang.StringBuffer (java.lang.String and java.lang.StringBuffer are in           module java.base of loader 'bootstrap')
			  at lectures.Java_DataTypes_03_01.TypeCasting_03.main(TypeCasting_03.java:35)*/
		
		
		      //TypeCastingExamples
		      //created Parent Class and Extends it with Our Public class
		      
		 TypeCasting_ObjectLevel_04 c= new TypeCasting_ObjectLevel_04();  //child class object created by (Tight Coupling)
		  c.methodOne();//B  //child class method calling
		  c.methodTwo();//C
		  ((Parent)c).methodOne();// have to do Type Casting(UpCasting) to call parent type
				
		 Parent c1= new TypeCasting_ObjectLevel_04();  //child class object created by Parent type reference (Loose Coupling)
		  c1.methodOne(); //parent class method calling only
		  ((TypeCasting_ObjectLevel_04)c1).methodOne();
		  ((TypeCasting_ObjectLevel_04)c1).methodTwo();// have to do Type Casting(DownCasting) to call Child type
	
	}//main method end here
	public void methodOne(){
		System.out.println("B");
	}
	public void methodTwo(){
		System.out.println("C");
	}

}
