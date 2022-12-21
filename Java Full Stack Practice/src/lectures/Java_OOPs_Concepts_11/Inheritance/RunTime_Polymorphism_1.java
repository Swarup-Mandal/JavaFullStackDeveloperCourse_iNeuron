package lectures.Java_OOPs_Concepts_11.Inheritance;

class Pareent1{
	public void cry() {
		System.out.println("Parent Crying");
	}
}
class Chilld1 extends Pareent1{
	public void cry() {
		System.out.println("Child1 cries at low voice");
	}
}
class Chilld2 extends Pareent1{
	public void cry() {
		System.out.println("Child2 cries at high voice");
	}
}
public class RunTime_Polymorphism_1 {

	public static void main(String[] args) {
		//Tight Coupling
		Chilld1 c1 = new Chilld1();
		Chilld2 c2 = new Chilld2();
		c1.cry();
		c2.cry();
		//Loose Coupling
//		Pareent1 parent = new Chilld1();
		Pareent1 ref;
		ref = c1;
		ref.cry();   //(1:M)
		
		ref = c2;
		ref.cry();   //(1:M)
		

	}

}
