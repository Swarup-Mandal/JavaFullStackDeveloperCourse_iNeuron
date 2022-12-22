package lectures.Java_OOPs_Concepts_11.Inheritance_2;
//private Date Members is not allowed in inheritance

class Parent11{
	//private String name;      //private variable is not allowed in inheritance
	String name;               //Normal variable is allowed
	void disp1() {
	System.out.println("Parent ");
	}
}
class Parent22 extends Parent11{
	
	void disp2() {
		//
		name = "Ayush";      //it gives error here when we use private variable
		System.out.println("Parent 22 : " +name);
	}
}
public class PrivateDataMembersNotAllowed {

	public static void main(String[] args) {
		Parent22 pc = new Parent22();
		pc.disp1();
		pc.disp2();

	}

}
