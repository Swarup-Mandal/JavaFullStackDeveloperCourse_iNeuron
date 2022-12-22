package lectures.Java_OOPs_Concepts_11.Encapsulation_1;
/*
 * //Own Setter => //***you can creat your own setter() but not getter()
*/
class Student1{
	private String name; //Data members/Instance Fields/instance variables/Properties
	private int age;
	private String city;
	

	//own setter() Syntax
	public void setData(String name, int age, String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	//getter() syntax you
	public String getName() { 
		return name;            
	}
//	public void setName(String name) {  
//		this.name = name;               
//	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;    
//	}                       
	public String getCity() {
		return city;
	}
//	public void setCity(String city) {
//		this.city = city;
//	}
}
public class Own_Setter {
	public static void main(String[] args) {
		Student1 st = new Student1();
//		st.setName("Ayush");  //now setting a restricted value from here by setter method
//		st.setAge(25);
//		st.setCity("Kolkata");
		st.setData("Ayush", 24, "Bengaluru"); //Own setter method call

		
		String name = st.getName();//now getting data members from other class by getter method 
		System.out.println(name);
		System.out.println(st.getAge());
		System.out.println(st.getCity());
		
	}
}
