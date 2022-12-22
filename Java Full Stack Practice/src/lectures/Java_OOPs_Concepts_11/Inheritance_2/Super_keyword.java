package lectures.Java_OOPs_Concepts_11.Inheritance_2;

//super keyword will call the parent class instance variable 
class Dem1{
	int age= 25;
	
}
class Dem2 extends Dem1{
	int age = 28;
	void disp() {
		System.out.println(age);
		System.out.println(super.age);
	}
}

public class Super_keyword {

	public static void main(String[] args) {
		Dem2 d = new Dem2();
		d.disp();
		

	}

}
