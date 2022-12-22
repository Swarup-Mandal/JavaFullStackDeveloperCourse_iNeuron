package lectures.Java_OOPs_Concepts_11.Inheritance_2;
//Multiple Inheritance is not allowed in java
class Parent1{
	String name = "Ayush";
	int age = 25;
	void disp() {
	    System.out.println("Parent class os parent of all Other class: " +name+" "+age);
	}
}
class Parent2 extends Parent1{
	
}
//class Parent3 extends parent2, Parent1{
//	
//}

public class Multiple_InheritanceIsNotAllowed {
	public static void main(String[] args) {
		Parent2 pc = new Parent2();
		pc.disp();
	
	}

}
