package lectures.Java_OOPs_Concepts_11.Inheritance;
//1. final class does not partcipate in inheritance

//final class Vehical{
//	void disp() {
//		System.out.println("Vehical");
//	}
//}
//class Car extends Vehical{  //final class can't inherit.
//	
//}


//2. final method will inherited but we can not override.
//3. final variable cannot be changed or reassigned value.

class Vehical{
	final int i = 10;
   final void disp() {            //finall method can inherited
//	  i = 10;          //The final field Vehical.i cannot be assigned
	   System.out.println(i);
	   System.out.println("Vehical");
   }
}
class Car extends Vehical{  
//	void disp() {                //Cannot override the final method from Vehical
//		
//	}

}

public class Final_Keyword {

	public static void main(String[] args) {
		Car c = new Car();
		c.disp();

	}
}
