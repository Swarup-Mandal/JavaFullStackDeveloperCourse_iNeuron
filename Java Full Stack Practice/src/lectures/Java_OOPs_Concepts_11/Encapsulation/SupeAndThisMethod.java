package lectures.Java_OOPs_Concepts_11.Encapsulation;

class Student3{  //class
	private String name; //Data members
	private int age;
	private String city;
	
  
	public Student3(String name, int age,String city){  //initial Start with giving the null value of all parameters
		this();  //1 Start constructor chaining //1st this method call by empty parameter and we have a constructor with no parameter.it will go there.
		this.name=name; //5 Taking all the value and go to Student3(String name, int age,String city) and  5> taking all the value and do the operation and end
		this.age=age;
		this.city=city;
	}
	
	public Student3() {
		this("Swarup");  // 2 control comes here and go again to Student3(String name) constructor
		age=27;     // 4 Taking all the value and go to this();
		name = "Rocky";
	}
	
	public Student3(String name) {   
		this.name=name; // 3 taking all the value and go again to this("Swarup");
	}
	
	
	//*getter() 	
	public String getName() {  
		return name;            
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
}
public class SupeAndThisMethod {

	public static void main(String[] args) {
		Student3 st = new Student3("Ayush",25, "Kolkata"); //setter by constructor.( you can creat but not recomended.)                                
	    String name = st.getName();
		System.out.println(name);
		System.out.println(st.getAge());
		System.out.println(st.getCity());
		
		System.out.println(); 
		                   
		Student3 st2 =new Student3("nitin"); //in this constructor ther is no any this(); going as normal operation
		System.out.println(st2.getName());
		

	}
}
