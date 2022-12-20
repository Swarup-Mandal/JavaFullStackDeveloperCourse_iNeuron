package lectures.Java_OOPs_Concepts_11.Encapsulation;
//constructor => class name and method name should be same

class Student2{  //class
	private String dog; //Data members/Instance Fields/instance variables/Properties
	private int cost;
	
  //creating setter method by constructor (not recommended)
	public Student2(String dog, int cost) {  //constructor 1
		this.dog=dog;
		this.cost=cost;
	}
	public Student2(String name) {   //this constructor not calling any where no problem
		this.dog=name;
	}
	public Student2() {   //**constructor Overloading
		dog = "Rocky";//inside same class you can change data members
		
	}
	
//    public Student2() {   //constructor 4
//		
//	}
	
	//all getter()
	public String getDog() {
		return dog;            
	}
	public int getCost() {
		return cost;
	}
}
public class Constructor {
	public static void main(String[] args) {
		Student2 st = new Student2("BullDog",20000); //obeject instantiation area.                                       
		String dogName = st.getDog();                      //and also constructor1 calling area.
		System.out.println(dogName);
		System.out.println(st.getCost());
		
		Student2 st2 =new Student2(); // new constructor 3 calling area
		System.out.println(st2.getDog());
		System.out.println(st2.getCost());//0 will get default value
		
//		Student2 st1 = new Student2("CoolDog",20000,"angry"); //you have to give (String name) or (String dog, int cost).it will give error.
	}
}
