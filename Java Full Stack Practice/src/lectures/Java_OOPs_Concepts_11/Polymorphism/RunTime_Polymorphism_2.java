package lectures.Java_OOPs_Concepts_11.Polymorphism;
class Planee{
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
class JetPlanee extends Planee{
	//Overridden -> of fly()
	public void fly() {
		System.out.println("JetPlane is flying very fast");
	}
	public void carryGoods() {     //This specialized method of child so, paren don't have this
		System.out.println("JetPlane ccan carry ogoods and Weapen");
	}
}

class PassengerPlanee extends Planee{
	//Overridden -> of fly()
		public void fly() {
			System.out.println("PassengerPlane is flying medium height");
		}
}
class Airport {   //Actuall Runtime Polymorphism happened
	public void permit(Planee plane) {   //the type should be parent type
		plane.takeOff();
		plane.fly();
		plane.land();
		
	}
}
public class RunTime_Polymorphism_2 {

	public static void main(String[] args) {
		JetPlanee jp = new JetPlanee();
		PassengerPlanee pp = new PassengerPlanee();
		
		Airport ap = new Airport();  //plymorphism
		ap.permit(pp);  //Passenger Plane class calling
		ap.permit(jp);  //Jet Plane class calling
	}

}
