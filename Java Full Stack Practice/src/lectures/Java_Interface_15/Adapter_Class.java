package lectures.Java_Interface_15;

/*Adapter class ::(It is a design pattern allowed to solve the problem of direct
implementation of interface methods)
===================================================================================
===========
It is a simple java class that implements an interface only with empty
implememtation for every method.
If we implement an interface compulsorily we should give the body for all the
methods whether it
is required or not. This approach increases the length of the code and reduces
readability.*/

//eg:: 1 normal approch
interface X{
   void m1();
   void m2();
   void m3();
   void m4();
   void m5();
}
class TestI implements X{
   public void m3(){
     System.out.println("I am from m3()");
   }
   public void m1(){}
   public void m2(){}
   public void m4(){}
   public void m5(){}
}
/*
 * In the above approach, even though we want only m3(), still we need to give
 * body for all the abstract methods, which increase the length of the code, to
 * reduce this we need to use "Adapater class". Instead of implementing the
 * interface directly we opt for "Adapter class". Adapter class are such classes
 * which implements the interface and gives dummy implementation for all the
 * abstract methods of interface. So if we extends Adapter classes then we can
 * easily give body only for those methods which are interested in giving the
 * body.
 */

  //eg:: 2 By Adapter Class
interface IX{
   void m1();
   void m2();
   void m3();
   void m4();
   void m5();
}
abstract class AdapaterX implements IX{   //Adapter Class
   public void m1(){}   //All are Dummy Implementation
   public void m2(){}
   public void m3(){}
   public void m4(){}
   public void m5(){}
}
class TestApp extends AdapaterX{
   public void m3(){
      System.out.println("I am from m3() of Adapter class.");
   }
}

public class Adapter_Class {

	public static void main(String[] args) {
		TestI t = new TestI();
		t.m3();
		TestApp name = new TestApp();
		name.m3();
	}

}
