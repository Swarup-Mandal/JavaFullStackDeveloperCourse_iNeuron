package lectures.Java_HAS_A_Relationdhip_13;

class Student{
	//Instance Variable
	private String sname; //creating private variable with object type by Wrapper Class . not primitive type.
	private Integer sage;
	private Integer sid;
	
	//How we can set our Private Instance variable value?
	    //1. By Constructor
	    //2. By Setter
	
	//Constructor
	public Student(String sname, Integer sage, Integer sid) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sid = sid;
	}
	
    //Getter and Setter
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", sid=" + sid + "]";
	}
	
	
	
}

public class PrimitiveValueInjection {

	public static void main(String[] args) {
	       //System.out.println(new Student(null, null, null));   //if you don't override toString() it will call bydefault toString() of Object class internally. resuilt -> lectures.Java_HAS_Relationdhip_13.Student@5acf9800
           Student student = new Student("Ayush", 25, 23423);
           System.out.println(student);
           System.out.println(student.toString());
           
	}

}
