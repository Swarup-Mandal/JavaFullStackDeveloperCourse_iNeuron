package lectures.Java_OOPs_Concepts_11.Encapsulation_1;
/*
 * //Encapsulation => (Private,setter(),getter(),shadowing problem,this keyword)
*/
class Student{
	private String name; //Data members/Instance Fields/instance variables/Properties
	private int age;
	private String city;
	private boolean married;
	
	//***you can creat your own setter() but not getter()
	//getter() syntax
	public String getName() {  //*getter() means you are giving/returning value to other class so make it public & specific return type
		return name;            
	}
	//setter() Syntax
	public void setName(String name) {  //*setter() means you are not returning anything from this method
		this.name = name;               //so, make it public void
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;    //*this keyword is used to avoid SHADOWING Problem - >
	}                       //means it clarify to JVM that attached variable is instance variable.so don't confuse give value to it    
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isMarried() {  //***for only boolean type getter() you have to give as isGetter() insted of getGetter()
		return married;
	}
	public void setMarried(boolean minor) {
		this.married = minor;
	}
}
public class Getter_Setter {
	public static void main(String[] args) {
		Student st = new Student();
		/*
		 * st.age = -28; st.name = "bangalaure"; st.city = "ayush";
		 * directly any one can change itand give unrastricted data.
		 * to avoid this we can creat our Data Members as private by giving private acces specifier.
		 * then we have to creat a setter() => to set value from another class with restricted way
		 * the after some operation ef other class want the value of the Data Member
		 * then we have to give data by getter() method
		 */
		st.setName("Ayush");  //now setting a restricted value from here by setter method
		st.setAge(25);
		st.setCity("Kolkata");
		st.setMarried(false);
		
		String name = st.getName();//now getting data members from other class by getter method 
		System.out.println(name);
		System.out.println(st.getAge());
		System.out.println(st.getCity());
		System.out.println("is Married ? "+st.isMarried());
	}
}
