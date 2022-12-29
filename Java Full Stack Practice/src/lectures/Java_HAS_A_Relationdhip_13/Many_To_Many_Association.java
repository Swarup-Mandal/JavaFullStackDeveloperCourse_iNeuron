package lectures.Java_HAS_A_Relationdhip_13;
//Dependent Object
class Course {
	String cid;
	String cname;
	int ccost;

	public Course(String cid, String cname, int ccost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}
}
//Target Object
class Stuudent {

	private String sid;
	private String sname;
	private String saddr;

	// HAS-A variable
	private Course[] course;

	// Constructor Injection
	public Stuudent(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}

	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS ARE:: ");
		System.out.println("SID   IS  :: " + sid);
		System.out.println("SNAME IS  :: " + sname);
		System.out.println("SADDR IS  :: " + saddr);
		System.out.println("COURSE DETAILS ARE:: ");
		for (Course c : course) {
			System.out.println("CID   IS  :: " + c.cid);
			System.out.println("CNAME IS  :: " + c.cname);
			System.out.println("COST  IS  :: " + c.ccost);
		}
		System.out.println("-------------------------------------");
	}
}
public class Many_To_Many_Association {

	public static void main(String[] args) {
		Course c1 = new Course("A11", "JAVA", 1000);
		Course c2 = new Course("B11", "Python", 2000);
		Course c3 = new Course("C11", "Blockchain", 3000);

		Course[] course = new Course[3];
		course[0] = c1;
		course[1] = c2;
		course[2] = c3;

		Stuudent s1 = new Stuudent("IND10", "sachin", "MI", course);
		Stuudent s2 = new Stuudent("IND7", "dhoni", "CSK", course);
		Stuudent s3 = new Stuudent("IND18", "kohli", "RCB", course);

		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();

	}

}
