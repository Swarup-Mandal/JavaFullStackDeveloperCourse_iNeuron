package lectures.Java_InnerClass_14;
       // Type 1------>

//class OuterClass1{
//      private int num; 
//      public void show() {     
//	     System.out.println("in show : " + num );
//      }
//
//      //creating Only Static Inner Class
//      static class InnerClass1{
//	       public void config() {
//		      System.out.println("In Config ");
//	       }
//      }
//}
//public class Static_InnerClass_03 {
//
//	public static void main(String[] args) {
//		OuterClass1 obj = new OuterClass1();  //first have to create OuterClass object
//		obj.show();
//		//obj.config();    //X
//		
//		OuterClass1.InnerClass1 obj1 =new  OuterClass1.InnerClass1();  //telling that InnerClass is belongs to OuterClass by (.) ymbol
//		obj1.config();     	
//	}
//}


        //Type 2------>
//Java Program to Illustrate Static Nested Classes
//Class 1
//Outer class
class Outer1 {
	
	// Method which is static----->
	private static void outerMethod()
	{

		// Print statement
		System.out.println("inside outerMethod");
	}

	// Class 2
	// Static inner class ------->
	static class Inner1 {

		public static void display()   //static method -------->
		{

			// Print statement
			System.out.println("inside inner class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}

//Class 3
//Main class
public class Static_InnerClass_03_4 {

	// Main driver method
	public static void main(String args[])
	{

		// Calling method static display method rather than an instance of that class.
		Outer1.Inner1.display();
	}
}

