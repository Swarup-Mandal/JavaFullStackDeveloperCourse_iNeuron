package lectures.Java_OOPs_Concepts_11.Inheritance_2;
//Hierarchy Inheritance
class Demo111{   //Demo11 is Parent of all others class
	String name = "Ayush";
	int age = 25;
	void disp() {
	    System.out.println("Demo111 class os parent of all Other class: " +name+" "+age);
	}
}

class Demo222 extends Demo111 {    //Demo22 -> child class of Demo11 and Pareeent of Demo33
	
}

class Demo333 extends Demo111 {    //Demo33 child class of Demo22
	
}

public class Hirarchy_Inheritance {

	public static void main(String[] args) {
		Demo333 demo = new Demo333();
		demo.disp();

	}

}
