package lectures.Java_OOPs_Concepts_11.Inheritance;
//Constructors not allow in Inheritance => However, parent class constructor will ge called by Super()
  //calling inside the child class by-default

class Parent{
	
	Parent(){      //Parent Constructor
		System.out.println("Parent Constructor");
	}
	void disp() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	//Child(){        //Child Constructor by default
	//    super();    //Then, Inside Child Constructor the super() metghod will call the Parent class Constructor.
	//}
}

public class Constructor_NotAllowedInInheritance {

	public static void main(String[] args) {
		Child cc = new Child();  //by default jvm will create a Child Constructor inbuilt
		cc.disp();

	}

}
