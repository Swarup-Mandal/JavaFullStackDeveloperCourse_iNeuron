package lectures.Java_OOPs_Concepts_11.Inheritance;

//Single Inheritance

class Demo1{        //Demo1
	String name = "Ayush";
	int age = 25;
	void disp() {
	    System.out.println("Demo1 class " +name+" "+age);
	}
}

class Demo2 extends Demoo1 {    //Demo2 child class
	
}

public class Basic_Inheritance {
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.disp();

	}

}
