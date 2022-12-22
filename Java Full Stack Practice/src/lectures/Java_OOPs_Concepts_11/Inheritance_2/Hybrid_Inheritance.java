package lectures.Java_OOPs_Concepts_11.Inheritance_2;
//Hybrid Inheritance
class Demo1111{   //Demo11 is Parent of all others class
	String name = "Ayush";
	int age = 25;
	void disp() {
	    System.out.println("Demo1111 class os parent of all Other class: " +name+" "+age);
	}
}

class Demo2222 extends Demo1111 {    //Demo22 -> child class of Demo11 and Pareeent of Demo33
	
}

class Demo3333 extends Demo1111 {    //Demo33 child class of Demo22
	
	
}
class Demo4444 extends Demo3333 {   //Hybrid inheritance
	
}

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		Demo3333 demo = new Demo3333();
		demo.disp();
		
		Demo4444 demo1 = new Demo4444();
		demo1.disp();

	}

}
