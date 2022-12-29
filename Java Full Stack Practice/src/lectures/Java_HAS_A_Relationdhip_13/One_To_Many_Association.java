package lectures.Java_HAS_A_Relationdhip_13;

//Dependent Object-->
class Employeee{
	
	 String eId;
	 String eName;
	 String eAddr;
	
	//Constructor->  setting value
	public Employeee(String eId, String eName, String eAddr) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAddr = eAddr;
	}
}

//Target Object (1:M)
class Department{
	//HAS-A Relationship
	Employeee[] employee;  //Instance variable

	 public String deptId;
	 public String deptName;
	//Constructor for setting value
	 public Department(String deptId,String deptName,Employeee[] employee) {
			super();
			this.employee = employee;
			this.deptName = deptName;
			this.deptId = deptId;
	 }
	
	 public void getDepartmentDetails() {	
		    System.out.println("Department Details::");
			System.out.println("Department Id :"+deptId);
			System.out.println("Department Name :"+deptName);
			System.out.println("===============================");
			System.out.println("Employee Details:");
			//use for each loop because of array 
			for (Employeee employ : employee) {
				System.out.println("Employee Id : "+employ.eId);
				System.out.println("Employee Name : "+employ.eName);
				System.out.println("Employee Address : "+employ.eAddr);
				System.out.println();
			}
	}
}


public class One_To_Many_Association {

	public static void main(String[] args) {
		//The Employeee object should be created first => the dependent object.
		Employeee em1 = new  Employeee("1234e", "Ayush Mandal", "Kolkata");
		Employeee em2 = new  Employeee("564e", "Rohan Mandal", "Delhi");
		Employeee em3 = new  Employeee("1464e", "Swarup Mandal", "Bangaluru");
		
		Employeee[] empls = new Employeee[3];
		empls[0] = em1;
		empls[1] = em2;
		empls[2] = em3;
		//Constructor Injection (accountt)
		Department dp = new Department("555dp","Management",empls);
		dp.getDepartmentDetails();
		

	}

}
