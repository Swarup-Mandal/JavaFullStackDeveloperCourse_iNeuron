package lectures.Java_ImportStatement_18;

import static java.lang.Math.sqrt;
import static java.lang.Math.*;

//case 4 import
import static java.lang.System.out;

//case 5 import
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

//Which of the following import statement is valid?
		 //import java.lang.Math.*; //invalid
		 //import static java.lang.Math.*;//valid
		 //import java.lang.Math;//valid
	     //import static java.lang.Math;//invalid
		 //import static java.lang.Math.sqrt.*;//invalid
		 //import java.lang.Math.sqrt;//invalid
		 //import static java.lang.Math.sqrt();//invalid
		 //import static java.lang.Math.sqrt;//valid



//case 3
class Test{
    static String name = "sachin";
}
//case 6
class Test1{
    static int MAX_VALUE = 999;
}


public class Static_Import_2 {

	public static void main(String[] args) {
		// normally we can call any static method by Class name directly
		System.out.println(Math.sqrt(4));
		System.out.println(Math.max(10,20));
		System.out.println(Math.random());
		
		//After static importing 
		System.out.println(sqrt(9));
		System.out.println(max(10,30));
		System.out.println(random());
		
		System.out.println(Test.name.length());
		System.out.println();
		
		//case 4
		out.println("hello");
		out.println("hi");

		 //case 5 
		//System.out.println(MAX_VALUE); //Compile time error.
		System.out.println(MAX_VALUE);  //succesfully run after explicite import
		
		//case 6 calling
		System.out.println(Test1.MAX_VALUE);



	}

}
