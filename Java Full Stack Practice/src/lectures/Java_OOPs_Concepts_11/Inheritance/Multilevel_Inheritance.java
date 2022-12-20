package lectures.Java_OOPs_Concepts_11.Inheritance;
//Multiple Inheritance

class Demo11{   //extends Object     //Demo11 is Parent of Demo22
	//so,Object class's property and method both are present here.
	
	String name = "Ayush";
	int age = 25;
	void disp() {
	    System.out.println("Demo11 class " +name+" "+age);
	}
}

class Demo22 extends Demo11 {      //Demo22 -> child class of Demo11 and Pareeent of Demo33
	
}

class Demo33 extends Demo22 {     //Demo33 child class of Demo22
	
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Demo33 d = new Demo33();
		d.disp();

	}

}
