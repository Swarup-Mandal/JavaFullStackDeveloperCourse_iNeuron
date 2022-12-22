package lectures.Java_OOPs_Concepts_11.Polymorphism_3;
class Pareent11{
	public void cry() {
		System.out.println("Parent Crying");
	}
}
class Chilld11 extends Pareent11{
	public void cry() {
		System.out.println("Child1 cries at low voice");
	}
	public void eat() {        //Creating a Specialized method
		System.out.println("Child1 eat");
	}
}
class Chilld22 extends Pareent11{
	public void cry() {
		System.out.println("Child2 cries at high voice");
	}
	public void run() {       //Creating a Specialized method
		System.out.println("Child2 run");
	}
}
public class RunTime_Polymorphism_3 {

	public static void main(String[] args) {
		
				Pareent11 p1 = new Chilld11();
			    p1.cry();   //(1:M)
			    //p1.eat();   //creating parent ref we canont call specialized behaviour of child class
			    //we haave to do Downcasting
			    ((Chilld11)(p1)).eat();
			 	
			    Pareent11 p2 = new Chilld22();
			    p2.cry();   //(1:M)
			    //p2.run();
			    ((Chilld22) p2).run();

	}
}
