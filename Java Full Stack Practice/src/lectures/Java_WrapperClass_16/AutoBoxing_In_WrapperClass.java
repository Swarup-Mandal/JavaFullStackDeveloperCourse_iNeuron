package lectures.Java_WrapperClass_16;

import java.util.ArrayList;

/*untill 1.4Version, we can't provide wrapper class objects in place of primitive and
primitive in place of wrapper object all
the required conversions should be done by the programmer.
But from jdk1.5 Version onwards,we can provide primtive in place of wrapper and in
place of wrapper we can keep primitive
also.All the requried conversion will be done by the compiler automatically, this
mechanism is called as "AutoBoxing" and
"AutoUnBoxing".*/

public class AutoBoxing_In_WrapperClass {

	public static void main(String[] args) {
		//eg#1.
		Boolean b1 = Boolean.valueOf(true);
		if (b1)
		  System.out.println("hello");
		
		//eg#2.
		ArrayList al = new ArrayList();
		System.out.println(al);
		   al.add(10);
	    System.out.println(al);
	    
	 /*Autoboxing
	    =========
	     Automatic conversion of primtive type to wrapper object by the compiler is called
	    "AutoBoxing".   */
	    
	    Integer i1 = 10;
	    
	   /*       |
	            |After compilation the code would be
	            |
	            |      */
	     Integer i11 = Integer.valueOf(10);
	     
//	Note: Autoboxing is done by the compiler using a method called "valueOf()".

	}

}
