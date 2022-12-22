package lectures.Java_OOPs_Concepts_11.Inheritance_2;

class Demoo1{
	public void disp() {
		System.out.println("Demo1 public method");
	}
	void disp2() {
		System.out.println("Demo1 default metho");
	}
	public int add() {
		return 10+30;
	}
	public int add(int a, int b) {
		return a+b;
	}
}
class Demoo2 extends Demoo1{
//	void disp() {    //we can not decrease Visibility during Override: public -> default (X)
//		System.out.println("Demo2 public to default not possible");
//	}
	public void disp2() {   //we can increase Visibility during Override: default -> public  (✔)
		System.out.println("Demo2 default to public possible");
	}
//	public void add() {  //The return type is incompatible with Demoo1.add()
//		return 30+50;
//	}
	public int add(int a) {  //specialized Method bcz parameter is different.
		return a;
	}
	public int add(int a, int b) { //overridden done
		return a-b;
	}
}

//Co-Varient Return Type
class Interest{
	
}
class PersonalInterest extends Interest{
	
}
class Loan{
	public Interest interest(){       //our return type is objcect type
	   Interest it = new Interest();  //creating object of Interest class
	   return it;                     //returning object
	}
}
class PeronalLoan extends Loan{
	public PersonalInterest peronalInterest() {
		PersonalInterest pi = new PersonalInterest();
		return pi;
	}
}
//


public class RulesOf_Override {

	public static void main(String[] args) {
		

	}

}
