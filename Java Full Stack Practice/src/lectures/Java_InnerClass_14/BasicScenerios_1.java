package lectures.Java_InnerClass_14;

//Some Scenerios----------->
//Scenerio 1  *******>

//public class BasicScenerios {
//	int num; //instance variable
//	public void show() {     //Non-Static method  ----------->
//		System.out.println("in show : " + num );
//	}
//	public static void main(String[] args) {     //Static Method-------------------->
//		//we can't call non-static method into a static method -> 
//		//show();     //we have to creat object that class or creat non-static method into static method.
//		BasicScenerios obj = new BasicScenerios();
//		obj.show();
//		System.out.println(obj.num);
//	}
//}

//Scenerio 2  *******>
//public class BasicScenerios {
//	private int num; //instance variable
//	
//	//have to create object of A class (like Inner Class)
//	A con = new A();
//	//con.config();   //you can,t call any method outside any method.bcz, calling  method is a action and all action shold be inside a method.
//	public void show() {     //Non-Static method  ----------->
//		System.out.println("in show : " + num );
//		con.config();
//	}
//	//creating another class Which is Inner Class
//	class A{
//		public void config() {
//			System.out.println("In Config " + num );
//		}
//	}
//	public static void main(String[] args) {     //Static Method-------------------->
//		BasicScenerios obj = new BasicScenerios();
//		obj.show();
//	}
//}


     //Scenerio 3 ************>

//class OuterClass{
//	private int num; 
//	public void show() {     
//		System.out.println("in show : " + num );
//	}
//	
//	//creating Inner Class
//	class InnerClass{
//		public void config() {
//			System.out.println("In Config " + num);
//		}
//	}
//}
//public class BasicScenerios {
//	public static void main(String[] args) {     //Static Method-------------------->
//		OuterClasss obj = new OuterClasss();
//		obj.show();  //this is is fine
//		//obj.config();    // X
//		
////		InnerClass obj1 = new InnerClass();   // X
////		obj1.config();
//		
//		OuterClasss.InnerClasss obj1;   //telling that InnerClass is belongs to OuterClass
//		obj1 = obj.new InnerClasss();  //if InnerClass is non-static 
//		          //Or
//		OuterClasss.InnerClasss in = new OuterClasss().new InnerClasss();
//		obj1.config();	
//	}
//}

     //Scenerio 4 ***********>

/**Note:  We can not have a static method in a nested inner class because an inner class 
  *is implicitly associated with an object of its outer class so it cannot define 
  *any static method for itself. For example, the following program doesn’t compile. 
  *But Since JAVA Version 16 we can have static members in our inner class also.
  */
//Java Program to Demonstrate Nested class
//Where Error is thrown

//Class 1
//Outer class
//class Outer {
//
//	// Method defined inside outer class
//	void outerMethod()
//	{
//
//		// Print statement
//		System.out.println("inside outerMethod");
//	}
//
//	// Class 2
//	// Inner class
//	class Inner {
//
//		// Main driver method
//		public static void main(String[] args)
//		{
//
//			// Display message for better readability
//			System.out.println("inside inner class Method");
//		}
//	}
//}

      //Scenerio 5 **********>
class Outerr {
	   void outerMethod() {
	      int x = 98;
	      System.out.println("inside outerMethod");
	      class Innerr {
	         void innerMethod() {
	            System.out.println("x= "+x);
	         }
	      }
	      Innerr y = new Innerr();
	      y.innerMethod();
	   }
	}
public class BasicScenerios_1 {
	   public static void main(String[] args) {
	      Outerr x=new Outerr();
	      x.outerMethod();
	   }
	}
