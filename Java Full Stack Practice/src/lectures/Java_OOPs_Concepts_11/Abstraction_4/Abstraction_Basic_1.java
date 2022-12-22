package lectures.Java_OOPs_Concepts_11.Abstraction_4;

abstract class Plane{     //abstract Parent class
	
	//abstract int a =10;   //variables cannot be abstract.
	abstract public  void takeOff(); // abstract method -> only funtionality present implementation not there(hidden).
	abstract public void fly();      //all abstract method = 100% abstraction
	abstract public void land(); 
	public void airport() {          //if only one normal method presen in a abstract class = not 100% abstraction happened.
		System.out.println("Welcome to Airport");
	}
}
 class JetPlane extends Plane{
	//when a child class overrriding all methods of Parent class then we can use abstract method ,
    //along with abstract class.if we dont do any method override in child class--> we have to do 
	//implementation of those unimplemented methods or have to create child class as abstract.
	public void takeOff() {
		System.out.println("JetPlane need short runway to Taking Off");
	}
	public void fly() {
		System.out.println("JetPlane is flying very fast");
	}
	public void land() {
		System.out.println("JetPlane need short runway to Landing");
	}
	
	public void carryGoods() {     //This specialized method of child so, paren don't have this
		System.out.println("JetPlane(Specialized Method) can carry goods and Weapon");
	}
}

class PassengerPlane extends Plane{
	//overrriding all methods of Parent class
	    public void takeOff() {
		    System.out.println("PassengerPlane need long runway to Taking Off");
	    }
		public void fly() {
			System.out.println("PassengerPlane is flying medium height");
		}
		public void land() {
			System.out.println("PassengerPlane need long runway to Landing");
		}
		
}
public class Abstraction_Basic_1 {

	public static void main(String[] args) {
		//Parent reference for the child object can be used for abstract class- polymorphism
		Plane pp = new JetPlane();
		pp.airport();
		pp.takeOff();
		pp.fly();
		pp.land();
		((JetPlane)(pp)).carryGoods();
		System.out.println();
		
		//Plane p = new Plane();   //Cannot instantiate the type Plane bcz it is abstract class
		//object creaction for abstract class not permitted but abstract class's reference can be allowed
		//for achiveing runtime polymorphism 
	    Plane pp1 = new PassengerPlane();
	    pp1.airport();
		pp1.takeOff();
		pp1.fly();
		pp1.land();
		
	
	}

}
