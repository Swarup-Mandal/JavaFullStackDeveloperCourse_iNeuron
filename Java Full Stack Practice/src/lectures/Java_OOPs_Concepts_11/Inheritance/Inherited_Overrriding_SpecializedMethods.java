package lectures.Java_OOPs_Concepts_11.Inheritance;
//Inherited vs Overriding vs Specialized Methods

class Plane{
	public void takeOff() {
		System.out.println("Plane is Taking Off");
	}
	public void fly() {
		System.out.println("Plane is Flying");
	}
	public void land() {
		System.out.println("Plane is Landing");
	}
}
class JetPlane extends Plane{
	//Inherited -> takeOff() ,fly(), land() from Plane class
	
	//Overridden -> of fly()
	public void fly() {
		System.out.println("JetPlane is flying very fast");
	}
	
	//Specialized -> new child's property
	public void carryGoods() {
		System.out.println("JetPlane caries Goods");
	}
	
}

class PassengerPlane extends Plane{
	//Inherited -> takeOff() ,fly(), land() from Plane class
	
	//Overridden -> of fly()
		public void fly() {
			System.out.println("PassengerPlane is flying medium height");
		}
		
		//Specialized -> new child's property
		public void carryPassengers() {
			System.out.println("PassengerPlane caries Goods & Passenger");
		}
	
}
public class Inherited_Overrriding_SpecializedMethods {

	public static void main(String[] args) {
		
		JetPlane jp = new JetPlane();
		PassengerPlane pp = new PassengerPlane();
		
		jp.takeOff();  //Inherited
		jp.fly();      //Ovverriding
		jp.land();     //Inherited
		jp.carryGoods(); //Specialized
		
		System.out.println();
		
		pp.takeOff();//Inherited
		pp.fly();//Ovverriding
		pp.land();//Inherited
		pp.carryPassengers();//Specialized

	}

}
