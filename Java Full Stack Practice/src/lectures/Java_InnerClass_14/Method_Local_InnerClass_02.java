package lectures.Java_InnerClass_14;
//Java Program to Illustrate Inner class can be
//declared within a method of outer class

//Class 1
//Outer class
class Outer {

	// Method inside outer class
	void outerMethod()
	{

		// Print statement
		System.out.println("inside outerMethod");

		// Class 2
		// Inner class
		// It is local to outerMethod()
		class Inner {

			// Method defined inside inner class
			void innerMethod()
			{

				// Print statement whenever inner class is
				// called
				System.out.println("inside innerMethod");
			}
		}

		// Creating object of inner class
		Inner y = new Inner();

		// Calling over method defined inside it
		y.innerMethod();
	}
}
//Main class
public class Method_Local_InnerClass_02 {

	public static void main(String[] args) {
		// Creating object of outer class inside main() method.
				Outer x = new Outer();

				// Calling over the same method
				// as we did for inner class above
				x.outerMethod();
	}

}
