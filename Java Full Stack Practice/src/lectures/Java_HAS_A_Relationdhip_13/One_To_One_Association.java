package lectures.Java_HAS_A_Relationdhip_13;
//Dependent Object-->
class Account{
	 public String accId;
	 public String accName;
	 public String accType;
	//Constructor for setting value
	public Account(String accId, String accName, String accType) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.accType = accType;
	}
}
//Target Object
class Employee{
	//HAS-A RelationShip
	Account account;    //Account Type reference variable
	
	private String eId;
	private String eName;
	private String eAddr;
	
	//Constructor Injection
	public Employee(String eId, String eName, String eAddr,Account account) {
		super();
		this.account = account;
		this.eId = eId;
		this.eName = eName;
		this.eAddr = eAddr;
	}
	public void getEmployeeDetails() {	
		System.out.println("Employee Details:");
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Id : "+eId);
		System.out.println("Employee Address : "+eAddr);
		System.out.println("==========================");
		System.out.println("Account Details");
		System.out.println("Account Id :"+account.accId);
		System.out.println("Account Holder Name :"+account.accName);
		System.out.println("Account Type :"+account.accType);
	}
}
public class One_To_One_Association {

	public static void main(String[] args) {
		//The Account object should be created first => the dependent object.
		Account accountt = new Account("1234","AyushAccount","Savings") ;
		
		//Constructor Injection (accountt)
		Employee empl = new  Employee("1234e", "Ayush Mandal", "Kolkata", accountt);
		empl.getEmployeeDetails();
		

	}

}
